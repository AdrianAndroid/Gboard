package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: llh  reason: default package */
/* loaded from: classes.dex */
class llh extends lje implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b;

    public llh(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
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
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
