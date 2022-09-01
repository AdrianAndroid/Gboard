package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: llw  reason: default package */
/* loaded from: classes.dex */
public abstract class llw implements Map, Serializable, j$.util.Map {
    static final Map.Entry[] a = new Map.Entry[0];
    private transient lmz b;
    private transient lmz c;
    private transient llg d;

    public static lls h() {
        return new lls();
    }

    public static lls i(int i) {
        jez.W(i, "expectedSize");
        return new lls(i);
    }

    public static llw j(Iterable iterable) {
        lls llsVar = new lls(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        llsVar.i(iterable);
        return llsVar.l();
    }

    public static llw k(Map map) {
        if ((map instanceof llw) && !(map instanceof SortedMap)) {
            llw llwVar = (llw) map;
            if (!llwVar.ig()) {
                return llwVar;
            }
        }
        return j(map.entrySet());
    }

    public static llw l(Object obj, Object obj2) {
        jez.U(obj, obj2);
        return lrq.a(1, new Object[]{obj, obj2});
    }

    public static llw m(Object obj, Object obj2, Object obj3, Object obj4) {
        jez.U(obj, obj2);
        jez.U(obj3, obj4);
        return lrq.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static llw n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jez.U(obj, obj2);
        jez.U(obj3, obj4);
        jez.U(obj5, obj6);
        return lrq.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static llw o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        jez.U(obj, obj2);
        jez.U(obj3, obj4);
        jez.U(obj5, obj6);
        jez.U(obj7, obj8);
        return lrq.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract llg c();

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: d */
    public llg values() {
        llg llgVar = this.d;
        if (llgVar == null) {
            llg c = c();
            this.d = c;
            return c;
        }
        return llgVar;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        return lre.z(this, obj);
    }

    public abstract lmz f();

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract lmz g();

    @Override // java.util.Map, j$.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        return lvw.h(entrySet());
    }

    /* renamed from: if */
    public lsz mo66if() {
        throw null;
    }

    public abstract boolean ig();

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: p */
    public final lmz entrySet() {
        lmz lmzVar = this.b;
        if (lmzVar == null) {
            lmz f = f();
            this.b = f;
            return f;
        }
        return lmzVar;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: q */
    public lmz keySet() {
        lmz lmzVar = this.c;
        if (lmzVar == null) {
            lmz g = g();
            this.c = g;
            return g;
        }
        return lmzVar;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        return lre.p(this);
    }

    Object writeReplace() {
        return new llv(this);
    }
}
