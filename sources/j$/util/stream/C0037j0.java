package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0037j0 implements K {
    final int[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0037j0(long j) {
        if (j < 2147483639) {
            this.a = new int[(int) j];
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0037j0(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a */
    public final M mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.M
    public final Object b() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // j$.util.stream.N
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.M
    public final void f(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void forEach(Consumer consumer) {
        E.l(this, consumer);
    }

    @Override // j$.util.stream.M
    public final void g(Object obj) {
        j$.util.function.g gVar = (j$.util.function.g) obj;
        for (int i = 0; i < this.b; i++) {
            gVar.accept(this.a[i]);
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
        return E.o(this, j, j2);
    }

    @Override // j$.util.stream.N
    /* renamed from: n */
    public final /* synthetic */ void i(Integer[] numArr, int i) {
        E.i(this, numArr, i);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.q mo59spliterator() {
        return j$.util.F.k(this.a, 0, this.b);
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
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
        return j$.util.F.k(this.a, 0, this.b);
    }
}
