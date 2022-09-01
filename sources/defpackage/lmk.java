package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lmk  reason: default package */
/* loaded from: classes.dex */
final class lmk extends lmr {
    final /* synthetic */ lmn a;

    public lmk(lmn lmnVar) {
        this.a = lmnVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use KeysSerializedForm");
    }

    @Override // defpackage.lqx
    public final int a(Object obj) {
        Collection collection = (Collection) this.a.map.get(obj);
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    @Override // defpackage.lmr, defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.map.containsKey(obj);
    }

    @Override // defpackage.llg
    public final boolean m() {
        throw null;
    }

    @Override // defpackage.lmr, defpackage.lqx
    /* renamed from: o */
    public final lmz e() {
        return this.a.u();
    }

    @Override // defpackage.lmr
    public final lqw p(int i) {
        Map.Entry entry = (Map.Entry) this.a.map.entrySet().k().get(i);
        return new lra(entry.getKey(), ((Collection) entry.getValue()).size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.lqx
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.lmr, defpackage.llg
    Object writeReplace() {
        return new lml(this.a);
    }
}
