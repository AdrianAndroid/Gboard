package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bz  reason: default package */
/* loaded from: classes.dex */
public class bz {
    public final an a;
    public int e;
    public int f;
    private final List g = new ArrayList();
    public final HashSet b = new HashSet();
    public boolean c = false;
    public boolean d = false;

    public bz(int i, int i2, an anVar, wq wqVar) {
        this.e = i;
        this.f = i2;
        this.a = anVar;
        wqVar.a(new by(this));
    }

    public void a() {
        if (this.d) {
            return;
        }
        if (bi.S(2)) {
            new StringBuilder("SpecialEffectsController: ").append(this);
        }
        this.d = true;
        for (Runnable runnable : this.g) {
            runnable.run();
        }
    }

    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Runnable runnable) {
        this.g.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b.isEmpty()) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList(this.b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wq wqVar = (wq) arrayList.get(i);
            synchronized (wqVar) {
                if (wqVar.a) {
                    continue;
                } else {
                    wqVar.a = true;
                    wqVar.c = true;
                    wp wpVar = wqVar.b;
                    if (wpVar != null) {
                        try {
                            wpVar.a();
                        } catch (Throwable th) {
                            synchronized (wqVar) {
                                wqVar.c = false;
                                wqVar.notifyAll();
                                throw th;
                            }
                        }
                    }
                    synchronized (wqVar) {
                        wqVar.c = false;
                        wqVar.notifyAll();
                    }
                    continue;
                }
            }
        }
    }

    public final void e(wq wqVar) {
        b();
        this.b.add(wqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.e != 1) {
                return;
            }
            if (bi.S(2)) {
                new StringBuilder("SpecialEffectsController: For fragment ").append(this.a);
                cd.u(this.f);
            }
            this.e = 2;
            this.f = 2;
        } else if (i3 != 2) {
            if (this.e == 1) {
                return;
            }
            if (bi.S(2)) {
                new StringBuilder("SpecialEffectsController: For fragment ").append(this.a);
                cd.q(this.e);
                cd.q(i);
            }
            this.e = i;
        } else {
            if (bi.S(2)) {
                new StringBuilder("SpecialEffectsController: For fragment ").append(this.a);
                cd.q(this.e);
                cd.u(this.f);
            }
            this.e = 1;
            this.f = 3;
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + ((Object) cd.q(this.e)) + "} {mLifecycleImpact = " + ((Object) cd.u(this.f)) + "} {mFragment = " + this.a + "}";
    }
}
