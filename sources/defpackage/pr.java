package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: pr  reason: default package */
/* loaded from: classes2.dex */
public final class pr extends py {
    public final HashMap a = new HashMap();

    @Override // defpackage.py
    public final pu a(Object obj) {
        return (pu) this.a.get(obj);
    }

    @Override // defpackage.py
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.a.remove(obj);
        return b;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
