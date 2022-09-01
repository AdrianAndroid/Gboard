package defpackage;

/* compiled from: PG */
/* renamed from: eha  reason: default package */
/* loaded from: classes.dex */
final class eha implements oiy {
    private final csh a;
    private final /* synthetic */ int b;

    public eha(csh cshVar, int i) {
        this.b = i;
        this.a = cshVar;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final ctu b() {
        if (this.b == 0) {
            ctu ctuVar = ((csg) this.a).d;
            nxp.W(ctuVar);
            return ctuVar;
        }
        ctu ctuVar2 = ((csg) this.a).d;
        nxp.W(ctuVar2);
        return ctuVar2;
    }
}
