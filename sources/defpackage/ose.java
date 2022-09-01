package defpackage;

/* compiled from: PG */
/* renamed from: ose  reason: default package */
/* loaded from: classes2.dex */
public final class ose {
    public static final ouu a = ouu.h(":");
    public static final ouu b = ouu.h(":status");
    public static final ouu c = ouu.h(":method");
    public static final ouu d = ouu.h(":path");
    public static final ouu e = ouu.h(":scheme");
    public static final ouu f = ouu.h(":authority");
    public final ouu g;
    public final ouu h;
    final int i;

    public ose(String str, String str2) {
        this(ouu.h(str), ouu.h(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ose) {
            ose oseVar = (ose) obj;
            if (this.g.equals(oseVar.g) && this.h.equals(oseVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + 527) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return oqs.i("%s: %s", this.g.e(), this.h.e());
    }

    public ose(ouu ouuVar, String str) {
        this(ouuVar, ouu.h(str));
    }

    public ose(ouu ouuVar, ouu ouuVar2) {
        this.g = ouuVar;
        this.h = ouuVar2;
        this.i = ouuVar.b() + 32 + ouuVar2.b();
    }
}
