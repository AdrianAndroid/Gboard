package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: ork  reason: default package */
/* loaded from: classes2.dex */
public final class ork implements oqa {
    private final opq a;

    public ork(opq opqVar) {
        this.a = opqVar;
    }

    @Override // defpackage.oqa
    public final oql a(orr orrVar) {
        boolean z;
        oqi oqiVar = orrVar.d;
        osr d = oqiVar.d();
        oqj oqjVar = oqiVar.d;
        if (oqjVar != null) {
            long a = oqjVar.a();
            if (a != -1) {
                d.c("Content-Length", Long.toString(a));
                d.f("Transfer-Encoding");
            } else {
                d.c("Transfer-Encoding", "chunked");
                d.f("Content-Length");
            }
        }
        if (oqiVar.a("Host") == null) {
            d.c("Host", oqs.j(oqiVar.a, false));
        }
        if (oqiVar.a("Connection") == null) {
            d.c("Connection", "Keep-Alive");
        }
        if (oqiVar.a("Accept-Encoding") == null && oqiVar.a("Range") == null) {
            d.c("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List a2 = this.a.a(oqiVar.a);
        if (!a2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                opo opoVar = (opo) a2.get(i);
                sb.append(opoVar.a);
                sb.append('=');
                sb.append(opoVar.b);
            }
            d.c("Cookie", sb.toString());
        }
        if (oqiVar.a("User-Agent") == null) {
            d.c("User-Agent", "okhttp/3.12.1");
        }
        oql a3 = orrVar.a(d.a());
        orq.g(this.a, oqiVar.a, a3.f);
        oqk c = a3.c();
        c.a = oqiVar;
        if (z && "gzip".equalsIgnoreCase(a3.a("Content-Encoding")) && orq.h(a3)) {
            ouy ouyVar = new ouy(a3.g.c());
            mlu h = a3.f.h();
            h.G("Content-Encoding");
            h.G("Content-Length");
            c.e(h.D());
            c.f = new ors(a3.a("Content-Type"), -1L, oix.e(ouyVar));
        }
        return c.a();
    }
}
