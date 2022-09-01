package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: pbu  reason: default package */
/* loaded from: classes2.dex */
public final class pbu {
    private static final AtomicReference a = new AtomicReference();
    private final ols b = new pbd(new pbj("RxComputationScheduler-"));
    private final ols c = new pbc(new pbj("RxIoScheduler-"));

    private pbu() {
        pbq.a.d();
        new pbj("RxNewThreadScheduler-");
    }

    public static ols b() {
        pbu pbuVar;
        loop0: while (true) {
            AtomicReference atomicReference = a;
            pbuVar = (pbu) atomicReference.get();
            if (pbuVar != null) {
                break;
            }
            pbuVar = new pbu();
            while (!atomicReference.compareAndSet(null, pbuVar)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            break loop0;
            pbuVar.a();
        }
        ols olsVar = pbuVar.c;
        pao paoVar = pbp.h;
        return olsVar;
    }

    final synchronized void a() {
        pay payVar;
        pay payVar2;
        ols olsVar = this.b;
        while (true) {
            mok mokVar = (mok) ((pbd) olsVar).c.get();
            mok mokVar2 = pbd.e;
            if (mokVar == mokVar2) {
                break;
            } else if (pbs.b(((pbd) olsVar).c, mokVar, mokVar2)) {
                mokVar.c();
                break;
            }
        }
        ols olsVar2 = this.c;
        do {
            payVar = (pay) ((pbc) olsVar2).d.get();
            payVar2 = pbc.b;
            if (payVar == payVar2) {
                return;
            }
        } while (!pbl.a(((pbc) olsVar2).d, payVar, payVar2));
        payVar.a();
    }
}
