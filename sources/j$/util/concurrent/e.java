package j$.util.concurrent;

import j$.util.AbstractC0002b;
import j$.util.AbstractC0003c;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e extends b implements Set, AbstractC0003c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // j$.util.AbstractC0003c
    public final boolean a(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.a;
        if (predicate != null) {
            l[] lVarArr = concurrentHashMap.a;
            boolean z = false;
            if (lVarArr != null) {
                q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
                while (true) {
                    l c = qVar.c();
                    if (c == null) {
                        break;
                    }
                    Object obj = c.b;
                    Object obj2 = c.c;
                    if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.h(obj, null, obj2) != null) {
                        z = true;
                    }
                }
            }
            return z;
        }
        concurrentHashMap.getClass();
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    /* renamed from: b */
    public final boolean add(Map.Entry entry) {
        return this.a.g(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // j$.util.AbstractC0003c
    public final void forEach(Consumer consumer) {
        if (consumer != null) {
            l[] lVarArr = this.a.a;
            if (lVarArr == null) {
                return;
            }
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l c = qVar.c();
                if (c == null) {
                    return;
                }
                consumer.accept(new k(c.b, c.c, this.a));
            }
        } else {
            throw null;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        l[] lVarArr = this.a.a;
        int i = 0;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l c = qVar.c();
                if (c == null) {
                    break;
                }
                i += c.hashCode();
            }
        }
        return i;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        l[] lVarArr = concurrentHashMap.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new d(lVarArr, length, length, concurrentHashMap);
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.a.remove(key, value);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.AbstractC0003c
    public final j$.util.r spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long k = concurrentHashMap.k();
        l[] lVarArr = concurrentHashMap.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        long j = 0;
        if (k >= 0) {
            j = k;
        }
        return new f(lVarArr, length, 0, length, j, concurrentHashMap);
    }

    @Override // java.util.Collection, j$.util.AbstractC0003c
    public final /* synthetic */ Stream stream() {
        return AbstractC0002b.n(this);
    }
}
