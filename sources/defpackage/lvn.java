package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lvn  reason: default package */
/* loaded from: classes.dex */
public final class lvn {
    public static final lvw a;
    private static final Set b;

    static {
        Set singleton = Collections.singleton(ltk.a);
        b = singleton;
        a = new lvm(singleton);
    }

    public static String a(lum lumVar) {
        return lup.b(lumVar.o());
    }

    public static boolean b(lum lumVar, lvi lviVar, Set set) {
        return lumVar.n() != null || lviVar.a() > set.size() || !set.containsAll(lviVar.c());
    }

    @Deprecated
    public static void c(lum lumVar, him himVar) {
        lvi g = lvi.g(luq.a, lumVar.m());
        Level q = lumVar.q();
        String a2 = a.a(lumVar, g);
        Throwable th = (Throwable) g.b(ltk.a);
        ltp ltpVar = himVar.b;
        if (ltpVar != ltp.a) {
            StringBuilder sb = new StringBuilder(a2);
            String b2 = ltpVar.b();
            sb.insert(0, ' ');
            sb.insert(0, ltpVar.a());
            sb.insert(0, "():");
            sb.insert(0, ltpVar.d());
            sb.insert(0, '.');
            sb.insert(0, b2.substring(b2.lastIndexOf(46) + 1));
            a2 = sb.toString();
        }
        int a3 = him.a(q);
        if (a3 == 2 || a3 == 3) {
            return;
        }
        if (a3 == 4) {
            Log.i(himVar.a, a2, th);
        } else if (a3 != 5) {
            if (a3 != 6 && th == null) {
                th = new hil();
            }
            Log.e(himVar.a, a2, th);
        } else {
            Log.w(himVar.a, a2, th);
        }
    }

    public static void d(lvi lviVar, luy luyVar, StringBuilder sb) {
        lul lulVar = new lul(sb);
        lviVar.d(luyVar, lulVar);
        if (lulVar.c) {
            lulVar.b.append(lulVar.a);
        }
    }
}
