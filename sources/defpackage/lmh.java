package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lmh  reason: default package */
/* loaded from: classes.dex */
public class lmh {
    final Map a = lkc.g();
    public Comparator b;

    public final lmn a() {
        Collection entrySet = this.a.entrySet();
        Comparator comparator = this.b;
        if (comparator != null) {
            entrySet = llp.z(lrc.b(comparator).c(), entrySet);
        }
        return llr.l(entrySet);
    }

    public Collection b() {
        return new ArrayList();
    }

    public final void c(Map.Entry entry) {
        e(entry.getKey(), entry.getValue());
    }

    public final void d(Object obj, Iterable iterable) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(lre.ae(iterable)));
        }
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            for (Object obj2 : iterable) {
                jez.U(obj, obj2);
                collection.add(obj2);
            }
            return;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return;
        }
        Collection b = b();
        while (it.hasNext()) {
            Object next = it.next();
            jez.U(obj, next);
            b.add(next);
        }
        this.a.put(obj, b);
    }

    public final void e(Object obj, Object obj2) {
        jez.U(obj, obj2);
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Map map = this.a;
            Collection b = b();
            map.put(obj, b);
            collection = b;
        }
        collection.add(obj2);
    }
}
