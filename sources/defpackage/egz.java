package defpackage;

/* compiled from: PG */
/* renamed from: egz  reason: default package */
/* loaded from: classes.dex */
final class egz implements oiy {
    private final csh a;
    private final /* synthetic */ int b;

    public egz(csh cshVar, int i) {
        this.b = i;
        this.a = cshVar;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final hsz b() {
        if (this.b == 0) {
            hsz hszVar = ((csg) this.a).c;
            nxp.W(hszVar);
            return hszVar;
        }
        hsz hszVar2 = ((csg) this.a).c;
        nxp.W(hszVar2);
        return hszVar2;
    }
}
