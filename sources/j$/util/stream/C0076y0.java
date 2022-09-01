package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0076y0 extends C0044l1 implements N, I {
    @Override // j$.util.stream.N
    /* renamed from: a */
    public final N mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.stream.C0044l1, j$.util.function.Consumer
    public final void accept(Object obj) {
        super.accept(obj);
    }

    @Override // j$.util.stream.I
    /* renamed from: build */
    public final N mo62build() {
        return this;
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        clear();
        n(j);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.C0044l1, j$.util.stream.N
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // j$.util.stream.N
    public final void i(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, objArr, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object[] objArr2 = this.e[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.e[i2].length;
        }
        int i3 = this.a;
        if (i3 <= 0) {
            return;
        }
        System.arraycopy(this.d, 0, objArr, i, i3);
    }

    @Override // j$.util.stream.X0
    public final void j() {
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.N
    public final Object[] l(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            i(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.q(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.C0044l1, java.lang.Iterable
    public final j$.util.r spliterator() {
        return super.spliterator();
    }
}
