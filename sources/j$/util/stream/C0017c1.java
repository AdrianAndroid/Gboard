package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.Comparator;

/* renamed from: j$.util.stream.c1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0017c1 implements j$.util.r {
    int a;
    final int b;
    int c;
    final int d;
    Object[] e;
    final /* synthetic */ C0044l1 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0017c1(C0044l1 c0044l1, int i, int i2, int i3, int i4) {
        this.f = c0044l1;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[][] objArr = c0044l1.e;
        this.e = objArr == null ? c0044l1.d : objArr[i];
    }

    @Override // j$.util.r
    public final int characteristics() {
        return 16464;
    }

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

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i = this.a;
        int i2 = this.b;
        if (i < i2 || (i == i2 && this.c < this.d)) {
            Object[] objArr = this.e;
            int i3 = this.c;
            this.c = i3 + 1;
            consumer.accept(objArr[i3]);
            if (this.c == this.e.length) {
                this.c = 0;
                int i4 = this.a + 1;
                this.a = i4;
                Object[][] objArr2 = this.f.e;
                if (objArr2 != null && i4 <= i2) {
                    this.e = objArr2[i4];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        C0044l1 c0044l1;
        Objects.requireNonNull(consumer);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                c0044l1 = this.f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = c0044l1.e[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.a == i3 ? this.e : c0044l1.e[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
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

    @Override // j$.util.r
    public final j$.util.r trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            C0044l1 c0044l1 = this.f;
            C0017c1 c0017c1 = new C0017c1(c0044l1, i, i3, i4, c0044l1.e[i3].length);
            this.a = i2;
            this.c = 0;
            this.e = c0044l1.e[i2];
            return c0017c1;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.c;
            int i6 = (this.d - i5) / 2;
            if (i6 == 0) {
                return null;
            }
            j$.util.r m = j$.util.F.m(this.e, i5, i5 + i6);
            this.c += i6;
            return m;
        }
    }
}
