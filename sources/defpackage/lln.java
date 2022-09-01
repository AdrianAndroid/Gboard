package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lln  reason: default package */
/* loaded from: classes.dex */
final class lln implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public lln(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return llp.p(this.a);
    }
}
