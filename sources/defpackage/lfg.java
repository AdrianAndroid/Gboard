package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lfg  reason: default package */
/* loaded from: classes.dex */
public final class lfg implements Serializable, lfe {
    private static final long serialVersionUID = 0;
    final lfe a;
    final leq b;

    public lfg(lfe lfeVar, leq leqVar) {
        jdg.u(lfeVar);
        this.a = lfeVar;
        jdg.u(leqVar);
        this.b = leqVar;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        return this.a.a(this.b.a(obj));
    }

    @Override // defpackage.lfe
    public final boolean equals(Object obj) {
        if (obj instanceof lfg) {
            lfg lfgVar = (lfg) obj;
            if (this.b.equals(lfgVar.b) && this.a.equals(lfgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(" + this.b + ")";
    }
}
