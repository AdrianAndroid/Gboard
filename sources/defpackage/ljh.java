package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ljh  reason: default package */
/* loaded from: classes.dex */
abstract class ljh implements lqr {
    private transient Collection a;
    private transient Set b;
    private transient lqx c;
    private transient Collection d;
    private transient Map e;

    @Override // defpackage.lqr
    public Set A() {
        Set set = this.b;
        if (set == null) {
            Set n = n();
            this.b = n;
            return n;
        }
        return set;
    }

    @Override // defpackage.lqr
    public final boolean B(Object obj, Object obj2) {
        Collection collection = (Collection) z().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean C(Object obj) {
        for (Collection collection : z().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lqr
    public final boolean D() {
        return e() == 0;
    }

    @Override // defpackage.lqr
    public boolean E(Object obj, Object obj2) {
        Collection collection = (Collection) z().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqr) {
            return z().equals(((lqr) obj).z());
        }
        return false;
    }

    public abstract lqx f();

    public abstract Collection h();

    public final int hashCode() {
        return z().hashCode();
    }

    public abstract Collection i();

    public abstract Iterator j();

    public Iterator k() {
        throw null;
    }

    public abstract Map m();

    public abstract Set n();

    public final String toString() {
        return z().toString();
    }

    @Override // defpackage.lqr
    public void v(Object obj, Object obj2) {
        throw null;
    }

    public final lqx w() {
        lqx lqxVar = this.c;
        if (lqxVar == null) {
            lqx f = f();
            this.c = f;
            return f;
        }
        return lqxVar;
    }

    @Override // defpackage.lqr
    public Collection x() {
        Collection collection = this.a;
        if (collection == null) {
            Collection h = h();
            this.a = h;
            return h;
        }
        return collection;
    }

    public final Collection y() {
        Collection collection = this.d;
        if (collection == null) {
            Collection i = i();
            this.d = i;
            return i;
        }
        return collection;
    }

    @Override // defpackage.lqr
    public Map z() {
        Map map = this.e;
        if (map == null) {
            Map m = m();
            this.e = m;
            return m;
        }
        return map;
    }
}
