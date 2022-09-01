package defpackage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.libraries.inputmethod.backup.BackupAgent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: giv  reason: default package */
/* loaded from: classes.dex */
public abstract class giv extends BackupAgentHelper {
    public static void c(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else {
            Class<?> cls = null;
            if (obj instanceof Set) {
                Set<String> set = (Set) obj;
                for (String str2 : set) {
                    if (!(str2 instanceof String)) {
                        if (obj != null) {
                            cls = obj.getClass();
                        }
                        String valueOf = String.valueOf(cls);
                        Log.w("PersistentBackupAgentHe", "Skipping restore of key " + str + " because its value is a set containing an object of type " + valueOf + ".");
                        return;
                    }
                }
                editor.putStringSet(str, set);
                return;
            }
            if (obj != null) {
                cls = obj.getClass();
            }
            String valueOf2 = String.valueOf(cls);
            Log.w("PersistentBackupAgentHe", "Skipping restore of key " + str + " because its value is the unrecognized type " + valueOf2 + ".");
        }
    }

    public static boolean d(String str) {
        return !str.contains(File.separator) && !str.contains("/") && !"persistent_backup_agent_helper".equals(str);
    }

    private final void e() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    protected SharedPreferences a(String str) {
        throw null;
    }

    protected abstract Map b();

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Map b = b();
        SharedPreferences.Editor edit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        edit.clear();
        for (Map.Entry entry : ((llw) b).entrySet()) {
            String str = (String) entry.getKey();
            gvb gvbVar = (gvb) entry.getValue();
            if (!d(str)) {
                throw new IllegalArgumentException("Unsupported shared preferences file name \"" + str + "\"");
            }
            for (Map.Entry<String, ?> entry2 : a(str).getAll().entrySet()) {
                String key = entry2.getKey();
                Object value = entry2.getValue();
                if (!BackupAgent.a.contains(key)) {
                    c(edit, str + "/" + key, value);
                }
            }
        }
        edit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        e();
    }

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            int indexOf = key.indexOf("/");
            if (indexOf < 0 || indexOf >= key.length() - 1) {
                Log.w("PersistentBackupAgentHe", "Format of key \"" + key + "\" not understood, so skipping its restore.");
            } else {
                String substring = key.substring(0, indexOf);
                String substring2 = key.substring(indexOf + 1);
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap.get(substring);
                if (editor == null) {
                    if (!d(substring)) {
                        Log.w("PersistentBackupAgentHe", "Skipping unsupported shared preferences file name \"" + substring + "\"");
                    } else {
                        editor = a(substring).edit();
                        hashMap.put(substring, editor);
                    }
                }
                c(editor, substring2, value);
            }
        }
        for (SharedPreferences.Editor editor2 : hashMap.values()) {
            editor2.apply();
        }
        hashMap.keySet();
        e();
    }
}
