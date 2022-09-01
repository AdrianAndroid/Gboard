package com.google.android.libraries.inputmethod.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.format.DateFormat;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BackupAgent extends giv {
    private llw d;
    private llw e;
    private idn f;
    private static final ltg b = ltg.j("com/google/android/libraries/inputmethod/backup/BackupAgent");
    public static final lmz a = lmz.w("recent_backup", "recent_restore", "restore_app_version", "last_manual_restore_app_version", "restore_timestamp", "restore_times", new String[0]);
    private static final int c = 40669281;

    public BackupAgent() {
        llw llwVar = lrq.b;
        this.d = llwVar;
        this.e = llwVar;
    }

    private static lfe e(BackupDataOutput backupDataOutput) {
        return Build.VERSION.SDK_INT >= 28 ? new ein(backupDataOutput, 11) : dyv.n;
    }

    private static String f(String str) {
        return String.format("type: %s, timestamp: %s", str, DateFormat.format("yyyy-MM-dd kk:mm:ss", System.currentTimeMillis()));
    }

    private final void g(String[] strArr) {
        if (strArr.length > 0) {
            addHelper("ime_files", new FileBackupHelper(this, strArr));
        }
    }

    private final void h() {
        hjg.p();
        igr d = igr.d(this);
        gvf.n();
        ilc ilcVar = (ilc) d.b(ilc.class);
        if (ilcVar == null) {
            ((ltd) ((ltd) b.d()).k("com/google/android/libraries/inputmethod/backup/BackupAgent", "fetchAndUpdatePhenotypeFlags", 356, "BackupAgent.java")).t("Can't load phenotype module.");
            return;
        }
        try {
            ilcVar.c(5).get(10L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ltd) ((ltd) ((ltd) b.d()).i(e)).k("com/google/android/libraries/inputmethod/backup/BackupAgent", "fetchAndUpdatePhenotypeFlags", (char) 364, "BackupAgent.java")).t("Failed to fetch phenotype flags");
            ieh.j().e(gvd.b, 5);
        }
    }

    @Override // defpackage.giv
    protected final SharedPreferences a(String str) {
        ino inoVar = (ino) this.e.get(str);
        if (inoVar == null) {
            return getSharedPreferences(str, 0);
        }
        return inoVar.J();
    }

    @Override // defpackage.giv
    protected final /* synthetic */ Map b() {
        return this.d;
    }

    @Override // defpackage.giv, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        ino.L().i("backup_timestamp", System.currentTimeMillis());
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 28) {
            ltd ltdVar = (ltd) ((ltd) b.b()).k("com/google/android/libraries/inputmethod/backup/BackupAgent", "onBackup", 109, "BackupAgent.java");
            int transportFlags = backupDataOutput.getTransportFlags() & 1;
            ltdVar.I("TransportFlags clientSideEncryption=%b, deviceToDeviceTransfer=%b", 1 == transportFlags, (backupDataOutput.getTransportFlags() & 2) != 0);
        }
        h();
        lls h = llw.h();
        lls h2 = llw.h();
        ino L = ino.L();
        String P = L.P();
        h.a(P, gvb.a);
        h2.a(P, L);
        if (((Boolean) gvc.a.c()).booleanValue()) {
            lsz it = hgw.g(getApplicationContext(), e(backupDataOutput)).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ino inoVar = (ino) entry.getKey();
                String P2 = inoVar.P();
                h.a(P2, (gvb) entry.getValue());
                h2.a(P2, inoVar);
            }
        }
        this.d = h.l();
        this.e = h2.l();
        if (((Boolean) gvc.a.c()).booleanValue()) {
            g(gvh.c(getApplicationContext(), e(backupDataOutput)));
        }
        addHelper("shared_pref", new SharedPreferencesBackupHelper(ino.L().d.g() ? jbt.m(this) : this, gvf.i()));
        try {
            try {
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
                String f = f("KEYVALUE_BACKUP");
                ((ltd) ((ltd) b.b()).k("com/google/android/libraries/inputmethod/backup/BackupAgent", "saveBackupHistoryInfo", 377, "BackupAgent.java")).w("Save history info: %s", f);
                ino.L().j("recent_backup", f);
                if (((Boolean) gvc.a.c()).booleanValue()) {
                    gvh.a(getApplicationContext());
                }
                idn idnVar = this.f;
                if (idnVar != null) {
                    idnVar.b(gve.KEY_VALUE_BACKUP_DURATION);
                }
                ieh j = ieh.j();
                j.e(gvd.a, 0);
                if (Build.VERSION.SDK_INT < 28) {
                    return;
                }
                gvd gvdVar = gvd.i;
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(1 == (backupDataOutput.getTransportFlags() & 1));
                j.e(gvdVar, objArr);
                gvd gvdVar2 = gvd.j;
                Object[] objArr2 = new Object[1];
                if ((backupDataOutput.getTransportFlags() & 2) == 0) {
                    z = false;
                }
                objArr2[0] = Boolean.valueOf(z);
                j.e(gvdVar2, objArr2);
            } catch (IOException e) {
                ieh.j().e(gvd.a, 1);
                throw e;
            }
        } catch (Throwable th) {
            if (((Boolean) gvc.a.c()).booleanValue()) {
                gvh.a(getApplicationContext());
            }
            throw th;
        }
    }

    @Override // defpackage.giv, android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            applicationContext = getBaseContext();
        }
        guw.a = applicationContext;
        jai.b.a(guw.a());
        this.f = ieh.j().a(gve.KEY_VALUE_BACKUP_DURATION);
    }

    @Override // android.app.backup.BackupAgent
    public final void onQuotaExceeded(long j, long j2) {
        ((ltd) ((ltd) b.d()).k("com/google/android/libraries/inputmethod/backup/BackupAgent", "onQuotaExceeded", 348, "BackupAgent.java")).B("Quota is exceeded: backupDataBytes %d, quotaBytes %d", j, j2);
        super.onQuotaExceeded(j, j2);
        ieh.j().e(gvd.a, 8);
    }

    @Override // defpackage.giv, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        h();
        lls h = llw.h();
        ino L = ino.L();
        h.a(L.P(), L);
        if (((Boolean) gvc.a.c()).booleanValue()) {
            lsz it = hgw.g(getApplicationContext(), dyv.o).keySet().iterator();
            while (it.hasNext()) {
                ino inoVar = (ino) it.next();
                h.a(inoVar.P(), inoVar);
            }
        }
        this.e = h.l();
        g(gvh.d());
        try {
            int i2 = c;
            if (i2 <= 0 || i < i2) {
                addHelper("shared_pref", new SharedPreferencesBackupHelper(this, gvf.i()));
                super.onRestore(backupDataInput, i, parcelFileDescriptor);
                String str = getApplicationInfo().dataDir;
                String str2 = File.separator;
                File file = new File(str + str2 + "shared_prefs");
                SharedPreferences sharedPreferences = jan.b.c(new File(file, gvf.i().concat(".xml")), new File(file, "restore_default_shared_preference.xml")) ? getSharedPreferences("restore_default_shared_preference", 0) : null;
                if (sharedPreferences != null) {
                    SharedPreferences.Editor edit = ino.L().J().edit();
                    Map<String, ?> all = sharedPreferences.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            c(edit, entry.getKey(), value);
                        }
                    }
                    all.size();
                    edit.apply();
                    sharedPreferences.edit().clear().apply();
                } else {
                    ((ltd) ((ltd) b.d()).k("com/google/android/libraries/inputmethod/backup/BackupAgent", "restoreDefaultSharedPreferences", 302, "BackupAgent.java")).t("Failed to get temporary SharedPreferences for restore default SharedPreferences.");
                }
            } else {
                super.onRestore(backupDataInput, i, parcelFileDescriptor);
            }
            if (!((Boolean) gvc.a.c()).booleanValue()) {
                return;
            }
            gvh.b(getApplicationContext(), i);
        } catch (IOException e) {
            ieh.j().e(gvd.a, 3);
            throw e;
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestoreFinished() {
        super.onRestoreFinished();
        long c2 = ino.L().c("backup_timestamp", -1L);
        if (c2 != -1) {
            ieh.j().e(gvd.h, Long.valueOf(TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - c2)));
        }
        idn idnVar = this.f;
        if (idnVar != null) {
            idnVar.b(gve.KEY_VALUE_RESTORE_DURATION);
        }
        ieh.j().e(gvd.a, 2);
        String f = f("KEYVALUE_RESTORE");
        ((ltd) ((ltd) b.b()).k("com/google/android/libraries/inputmethod/backup/BackupAgent", "saveRestoreHistoryInfo", 383, "BackupAgent.java")).w("Save history info: %s", f);
        ino.L().j("recent_restore", f);
        ijl.b().g(new gvo());
    }
}
