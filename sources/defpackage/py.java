package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: py  reason: default package */
/* loaded from: classes2.dex */
public class py implements Iterable {
    public pu b;
    public pu c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected pu a(Object obj) {
        pu puVar = this.b;
        while (puVar != null && !puVar.a.equals(obj)) {
            puVar = puVar.c;
        }
        return puVar;
    }

    public Object b(Object obj) {
        pu a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (px pxVar : this.d.keySet()) {
                pxVar.eX(a);
            }
        }
        pu puVar = a.d;
        pu puVar2 = a.c;
        if (puVar != null) {
            puVar.c = puVar2;
        } else {
            this.b = puVar2;
        }
        pu puVar3 = a.c;
        if (puVar3 != null) {
            puVar3.d = puVar;
        } else {
            this.c = puVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final pu d(Object obj, Object obj2) {
        pu puVar = new pu(obj, obj2);
        this.e++;
        pu puVar2 = this.c;
        if (puVar2 == null) {
            this.b = puVar;
        } else {
            puVar2.c = puVar;
            puVar.d = puVar2;
        }
        this.c = puVar;
        return puVar;
    }

    public final pv e() {
        pv pvVar = new pv(this);
        this.d.put(pvVar, false);
        return pvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        if (this.e != pyVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = pyVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((pw) it).next();
            Map.Entry next2 = ((pw) it2).next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
                next2 = null;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public final Object f(Object obj, Object obj2) {
        pu a = a(obj);
        if (a != null) {
            return a.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((pw) it).next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ps psVar = new ps(this.b, this.c);
        this.d.put(psVar, false);
        return psVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((pw) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
