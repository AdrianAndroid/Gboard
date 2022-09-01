package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: blr  reason: default package */
/* loaded from: classes.dex */
public final class blr {
    public static final blr a = bvq.i(2, false, false, -2, -2);
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;
    private final int f;

    public blr(int i, boolean z, boolean z2, int i2, int i3) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = i3;
    }

    public final boolean a() {
        int i = this.b;
        return i == 1 || i == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blr)) {
            return false;
        }
        blr blrVar = (blr) obj;
        return this.b == blrVar.b && this.c == blrVar.c && this.e == blrVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.e)});
    }

    public final String toString() {
        int i = this.b;
        boolean z = this.c;
        int i2 = this.e;
        int i3 = this.f;
        return "ConnectivityInfo(connectivityStatus=" + i + " metered=" + z + " type=" + i2 + " subtype=" + i3 + ")";
    }
}
