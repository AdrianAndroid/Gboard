package defpackage;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: osk  reason: default package */
/* loaded from: classes2.dex */
public final class osk implements orn {
    private static final List b = oqs.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List c = oqs.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    final orj a;
    private final osz d;
    private otf e;
    private final oqe f;
    private final orr g;

    public osk(oqd oqdVar, orr orrVar, orj orjVar, osz oszVar) {
        this.g = orrVar;
        this.a = orjVar;
        this.d = oszVar;
        this.f = oqdVar.e.contains(oqe.H2_PRIOR_KNOWLEDGE) ? oqe.H2_PRIOR_KNOWLEDGE : oqe.HTTP_2;
    }

    @Override // defpackage.orn
    public final oqk a(boolean z) {
        opx a = this.e.a();
        oqe oqeVar = this.f;
        mlu mluVar = new mlu((byte[]) null);
        int a2 = a.a();
        oru oruVar = null;
        for (int i = 0; i < a2; i++) {
            String c2 = a.c(i);
            String d = a.d(i);
            if (c2.equals(":status")) {
                oruVar = oru.a("HTTP/1.1 ".concat(String.valueOf(d)));
            } else if (!c.contains(c2)) {
                mluVar.F(c2, d);
            }
        }
        if (oruVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        oqk oqkVar = new oqk();
        oqkVar.b = oqeVar;
        oqkVar.c = oruVar.b;
        oqkVar.d = oruVar.c;
        oqkVar.e(mluVar.D());
        if (z && oqkVar.c == 100) {
            return null;
        }
        return oqkVar;
    }

    @Override // defpackage.orn
    public final oqn b(oql oqlVar) {
        return new ors(oqlVar.a("Content-Type"), orq.d(oqlVar), oix.e(new osj(this, this.e.g)));
    }

    @Override // defpackage.orn
    public final ovn c(oqi oqiVar, long j) {
        return this.e.b();
    }

    @Override // defpackage.orn
    public final void d() {
        otf otfVar = this.e;
        if (otfVar != null) {
            otfVar.k(9);
        }
    }

    @Override // defpackage.orn
    public final void e() {
        this.e.b().close();
    }

    @Override // defpackage.orn
    public final void f() {
        this.d.e();
    }

    @Override // defpackage.orn
    public final void g(oqi oqiVar) {
        int i;
        otf otfVar;
        if (this.e == null) {
            boolean z = false;
            boolean z2 = oqiVar.d != null;
            opx opxVar = oqiVar.c;
            ArrayList arrayList = new ArrayList(opxVar.a() + 4);
            arrayList.add(new ose(ose.c, oqiVar.b));
            arrayList.add(new ose(ose.d, ofb.c(oqiVar.a)));
            String a = oqiVar.a("Host");
            if (a != null) {
                arrayList.add(new ose(ose.f, a));
            }
            arrayList.add(new ose(ose.e, oqiVar.a.a));
            int a2 = opxVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                ouu h = ouu.h(opxVar.c(i2).toLowerCase(Locale.US));
                if (!b.contains(h.e())) {
                    arrayList.add(new ose(h, opxVar.d(i2)));
                }
            }
            osz oszVar = this.d;
            boolean z3 = !z2;
            synchronized (oszVar.p) {
                synchronized (oszVar) {
                    if (oszVar.g > 1073741823) {
                        oszVar.l(8);
                    }
                    if (!oszVar.h) {
                        i = oszVar.g;
                        oszVar.g = i + 2;
                        otfVar = new otf(i, oszVar, z3, false, null);
                        if (!z2 || oszVar.k == 0 || otfVar.b == 0) {
                            z = true;
                        }
                        if (otfVar.i()) {
                            oszVar.d.put(Integer.valueOf(i), otfVar);
                        }
                    } else {
                        throw new osd();
                    }
                }
                oszVar.p.j(z3, i, arrayList);
            }
            if (z) {
                oszVar.p.d();
            }
            this.e = otfVar;
            otfVar.i.f(this.g.h, TimeUnit.MILLISECONDS);
            this.e.j.f(this.g.i, TimeUnit.MILLISECONDS);
        }
    }
}
