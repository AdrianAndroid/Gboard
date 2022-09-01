package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V extends Y implements J {
    /* JADX INFO: Access modifiers changed from: package-private */
    public V(J j, J j2) {
        super(j, j2);
    }

    @Override // j$.util.stream.N
    /* renamed from: c */
    public final /* synthetic */ void i(Double[] dArr, int i) {
        E.h(this, dArr, i);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void forEach(Consumer consumer) {
        E.k(this, consumer);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.n(this, j, j2);
    }

    @Override // j$.util.stream.M
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.q mo59spliterator() {
        return new C0046m0(this);
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator  reason: collision with other method in class */
    public final j$.util.r mo59spliterator() {
        return new C0046m0(this);
    }
}
