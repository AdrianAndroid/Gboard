package j$.util;

import j$.util.Comparator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: j$.util.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0002b {
    public static void c(n nVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.c) {
            nVar.l((j$.util.function.c) consumer);
        } else if (H.a) {
            H.a(nVar.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            nVar.l(new C0007g(consumer));
        }
    }

    public static void d(o oVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.g) {
            oVar.i((j$.util.function.g) consumer);
        } else if (H.a) {
            H.a(oVar.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            oVar.i(new i(consumer));
        }
    }

    public static void e(p pVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.i) {
            pVar.a((j$.util.function.i) consumer);
        } else if (H.a) {
            H.a(pVar.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            pVar.a(new k(consumer));
        }
    }

    public static long h(r rVar) {
        if ((rVar.characteristics() & 64) == 0) {
            return -1L;
        }
        return rVar.estimateSize();
    }

    public static boolean j(r rVar, int i) {
        return (rVar.characteristics() & i) == i;
    }

    public static boolean m(Collection collection, Predicate predicate) {
        if (DesugarCollections.a.isInstance(collection)) {
            return DesugarCollections.c(collection, predicate);
        }
        Objects.requireNonNull(predicate);
        java.util.Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static Stream n(Collection collection) {
        r d;
        r rVar;
        if (collection instanceof AbstractC0003c) {
            rVar = ((AbstractC0003c) collection).spliterator();
        } else {
            if (collection instanceof LinkedHashSet) {
                d = new D((Collection) Objects.requireNonNull((LinkedHashSet) collection), 17);
            } else if (collection instanceof SortedSet) {
                SortedSet sortedSet = (SortedSet) collection;
                d = new m(sortedSet, sortedSet);
            } else if (collection instanceof Set) {
                d = new D((Collection) Objects.requireNonNull((Set) collection), 1);
            } else if (collection instanceof List) {
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    d = new C0001a(list);
                } else {
                    d = new D((Collection) Objects.requireNonNull(list), 16);
                }
            } else {
                d = new D((Collection) Objects.requireNonNull(collection), 0);
            }
            rVar = d;
        }
        return j$.util.stream.E.J(rVar, false);
    }

    public static boolean o(n nVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.c) {
            return nVar.k((j$.util.function.c) consumer);
        }
        if (!H.a) {
            Objects.requireNonNull(consumer);
            return nVar.k(new C0007g(consumer));
        }
        H.a(nVar.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static boolean p(o oVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.g) {
            return oVar.g((j$.util.function.g) consumer);
        }
        if (!H.a) {
            Objects.requireNonNull(consumer);
            return oVar.g(new i(consumer));
        }
        H.a(oVar.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static boolean q(p pVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.i) {
            return pVar.b((j$.util.function.i) consumer);
        }
        if (!H.a) {
            Objects.requireNonNull(consumer);
            return pVar.b(new k(consumer));
        }
        H.a(pVar.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public static /* synthetic */ java.util.Comparator r(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public r trySplit() {
        return null;
    }
}
