package defpackage;

/* compiled from: PG */
/* renamed from: hyz  reason: default package */
/* loaded from: classes.dex */
public final class hyz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public hyz() {
    }

    public hyz(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
    }

    public static hyt a() {
        hyt hytVar = new hyt();
        hytVar.b(false);
        hytVar.f(false);
        hytVar.c(false);
        hytVar.d(false);
        hytVar.e(0);
        return hytVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyz) {
            hyz hyzVar = (hyz) obj;
            if (this.a == hyzVar.a && this.b == hyzVar.b && this.c == hyzVar.c && this.d == hyzVar.d && this.e == hyzVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.e;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        int i = this.e;
        return "DownloadParams{allowMetered=" + z + ", requireCharging=" + z2 + ", foreground=" + z3 + ", immediately=" + z4 + ", priority=" + i + "}";
    }
}
