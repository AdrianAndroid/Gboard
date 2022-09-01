package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: nfz  reason: default package */
/* loaded from: classes2.dex */
public final class nfz extends AbstractMap {
    public final nfw a;
    private final Map b;

    public nfz(Map map, nfw nfwVar) {
        this.b = map;
        this.a = nfwVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new nfy(this, this.b.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.a.a(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object valueOf;
        Map map = this.b;
        valueOf = Integer.valueOf(((nfp) obj2).a());
        Object put = map.put(obj, valueOf);
        if (put == null) {
            return null;
        }
        return this.a.a(put);
    }
}
