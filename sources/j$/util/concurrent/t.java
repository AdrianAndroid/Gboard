package j$.util.concurrent;

import j$.util.AbstractC0002b;
import j$.util.AbstractC0003c;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t extends b implements AbstractC0003c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(ConcurrentHashMap concurrentHashMap) {
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
                    if (predicate.test(obj2) && concurrentHashMap.h(obj, null, obj2) != null) {
                        z = true;
                    }
                }
            }
            return z;
        }
        concurrentHashMap.getClass();
        throw null;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
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
                consumer.accept(c.c);
            }
        } else {
            throw null;
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        l[] lVarArr = concurrentHashMap.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        a aVar;
        if (obj != null) {
            Iterator it = iterator();
            do {
                aVar = (a) it;
                if (!aVar.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((h) it).next()));
            aVar.remove();
            return true;
        }
        return false;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection != null) {
            Iterator it = iterator();
            boolean z = false;
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return z;
                }
                if (collection.contains(((h) it).next())) {
                    aVar.remove();
                    z = true;
                }
            }
        } else {
            throw null;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.AbstractC0003c, java.util.Set
    public final j$.util.r spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long k = concurrentHashMap.k();
        l[] lVarArr = concurrentHashMap.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        long j = 0;
        if (k >= 0) {
            j = k;
        }
        return new j(lVarArr, length, 0, length, j, 1);
    }

    @Override // java.util.Collection, j$.util.AbstractC0003c
    public final /* synthetic */ Stream stream() {
        return AbstractC0002b.n(this);
    }
}
