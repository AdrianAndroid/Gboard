package defpackage;

/* compiled from: PG */
/* renamed from: jou  reason: default package */
/* loaded from: classes.dex */
public final class jou {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final double i;

    public jou() {
    }

    public jou(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, double d) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jou) {
            jou jouVar = (jou) obj;
            if (this.a == jouVar.a && this.b == jouVar.b && this.c == jouVar.c && this.d == jouVar.d && this.e == jouVar.e && this.f == jouVar.f && this.g == jouVar.g && this.h == jouVar.h && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(jouVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)));
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        double d = this.i;
        return "HttpConfig{connectTimeoutMs=" + i + ", readTimeoutMs=" + i2 + ", requestBodyChunkSizeBytes=" + i3 + ", responseBodyChunkSizeBytes=" + i4 + ", responseBodyGzipBufferSizeBytes=" + i5 + ", callDisconnectWhenCancelled=" + z + ", supportAcceptEncodingHeader=" + z2 + ", estimateSentReceivedBytes=" + z3 + ", estimatedHttp2HeaderCompressionRatio=" + d + "}";
    }
}
