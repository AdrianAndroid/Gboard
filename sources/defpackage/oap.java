package defpackage;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oap  reason: default package */
/* loaded from: classes2.dex */
public final class oap {
    final int a;
    final long b;
    final Set c;

    public oap(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = lmz.p(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oap oapVar = (oap) obj;
            if (this.a == oapVar.a && this.b == oapVar.b && jdg.W(this.c, oapVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.f("maxAttempts", this.a);
        S.g("hedgingDelayNanos", this.b);
        S.b("nonFatalStatusCodes", this.c);
        return S.toString();
    }
}
