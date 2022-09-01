package defpackage;

/* compiled from: PG */
/* renamed from: ayz  reason: default package */
/* loaded from: classes.dex */
public final class ayz implements azo {
    private final /* synthetic */ int a;
    private final Object b;

    public ayz(int i, byte[] bArr) {
        this.a = i;
        this.b = new cy();
    }

    public ayz(azb azbVar, int i) {
        this.a = i;
        this.b = azbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [azb, java.lang.Object] */
    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        return this.a != 0 ? new azs(1) : new azd((azb) this.b, 0);
    }

    @Override // defpackage.azo
    public final void c() {
    }
}
