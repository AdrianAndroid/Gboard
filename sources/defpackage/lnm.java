package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lnm  reason: default package */
/* loaded from: classes.dex */
final class lnm implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public lnm(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        lnl lnlVar = new lnl(this.a);
        lnlVar.m(this.b);
        return lnlVar.g();
    }
}
