package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BasePendingResult extends fof {
    public static final ThreadLocal b = new foy();
    public foi c;
    private Status h;
    private volatile boolean i;
    private boolean j;
    private volatile fgy k;
    private fpa mResultGuardian;
    private final Object a = new Object();
    private final CountDownLatch e = new CountDownLatch(1);
    private final ArrayList f = new ArrayList();
    private final AtomicReference g = new AtomicReference();
    public boolean d = false;

    @Deprecated
    BasePendingResult() {
        new foz(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void j(foi foiVar) {
        if (foiVar instanceof fog) {
            try {
                ((fog) foiVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(foiVar))), e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract foi a(Status status);

    @Override // defpackage.fof
    public final void d(foe foeVar) {
        fyb.az(foeVar != null, "Callback cannot be null.");
        synchronized (this.a) {
            if (!l()) {
                this.f.add(foeVar);
            } else {
                foeVar.a(this.h);
            }
        }
    }

    @Override // defpackage.fof
    public final void e(TimeUnit timeUnit) {
        foi foiVar;
        fyb.aE(!this.i, "Result has already been consumed.");
        fyb.aE(true, "Cannot await if then() has been called.");
        try {
            if (!this.e.await(0L, timeUnit)) {
                i(Status.d);
            }
        } catch (InterruptedException unused) {
            i(Status.b);
        }
        fyb.aE(l(), "Result is not ready.");
        synchronized (this.a) {
            fyb.aE(!this.i, "Result has already been consumed.");
            fyb.aE(l(), "Result is not ready.");
            foiVar = this.c;
            this.c = null;
            this.i = true;
        }
        fqh fqhVar = (fqh) this.g.getAndSet(null);
        if (fqhVar != null) {
            fqhVar.a();
        }
        fyb.ax(foiVar);
    }

    @Deprecated
    public final void i(Status status) {
        synchronized (this.a) {
            if (!l()) {
                k(a(status));
                this.j = true;
            }
        }
    }

    public final void k(foi foiVar) {
        synchronized (this.a) {
            if (!this.j) {
                l();
                fyb.aE(!l(), "Results have already been set");
                fyb.aE(!this.i, "Result has already been consumed");
                this.c = foiVar;
                this.h = (Status) foiVar;
                this.e.countDown();
                ArrayList arrayList = this.f;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((foe) arrayList.get(i)).a(this.h);
                }
                this.f.clear();
                return;
            }
            j(foiVar);
        }
    }

    public final boolean l() {
        return this.e.getCount() == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public BasePendingResult(Looper looper) {
        new foz(looper);
        new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(fod fodVar) {
        new foz(((fpk) fodVar).a.f);
        new WeakReference(fodVar);
    }
}
