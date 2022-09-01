package j$.util;

import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public interface Map<K, V> {

    /* renamed from: j$.util.Map$-CC */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$compute(java.util.Map map, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Object obj2 = map.get(obj);
            Object apply = biFunction.apply(obj, obj2);
            if (apply != null) {
                map.put(obj, apply);
                return apply;
            } else if (obj2 == null && !map.containsKey(obj)) {
                return null;
            } else {
                map.remove(obj);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfAbsent(java.util.Map map, Object obj, Function function) {
            Object apply;
            Objects.requireNonNull(function);
            Object obj2 = map.get(obj);
            if (obj2 != null || (apply = function.apply(obj)) == null) {
                return obj2;
            }
            map.put(obj, apply);
            return apply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfPresent(java.util.Map map, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                Object apply = biFunction.apply(obj, obj2);
                if (apply != null) {
                    map.put(obj, apply);
                    return apply;
                }
                map.remove(obj);
            }
            return null;
        }

        public static void $default$forEach(java.util.Map map, BiConsumer biConsumer) {
            Objects.requireNonNull(biConsumer);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (IllegalStateException e) {
                    throw new ConcurrentModificationException(e);
                }
            }
        }

        public static Object $default$getOrDefault(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$merge(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Objects.requireNonNull(obj2);
            Object obj3 = map.get(obj);
            if (obj3 != null) {
                obj2 = biFunction.apply(obj3, obj2);
            }
            if (obj2 == null) {
                map.remove(obj);
            } else {
                map.put(obj, obj2);
            }
            return obj2;
        }

        public static Object $default$putIfAbsent(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return obj3 == null ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$remove(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            if (Objects.equals(obj3, obj2)) {
                if (obj3 == null && !map.containsKey(obj)) {
                    return false;
                }
                map.remove(obj);
                return true;
            }
            return false;
        }

        public static Object $default$replace(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$replace(java.util.Map map, Object obj, Object obj2, Object obj3) {
            Object obj4 = map.get(obj);
            if (Objects.equals(obj4, obj2)) {
                if (obj4 == null && !map.containsKey(obj)) {
                    return false;
                }
                map.put(obj, obj3);
                return true;
            }
            return false;
        }

        public static void $default$replaceAll(java.util.Map map, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    try {
                        entry.setValue((V) biFunction.apply(entry.getKey(), entry.getValue()));
                    } catch (IllegalStateException e) {
                        throw new ConcurrentModificationException(e);
                    }
                } catch (IllegalStateException e2) {
                    throw new ConcurrentModificationException(e2);
                }
            }
        }
    }

    /* renamed from: j$.util.Map$-EL */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class EL {
        public static /* synthetic */ Object a(java.util.Map map, Object obj, Object obj2) {
            return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : CC.$default$putIfAbsent(map, obj, obj2);
        }

        public static /* synthetic */ Object computeIfAbsent(java.util.Map map, Object obj, Function function) {
            return map instanceof Map ? ((Map) map).computeIfAbsent(obj, function) : map instanceof ConcurrentMap ? ConcurrentMap.CC.$default$computeIfAbsent((java.util.concurrent.ConcurrentMap) map, obj, function) : CC.$default$computeIfAbsent(map, obj, function);
        }

        public static /* synthetic */ void forEach(java.util.Map map, BiConsumer biConsumer) {
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                ConcurrentMap.CC.$default$forEach((java.util.concurrent.ConcurrentMap) map, biConsumer);
            } else {
                CC.$default$forEach(map, biConsumer);
            }
        }

        public static /* synthetic */ Object getOrDefault(java.util.Map map, Object obj, Object obj2) {
            return map instanceof Map ? ((Map) map).getOrDefault(obj, obj2) : map instanceof java.util.concurrent.ConcurrentMap ? ((java.util.concurrent.ConcurrentMap) map).get(obj) : CC.$default$getOrDefault(map, obj, obj2);
        }

        public static /* synthetic */ Object merge(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
            return map instanceof Map ? ((Map) map).merge(obj, obj2, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$merge((java.util.concurrent.ConcurrentMap) map, obj, obj2, biFunction) : CC.$default$merge(map, obj, obj2, biFunction);
        }
    }

    /* loaded from: classes3.dex */
    public interface Entry<K, V> {
        boolean equals(Object obj);

        K getKey();

        V getValue();

        int hashCode();

        V setValue(V v);
    }

    void clear();

    V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    V computeIfAbsent(K k, Function<? super K, ? extends V> function);

    V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Set<Map.Entry<K, V>> entrySet();

    boolean equals(Object obj);

    void forEach(BiConsumer<? super K, ? super V> biConsumer);

    V get(Object obj);

    V getOrDefault(Object obj, V v);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction);

    V put(K k, V v);

    void putAll(java.util.Map<? extends K, ? extends V> map);

    V putIfAbsent(K k, V v);

    V remove(Object obj);

    boolean remove(Object obj, Object obj2);

    V replace(K k, V v);

    boolean replace(K k, V v, V v2);

    void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction);

    int size();

    Collection<V> values();
}
