package defpackage;

import android.util.Pair;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: csu  reason: default package */
/* loaded from: classes.dex */
public final class csu extends agd {
    public final AtomicReference j = new AtomicReference(null);
    public final AtomicBoolean k = new AtomicBoolean(false);
    private final boolean m = true;
    public final boolean l = true;

    public static void j(Pair pair) {
        if (pair != null) {
            ((hix) pair.second).close();
            ((mko) pair.first).cancel(true);
        }
    }

    public static void k(Pair pair) {
        if (pair != null) {
            ((hix) pair.second).close();
            if (hji.e((Future) pair.first)) {
                throw new IllegalStateException("Cannot set value when there is a pending future");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agc
    public final void f() {
        if (this.m) {
            j((Pair) this.j.getAndSet(null));
        }
    }

    public final void l(afv afvVar, css cssVar) {
        super.d(afvVar, cssVar);
    }

    public final void m(cst cstVar) {
        this.k.set(true);
        super.i(cstVar);
    }

    @Override // defpackage.agd, defpackage.agc
    /* renamed from: n */
    public final void h(cst cstVar) {
        this.k.set(true);
        Pair pair = (Pair) this.j.getAndSet(null);
        if (this.l) {
            j(pair);
        } else {
            k(pair);
        }
        super.h(cstVar);
    }
}
