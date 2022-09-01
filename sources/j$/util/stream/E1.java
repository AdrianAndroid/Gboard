package j$.util.stream;

/* loaded from: classes3.dex */
abstract class E1 {
    final long a;
    final long b;
    j$.util.r c;
    long d;
    long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E1(j$.util.r rVar, long j, long j2, long j3, long j4) {
        this.c = rVar;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    protected abstract j$.util.r c(j$.util.r rVar, long j, long j2, long j3, long j4);

    public final int characteristics() {
        return this.c.characteristics();
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    public final j$.util.r trySplit() {
        long j = this.e;
        if (this.a < j && this.d < j) {
            while (true) {
                j$.util.r trySplit = this.c.trySplit();
                if (trySplit == null) {
                    return null;
                }
                long estimateSize = trySplit.estimateSize() + this.d;
                long min = Math.min(estimateSize, this.b);
                long j2 = this.a;
                if (j2 >= min) {
                    this.d = min;
                } else {
                    long j3 = this.b;
                    if (min < j3) {
                        long j4 = this.d;
                        if (j4 < j2 || estimateSize > j3) {
                            this.d = min;
                            return c(trySplit, j2, j3, j4, min);
                        }
                        this.d = min;
                        return trySplit;
                    }
                    this.c = trySplit;
                    this.e = min;
                }
            }
        } else {
            return null;
        }
    }
}
