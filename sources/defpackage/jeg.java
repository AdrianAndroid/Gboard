package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jeg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jeg implements fkh {
    private final /* synthetic */ int a;

    public /* synthetic */ jeg(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [iyg, java.lang.Object] */
    @Override // defpackage.fkh
    public final Bundle a(Context context, Bundle bundle, fjr fjrVar) {
        mko mkoVar;
        mko K;
        switch (this.a) {
            case 0:
                Bundle bundle2 = new Bundle(fkd.class.getClassLoader());
                File i = jeh.a(context).i((String) jeh.b.a(bundle, "path", fke.a("java.lang.String")));
                if (i != null) {
                    i.delete();
                }
                fjo.d(mkk.a, new kcq(fjrVar, jeh.b, fke.a("java.lang.Void")));
                return bundle2;
            case 1:
                Bundle bundle3 = new Bundle(fkd.class.getClassLoader());
                fjo.d(jeh.a(context).b.a(), new kcq(fjrVar, jeh.b, fke.a("java.lang.Boolean")));
                return bundle3;
            case 2:
                Bundle bundle4 = new Bundle(fkd.class.getClassLoader());
                String str = (String) jeh.b.a(bundle, "path", fke.a("java.lang.String"));
                boolean booleanValue = ((Boolean) jeh.b.a(bundle, "deleteFile", fke.a("boolean"))).booleanValue();
                File i2 = jeh.a(context).i(str);
                try {
                    if (i2 == null) {
                        mkoVar = kcu.J(new FileNotFoundException(str));
                    } else {
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(i2));
                            try {
                                byte[] bArr = new byte[(int) i2.length()];
                                dataInputStream.readFully(bArr);
                                mko K2 = kcu.K(new jen(bArr));
                                dataInputStream.close();
                                if (booleanValue) {
                                    i2.delete();
                                }
                                mkoVar = K2;
                            } catch (Throwable th) {
                                try {
                                    dataInputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            mko J = kcu.J(e);
                            if (booleanValue) {
                                i2.delete();
                            }
                            mkoVar = J;
                        }
                    }
                    fjo.d(mkoVar, new kcq(fjrVar, jeh.b, fke.a("com.google.android.libraries.inputmethod.workprofile.FileContent")));
                    return bundle4;
                } catch (Throwable th3) {
                    if (booleanValue) {
                        i2.delete();
                    }
                    throw th3;
                }
            case 3:
                Bundle bundle5 = new Bundle(fkd.class.getClassLoader());
                jeh.a(context);
                jez.d(false);
                fjo.d(mkk.a, new kcq(fjrVar, jeh.b, fke.a("java.lang.Void")));
                return bundle5;
            case 4:
                Bundle bundle6 = new Bundle(fkd.class.getClassLoader());
                Intent intent = (Intent) jeh.b.a(bundle, "intent", fke.a("android.content.Intent"));
                jls a = jeh.a(context);
                if (((Context) a.a).getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                    K = kcu.K(Boolean.FALSE);
                } else {
                    ((Context) a.a).startActivity(intent);
                    K = kcu.K(Boolean.TRUE);
                }
                fjo.d(K, new kcq(fjrVar, jeh.b, fke.a("java.lang.Boolean")));
                return bundle6;
            case 5:
                Bundle bundle7 = new Bundle(fkd.class.getClassLoader());
                fkd fkdVar = jev.b;
                fke[] fkeVarArr = {fke.a("java.lang.String")};
                Map<String, ?> all = jev.a(context).c.getAll();
                all.keySet().retainAll((Set) fkdVar.a(bundle, "keys", fke.b(fkeVarArr)));
                fjo.d(kcu.K(new jep(all)), new kcq(fjrVar, jev.b, fke.a("com.google.android.libraries.inputmethod.workprofile.PreferenceValues")));
                return bundle7;
            case 6:
                Bundle bundle8 = new Bundle(fkd.class.getClassLoader());
                String str2 = (String) jev.b.a(bundle, "key", fke.a("java.lang.String"));
                boolean booleanValue2 = ((Boolean) jev.b.a(bundle, "value", fke.a("boolean"))).booleanValue();
                jes a2 = jev.a(context);
                ((ltd) ((ltd) jes.a.b()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "putBoolean", 147, "SharedPreferencesSynchronizer.java")).H("putBoolean %s: %s", str2, booleanValue2);
                a2.d.a();
                a2.a(str2);
                if (!a2.d.c(str2, Boolean.valueOf(booleanValue2), a2.c)) {
                    a2.c.edit().putBoolean(str2, booleanValue2).apply();
                }
                a2.d.b();
                fjo.d(mkk.a, new kcq(fjrVar, jev.b, fke.a("java.lang.Void")));
                return bundle8;
            case 7:
                Bundle bundle9 = new Bundle(fkd.class.getClassLoader());
                String str3 = (String) jev.b.a(bundle, "key", fke.a("java.lang.String"));
                float floatValue = ((Float) jev.b.a(bundle, "value", fke.a("float"))).floatValue();
                jes a3 = jev.a(context);
                ((ltd) ((ltd) jes.a.b()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "putFloat", 134, "SharedPreferencesSynchronizer.java")).D("putFloat %s: %s", str3, floatValue);
                a3.d.a();
                a3.a(str3);
                if (!a3.d.c(str3, Float.valueOf(floatValue), a3.c)) {
                    a3.c.edit().putFloat(str3, floatValue).apply();
                }
                a3.d.b();
                fjo.d(mkk.a, new kcq(fjrVar, jev.b, fke.a("java.lang.Void")));
                return bundle9;
            case 8:
                Bundle bundle10 = new Bundle(fkd.class.getClassLoader());
                String str4 = (String) jev.b.a(bundle, "key", fke.a("java.lang.String"));
                int intValue = ((Integer) jev.b.a(bundle, "value", fke.a("int"))).intValue();
                jes a4 = jev.a(context);
                ((ltd) ((ltd) jes.a.b()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "putInt", 108, "SharedPreferencesSynchronizer.java")).E("putInt %s: %s", str4, intValue);
                a4.d.a();
                a4.a(str4);
                if (!a4.d.c(str4, Integer.valueOf(intValue), a4.c)) {
                    a4.c.edit().putInt(str4, intValue).apply();
                }
                a4.d.b();
                fjo.d(mkk.a, new kcq(fjrVar, jev.b, fke.a("java.lang.Void")));
                return bundle10;
            case 9:
                Bundle bundle11 = new Bundle(fkd.class.getClassLoader());
                String str5 = (String) jev.b.a(bundle, "key", fke.a("java.lang.String"));
                long longValue = ((Long) jev.b.a(bundle, "value", fke.a("long"))).longValue();
                jes a5 = jev.a(context);
                ((ltd) ((ltd) jes.a.b()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "putLong", 121, "SharedPreferencesSynchronizer.java")).F("putLong %s: %s", str5, longValue);
                a5.d.a();
                a5.a(str5);
                if (!a5.d.c(str5, Long.valueOf(longValue), a5.c)) {
                    a5.c.edit().putLong(str5, longValue).apply();
                }
                a5.d.b();
                fjo.d(mkk.a, new kcq(fjrVar, jev.b, fke.a("java.lang.Void")));
                return bundle11;
            case 10:
                Bundle bundle12 = new Bundle(fkd.class.getClassLoader());
                String str6 = (String) jev.b.a(bundle, "key", fke.a("java.lang.String"));
                String str7 = (String) jev.b.a(bundle, "value", fke.a("java.lang.String"));
                jes a6 = jev.a(context);
                ((ltd) ((ltd) jes.a.b()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "putString", 81, "SharedPreferencesSynchronizer.java")).G("putString %s: %s", str6, str7);
                a6.d.a();
                a6.a(str6);
                if (!a6.d.c(str6, str7, a6.c)) {
                    a6.c.edit().putString(str6, str7).apply();
                }
                a6.d.b();
                fjo.d(mkk.a, new kcq(fjrVar, jev.b, fke.a("java.lang.Void")));
                return bundle12;
            case 11:
                Bundle bundle13 = new Bundle(fkd.class.getClassLoader());
                String str8 = (String) jev.b.a(bundle, "key", fke.a("java.lang.String"));
                Set<String> set = (Set) jev.b.a(bundle, "values", fke.b(fke.a("java.lang.String")));
                jes a7 = jev.a(context);
                ((ltd) ((ltd) jes.a.b()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "putStringSet", 95, "SharedPreferencesSynchronizer.java")).G("putStringSet %s: %s", str8, set);
                a7.d.a();
                a7.a(str8);
                if (!a7.d.c(str8, set, a7.c)) {
                    a7.c.edit().putStringSet(str8, set).apply();
                }
                a7.d.b();
                fjo.d(mkk.a, new kcq(fjrVar, jev.b, fke.a("java.lang.Void")));
                return bundle13;
            default:
                Bundle bundle14 = new Bundle(fkd.class.getClassLoader());
                String str9 = (String) jev.b.a(bundle, "key", fke.a("java.lang.String"));
                jes a8 = jev.a(context);
                ((ltd) ((ltd) jes.a.b()).k("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer", "remove", 67, "SharedPreferencesSynchronizer.java")).w("remove %s", str9);
                a8.d.a();
                a8.a(str9);
                if (!a8.d.c(str9, null, a8.c)) {
                    a8.c.edit().remove(str9).apply();
                }
                a8.d.b();
                fjo.d(mkk.a, new kcq(fjrVar, jev.b, fke.a("java.lang.Void")));
                return bundle14;
        }
    }
}
