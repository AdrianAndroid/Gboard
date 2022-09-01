package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lky  reason: default package */
/* loaded from: classes.dex */
public abstract class lky extends lkz implements Map {
    protected abstract Map b();

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return b().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return b().values();
    }
}
