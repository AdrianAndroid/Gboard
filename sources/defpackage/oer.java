package defpackage;

/* compiled from: PG */
/* renamed from: oer  reason: default package */
/* loaded from: classes2.dex */
public final class oer extends nzh {
    final /* synthetic */ nsn a;
    final /* synthetic */ mld b;
    final /* synthetic */ num c;
    final /* synthetic */ oew d;
    final /* synthetic */ oep e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oer(nsn nsnVar, mld mldVar, num numVar, oew oewVar, oep oepVar) {
        super(nsnVar);
        this.a = nsnVar;
        this.b = mldVar;
        this.c = numVar;
        this.d = oewVar;
        this.e = oepVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [nvm, java.lang.Object] */
    @Override // defpackage.nzh
    public final void a() {
        int i = oiw.a;
        oex oexVar = oeu.c;
        if (this.b.isCancelled()) {
            return;
        }
        oqv oqvVar = (oqv) kcu.S(this.b);
        nxo a = oqvVar.a.a((nvl) oqvVar.b, this.c);
        Object obj = oqvVar.b;
        this.e.g(new oej((oek) obj, a, ((oek) obj).d, null, null));
        this.a.d(new nyr(this, 3), mjl.a);
    }
}
