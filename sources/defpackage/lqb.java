package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: lqb  reason: default package */
/* loaded from: classes.dex */
final class lqb extends lje {
    final Object a;
    Object b;
    final /* synthetic */ lqc c;

    public lqb(lqc lqcVar, Object obj, Object obj2) {
        this.c = lqcVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object put = this.c.put(this.a, obj);
        this.b = obj;
        return put;
    }
}
