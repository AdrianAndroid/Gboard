package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: lnj  reason: default package */
/* loaded from: classes.dex */
public final class lnj extends lnk implements NavigableMap, Map {
    private static final Comparator d;
    private static final lnj e;
    private static final long serialVersionUID = 0;
    public final transient lrs b;
    public final transient llp c;
    private transient lnj f;

    static {
        lrb lrbVar = lrb.a;
        d = lrbVar;
        e = new lnj(lnn.G(lrbVar), llp.q());
    }

    public lnj(lrs lrsVar, llp llpVar) {
        this(lrsVar, llpVar, null);
    }

    public lnj(lrs lrsVar, llp llpVar, lnj lnjVar) {
        this.b = lrsVar;
        this.c = llpVar;
        this.f = lnjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.lnj a(java.util.Map r9, java.util.Comparator r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnj.a(java.util.Map, java.util.Comparator):lnj");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lnj r(Comparator comparator) {
        return lrb.a.equals(comparator) ? e : new lnj(lnn.G(comparator), llp.q());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static lnj t(Comparator comparator, Object obj, Object obj2) {
        return new lnj(new lrs(llp.r(obj), comparator), llp.r(obj2));
    }

    private final lnj w(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return r(comparator());
        }
        return new lnj(this.b.K(i, i2), this.c.subList(i, i2));
    }

    @Override // defpackage.llw
    public final llg c() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return lre.n(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((lnn) this.b).a;
    }

    @Override // defpackage.llw
    public final llg d() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.b.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        lnj lnjVar = this.f;
        if (lnjVar == null) {
            if (isEmpty()) {
                return r(lrc.b(comparator()).a());
            }
            return new lnj((lrs) this.b.descendingSet(), this.c.a(), this);
        }
        return lnjVar;
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // defpackage.llw
    public final lmz f() {
        if (!isEmpty()) {
            return new lng(this);
        }
        return lrr.a;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().k().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.b.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return lre.n(floorEntry(obj));
    }

    @Override // defpackage.llw
    public final lmz g() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return lre.n(higherEntry(obj));
    }

    @Override // defpackage.llw
    public final boolean ig() {
        return this.b.m() || this.c.m();
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    public final /* synthetic */ Set keySet() {
        return this.b;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().k().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.b.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return lre.n(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.b;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.llw
    public final /* synthetic */ lmz q() {
        return this.b;
    }

    @Override // java.util.NavigableMap
    /* renamed from: s */
    public final lnj headMap(Object obj, boolean z) {
        lrs lrsVar = this.b;
        jdg.u(obj);
        return w(0, lrsVar.I(obj, z));
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    /* renamed from: u */
    public final lnj subMap(Object obj, boolean z, Object obj2, boolean z2) {
        jdg.u(obj);
        jdg.u(obj2);
        jdg.D(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    /* renamed from: v */
    public final lnj tailMap(Object obj, boolean z) {
        lrs lrsVar = this.b;
        jdg.u(obj);
        return w(lrsVar.J(obj, z), size());
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    public final /* synthetic */ Collection values() {
        return this.c;
    }

    @Override // defpackage.llw
    Object writeReplace() {
        return new lni(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r4 < 0) goto L3;
     */
    @Override // defpackage.llw, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            lrs r0 = r3.b
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = -1
            goto L14
        L7:
            llp r2 = r0.d     // Catch: java.lang.ClassCastException -> L12
            java.util.Comparator r0 = r0.a     // Catch: java.lang.ClassCastException -> L12
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L12
            if (r4 >= 0) goto L14
            goto L5
        L12:
            goto L5
        L14:
            if (r4 != r1) goto L18
            r4 = 0
            return r4
        L18:
            llp r0 = r3.c
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnj.get(java.lang.Object):java.lang.Object");
    }
}
