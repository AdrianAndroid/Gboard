package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: blu  reason: default package */
/* loaded from: classes.dex */
public final class blu {
    public static final blu a = a().a();
    public final blt b;
    public final long c;
    public final int d;

    static {
        bls a2 = a();
        a2.d = 3;
        a2.a();
        bls a3 = a();
        a3.d = 2;
        a3.a();
    }

    public blu() {
    }

    public blu(int i, blt bltVar, long j) {
        this.d = i;
        this.b = bltVar;
        this.c = j;
    }

    public static bls a() {
        bls blsVar = new bls();
        blsVar.d = 1;
        blsVar.a = blt.a;
        blsVar.b = Long.MAX_VALUE;
        blsVar.c = (byte) 1;
        return blsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blu)) {
            return false;
        }
        blu bluVar = (blu) obj;
        return this.d == bluVar.d && this.b.equals(bluVar.b) && this.c == bluVar.c;
    }

    public final int hashCode() {
        Object[] objArr = new Object[3];
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = this.b;
        objArr[2] = Long.valueOf(this.c);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = this.b;
        objArr[2] = Long.valueOf(this.c);
        return String.format("ConnectivityRequirements: networkLevel=%d, networkQuality=%s, maxConnectivityCheckDurationMs=%d", objArr);
    }
}
