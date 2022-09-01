package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iwv  reason: default package */
/* loaded from: classes.dex */
final class iwv {
    public final long a;
    public final long b;
    public final byte[] c;
    public final ipt d;

    public iwv() {
    }

    public iwv(long j, long j2, byte[] bArr, ipt iptVar) {
        this.a = j;
        this.b = j2;
        this.c = bArr;
        this.d = iptVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iwv) {
            iwv iwvVar = (iwv) obj;
            if (this.a == iwvVar.a && this.b == iwvVar.b) {
                if (Arrays.equals(this.c, iwvVar instanceof iwv ? iwvVar.c : iwvVar.c) && this.d.equals(iwvVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String arrays = Arrays.toString(this.c);
        String obj = this.d.toString();
        return "CachedData{timestamp=" + j + ", sessionId=" + j2 + ", protoBytes=" + arrays + ", extraFieldValues=" + obj + "}";
    }
}
