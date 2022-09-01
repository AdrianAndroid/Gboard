package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ntx  reason: default package */
/* loaded from: classes2.dex */
public final class ntx {
    public final nsa a;
    public final num b;
    public final nuq c;

    public ntx() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ntx ntxVar = (ntx) obj;
            if (jdg.W(this.a, ntxVar.a) && jdg.W(this.b, ntxVar.b) && jdg.W(this.c, ntxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "[method=" + this.c + " headers=" + this.b + " callOptions=" + this.a + "]";
    }

    public ntx(nuq nuqVar, num numVar, nsa nsaVar) {
        jdg.Q(nuqVar, "method");
        this.c = nuqVar;
        jdg.Q(numVar, "headers");
        this.b = numVar;
        jdg.Q(nsaVar, "callOptions");
        this.a = nsaVar;
    }
}
