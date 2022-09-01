package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0074x0 extends CountedCompleter implements X0 {
    protected final j$.util.r a;
    protected final E b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0074x0(j$.util.r rVar, E e, int i) {
        this.a = rVar;
        this.b = e;
        this.c = AbstractC0024f.g(rVar.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0074x0(AbstractC0074x0 abstractC0074x0, j$.util.r rVar, long j, long j2, int i) {
        super(abstractC0074x0);
        this.a = rVar;
        this.b = abstractC0074x0.b;
        this.c = abstractC0074x0.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    abstract AbstractC0074x0 a(j$.util.r rVar, long j, long j2);

    public /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        long j2 = this.e;
        if (j <= j2) {
            int i = (int) this.d;
            this.f = i;
            this.g = i + ((int) j2);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.r rVar;
        j$.util.r trySplit;
        AbstractC0074x0 abstractC0074x0 = this;
        while (true) {
            rVar = this.a;
            if (rVar.estimateSize() <= abstractC0074x0.c || (trySplit = rVar.trySplit()) == null) {
                break;
            }
            abstractC0074x0.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC0074x0.a(trySplit, abstractC0074x0.d, estimateSize).fork();
            abstractC0074x0 = abstractC0074x0.a(rVar, abstractC0074x0.d + estimateSize, abstractC0074x0.e - estimateSize);
        }
        abstractC0074x0.b.K(rVar, abstractC0074x0);
        abstractC0074x0.propagateCompletion();
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void j() {
    }
}
