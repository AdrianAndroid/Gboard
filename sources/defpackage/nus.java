package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: nus  reason: default package */
/* loaded from: classes2.dex */
public final class nus {
    public final nvu a;
    public final Object b;

    private nus(Object obj) {
        this.b = obj;
        this.a = null;
    }

    private nus(nvu nvuVar) {
        this.b = null;
        this.a = nvuVar;
        jdg.A(!nvuVar.k(), "cannot use OK status: %s", nvuVar);
    }

    public static nus a(Object obj) {
        return new nus(obj);
    }

    public static nus b(nvu nvuVar) {
        return new nus(nvuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nus nusVar = (nus) obj;
            if (jdg.W(this.a, nusVar.a) && jdg.W(this.b, nusVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            lfa S = jdg.S(this);
            S.b("config", this.b);
            return S.toString();
        }
        lfa S2 = jdg.S(this);
        S2.b("error", this.a);
        return S2.toString();
    }
}
