package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cjf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cjf {
    static {
        cjg cjgVar = cjg.b;
    }

    public static cjg a(Context context) {
        cjh cjhVar = (cjh) igr.d(context).a(cjh.class);
        return cjhVar == null ? cjg.b : cjhVar;
    }

    public static llp b(mty mtyVar, boolean z) {
        return fgy.n(mtyVar.c, new jap(z, 1));
    }

    public static mse c(mse mseVar, hbd hbdVar) {
        if (!((Boolean) cit.d.c()).booleanValue() || hbdVar.g().a(mseVar.d).isEmpty()) {
            return mseVar;
        }
        String str = mseVar.d;
        if (!str.equals(hbdVar.g().b(str))) {
            return mseVar;
        }
        String i = hbdVar.i(str);
        if (i == null) {
            if (!cit.f.j(str)) {
                return null;
            }
            return mseVar;
        } else if (i.equals(str)) {
            return mseVar;
        } else {
            nfh nfhVar = (nfh) mseVar.N(5);
            nfhVar.cG(mseVar);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mse mseVar2 = (mse) nfhVar.b;
            int i2 = mseVar2.a | 2;
            mseVar2.a = i2;
            mseVar2.d = i;
            mseVar2.a = (-2097153) & i2;
            mseVar2.h = 0;
            return (mse) nfhVar.cz();
        }
    }

    public static void d(int i) {
        ieh j = ieh.j();
        ctd ctdVar = ctd.IMPRESSION;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 7;
        mbcVar.a |= 1;
        nfh t2 = mbt.e.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbt mbtVar = (mbt) t2.b;
        mbtVar.a = 1 | mbtVar.a;
        mbtVar.b = i;
        mbt mbtVar2 = (mbt) t2.b;
        mbtVar2.c = 9;
        mbtVar2.a |= 2;
        t.dM(t2);
        objArr[0] = t.cz();
        j.e(ctdVar, objArr);
    }

    public static boolean e(mse mseVar, hdz hdzVar, hdn hdnVar) {
        boolean g = hdzVar.g(mseVar.d, hdnVar.h);
        if (g || !((Boolean) cit.c.c()).booleanValue()) {
            return g;
        }
        ieh.j().e(ciu.SUPPLIER_EXCEPTION, 3);
        return false;
    }

    public static boolean f(mse mseVar, boolean z) {
        int i = mseVar.c;
        int b = msc.b(i);
        if (b != 0 && b == 4 && z) {
            return true;
        }
        int b2 = msc.b(i);
        if (b2 != 0 && b2 == 21) {
            return true;
        }
        int b3 = msc.b(i);
        if (b3 != 0 && b3 == 18) {
            return true;
        }
        int b4 = msc.b(i);
        if (b4 != 0 && b4 == 27) {
            return true;
        }
        int b5 = msc.b(i);
        if (b5 != 0 && b5 == 29) {
            return true;
        }
        int b6 = msc.b(i);
        if (b6 != 0 && b6 == 19) {
            return true;
        }
        int b7 = msc.b(i);
        if (b7 != 0 && b7 == 20) {
            return true;
        }
        int b8 = msc.b(i);
        if (b8 != 0 && b8 == 23) {
            return true;
        }
        int b9 = msc.b(i);
        if (b9 != 0 && b9 == 26) {
            return true;
        }
        int b10 = msc.b(i);
        if (b10 != 0 && b10 == 28) {
            return true;
        }
        int b11 = msc.b(i);
        if (b11 != 0 && b11 == 31) {
            return true;
        }
        int b12 = msc.b(i);
        return b12 != 0 && b12 == 33;
    }
}
