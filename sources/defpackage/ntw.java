package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ntw  reason: default package */
/* loaded from: classes2.dex */
public final class ntw {
    public static final ntw a = new ntw(null, nvu.b, false);
    public final ntz b;
    public final nvu c;
    public final boolean d;
    private final nxp e = null;

    private ntw(ntz ntzVar, nvu nvuVar, boolean z) {
        this.b = ntzVar;
        jdg.Q(nvuVar, "status");
        this.c = nvuVar;
        this.d = z;
    }

    public static ntw a(nvu nvuVar) {
        jdg.w(!nvuVar.k(), "drop status shouldn't be OK");
        return new ntw(null, nvuVar, true);
    }

    public static ntw b(nvu nvuVar) {
        jdg.w(!nvuVar.k(), "error status shouldn't be OK");
        return new ntw(null, nvuVar, false);
    }

    public static ntw c(ntz ntzVar) {
        jdg.Q(ntzVar, "subchannel");
        return new ntw(ntzVar, nvu.b, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ntw)) {
            return false;
        }
        ntw ntwVar = (ntw) obj;
        if (jdg.W(this.b, ntwVar.b) && jdg.W(this.c, ntwVar.c)) {
            nxp nxpVar = ntwVar.e;
            if (jdg.W(null, null) && this.d == ntwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("subchannel", this.b);
        S.b("streamTracerFactory", null);
        S.b("status", this.c);
        S.h("drop", this.d);
        return S.toString();
    }
}
