package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.Objects;
import java.util.Comparator;

/* renamed from: j$.util.stream.j1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0038j1 implements j$.util.q {
    int a;
    final int b;
    int c;
    final int d;
    Object e;
    final /* synthetic */ AbstractC0041k1 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0038j1(AbstractC0041k1 abstractC0041k1, int i, int i2, int i3, int i4) {
        this.f = abstractC0041k1;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = abstractC0041k1.e;
        this.e = objArr == null ? abstractC0041k1.d : objArr[i];
    }

    abstract void c(int i, Object obj, Object obj2);

    @Override // j$.util.r
    public final int characteristics() {
        return 16464;
    }

    abstract j$.util.q d(Object obj, int i, int i2);

    abstract j$.util.q e(int i, int i2, int i3, int i4);

    @Override // j$.util.r
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return i2 - this.c;
        }
        long[] jArr = this.f.c;
        return ((jArr[i3] + i2) - jArr[i]) - this.c;
    }

    @Override // j$.util.q
    /* renamed from: forEachRemaining */
    public final void l(Object obj) {
        AbstractC0041k1 abstractC0041k1;
        Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                abstractC0041k1 = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = abstractC0041k1.e[i];
                abstractC0041k1.n(obj2, i4, abstractC0041k1.o(obj2), obj);
                i++;
                i4 = 0;
            }
            abstractC0041k1.n(this.a == i3 ? this.e : abstractC0041k1.e[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
    }

    @Override // j$.util.r
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.r
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0002b.h(this);
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0002b.j(this, i);
    }

    @Override // j$.util.q
    /* renamed from: tryAdvance */
    public final boolean k(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.b;
        if (i < i2 || (i == i2 && this.c < this.d)) {
            Object obj2 = this.e;
            int i3 = this.c;
            this.c = i3 + 1;
            c(i3, obj2, obj);
            int i4 = this.c;
            Object obj3 = this.e;
            AbstractC0041k1 abstractC0041k1 = this.f;
            if (i4 == abstractC0041k1.o(obj3)) {
                this.c = 0;
                int i5 = this.a + 1;
                this.a = i5;
                Object[] objArr = abstractC0041k1.e;
                if (objArr != null && i5 <= i2) {
                    this.e = objArr[i5];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.r
    public final j$.util.r trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            AbstractC0041k1 abstractC0041k1 = this.f;
            j$.util.q e = e(i, i3, i4, abstractC0041k1.o(abstractC0041k1.e[i3]));
            this.a = i2;
            this.c = 0;
            this.e = abstractC0041k1.e[i2];
            return e;
        }
        if (i == i2) {
            int i5 = this.c;
            int i6 = (this.d - i5) / 2;
            if (i6 != 0) {
                j$.util.q d = d(this.e, i5, i6);
                this.c += i6;
                return d;
            }
        }
        return null;
    }
}
