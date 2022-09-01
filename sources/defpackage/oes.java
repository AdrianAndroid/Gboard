package defpackage;

/* compiled from: PG */
/* renamed from: oes  reason: default package */
/* loaded from: classes2.dex */
public final class oes extends nzh {
    final /* synthetic */ nsn a;
    final /* synthetic */ oix b;
    final /* synthetic */ String c;
    final /* synthetic */ oew d;
    final /* synthetic */ oep e;
    final /* synthetic */ mld f;
    final /* synthetic */ ofg g;
    final /* synthetic */ num h;
    final /* synthetic */ oet i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oes(oet oetVar, nsn nsnVar, oix oixVar, String str, oew oewVar, oep oepVar, mld mldVar, ofg ofgVar, num numVar) {
        super(nsnVar);
        this.i = oetVar;
        this.a = nsnVar;
        this.b = oixVar;
        this.c = str;
        this.d = oewVar;
        this.e = oepVar;
        this.f = mldVar;
        this.g = ofgVar;
        this.h = numVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [nvm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [nvm] */
    @Override // defpackage.nzh
    public final void a() {
        int i = oiw.a;
        try {
            oqv oqvVar = (oqv) ((oav) this.i.c.t).a.get(this.c);
            if (oqvVar == null) {
                this.d.m();
                oqvVar = null;
            }
            if (oqvVar == null) {
                nvu f = nvu.j.f("Method not found: " + this.c);
                this.e.g(oeu.c);
                this.d.e(f, new num());
                this.a.j(null);
                this.f.cancel(false);
                return;
            }
            oet oetVar = this.i;
            oew oewVar = this.d;
            ofg ofgVar = this.g;
            oewVar.a();
            oewVar.m();
            nxp[] nxpVarArr = ofgVar.b;
            if (nxpVarArr.length > 0) {
                nxp nxpVar = nxpVarArr[0];
                throw null;
            }
            Object obj = oqvVar.b;
            nxp[] nxpVarArr2 = oetVar.c.u;
            int length = nxpVarArr2.length;
            oil oilVar = obj;
            int i2 = 0;
            while (i2 < length) {
                i2++;
                oilVar = new oil(nxpVarArr2[i2], oilVar, 1, null, null, null);
            }
            oqv oqvVar2 = new oqv((nuq) oqvVar.a, (nvm) oilVar);
            oew oewVar2 = this.d;
            num numVar = this.h;
            nsn nsnVar = this.a;
            oix oixVar = this.b;
            Object obj2 = oqvVar2.a;
            oeu oeuVar = this.i.c;
            this.f.c(new oqv(new oek(oewVar2, (nuq) obj2, numVar, nsnVar, oeuVar.q, oeuVar.s, oixVar), (nvm) oqvVar2.b));
        } finally {
        }
    }
}
