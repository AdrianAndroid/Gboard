package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.d1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0020d1 extends AbstractC0038j1 implements j$.util.n {
    final /* synthetic */ AbstractC0023e1 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020d1(AbstractC0023e1 abstractC0023e1, int i, int i2, int i3, int i4) {
        super(abstractC0023e1, i, i2, i3, i4);
        this.g = abstractC0023e1;
    }

    @Override // j$.util.stream.AbstractC0038j1
    final void c(int i, Object obj, Object obj2) {
        ((j$.util.function.c) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.AbstractC0038j1
    final j$.util.q d(Object obj, int i, int i2) {
        return j$.util.F.j((double[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.AbstractC0038j1
    final j$.util.q e(int i, int i2, int i3, int i4) {
        return new C0020d1(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean f(Consumer consumer) {
        return AbstractC0002b.o(this, consumer);
    }

    @Override // j$.util.r
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0002b.c(this, consumer);
    }
}
