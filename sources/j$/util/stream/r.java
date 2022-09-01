package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r extends CountedCompleter {
    public static final /* synthetic */ int h = 0;
    private final E a;
    private j$.util.r b;
    private final long c;
    private final ConcurrentHashMap d;
    private final X0 e;
    private final r f;
    private N g;

    /* JADX INFO: Access modifiers changed from: protected */
    public r(E e, j$.util.r rVar, X0 x0) {
        super(null);
        this.a = e;
        this.b = rVar;
        this.c = AbstractC0024f.g(rVar.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC0024f.b() << 1));
        this.e = x0;
        this.f = null;
    }

    r(r rVar, j$.util.r rVar2, r rVar3) {
        super(rVar);
        this.a = rVar.a;
        this.b = rVar2;
        this.c = rVar.c;
        this.d = rVar.d;
        this.e = rVar.e;
        this.f = rVar3;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.r trySplit;
        j$.util.r rVar = this.b;
        boolean z = false;
        r rVar2 = this;
        while (rVar.estimateSize() > this.c && (trySplit = rVar.trySplit()) != null) {
            r rVar3 = rVar2.f;
            r rVar4 = new r(rVar2, trySplit, rVar3);
            r rVar5 = new r(rVar2, rVar, rVar4);
            rVar2.addToPendingCount(1);
            rVar5.addToPendingCount(1);
            ConcurrentHashMap concurrentHashMap = rVar2.d;
            concurrentHashMap.put(rVar4, rVar5);
            if (rVar3 != null) {
                rVar4.addToPendingCount(1);
                if (concurrentHashMap.replace(rVar3, rVar2, rVar4)) {
                    rVar2.addToPendingCount(-1);
                } else {
                    rVar4.addToPendingCount(-1);
                }
            }
            if (z) {
                rVar = trySplit;
                rVar2 = rVar4;
                rVar4 = rVar5;
            } else {
                rVar2 = rVar5;
            }
            z = !z;
            rVar4.fork();
        }
        if (rVar2.getPendingCount() > 0) {
            C0012b c0012b = new C0012b(6);
            E e = rVar2.a;
            I H = e.H(e.C(rVar), c0012b);
            e.K(rVar, H);
            rVar2.g = H.mo62build();
            rVar2.b = null;
        }
        rVar2.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        N n = this.g;
        X0 x0 = this.e;
        if (n != null) {
            n.forEach(x0);
            this.g = null;
        } else {
            j$.util.r rVar = this.b;
            if (rVar != null) {
                this.a.K(rVar, x0);
                this.b = null;
            }
        }
        r rVar2 = (r) this.d.remove(this);
        if (rVar2 != null) {
            rVar2.tryComplete();
        }
    }
}
