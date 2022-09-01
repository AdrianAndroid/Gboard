package j$.util.concurrent;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class j extends q implements j$.util.r {
    public final /* synthetic */ int i;
    long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i, int i2, int i3, long j, int i4) {
        super(lVarArr, i, i2, i3);
        this.i = i4;
        this.j = j;
    }

    @Override // j$.util.r
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.r
    public final long estimateSize() {
        switch (this.i) {
            case 0:
                return this.j;
            default:
                return this.j;
        }
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                l c = c();
                if (c == null) {
                    return false;
                }
                consumer.accept(c.b);
                return true;
            default:
                consumer.getClass();
                l c2 = c();
                if (c2 == null) {
                    return false;
                }
                consumer.accept(c2.c);
                return true;
        }
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l c = c();
                    if (c != null) {
                        consumer.accept(c.b);
                    } else {
                        return;
                    }
                }
            default:
                if (consumer == null) {
                    throw null;
                }
                while (true) {
                    l c2 = c();
                    if (c2 != null) {
                        consumer.accept(c2.c);
                    } else {
                        return;
                    }
                }
        }
    }

    @Override // j$.util.r
    public final Comparator getComparator() {
        switch (this.i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.r
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
            case 0:
                return AbstractC0002b.h(this);
            default:
                return AbstractC0002b.h(this);
        }
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
            case 0:
                return AbstractC0002b.j(this, i);
            default:
                return AbstractC0002b.j(this, i);
        }
    }

    @Override // j$.util.r
    public final j$.util.r trySplit() {
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                l[] lVarArr = this.a;
                int i4 = this.h;
                this.g = i3;
                long j = this.j >>> 1;
                this.j = j;
                return new j(lVarArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f;
                int i6 = this.g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                l[] lVarArr2 = this.a;
                int i8 = this.h;
                this.g = i7;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new j(lVarArr2, i8, i7, i6, j2, 1);
        }
    }
}
