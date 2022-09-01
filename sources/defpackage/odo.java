package defpackage;

/* compiled from: PG */
/* renamed from: odo  reason: default package */
/* loaded from: classes2.dex */
final class odo implements odt {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public odo(nsj nsjVar, int i) {
        this.b = i;
        this.a = nsjVar;
    }

    public odo(nsv nsvVar, int i) {
        this.b = i;
        this.a = nsvVar;
    }

    public odo(nsy nsyVar, int i) {
        this.b = i;
        this.a = nsyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [nsj, java.lang.Object] */
    @Override // defpackage.odt
    public final void a(oea oeaVar) {
        int i = this.b;
        if (i == 0) {
            oeaVar.a.i((nsv) this.a);
        } else if (i != 1) {
            oeaVar.a.j((nsy) this.a);
        } else {
            oeaVar.a.h(this.a);
        }
    }
}
