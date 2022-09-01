package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ljc */
/* loaded from: classes.dex */
public abstract class ljc extends ljh implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    public ljc(Map map) {
        jdg.v(map.isEmpty());
        this.a = map;
    }

    public static /* synthetic */ void r(ljc ljcVar) {
        ljcVar.b++;
    }

    public static /* synthetic */ void s(ljc ljcVar) {
        ljcVar.b--;
    }

    public static /* synthetic */ void t(ljc ljcVar, int i) {
        ljcVar.b += i;
    }

    public static /* synthetic */ void u(ljc ljcVar, int i) {
        ljcVar.b -= i;
    }

    public abstract Collection a();

    @Override // defpackage.lqr
    public Collection b(Object obj) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            collection = g(obj);
        }
        return c(obj, collection);
    }

    public Collection c(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.lqr
    public final int e() {
        return this.b;
    }

    @Override // defpackage.ljh
    public final lqx f() {
        return new lqv(this);
    }

    public Collection g(Object obj) {
        return a();
    }

    @Override // defpackage.ljh
    public final Collection h() {
        if (this instanceof lrv) {
            return new ljf(this);
        }
        return new lqs(this);
    }

    @Override // defpackage.ljh
    public final Collection i() {
        return new ljg(this);
    }

    @Override // defpackage.ljh
    public Iterator j() {
        return new lip(this);
    }

    @Override // defpackage.ljh
    public Iterator k() {
        return new lio(this);
    }

    public final List l(Object obj, List list, liy liyVar) {
        if (list instanceof RandomAccess) {
            return new liw(this, obj, list, liyVar);
        }
        return new lja(this, obj, list, liyVar);
    }

    @Override // defpackage.ljh
    public final Map m() {
        return new lis(this, this.a);
    }

    @Override // defpackage.ljh
    public final Set n() {
        return new liv(this, this.a);
    }

    @Override // defpackage.lqr
    public void o() {
        for (Collection collection : this.a.values()) {
            collection.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    public final void p(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            jdg.v(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.lqr
    public final boolean q(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ljh, defpackage.lqr
    public final void v(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Collection g = g(obj);
            if (g.add(obj2)) {
                this.b++;
                this.a.put(obj, g);
                return;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
        } else {
            this.b++;
        }
    }
}
