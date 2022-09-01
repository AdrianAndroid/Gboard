package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class Q implements N {
    final Object[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(long j, IntFunction intFunction) {
        if (j < 2147483639) {
            this.a = (Object[]) intFunction.apply((int) j);
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // j$.util.stream.N
    /* renamed from: a */
    public final N mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.N
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.N
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.N
    public final void i(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.N
    public final Object[] l(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.q(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.r mo59spliterator() {
        return j$.util.F.m(this.a, 0, this.b);
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
