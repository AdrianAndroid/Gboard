package defpackage;

/* compiled from: PG */
/* renamed from: hlc  reason: default package */
/* loaded from: classes.dex */
public final class hlc {
    public final int a;
    public final int b;
    public final int c;

    public hlc() {
    }

    public hlc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static hlc a(int i, int i2, int i3) {
        return new hlc(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hlc) {
            hlc hlcVar = (hlc) obj;
            if (this.a == hlcVar.a && this.b == hlcVar.b && this.c == hlcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        return "Position{position=" + i + ", xOffset=" + i2 + ", yOffset=" + i3 + "}";
    }
}
