package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X extends Y implements L {
    /* JADX INFO: Access modifiers changed from: package-private */
    public X(L l, L l2) {
        super(l, l2);
    }

    @Override // j$.util.stream.N
    /* renamed from: c */
    public final /* synthetic */ void i(Long[] lArr, int i) {
        E.j(this, lArr, i);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void forEach(Consumer consumer) {
        E.m(this, consumer);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.p(this, j, j2);
    }

    @Override // j$.util.stream.M
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.q mo59spliterator() {
        return new C0052o0(this);
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator  reason: collision with other method in class */
    public final j$.util.r mo59spliterator() {
        return new C0052o0(this);
    }
}
