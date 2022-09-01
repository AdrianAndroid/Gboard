package defpackage;

/* compiled from: PG */
/* renamed from: pau  reason: default package */
/* loaded from: classes2.dex */
public final class pau implements ozr {
    final Object a;
    final Object b;
    private final /* synthetic */ int c;

    public pau(mok mokVar, pao paoVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.a = mokVar;
        this.b = paoVar;
    }

    public pau(ozr ozrVar, ols olsVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.b = ozrVar;
        this.a = olsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pao] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ozr, java.lang.Object] */
    @Override // defpackage.pan
    public final /* synthetic */ void a(Object obj) {
        if (this.c == 0) {
            ozs ozsVar = (ozs) obj;
            pat patVar = new pat(ozsVar, this.b);
            ozsVar.c(patVar);
            ((mok) this.a).d(patVar);
            return;
        }
        ozy ozyVar = new ozy(((paa) this.a).a);
        ozs ozsVar2 = (ozs) obj;
        pas pasVar = new pas(ozsVar2, ozyVar);
        ozsVar2.c(ozyVar);
        ozsVar2.c(pasVar);
        this.b.a(pasVar);
    }
}
