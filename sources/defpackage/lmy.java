package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lmy  reason: default package */
/* loaded from: classes.dex */
final class lmy implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public lmy(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return lmz.q(this.a);
    }
}
