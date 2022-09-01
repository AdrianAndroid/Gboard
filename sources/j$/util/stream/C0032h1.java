package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.h1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0032h1 extends AbstractC0038j1 implements j$.util.p {
    final /* synthetic */ AbstractC0035i1 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0032h1(AbstractC0035i1 abstractC0035i1, int i, int i2, int i3, int i4) {
        super(abstractC0035i1, i, i2, i3, i4);
        this.g = abstractC0035i1;
    }

    @Override // j$.util.stream.AbstractC0038j1
    final void c(int i, Object obj, Object obj2) {
        ((j$.util.function.i) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.AbstractC0038j1
    final j$.util.q d(Object obj, int i, int i2) {
        return j$.util.F.l((long[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.AbstractC0038j1
    final j$.util.q e(int i, int i2, int i3, int i4) {
        return new C0032h1(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean f(Consumer consumer) {
        return AbstractC0002b.q(this, consumer);
    }

    @Override // j$.util.r
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0002b.e(this, consumer);
    }
}
