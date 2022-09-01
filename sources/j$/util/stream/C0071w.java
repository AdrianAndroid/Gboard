package j$.util.stream;

/* renamed from: j$.util.stream.w  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0071w extends AbstractC0075y {
    public final /* synthetic */ int s;
    final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0071w(AbstractC0015c abstractC0015c, int i, Object obj, int i2) {
        super(abstractC0015c, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0015c
    public final X0 Z(int i, X0 x0) {
        switch (this.s) {
            case 0:
                return new C0067u(this, x0, 1);
            default:
                return new C0036j(this, x0, 3);
        }
    }
}
