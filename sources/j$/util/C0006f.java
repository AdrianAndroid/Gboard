package j$.util;

import j$.util.Map;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0006f implements java.util.Map, Serializable, Map {
    private final java.util.Map a;
    final Object b = this;
    private transient Set c;
    private transient Set d;
    private transient Collection e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0006f(java.util.Map map) {
        this.a = (java.util.Map) Objects.requireNonNull(map);
    }

    private static Set a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.e;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.e;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    @Override // j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object $default$compute;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                $default$compute = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                $default$compute = ConcurrentMap.CC.$default$compute((java.util.concurrent.ConcurrentMap) map, obj, biFunction);
            } else {
                $default$compute = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return $default$compute;
    }

    @Override // j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object computeIfAbsent;
        synchronized (this.b) {
            computeIfAbsent = Map.EL.computeIfAbsent(this.a, obj, function);
        }
        return computeIfAbsent;
    }

    @Override // j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object $default$computeIfPresent;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                $default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                $default$computeIfPresent = ConcurrentMap.CC.$default$computeIfPresent((java.util.concurrent.ConcurrentMap) map, obj, biFunction);
            } else {
                $default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return $default$computeIfPresent;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.b) {
            containsKey = this.a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.b) {
            containsValue = this.a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.b) {
            if (this.d == null) {
                this.d = a(this.a.entrySet(), this.b);
            }
            set = this.d;
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            equals = this.a.equals(obj);
        }
        return equals;
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.b) {
            Map.EL.forEach(this.a, biConsumer);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.b) {
            orDefault = Map.EL.getOrDefault(this.a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = this.a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = this.a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = a(this.a.keySet(), this.b);
            }
            set = this.c;
        }
        return set;
    }

    @Override // j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object merge;
        synchronized (this.b) {
            merge = Map.EL.merge(this.a, obj, obj2, biFunction);
        }
        return merge;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.b) {
            put = this.a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.b) {
            this.a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object a;
        synchronized (this.b) {
            a = Map.EL.a(this.a, obj, obj2);
        }
        return a;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.b) {
            remove = this.a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean $default$remove;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                $default$remove = ((Map) map).remove(obj, obj2);
            } else {
                $default$remove = Map.CC.$default$remove(map, obj, obj2);
            }
        }
        return $default$remove;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : map.get(obj);
        }
        return replace;
    }

    @Override // j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                ConcurrentMap.CC.$default$replaceAll((java.util.concurrent.ConcurrentMap) map, biFunction);
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.b) {
            obj = this.a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        Collection collection;
        Constructor constructor;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.b) {
            if (this.e == null) {
                Collection values = this.a.values();
                Object obj = this.b;
                constructor = DesugarCollections.d;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.d;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.e = collection2;
            }
            collection = this.e;
        }
        return collection;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }
}
