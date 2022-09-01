package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o implements g {
    private final j$.time.temporal.q a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(a aVar) {
        this.a = aVar;
    }

    @Override // j$.time.format.g
    public final boolean a(r rVar, StringBuilder sb) {
        j$.time.n nVar = (j$.time.n) rVar.f(this.a);
        if (nVar == null) {
            return false;
        }
        sb.append(nVar.j());
        return true;
    }

    public final String toString() {
        return "ZoneRegionId()";
    }
}
