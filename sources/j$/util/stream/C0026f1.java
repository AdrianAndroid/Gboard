package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0026f1 extends AbstractC0038j1 implements j$.util.o {
    final /* synthetic */ C0029g1 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0026f1(C0029g1 c0029g1, int i, int i2, int i3, int i4) {
        super(c0029g1, i, i2, i3, i4);
        this.g = c0029g1;
    }

    @Override // j$.util.stream.AbstractC0038j1
    final void c(int i, Object obj, Object obj2) {
        ((j$.util.function.g) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.AbstractC0038j1
    final j$.util.q d(Object obj, int i, int i2) {
        return j$.util.F.k((int[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.AbstractC0038j1
    final j$.util.q e(int i, int i2, int i3, int i4) {
        return new C0026f1(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean f(Consumer consumer) {
        return AbstractC0002b.p(this, consumer);
    }

    @Override // j$.util.r
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0002b.d(this, consumer);
    }
}
