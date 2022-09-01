package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: qo  reason: default package */
/* loaded from: classes2.dex */
public class qo extends qv implements Map, j$.util.Map {
    qi a;
    qk b;
    qm c;

    public qo() {
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
    public final Set entrySet() {
        qi qiVar = this.a;
        if (qiVar == null) {
            qi qiVar2 = new qi(this);
            this.a = qiVar2;
            return qiVar2;
        }
        return qiVar;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        qk qkVar = this.b;
        if (qkVar == null) {
            qk qkVar2 = new qk(this);
            this.b = qkVar2;
            return qkVar2;
        }
        return qkVar;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        g(this.d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        qm qmVar = this.c;
        if (qmVar == null) {
            qm qmVar2 = new qm(this);
            this.c = qmVar2;
            return qmVar2;
        }
        return qmVar;
    }

    public qo(int i) {
        super(i);
    }
}
