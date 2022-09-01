package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0062s extends CountedCompleter {
    private j$.util.r a;
    private final X0 b;
    private final E c;
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0062s(E e, j$.util.r rVar, X0 x0) {
        super(null);
        this.b = x0;
        this.c = e;
        this.a = rVar;
        this.d = 0L;
    }

    C0062s(C0062s c0062s, j$.util.r rVar) {
        super(c0062s);
        this.a = rVar;
        this.b = c0062s.b;
        this.d = c0062s.d;
        this.c = c0062s.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        X0 x0;
        j$.util.r trySplit;
        j$.util.r rVar = this.a;
        long estimateSize = rVar.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = AbstractC0024f.g(estimateSize);
            this.d = j;
        }
        boolean d = EnumC0053o1.SHORT_CIRCUIT.d(this.c.F());
        boolean z = false;
        C0062s c0062s = this;
        while (true) {
            x0 = this.b;
            if (d && x0.e()) {
                break;
            } else if (estimateSize <= j || (trySplit = rVar.trySplit()) == null) {
                break;
            } else {
                C0062s c0062s2 = new C0062s(c0062s, trySplit);
                c0062s.addToPendingCount(1);
                if (z) {
                    rVar = trySplit;
                } else {
                    C0062s c0062s3 = c0062s;
                    c0062s = c0062s2;
                    c0062s2 = c0062s3;
                }
                z = !z;
                c0062s.fork();
                c0062s = c0062s2;
                estimateSize = rVar.estimateSize();
            }
        }
        c0062s.c.z(rVar, x0);
        c0062s.a = null;
        c0062s.propagateCompletion();
    }
}
