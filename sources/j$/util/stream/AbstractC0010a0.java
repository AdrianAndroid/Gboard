package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0010a0 implements J {
    final double[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0010a0(long j) {
        if (j < 2147483639) {
            this.a = new double[(int) j];
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a */
    public final M mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.M
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // j$.util.stream.N
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.M
    public final void f(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void forEach(Consumer consumer) {
        E.k(this, consumer);
    }

    @Override // j$.util.stream.M
    public final void g(Object obj) {
        j$.util.function.c cVar = (j$.util.function.c) obj;
        for (int i = 0; i < this.b; i++) {
            cVar.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ Object[] l(IntFunction intFunction) {
        return E.g(this, intFunction);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.n(this, j, j2);
    }

    @Override // j$.util.stream.N
    /* renamed from: n */
    public final /* synthetic */ void i(Double[] dArr, int i) {
        E.h(this, dArr, i);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.q mo59spliterator() {
        return j$.util.F.j(this.a, 0, this.b);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ N mo61a(int i) {
        mo61a(i);
        throw null;
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: spliterator  reason: collision with other method in class */
    public final j$.util.r mo59spliterator() {
        return j$.util.F.j(this.a, 0, this.b);
    }
}
