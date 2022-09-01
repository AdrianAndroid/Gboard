package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lqq  reason: default package */
/* loaded from: classes.dex */
abstract class lqq extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set == null) {
            Set a = a();
            this.a = a;
            return a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set == null) {
            lql lqlVar = new lql(this);
            this.b = lqlVar;
            return lqlVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection == null) {
            lqp lqpVar = new lqp(this);
            this.c = lqpVar;
            return lqpVar;
        }
        return collection;
    }
}
