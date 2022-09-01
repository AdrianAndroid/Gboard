package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lhf  reason: default package */
/* loaded from: classes.dex */
final class lhf extends lgs {
    final /* synthetic */ lig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhf(lig ligVar) {
        super(ligVar);
        this.b = ligVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = this.b.get(key)) != null && this.b.i.d(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lhe(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.b.remove(key, entry.getValue());
    }
}
