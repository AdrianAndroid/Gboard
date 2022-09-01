package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.e0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0022e0 extends AbstractC0031h0 implements K {
    @Override // j$.util.stream.AbstractC0031h0, j$.util.stream.N
    /* renamed from: a */
    public final M mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.M
    public final Object b() {
        int[] iArr;
        iArr = E.e;
        return iArr;
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

    @Override // j$.util.stream.AbstractC0031h0, j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.o(this, j, j2);
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.q mo59spliterator() {
        return j$.util.F.c();
    }

    @Override // j$.util.stream.AbstractC0031h0, j$.util.stream.N
    /* renamed from: a  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ N mo61a(int i) {
        mo61a(i);
        throw null;
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator  reason: collision with other method in class */
    public final j$.util.r mo59spliterator() {
        return j$.util.F.c();
    }
}
