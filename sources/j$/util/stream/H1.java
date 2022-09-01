package j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
abstract class H1 {
    protected final j$.util.r a;
    protected final boolean b;
    protected final int c;
    private final long d;
    private final AtomicLong e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H1(j$.util.r rVar, long j, long j2) {
        this.a = rVar;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H1(j$.util.r rVar, H1 h1) {
        this.a = rVar;
        this.b = h1.b;
        this.e = h1.e;
        this.d = h1.d;
        this.c = h1.c;
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long m(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long min;
        do {
            atomicLong = this.e;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else if (!z) {
                return 0L;
            } else {
                return j;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final G1 n() {
        return this.e.get() > 0 ? G1.MAYBE_MORE : this.b ? G1.UNLIMITED : G1.NO_MORE;
    }

    public final j$.util.r trySplit() {
        j$.util.r trySplit;
        if (this.e.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return new F1(trySplit, (F1) this);
    }
}
