package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class n implements g {
    private final j$.time.temporal.n a;
    private final x b;
    private final t c;
    private volatile j d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(j$.time.temporal.a aVar, x xVar, b bVar) {
        this.a = aVar;
        this.b = xVar;
        this.c = bVar;
    }

    @Override // j$.time.format.g
    public final boolean a(r rVar, StringBuilder sb) {
        String c;
        Long e = rVar.e(this.a);
        if (e == null) {
            return false;
        }
        j$.time.chrono.g gVar = (j$.time.chrono.g) rVar.d().i(j$.time.temporal.p.a());
        if (gVar != null && gVar != j$.time.chrono.h.a) {
            c = this.c.b(gVar, this.a, e.longValue(), this.b, rVar.c());
        } else {
            c = this.c.c(this.a, e.longValue(), this.b, rVar.c());
        }
        if (c == null) {
            if (this.d == null) {
                this.d = new j(this.a, 1, 19, w.NORMAL);
            }
            return this.d.a(rVar, sb);
        }
        sb.append(c);
        return true;
    }

    public final String toString() {
        x xVar = x.FULL;
        j$.time.temporal.n nVar = this.a;
        x xVar2 = this.b;
        if (xVar2 == xVar) {
            String valueOf = String.valueOf(nVar);
            return "Text(" + valueOf + ")";
        }
        String valueOf2 = String.valueOf(nVar);
        String valueOf3 = String.valueOf(xVar2);
        return "Text(" + valueOf2 + "," + valueOf3 + ")";
    }
}
