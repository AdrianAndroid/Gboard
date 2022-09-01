package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.libraries.inputmethod.staticflag.AllFlags;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hhq  reason: default package */
/* loaded from: classes.dex */
public final class hhq {
    public static final hhp a;
    private static final ltg b = ltg.j("com/google/android/libraries/inputmethod/flag/FlagFactory");

    static {
        hhp hhpVar = new hhp();
        a = hhpVar;
        ijf.g("FlagFactory_UserUnlocked", hhpVar);
    }

    public static hhl a(String str, boolean z) {
        hhu hhuVar = hhu.b;
        return hhuVar.i(hhuVar.c, Boolean.class, str, Boolean.valueOf(z), (Boolean) hhuVar.l(str, fxd.t));
    }

    public static hhl b(String str) {
        String[] split = str.split("=");
        if (split.length == 2) {
            if (jdg.Z("true", split[1])) {
                return hhu.b.b(split[0], true);
            }
            if (!jdg.Z("false", split[1])) {
                return null;
            }
            return hhu.b.b(split[0], false);
        }
        return null;
    }

    public static hhl c(Context context, int i) {
        String string = context.getString(i);
        hhl b2 = b(string);
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException(String.format(Locale.ROOT, "Failed to parse flag from resource: %s(%s)", context.getResources().getResourceEntryName(i), string));
    }

    public static hhl d(String str, byte[] bArr) {
        return hhu.b.h(str, bArr);
    }

    public static hhl e(String str, double d) {
        hhu hhuVar = hhu.b;
        return hhuVar.i(hhuVar.e, Double.class, str, Double.valueOf(d), (Double) hhuVar.l(str, hht.b));
    }

    public static hhl f(String str, long j) {
        hhu hhuVar = hhu.b;
        return hhuVar.i(hhuVar.d, Long.class, str, Long.valueOf(j), (Long) hhuVar.l(str, hht.a));
    }

    public static hhl g(String str) {
        String[] split = str.split("=");
        if (split.length == 2) {
            try {
                long parseLong = Long.parseLong(split[1]);
                hhu hhuVar = hhu.b;
                String str2 = split[0];
                return hhuVar.j(hhuVar.d, Long.class, str2, Long.valueOf(parseLong), (Long) hhuVar.l(str2, hht.a));
            } catch (NumberFormatException e) {
                ((ltd) ((ltd) ((ltd) b.d()).i(e)).k("com/google/android/libraries/inputmethod/flag/FlagFactory", "createLongFlagFromString", 191, "FlagFactory.java")).w("Failed to parse flag from string: %s", str);
                return null;
            }
        }
        return null;
    }

    public static hhl h(String str, String str2) {
        hhu hhuVar = hhu.b;
        return hhuVar.i(hhuVar.f, String.class, str, str2, (String) hhuVar.l(str, fxd.u));
    }

    public static hhx i() {
        return new hhn(hhu.b);
    }

    public static hhy j() {
        return new hhz(hhu.b);
    }

    public static hic k(String str, ngz ngzVar) {
        return new hic(hhu.b.h(str, ngzVar.q()), ngzVar);
    }

    public static String l(hhl hhlVar) {
        Object b2 = hhlVar.b(hie.DEFAULT);
        if (b2 != null) {
            String str = ((hhr) hhlVar).a;
            String obj = b2.toString();
            return str + "=" + obj;
        }
        return null;
    }

    public static Collection m() {
        hhu hhuVar = hhu.b;
        HashSet hashSet = new HashSet();
        hhu.n(hashSet, hhuVar.c);
        hhu.n(hashSet, hhuVar.d);
        hhu.n(hashSet, hhuVar.e);
        hhu.n(hashSet, hhuVar.f);
        hhu.n(hashSet, hhuVar.g);
        return hashSet;
    }

    public static void n(final Context context, idk idkVar) {
        final hhu hhuVar = hhu.b;
        hhuVar.h = idkVar;
        hhuVar.k = ijf.a(new Runnable() { // from class: hhs
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v17, types: [android.content.SharedPreferences, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.concurrent.Executor, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                mko K;
                mko b2;
                hhu hhuVar2 = hhu.this;
                Context context2 = context;
                hhuVar2.k = null;
                hhm hhmVar = new hhm(context2);
                if (hhuVar2.j) {
                    ((ltd) ((ltd) hhu.a.c()).k("com/google/android/libraries/inputmethod/flag/FlagManager", "onUserUnlocked", 673, "FlagManager.java")).t("onUserUnlocked() has already run");
                    return;
                }
                hhuVar2.j = true;
                hhuVar2.i = hhmVar;
                Context applicationContext = context2.getApplicationContext();
                lmx g = lmz.g();
                if (!TextUtils.isEmpty(AllFlags.STATICMENDELPACKAGENAME)) {
                    lfb b3 = kki.b(applicationContext);
                    if (b3.e()) {
                        hhuVar2.l = (jlt) b3.a();
                        hhuVar2.m(hhuVar2.c, fxd.t, g);
                        hhuVar2.m(hhuVar2.d, hht.a, g);
                        hhuVar2.m(hhuVar2.e, hht.b, g);
                        hhuVar2.m(hhuVar2.f, fxd.u, g);
                        hhuVar2.m(hhuVar2.g, hht.c, g);
                    }
                }
                if (hhuVar2.v()) {
                    hhuVar2.o = new ijk(applicationContext);
                } else {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("flag_value", 0);
                    hhuVar2.m = new dsl(hhuVar2, sharedPreferences, hie.PHENOTYPE);
                    hhuVar2.p = new ijk(sharedPreferences.edit(), hie.PHENOTYPE);
                    SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("flag_override", 0);
                    hhuVar2.n = new dsl(hhuVar2, sharedPreferences2, hie.OVERRIDE);
                    hhuVar2.q = new ijk(sharedPreferences2.edit(), hie.OVERRIDE);
                }
                if (gva.d()) {
                    i = 2;
                } else {
                    long j = hyr.a;
                    i = hyq.b() ? 1 : -1;
                }
                if (i != -1) {
                    K = kcu.K(null);
                    if (!hhuVar2.v()) {
                        idn k = hhuVar2.k(hhw.CLEAR_FLAG_VALUE_FROM_SHARED_PREFERENCES);
                        if (hhuVar2.m != null) {
                            hhuVar2.m.b.edit().clear().apply();
                        }
                        K = kcu.K(k);
                    } else if (hhuVar2.o != null) {
                        idn k2 = hhuVar2.k(hhw.CLEAR_FLAG_VALUE_FROM_DATA_STORE);
                        ijk ijkVar = hhuVar2.o;
                        hie hieVar = hie.PHENOTYPE;
                        if (!ijk.c(hieVar)) {
                            b2 = mkk.a;
                        } else {
                            b2 = ((kqr) ijkVar.a).b(new hdp(hieVar, 7), ijkVar.b);
                        }
                        K = mio.g(b2, new hdp(k2, 3), mjl.a);
                    }
                    if (hhuVar2.h != null) {
                        hhuVar2.h.e(hhv.CLEAN_UP_BACKED_FLAG, Integer.valueOf(i));
                    }
                } else {
                    lmx g2 = lmz.g();
                    if (!hhuVar2.v()) {
                        idn k3 = hhuVar2.k(hhw.LOAD_FLAG_VALUE_FROM_SHARED_PREFERENCES);
                        if (hhuVar2.n != null) {
                            hhuVar2.n.j(g, g2);
                        }
                        if (hhuVar2.m != null) {
                            hhuVar2.m.j(g, g2);
                        }
                        K = kcu.K(k3);
                    } else if (hhuVar2.o != null) {
                        K = mio.g(((kqr) hhuVar2.o.a).a(), new eiy(hhuVar2, g, g2, hhuVar2.k(hhw.LOAD_FLAG_VALUE_FROM_DATA_STORE), 4), gyc.a);
                    } else {
                        K = kcu.K(null);
                    }
                }
                kcu.U(K, new fel(hhuVar2, g, 4), gyc.a);
            }
        }, jai.a);
        hhuVar.k.e(mjl.a);
    }

    public static void o(hho hhoVar, Collection collection) {
        hhu.b.p(hhoVar, collection);
    }

    public static void p(hho hhoVar, hhl... hhlVarArr) {
        hhu.b.q(hhoVar, hhlVarArr);
    }

    public static void q(hho hhoVar) {
        hhu.b.s(hhoVar);
    }
}
