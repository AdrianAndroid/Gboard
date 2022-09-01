package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B1 extends C1 implements j$.util.p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public B1(j$.util.p pVar, long j, long j2) {
        super(pVar, j, j2);
    }

    B1(j$.util.p pVar, long j, long j2, long j3, long j4) {
        super(pVar, j, j2, j3, j4);
    }

    @Override // j$.util.stream.E1
    protected final j$.util.r c(j$.util.r rVar, long j, long j2, long j3, long j4) {
        return new B1((j$.util.p) rVar, j, j2, j3, j4);
    }

    @Override // j$.util.stream.C1
    protected final Object d() {
        return new A1(0);
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
