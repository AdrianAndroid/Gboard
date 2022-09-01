package j$.util.stream;

import j$.util.function.Function;

/* loaded from: classes3.dex */
final class P0 extends S0 {
    public final /* synthetic */ int s;
    final /* synthetic */ Function t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(AbstractC0015c abstractC0015c, int i, Function function, int i2) {
        super(abstractC0015c, i);
        this.s = i2;
        this.t = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0015c
    public final X0 Z(int i, X0 x0) {
        switch (this.s) {
            case 0:
                return new C0036j(this, x0, 2);
            default:
                return new C0033i(this, x0);
        }
    }
}
