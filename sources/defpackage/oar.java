package defpackage;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* renamed from: oar  reason: default package */
/* loaded from: classes2.dex */
public final class oar extends nxu implements ogo {
    private static final ntn J;
    public static final nuj p;
    public int A;
    public final ofu B;
    public final ogr C;
    public final ogh D;
    public ogp G;
    public final /* synthetic */ ogc I;
    private final int K;
    private int L;
    public nvu q;
    public num r;
    public boolean t;
    public final Object u;
    public List v;
    public Charset s = lel.b;
    public final our w = new our();
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean E = true;
    public int H = -1;
    public final oix F = oiv.a;

    static {
        oaq oaqVar = new oaq(0);
        J = oaqVar;
        p = nto.b(":status", oaqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oar(ogc ogcVar, int i, ofg ofgVar, Object obj, ofu ofuVar, ogr ogrVar, ogh oghVar, int i2) {
        super(i, ofgVar, ogcVar.b);
        this.I = ogcVar;
        this.u = obj;
        this.B = ofuVar;
        this.C = ogrVar;
        this.D = oghVar;
        this.A = i2;
        this.L = i2;
        this.K = i2;
    }

    public static Charset i(num numVar) {
        String str = (String) numVar.b(oao.h);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return lel.b;
    }

    public static void j(num numVar) {
        numVar.d(p);
        numVar.d(ntq.b);
        numVar.d(ntq.a);
    }

    @Override // defpackage.nxu, defpackage.ocr
    public final void e(boolean z) {
        if (!this.m) {
            this.D.g(this.H, null, nyv.PROCESSED, false, ohf.CANCEL, null);
        } else {
            this.D.g(this.H, null, nyv.PROCESSED, false, null, null);
        }
        jdg.G(this.n, "status should have been reported on deframer closed");
        this.k = true;
        if (this.o && z) {
            f(nvu.k.f("Encountered end-of-stream mid-frame"), true, new num());
        }
        Runnable runnable = this.l;
        if (runnable != null) {
            runnable.run();
            this.l = null;
        }
    }

    public final nvu h(num numVar) {
        Integer num = (Integer) numVar.b(p);
        if (num == null) {
            return nvu.k.f("Missing HTTP status code");
        }
        String str = (String) numVar.b(oao.h);
        if (oao.g(str)) {
            return null;
        }
        return oao.a(num.intValue()).b("invalid content-type: ".concat(String.valueOf(str)));
    }

    public final ogp k() {
        ogp ogpVar;
        synchronized (this.u) {
            ogpVar = this.G;
        }
        return ogpVar;
    }

    @Override // defpackage.ocr
    public final void l(int i) {
        int i2 = this.L - i;
        this.L = i2;
        int i3 = this.K;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.A += i4;
            this.L = i2 + i4;
            this.B.h(this.H, i4);
        }
    }

    public final void m(nvu nvuVar, boolean z, num numVar) {
        if (this.z) {
            return;
        }
        this.z = true;
        if (this.E) {
            ogh oghVar = this.D;
            ogc ogcVar = this.I;
            oghVar.w.remove(ogcVar);
            oghVar.h(ogcVar);
            this.v = null;
            this.w.y();
            this.E = false;
            if (numVar == null) {
                numVar = new num();
            }
            f(nvuVar, true, numVar);
            return;
        }
        this.D.g(this.H, nvuVar, nyv.PROCESSED, z, ohf.CANCEL, numVar);
    }

    @Override // defpackage.ocr
    public final void n(Throwable th) {
        m(nvu.d(th), true, new num());
    }

    public final void o() {
        jdg.F(this.i != null);
        synchronized (this.b) {
            jdg.G(!this.f, "Already allocated");
            this.f = true;
        }
        super.b();
        ofo ofoVar = this.c;
        ofoVar.b++;
        ofoVar.a.a();
    }

    public final void p(nvu nvuVar, num numVar) {
        m(nvuVar, false, numVar);
    }
}
