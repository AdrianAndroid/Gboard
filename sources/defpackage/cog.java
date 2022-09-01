package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cog  reason: default package */
/* loaded from: classes.dex */
public final class cog {
    private static volatile cog a;

    private cog() {
    }

    public static final coq a(int i, int i2) {
        osr a2 = coq.a();
        a2.u(col.HALF_SEARCH_BOX);
        a2.e = cok.a(-10001);
        a2.a = cop.a(i2);
        czp a3 = com.a();
        a3.i(R.drawable.f50590_resource_name_obfuscated_res_0x7f080363);
        a3.h(i);
        a3.c = 2;
        a2.c = a3.f();
        return a2.t();
    }

    public static final coq b(int i) {
        osr a2 = coq.a();
        a2.u(col.IMAGE_RESOURCE);
        a2.e = cok.a(-10001);
        czp a3 = com.a();
        a3.i(R.drawable.f50590_resource_name_obfuscated_res_0x7f080363);
        a3.h(i);
        a3.c = 2;
        a2.c = a3.f();
        return a2.t();
    }

    public static void c() {
        if (a == null) {
            synchronized (cog.class) {
                if (a == null) {
                    a = new cog();
                }
            }
        }
    }

    public static lmz d() {
        return lmz.s(csl.a, csl.b);
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? i != 2 ? "CANCELLATION" : "FAILURE" : "SUCCESS";
    }

    public static cst f(Object obj) {
        obj.getClass();
        return new csq(obj);
    }

    public static final emv g(int i, int i2) {
        emv a2 = cov.a();
        osr a3 = coq.a();
        a3.u(col.FULL_SEARCH_BOX);
        a3.e = cok.a(-10001);
        a3.a = cop.a(i2);
        czp a4 = com.a();
        a4.i(R.drawable.f50590_resource_name_obfuscated_res_0x7f080363);
        a4.h(i);
        a4.c = 2;
        a3.c = a4.f();
        a2.d = a3.t();
        return a2;
    }

    public static final emv h(int i, int i2) {
        emv a2 = cov.a();
        a2.d = a(i, i2);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.lang.Iterable] */
    public static final emv i(String str, int i) {
        emv a2 = cov.a();
        a2.d = b(i);
        osr a3 = coq.a();
        a3.u(col.TEXT);
        con a4 = coo.a();
        a4.d(str);
        a4.b(str);
        a3.b = a4.a();
        a3.e = cok.a(-10003);
        a2.i(a3.t());
        osr a5 = coq.a();
        a5.u(col.IMAGE_RESOURCE);
        a5.e = cok.a(-10002);
        czp a6 = com.a();
        a6.i(R.drawable.f50170_resource_name_obfuscated_res_0x7f080334);
        a6.b = 1;
        a6.h(R.string.f149000_resource_name_obfuscated_res_0x7f1400e9);
        a6.c = 2;
        a5.c = a6.f();
        coq t = a5.t();
        if (a2.e == null) {
            if (a2.f == null) {
                a2.e = llp.e();
            } else {
                a2.e = llp.e();
                ((llk) a2.e).j(a2.f);
                a2.f = null;
            }
        }
        ((llk) a2.e).h(t);
        return a2;
    }

    public static int j(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static void l(bxh bxhVar) {
        bxhVar.d();
    }

    public static /* synthetic */ void m(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }
}
