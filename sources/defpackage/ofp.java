package defpackage;

/* compiled from: PG */
/* renamed from: ofp  reason: default package */
/* loaded from: classes2.dex */
final class ofp extends ofr {
    final /* synthetic */ ofs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofp(ofs ofsVar) {
        super(ofsVar);
        this.a = ofsVar;
        int i = oiw.a;
    }

    @Override // defpackage.ofr
    public final void a() {
        int i;
        int i2 = oiw.a;
        our ourVar = new our();
        synchronized (this.a.a) {
            our ourVar2 = this.a.b;
            ourVar.ik(ourVar2, ourVar2.g());
            ofs ofsVar = this.a;
            ofsVar.d = false;
            i = ofsVar.i;
        }
        this.a.f.ik(ourVar, ourVar.b);
        synchronized (this.a.a) {
            this.a.i -= i;
        }
    }
}
