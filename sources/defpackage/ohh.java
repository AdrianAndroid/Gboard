package defpackage;

/* compiled from: PG */
/* renamed from: ohh  reason: default package */
/* loaded from: classes2.dex */
public final class ohh {
    public static final ouu a = ouu.h(":status");
    public static final ouu b = ouu.h(":method");
    public static final ouu c = ouu.h(":path");
    public static final ouu d = ouu.h(":scheme");
    public static final ouu e = ouu.h(":authority");
    public final ouu f;
    public final ouu g;
    final int h;

    static {
        ouu.h(":host");
        ouu.h(":version");
    }

    public ohh(String str, String str2) {
        this(ouu.h(str), ouu.h(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ohh) {
            ohh ohhVar = (ohh) obj;
            if (this.f.equals(ohhVar.f) && this.g.equals(ohhVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.e(), this.g.e());
    }

    public ohh(ouu ouuVar, String str) {
        this(ouuVar, ouu.h(str));
    }

    public ohh(ouu ouuVar, ouu ouuVar2) {
        this.f = ouuVar;
        this.g = ouuVar2;
        this.h = ouuVar.b() + 32 + ouuVar2.b();
    }
}
