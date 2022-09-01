package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: azt  reason: default package */
/* loaded from: classes.dex */
public final class azt {
    private static final azn a = new azs(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final xx d;

    public azt(xx xxVar) {
        this.d = xxVar;
    }

    private final void h(Class cls, Class cls2, azo azoVar, boolean z) {
        fws fwsVar = new fws(cls, cls2, azoVar);
        List list = this.b;
        list.add(z ? list.size() : 0, fwsVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [azo, java.lang.Object] */
    private final azn i(fws fwsVar) {
        azn b = fwsVar.c.b(this);
        ce.m(b);
        return b;
    }

    public final synchronized azn a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (fws fwsVar : this.b) {
                if (this.c.contains(fwsVar)) {
                    z = true;
                } else if (fwsVar.l(cls, cls2)) {
                    this.c.add(fwsVar);
                    arrayList.add(i(fwsVar));
                    this.c.remove(fwsVar);
                }
            }
            if (arrayList.size() > 1) {
                return new azr(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                return (azn) arrayList.get(0);
            } else if (!z) {
                throw new atn(cls, cls2);
            } else {
                return a;
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (fws fwsVar : this.b) {
                if (!this.c.contains(fwsVar) && fwsVar.k(cls)) {
                    this.c.add(fwsVar);
                    arrayList.add(i(fwsVar));
                    this.c.remove(fwsVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (fws fwsVar : this.b) {
            if (!arrayList.contains(fwsVar.a) && fwsVar.k(cls)) {
                arrayList.add(fwsVar.a);
            }
        }
        return arrayList;
    }

    final synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            fws fwsVar = (fws) it.next();
            if (fwsVar.l(cls, cls2)) {
                it.remove();
                arrayList.add(fwsVar.c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List e(Class cls, Class cls2, azo azoVar) {
        List d;
        d = d(cls, cls2);
        f(cls, cls2, azoVar);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(Class cls, Class cls2, azo azoVar) {
        h(cls, cls2, azoVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(Class cls, Class cls2, azo azoVar) {
        h(cls, cls2, azoVar, false);
    }
}
