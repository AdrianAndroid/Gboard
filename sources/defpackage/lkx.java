package defpackage;

import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: lkx  reason: default package */
/* loaded from: classes.dex */
public abstract class lkx extends lky implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    protected abstract ConcurrentMap a();

    @Override // defpackage.lky
    protected /* bridge */ /* synthetic */ Map b() {
        throw null;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        return a().putIfAbsent(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return a().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        return a().replace(obj, obj2);
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return a().replace(obj, obj2, obj3);
    }
}
