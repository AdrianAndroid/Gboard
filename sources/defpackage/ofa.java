package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ofa  reason: default package */
/* loaded from: classes2.dex */
public final class ofa {
    final nud a;
    final Object b;

    public ofa(nud nudVar, Object obj) {
        this.a = nudVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ofa ofaVar = (ofa) obj;
            if (jdg.W(this.a, ofaVar.a) && jdg.W(this.b, ofaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("provider", this.a);
        S.b("config", this.b);
        return S.toString();
    }
}
