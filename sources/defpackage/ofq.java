package defpackage;

/* compiled from: PG */
/* renamed from: ofq  reason: default package */
/* loaded from: classes2.dex */
final class ofq extends ofr {
    final /* synthetic */ ofs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofq(ofs ofsVar) {
        super(ofsVar);
        this.a = ofsVar;
        int i = oiw.a;
    }

    @Override // defpackage.ofr
    public final void a() {
        int i = oiw.a;
        our ourVar = new our();
        synchronized (this.a.a) {
            our ourVar2 = this.a.b;
            ourVar.ik(ourVar2, ourVar2.b);
            this.a.e = false;
        }
        this.a.f.ik(ourVar, ourVar.b);
        this.a.f.flush();
    }
}
