package defpackage;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;

/* compiled from: PG */
/* renamed from: kjv  reason: default package */
/* loaded from: classes.dex */
public final class kjv extends lky implements Map {
    private final java.util.Map a;

    private kjv(java.util.Map map) {
        this.a = map;
    }

    public static kjv a() {
        return new kjv(new ConcurrentHashMap());
    }

    @Override // defpackage.lky
    protected final java.util.Map b() {
        return this.a;
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

    @Override // defpackage.lkz
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return ((ConcurrentHashMap) this.a).putIfAbsent(obj, obj2);
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
}
