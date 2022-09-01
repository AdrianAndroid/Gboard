package j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class D extends AbstractC0018d {
    private final C j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(C c, E e, j$.util.r rVar) {
        super(e, rVar);
        this.j = c;
    }

    D(D d, j$.util.r rVar) {
        super(d, rVar);
        this.j = d.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0024f
    public final Object a() {
        boolean z;
        Boolean valueOf;
        AtomicReference atomicReference;
        C c = this.j;
        A a = (A) c.b.get();
        this.a.K(this.b, a);
        boolean z2 = a.b;
        z = c.a.b;
        if (z2 == z && (valueOf = Boolean.valueOf(z2)) != null) {
            do {
                atomicReference = this.h;
                if (atomicReference.compareAndSet(null, valueOf)) {
                    break;
                }
            } while (atomicReference.get() == null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0024f
    public final AbstractC0024f e(j$.util.r rVar) {
        return new D(this, rVar);
    }

    @Override // j$.util.stream.AbstractC0018d
    protected final Object j() {
        boolean z;
        z = this.j.a.b;
        return Boolean.valueOf(!z);
    }
}
