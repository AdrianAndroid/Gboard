package j$.util.stream;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: j$.util.stream.k  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0039k extends R0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0039k(AbstractC0015c abstractC0015c, int i) {
        super(abstractC0015c, i);
    }

    static S e0(AbstractC0015c abstractC0015c, j$.util.r rVar) {
        C0012b c0012b = new C0012b(17);
        C0012b c0012b2 = new C0012b(18);
        C0012b c0012b3 = new C0012b(19);
        Objects.requireNonNull(c0012b);
        Objects.requireNonNull(c0012b2);
        Objects.requireNonNull(c0012b3);
        return new S((Collection) new G0(EnumC0056p1.REFERENCE, c0012b3, c0012b2, c0012b).a(abstractC0015c, rVar));
    }

    @Override // j$.util.stream.AbstractC0015c
    final N W(j$.util.r rVar, IntFunction intFunction, AbstractC0015c abstractC0015c) {
        if (EnumC0053o1.DISTINCT.d(abstractC0015c.F())) {
            return abstractC0015c.M(rVar, false, intFunction);
        }
        if (EnumC0053o1.ORDERED.d(abstractC0015c.F())) {
            return e0(abstractC0015c, rVar);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C0030h c0030h = new C0030h(0, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c0030h);
        new C0057q(c0030h).a(abstractC0015c, rVar);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new S(keySet);
    }

    @Override // j$.util.stream.AbstractC0015c
    final j$.util.r X(AbstractC0015c abstractC0015c, j$.util.r rVar) {
        return EnumC0053o1.DISTINCT.d(abstractC0015c.F()) ? abstractC0015c.d0(rVar) : EnumC0053o1.ORDERED.d(abstractC0015c.F()) ? e0(abstractC0015c, rVar).mo59spliterator() : new t1(abstractC0015c.d0(rVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0015c
    public final X0 Z(int i, X0 x0) {
        Objects.requireNonNull(x0);
        return EnumC0053o1.DISTINCT.d(i) ? x0 : EnumC0053o1.SORTED.d(i) ? new C0033i(x0) : new C0036j(x0);
    }
}
