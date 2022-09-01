package defpackage;

import java.net.ProtocolException;

/* compiled from: PG */
/* renamed from: orm  reason: default package */
/* loaded from: classes2.dex */
public final class orm implements oqa {
    public static final /* synthetic */ orm a = new orm(2);
    private final /* synthetic */ int b;

    public orm(int i) {
        this.b = i;
    }

    @Override // defpackage.oqa
    public final oql a(orr orrVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                oql a2 = orrVar.a(orrVar.d);
                if (a2.c != 200) {
                    return a2;
                }
                oqk c = a2.c();
                c.d("Cache-Control", faa.b.toString());
                c.l.G("Pragma");
                return c.a();
            }
            return ouk.a(orrVar);
        }
        orn ornVar = orrVar.b;
        orj orjVar = orrVar.a;
        orf orfVar = orrVar.c;
        oqi oqiVar = orrVar.d;
        long currentTimeMillis = System.currentTimeMillis();
        ornVar.g(oqiVar);
        orrVar.f.a(oqiVar);
        oqk oqkVar = null;
        if (ofb.e(oqiVar.b) && oqiVar.d != null) {
            if ("100-continue".equalsIgnoreCase(oqiVar.a("Expect"))) {
                ornVar.f();
                oqkVar = ornVar.a(true);
            }
            if (oqkVar == null) {
                ous d = oix.d(new orl(ornVar.c(oqiVar, oqiVar.d.a())));
                oqiVar.d.b(d);
                d.close();
            } else if (!orfVar.g()) {
                orjVar.d();
            }
        }
        ornVar.e();
        if (oqkVar == null) {
            oqkVar = ornVar.a(false);
        }
        oqkVar.a = oqiVar;
        oqkVar.e = orjVar.b().e;
        oqkVar.j = currentTimeMillis;
        oqkVar.k = System.currentTimeMillis();
        oql a3 = oqkVar.a();
        int i2 = a3.c;
        if (i2 == 100) {
            oqk a4 = ornVar.a(false);
            a4.a = oqiVar;
            a4.e = orjVar.b().e;
            a4.j = currentTimeMillis;
            a4.k = System.currentTimeMillis();
            a3 = a4.a();
            i2 = a3.c;
        }
        orrVar.f.b();
        oqk c2 = a3.c();
        c2.f = ornVar.b(a3);
        oql a5 = c2.a();
        if ("close".equalsIgnoreCase(a5.a.a("Connection")) || "close".equalsIgnoreCase(a5.a("Connection"))) {
            orjVar.d();
        }
        if (i2 != 204) {
            if (i2 == 205) {
                i2 = 205;
            }
            return a5;
        }
        if (a5.g.a() > 0) {
            long a6 = a5.g.a();
            throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a6);
        }
        return a5;
    }
}
