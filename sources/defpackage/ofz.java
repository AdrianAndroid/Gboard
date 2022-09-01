package defpackage;

/* compiled from: PG */
/* renamed from: ofz  reason: default package */
/* loaded from: classes2.dex */
public final class ofz implements ocg {
    final /* synthetic */ nug a;
    private final /* synthetic */ int b;

    public ofz(mot motVar, int i) {
        this.b = i;
        this.a = motVar;
    }

    public ofz(ogb ogbVar, int i) {
        this.b = i;
        this.a = ogbVar;
    }

    @Override // defpackage.ocg
    public final nyz a() {
        if (this.b == 0) {
            ogb ogbVar = (ogb) this.a;
            return new oga(ogbVar.d, ogbVar.e, ogbVar.b(), ogbVar.f, ogbVar.h, null, null);
        }
        mot motVar = (mot) this.a;
        return new mos(motVar.b, motVar.g, motVar.f, motVar.d, motVar.c.d, motVar.e);
    }
}
