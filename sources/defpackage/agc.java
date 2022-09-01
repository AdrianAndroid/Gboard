package defpackage;

import androidx.lifecycle.LiveData$LifecycleBoundObserver;

/* compiled from: PG */
/* renamed from: agc  reason: default package */
/* loaded from: classes.dex */
public class agc {
    public static final Object a = new Object();
    public boolean e;
    public volatile Object f;
    public volatile Object g;
    private boolean j;
    private boolean k;
    public final Object b = new Object();
    public final py c = new py();
    public int d = 0;
    public final Runnable i = new od(this, 12);
    public int h = -1;

    public agc() {
        Object obj = a;
        this.g = obj;
        this.f = obj;
    }

    public static void b(String str) {
        pp.b();
        if (pp.c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private final void i(agb agbVar) {
        if (!agbVar.d) {
            return;
        }
        if (!agbVar.eY()) {
            agbVar.d(false);
            return;
        }
        int i = agbVar.e;
        int i2 = this.h;
        if (i >= i2) {
            return;
        }
        agbVar.e = i2;
        agbVar.c.a(this.f);
    }

    public final Object a() {
        Object obj = this.f;
        if (obj != a) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(agb agbVar) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        while (true) {
            this.k = false;
            if (agbVar == null) {
                pv e = this.c.e();
                while (e.hasNext()) {
                    i((agb) ((pu) e.next()).b);
                    if (this.k) {
                        break;
                    }
                }
            } else {
                i(agbVar);
            }
            if (!this.k) {
                this.j = false;
                return;
            }
            agbVar = null;
        }
    }

    public final void d(afv afvVar, age ageVar) {
        b("observe");
        if (afvVar.I().a == afp.DESTROYED) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, afvVar, ageVar);
        agb agbVar = (agb) this.c.f(ageVar, liveData$LifecycleBoundObserver);
        if (agbVar != null && !agbVar.c(afvVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (agbVar != null) {
            return;
        }
        afvVar.I().b(liveData$LifecycleBoundObserver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
    }

    public void g(age ageVar) {
        b("removeObserver");
        agb agbVar = (agb) this.c.b(ageVar);
        if (agbVar == null) {
            return;
        }
        agbVar.b();
        agbVar.d(false);
    }

    public void h(Object obj) {
        throw null;
    }
}
