package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jev  reason: default package */
/* loaded from: classes.dex */
public final class jev {
    public static final jev a = new jev();
    public static final fkd b = new jet();
    public final fkh[] c = {new jeg(5), new jeg(6), new jeg(7), new jeg(8), new jeg(9), new jeg(10), new jeg(11), new jeg(12), new fkh() { // from class: jeu
        @Override // defpackage.fkh
        public final Bundle a(Context context, Bundle bundle, fjr fjrVar) {
            Bundle bundle2 = new Bundle(fkd.class.getClassLoader());
            jed jedVar = (jed) jev.b.a(bundle, "allowedSharedPreferences", fke.a("com.google.android.libraries.inputmethod.workprofile.AllowedSharedPreferences"));
            jes a2 = jev.a(context);
            jez.d(true);
            a2.d.a();
            SharedPreferences.Editor edit = a2.c.edit();
            jee jeeVar = new jee(a2.b.getResources(), jedVar.a);
            llw llwVar = jedVar.b;
            lmz lmzVar = jedVar.c;
            Map<String, ?> all = a2.c.getAll();
            int i = 0;
            for (String str : all.keySet()) {
                if (jeeVar.b(str) && !llwVar.containsKey(str) && !lmzVar.contains(str)) {
                    edit.remove(str);
                    i++;
                }
            }
            ArrayList<jer> arrayList = new ArrayList(llwVar.size());
            for (Map.Entry entry : llwVar.entrySet()) {
                String str2 = (String) entry.getKey();
                jeeVar.a();
                int intValue = ((Integer) jeeVar.b.getOrDefault(str2, -1)).intValue();
                lsz it = jeeVar.c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it.next();
                    if (intValue < 0 || ((Integer) entry2.getKey()).intValue() <= intValue) {
                        if (((Pattern) entry2.getValue()).matcher(str2).matches()) {
                            intValue = ((Integer) entry2.getKey()).intValue();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (intValue >= 0) {
                    arrayList.add(new jer(intValue, entry));
                } else {
                    ((ltd) ((ltd) jes.a.c()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "filterAndSortPreferences", 249, "SharedPreferencesSynchronizer.java")).G("find non allowed preference %s: %s", entry.getKey(), entry.getValue());
                }
            }
            Collections.sort(arrayList);
            int i2 = 0;
            for (jer jerVar : arrayList) {
                Map.Entry entry3 = jerVar.a;
                String str3 = (String) entry3.getKey();
                all.get(str3);
                Object value = entry3.getValue();
                if (!a2.d.c(str3, value, a2.c)) {
                    if (value instanceof Integer) {
                        edit.putInt(str3, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        edit.putLong(str3, ((Long) value).longValue());
                    } else if (value instanceof Boolean) {
                        edit.putBoolean(str3, ((Boolean) value).booleanValue());
                    } else if (value instanceof Float) {
                        edit.putFloat(str3, ((Float) value).floatValue());
                    } else if (value instanceof String) {
                        edit.putString(str3, (String) value);
                    } else if (value instanceof Set) {
                        edit.putStringSet(str3, (Set) value);
                    } else {
                        i2++;
                        ((ltd) ((ltd) jes.a.c()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "syncAllowedPreferences", 227, "SharedPreferencesSynchronizer.java")).G("try to sync '%s' with unrecognized value: %s", str3, value);
                    }
                }
            }
            edit.apply();
            ((ltd) ((ltd) jes.a.b()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "syncAllowedPreferences", 231, "SharedPreferencesSynchronizer.java")).K("syncAllowedPreferences with %d items: %d removed, %d updated, %d error", Integer.valueOf(llwVar.size()), Integer.valueOf(i), Integer.valueOf(arrayList.size() - i2), Integer.valueOf(i2));
            a2.d.b();
            fjo.d(mkk.a, new kcq(fjrVar, jev.b, fke.a("java.lang.Void")));
            return bundle2;
        }
    }};

    private jev() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final jes a(Context context) {
        jeq.a.a();
        SharedPreferences J = ino.L().J();
        if (J instanceof jek) {
            J = ((jek) J).a;
        }
        return new jes(context, J, jco.b);
    }
}
