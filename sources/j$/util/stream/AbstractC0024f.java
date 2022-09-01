package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0024f extends CountedCompleter {
    private static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final E a;
    protected j$.util.r b;
    protected long c;
    protected AbstractC0024f d;
    protected AbstractC0024f e;
    private Object f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0024f(E e, j$.util.r rVar) {
        super(null);
        this.a = e;
        this.b = rVar;
        this.c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0024f(AbstractC0024f abstractC0024f, j$.util.r rVar) {
        super(abstractC0024f);
        this.b = rVar;
        this.a = abstractC0024f.a;
        this.c = abstractC0024f.c;
    }

    public static int b() {
        return g;
    }

    public static long g(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.r trySplit;
        j$.util.r rVar = this.b;
        long estimateSize = rVar.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = g(estimateSize);
            this.c = j;
        }
        boolean z = false;
        AbstractC0024f abstractC0024f = this;
        while (estimateSize > j && (trySplit = rVar.trySplit()) != null) {
            AbstractC0024f e = abstractC0024f.e(trySplit);
            abstractC0024f.d = e;
            AbstractC0024f e2 = abstractC0024f.e(rVar);
            abstractC0024f.e = e2;
            abstractC0024f.setPendingCount(1);
            if (z) {
                rVar = trySplit;
                abstractC0024f = e;
                e = e2;
            } else {
                abstractC0024f = e2;
            }
            z = !z;
            e.fork();
            estimateSize = rVar.estimateSize();
        }
        abstractC0024f.f(abstractC0024f.a());
        abstractC0024f.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC0024f d() {
        return (AbstractC0024f) getCompleter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC0024f e(j$.util.r rVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException();
    }
}
