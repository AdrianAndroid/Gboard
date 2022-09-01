package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.function.Supplier;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0059q1 implements j$.util.r {
    final boolean a;
    final E b;
    private Supplier c;
    j$.util.r d;
    X0 e;
    C0009a f;
    long g;
    AbstractC0021e h;
    boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0059q1(E e, j$.util.r rVar, boolean z) {
        this.b = e;
        this.c = null;
        this.d = rVar;
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0059q1(E e, C0009a c0009a, boolean z) {
        this.b = e;
        this.c = c0009a;
        this.d = null;
        this.a = z;
    }

    private boolean d() {
        while (this.h.count() == 0) {
            if (this.e.e() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.j();
                this.i = true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        AbstractC0021e abstractC0021e = this.h;
        boolean z = false;
        if (abstractC0021e == null) {
            if (this.i) {
                return false;
            }
            e();
            h();
            this.g = 0L;
            this.e.c(this.d.getExactSizeIfKnown());
            return d();
        }
        long j = this.g + 1;
        this.g = j;
        if (j < abstractC0021e.count()) {
            z = true;
        }
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return d();
    }

    @Override // j$.util.r
    public final int characteristics() {
        e();
        int g = EnumC0053o1.g(this.b.F()) & EnumC0053o1.f;
        if ((g & 64) != 0) {
            return (g & (-16449)) | (this.d.characteristics() & 16448);
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.d == null) {
            this.d = (j$.util.r) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.r
    public final long estimateSize() {
        e();
        return this.d.estimateSize();
    }

    @Override // j$.util.r
    public final Comparator getComparator() {
        if (AbstractC0002b.j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.r
    public final long getExactSizeIfKnown() {
        e();
        if (EnumC0053o1.SIZED.d(this.b.F())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract void h();

    @Override // j$.util.r
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0002b.j(this, i);
    }

    abstract AbstractC0059q1 j(j$.util.r rVar);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.r
    public j$.util.r trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        e();
        j$.util.r trySplit = this.d.trySplit();
        if (trySplit != null) {
            return j(trySplit);
        }
        return null;
    }
}
