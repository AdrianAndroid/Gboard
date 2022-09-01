package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lmv  reason: default package */
/* loaded from: classes.dex */
final class lmv implements Serializable {
    private final llp a;

    public lmv(llp llpVar) {
        this.a = llpVar;
    }

    Object readResolve() {
        if (this.a.isEmpty()) {
            return lmw.a;
        }
        if (lre.I(this.a, llp.r(lrh.a))) {
            return lmw.b;
        }
        return new lmw(this.a);
    }
}
