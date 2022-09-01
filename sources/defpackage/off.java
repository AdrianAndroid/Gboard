package defpackage;

/* compiled from: PG */
/* renamed from: off  reason: default package */
/* loaded from: classes2.dex */
public final class off implements oda {
    private final /* synthetic */ int a;
    private final Object b;

    public off(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private off(ofd ofdVar, int i) {
        this.a = i;
        this.b = ofdVar;
    }

    public static off c(ofd ofdVar) {
        return new off(ofdVar, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ofd] */
    @Override // defpackage.oda
    public final Object a() {
        return this.a != 0 ? this.b : ofe.a(this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ofd] */
    @Override // defpackage.oda
    public final void b(Object obj) {
        if (this.a != 0) {
            return;
        }
        ofe.d(this.b, obj);
    }
}
