package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dvf  reason: default package */
/* loaded from: classes.dex */
public final class dvf implements oin {
    public static final AtomicReference a = new AtomicReference();
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/service/OrationRequestObserver");
    public final dur c;
    public final dun d;
    public final oin e;
    public final Executor f;
    private final dsv i;
    public final AtomicBoolean g = new AtomicBoolean();
    public final AtomicBoolean h = new AtomicBoolean();
    private final AtomicBoolean j = new AtomicBoolean();

    public dvf(dur durVar, dun dunVar, oin oinVar, dsv dsvVar, Executor executor) {
        this.c = durVar;
        this.d = dunVar;
        this.e = new dvg(oinVar);
        this.i = dsvVar;
        this.f = executor;
    }

    public static dvf d() {
        return (dvf) a.get();
    }

    private final void h(Runnable runnable) {
        gyc.b.execute(new dvc(this, runnable, 0));
    }

    private final void i() {
        AtomicReference atomicReference = a;
        while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
        }
    }

    @Override // defpackage.oin
    public final void a() {
        if (this.j.get()) {
            i();
        } else {
            e(fhz.ORATION_COMPLETED);
        }
    }

    @Override // defpackage.oin
    public final void b(Throwable th) {
        ((ltd) ((ltd) ((ltd) b.c()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/service/OrationRequestObserver", "onError", (char) 158, "OrationRequestObserver.java")).t("gRPC error");
        e(fhz.ORATION_RPC_ERROR);
    }

    @Override // defpackage.oin
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        fih fihVar;
        fii fiiVar = (fii) obj;
        int i = fiiVar.a;
        int i2 = 0;
        int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
        int i4 = i3 - 1;
        if (i3 != 0) {
            if (i4 == 0) {
                h(new dod(this, fiiVar, 19));
                return;
            } else if (i4 == 1) {
                this.j.set(true);
                h(new dod(this, fiiVar, 20));
                return;
            } else if (i4 == 2) {
                h(new dvc(this, fiiVar, 1));
                return;
            } else if (i4 != 3) {
                if (i4 != 4) {
                    return;
                }
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/OrationRequestObserver", "onNext", 122, "OrationRequestObserver.java")).t("Received OrationRequest message without update.");
                return;
            } else {
                if (i == 4) {
                    fihVar = (fih) fiiVar.b;
                } else {
                    fihVar = fih.c;
                }
                this.i.h.set(lfb.g(few.AIAI));
                int i5 = fihVar.a;
                if (i5 == 0) {
                    i2 = 3;
                } else if (i5 == 1) {
                    i2 = 1;
                } else if (i5 == 2) {
                    i2 = 2;
                }
                int i6 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                long j = 0;
                if (i6 == 0) {
                    dsv dsvVar = this.i;
                    long longValue = i5 == 1 ? ((Long) fihVar.b).longValue() : 0L;
                    if (dsvVar.d < 0) {
                        dsvVar.d = longValue;
                    }
                    dsvVar.e = longValue;
                    return;
                } else if (i6 != 1) {
                    if (i6 != 2) {
                        return;
                    }
                    ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/OrationRequestObserver", "handleLatencyEvent", 138, "OrationRequestObserver.java")).t("Received empty OrationLatencyEvent");
                    return;
                } else {
                    dsv dsvVar2 = this.i;
                    if (i5 == 2) {
                        j = ((Long) fihVar.b).longValue();
                    }
                    dsvVar2.a(j);
                    return;
                }
            }
        }
        throw null;
    }

    public final void e(fhz fhzVar) {
        f(fhzVar, nvu.b);
    }

    public final void f(fhz fhzVar, nvu nvuVar) {
        g();
        if (!this.h.compareAndSet(false, true)) {
            return;
        }
        i();
        dtx.a("sending oration done", kcu.N(new bue(this, fhzVar, nvuVar, 15), this.f));
    }

    public final void g() {
        this.g.set(true);
    }
}
