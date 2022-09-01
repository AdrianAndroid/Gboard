package defpackage;

/* compiled from: PG */
/* renamed from: clx  reason: default package */
/* loaded from: classes.dex */
public enum clx {
    UNKNOWN,
    AVAILABLE_ON_DEVICE,
    NOT_YET_DOWNLOADED,
    MANIFEST_NOT_YET_REGISTERED,
    NOT_AVAILABLE_WITH_CURRENT_METADATA,
    SUPERPACKS_DISABLED
}  public cqv(long j, int i, int i2) {
        this.a = j;
        this.b = i;
        this.c = 1;
        this.d = i2;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqv) {
            cqv cqvVar = (cqv) obj;
            if (this.a == cqvVar.a && this.b == cqvVar.b && this.c == cqvVar.c && this.d == cqvVar.d && this.e == cqvVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (true != this.e ? 1237 : 1231) ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        boolean z = this.e;
        return "ImageDownloaderConfig{perImageTimeoutMillis=" + j + ", maxNetworkRequests=" + i + ", minImages=" + i2 + ", maxImages=" + i3 + ", nonMeteredOnly=" + z + "}";
    }
}
