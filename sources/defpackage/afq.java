package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: afq  reason: default package */
/* loaded from: classes.dex */
public final class afq {
    public afp a;
    private pr b;
    private final WeakReference c;
    private int d;
    private boolean e;
    private boolean f;
    private ArrayList g;

    public afq() {
        new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afp a(afp afpVar, afp afpVar2) {
        return (afpVar2 == null || afpVar2.compareTo(afpVar) >= 0) ? afpVar : afpVar2;
    }

    public static void f(String str) {
        pp.b();
        if (pp.c()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private final afp g(afu afuVar) {
        pr prVar = this.b;
        afp afpVar = null;
        pu puVar = prVar.c(afuVar) ? ((pu) prVar.a.get(afuVar)).d : null;
        afp afpVar2 = puVar != null ? ((afw) puVar.b).a : null;
        if (!this.g.isEmpty()) {
            ArrayList arrayList = this.g;
            afpVar = (afp) arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.a, afpVar2), afpVar);
    }

    private final void h(afp afpVar) {
        afp afpVar2 = this.a;
        if (afpVar2 == afpVar) {
            return;
        }
        if (afpVar2 != afp.INITIALIZED || afpVar != afp.DESTROYED) {
            this.a = afpVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            k();
            this.e = false;
            if (this.a != afp.DESTROYED) {
                return;
            }
            this.b = new pr();
            return;
        }
        StringBuilder sb = new StringBuilder("no event down from ");
        afp afpVar3 = this.a;
        sb.append(afpVar3);
        throw new IllegalStateException("no event down from ".concat(String.valueOf(afpVar3)));
    }

    private final void i() {
        ArrayList arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void j(afp afpVar) {
        this.g.add(afpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        r6.f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afq.k():void");
    }

    public final void b(afu afuVar) {
        Object obj;
        afv afvVar;
        f("addObserver");
        afw afwVar = new afw(afuVar, this.a == afp.DESTROYED ? afp.DESTROYED : afp.INITIALIZED);
        pr prVar = this.b;
        pu a = prVar.a(afuVar);
        if (a != null) {
            obj = a.b;
        } else {
            prVar.a.put(afuVar, prVar.d(afuVar, afwVar));
            obj = null;
        }
        if (((afw) obj) == null && (afvVar = (afv) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            afp g = g(afuVar);
            this.d++;
            while (afwVar.a.compareTo(g) < 0 && this.b.c(afuVar)) {
                j(afwVar.a);
                afo b = afo.b(afwVar.a);
                if (b != null) {
                    afwVar.a(afvVar, b);
                    i();
                    g = g(afuVar);
                } else {
                    StringBuilder sb = new StringBuilder("no event up from ");
                    afp afpVar = afwVar.a;
                    sb.append(afpVar);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(afpVar)));
                }
            }
            if (!z) {
                k();
            }
            this.d--;
        }
    }

    public final void c(afo afoVar) {
        f("handleLifecycleEvent");
        h(afoVar.c());
    }

    public final void d(afu afuVar) {
        f("removeObserver");
        this.b.b(afuVar);
    }

    public final void e(afp afpVar) {
        f("setCurrentState");
        h(afpVar);
    }

    public afq(afv afvVar) {
        new AtomicReference();
        this.b = new pr();
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = new ArrayList();
        this.c = new WeakReference(afvVar);
        this.a = afp.INITIALIZED;
    }
}
