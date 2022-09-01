package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* renamed from: iin */
/* loaded from: classes.dex */
public final class iin {
    public static Uri a(String str) {
        return Uri.fromFile(new File(str));
    }

    public static boolean b(Uri uri) {
        return uri != null && "gboard".equals(uri.getScheme());
    }

    public static boolean c(Uri uri) {
        if (uri == null) {
            return false;
        }
        String X = jdg.X(lfd.d(uri.getScheme()));
        return "https".equals(X) || "http".equals(X);
    }

    public static boolean d(Uri uri) {
        if (uri == null) {
            return false;
        }
        return "https".equals(jdg.X(lfd.d(uri.getScheme())));
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "HIGHEST" : "MEDIUM" : "LOW" : "LOWEST" : "IDLE";
    }

    public static /* synthetic */ void f(int i) {
        if (i != 0) {
            return;
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        return i != 1 ? "null" : "GET";
    }

    public static ihs h(iij iijVar, ihr ihrVar, leq leqVar) {
        if (j(iijVar)) {
            try {
                return ihrVar.a(iijVar);
            } catch (Exception e) {
                iii iiiVar = new iii(iijVar);
                iiiVar.a = e;
                iijVar = iiiVar.a();
            }
        }
        return (ihs) leqVar.a(iijVar);
    }

    public static boolean i(ihs ihsVar) {
        return j(ihsVar.a());
    }

    public static boolean j(iij iijVar) {
        return iijVar.c && iijVar.d == null;
    }

    public static hsy l(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        if (iavVar == null) {
            iavVar = iav.a;
        }
        return (hsy) jbt.v(context.getClassLoader(), hsy.class, ibmVar.c, new Class[]{Context.class, hsz.class, ibm.class, iav.class, ibz.class}, context, hszVar, ibmVar, iavVar, ibzVar);
    }

    public static Context m(hsk hskVar) {
        hqt b = hqp.b();
        if (b != null) {
            return b.a();
        }
        return hskVar.C();
    }

    public static int n(Context context, hqt hqtVar) {
        return ino.M(context).b(o(hqtVar), 0);
    }

    public static String o(hqt hqtVar) {
        return String.format("enable_reason_%s_%s", hqtVar.i(), hqtVar.p());
    }

    public static void p(Context context, hqt hqtVar, int i) {
        if (!ino.M(context).ai(o(hqtVar))) {
            ino.M(context).h(o(hqtVar), i);
        }
    }
}
