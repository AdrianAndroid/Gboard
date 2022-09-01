package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lrs  reason: default package */
/* loaded from: classes.dex */
public final class lrs extends lnn {
    static final lrs c = new lrs(llp.q(), lrb.a);
    final transient llp d;

    public lrs(llp llpVar, Comparator comparator) {
        super(comparator);
        this.d = llpVar;
    }

    @Override // defpackage.lnn
    public final lnn B(Object obj, boolean z) {
        return K(0, I(obj, z));
    }

    @Override // defpackage.lnn
    public final lnn D(Object obj, boolean z, Object obj2, boolean z2) {
        return F(obj, z).B(obj2, z2);
    }

    @Override // defpackage.lnn
    public final lnn F(Object obj, boolean z) {
        return K(J(obj, z), size());
    }

    @Override // defpackage.lnn, java.util.NavigableSet
    /* renamed from: H */
    public final lsz descendingIterator() {
        return this.d.a().listIterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int I(Object obj, boolean z) {
        llp llpVar = this.d;
        jdg.u(obj);
        int binarySearch = Collections.binarySearch(llpVar, obj, ((lnn) this).a);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : binarySearch ^ (-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int J(Object obj, boolean z) {
        llp llpVar = this.d;
        jdg.u(obj);
        int binarySearch = Collections.binarySearch(llpVar, obj, ((lnn) this).a);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : binarySearch ^ (-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lrs K(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i < i2) {
            return new lrs(this.d.subList(i, i2), this.a);
        }
        return G(this.a);
    }

    @Override // defpackage.llg
    public final int b(Object[] objArr, int i) {
        return this.d.b(objArr, i);
    }

    @Override // defpackage.llg
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.lnn, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int J = J(obj, true);
        if (J == size()) {
            return null;
        }
        return this.d.get(J);
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof lqx) {
            collection = ((lqx) collection).e();
        }
        if (!lvw.g(((lnn) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        lsz it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int a = a(next2, next);
                if (a >= 0) {
                    if (a != 0) {
                        break;
                    } else if (!it2.hasNext()) {
                        return true;
                    } else {
                        next = it2.next();
                    }
                } else if (!it.hasNext()) {
                    return false;
                } else {
                    next2 = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: ClassCastException | NoSuchElementException -> 0x0046, TryCatch #0 {ClassCastException | NoSuchElementException -> 0x0046, blocks: (B:18:0x002a, B:19:0x002e, B:21:0x0034, B:23:0x003e), top: B:17:0x002a }] */
    @Override // defpackage.lmz, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.util.Comparator r1 = r5.a
            boolean r1 = defpackage.lvw.g(r1, r6)
            if (r1 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()
            lsz r1 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L2e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L44
            int r3 = r5.a(r3, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L2e
        L44:
            return r2
        L45:
            return r0
        L46:
            return r2
        L47:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrs.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.lnn, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.lnn, java.util.NavigableSet
    public final Object floor(Object obj) {
        int I = I(obj, true) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.lnn, java.util.NavigableSet
    public final Object higher(Object obj) {
        int J = J(obj, false);
        if (J == size()) {
            return null;
        }
        return this.d.get(J);
    }

    @Override // defpackage.llg
    public final int j() {
        return this.d.j();
    }

    @Override // defpackage.lmz, defpackage.llg
    public final llp k() {
        return this.d;
    }

    @Override // defpackage.lnn, defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return this.d.listIterator();
    }

    @Override // defpackage.lnn, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.lnn, java.util.NavigableSet
    public final Object lower(Object obj) {
        int I = I(obj, false) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.llg
    public final boolean m() {
        return this.d.m();
    }

    @Override // defpackage.llg
    public final Object[] n() {
        return this.d.n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.lnn
    public final lnn y() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        if (isEmpty()) {
            return G(reverseOrder);
        }
        return new lrs(this.d.a(), reverseOrder);
    }
}
