package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: llj  reason: default package */
/* loaded from: classes.dex */
public final class llj extends llu {
    private final transient EnumMap b;

    public llj(EnumMap enumMap) {
        this.b = enumMap;
        jdg.v(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.llu
    public final lsz a() {
        return new lqg(this.b.entrySet().iterator());
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof llj) {
            obj = ((llj) obj).b;
        }
        return this.b.equals(obj);
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        return this.b.get(obj);
    }

    @Override // defpackage.llw
    /* renamed from: if  reason: not valid java name */
    public final lsz mo66if() {
        Iterator it = this.b.keySet().iterator();
        jdg.u(it);
        return it instanceof lsz ? (lsz) it : new lnw(it);
    }

    @Override // defpackage.llw
    public final boolean ig() {
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.llw
    Object writeReplace() {
        return new lli(this.b);
    }
}
