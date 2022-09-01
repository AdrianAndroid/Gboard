package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0063s0 implements L {
    final long[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0063s0(long j) {
        if (j < 2147483639) {
            this.a = new long[(int) j];
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
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.N
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.M
    public final void f(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void forEach(Consumer consumer) {
        E.m(this, consumer);
    }

    @Override // j$.util.stream.M
    public final void g(Object obj) {
        j$.util.function.i iVar = (j$.util.function.i) obj;
        for (int i = 0; i < this.b; i++) {
            iVar.accept(this.a[i]);
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
        return E.p(this, j, j2);
    }

    @Override // j$.util.stream.N
    /* renamed from: n */
    public final /* synthetic */ void i(Long[] lArr, int i) {
        E.j(this, lArr, i);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.q mo59spliterator() {
        return j$.util.F.l(this.a, 0, this.b);
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
        return j$.util.F.l(this.a, 0, this.b);
    }
}
