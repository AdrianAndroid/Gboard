package j$.util.stream;

import j$.util.function.IntFunction;
import j$.util.function.IntPredicate;

/* renamed from: j$.util.stream.u  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0067u extends U0 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0015c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0067u(AbstractC0015c abstractC0015c, X0 x0, int i) {
        super(x0);
        this.b = i;
        this.c = abstractC0015c;
    }

    @Override // j$.util.stream.W0, j$.util.stream.X0
    public final void accept(int i) {
        int i2 = this.b;
        X0 x0 = this.a;
        AbstractC0015c abstractC0015c = this.c;
        switch (i2) {
            case 0:
                x0.accept((X0) ((IntFunction) ((C0069v) abstractC0015c).t).apply(i));
                return;
            default:
                if (((IntPredicate) ((C0071w) abstractC0015c).t).test(i)) {
                    x0.accept(i);
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        int i = this.b;
        X0 x0 = this.a;
        switch (i) {
            case 1:
                x0.c(-1L);
                return;
            default:
                x0.c(j);
                return;
        }
    }
}
