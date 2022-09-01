package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W extends Y implements K {
    /* JADX INFO: Access modifiers changed from: package-private */
    public W(K k, K k2) {
        super(k, k2);
    }

    @Override // j$.util.stream.N
    /* renamed from: c */
    public final /* synthetic */ void i(Integer[] numArr, int i) {
        E.i(this, numArr, i);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void forEach(Consumer consumer) {
        E.l(this, consumer);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.o(this, j, j2);
    }

    @Override // j$.util.stream.M
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.q mo59spliterator() {
        return new C0049n0(this);
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator  reason: collision with other method in class */
    public final j$.util.r mo59spliterator() {
        return new C0049n0(this);
    }
}
