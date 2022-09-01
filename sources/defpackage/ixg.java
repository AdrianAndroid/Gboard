package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ixg  reason: default package */
/* loaded from: classes.dex */
public final class ixg {
    public static final /* synthetic */ int e = 0;
    public final long a;
    public final long b;
    public final byte[] c;
    public final ipt d;
    private lgb f;

    static {
        ipt.j().A();
    }

    public ixg(long j, long j2, byte[] bArr, ipt iptVar) {
        this.a = j;
        this.b = j2;
        if (bArr != null) {
            this.c = bArr;
            this.d = iptVar;
            return;
        }
        throw new NullPointerException("Null protoBytes");
    }

    public static ixg a(long j, long j2, Class cls, ngz ngzVar, byte[] bArr, ipt iptVar) {
        ixg ixgVar = new ixg(j, j2, bArr, iptVar);
        ixgVar.f = jdg.n(new ixf(ngzVar, bArr, cls, 0));
        return ixgVar;
    }

    public final ngz b() {
        return (ngz) this.f.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ixg) {
            ixg ixgVar = (ixg) obj;
            if (this.a == ixgVar.a && this.b == ixgVar.b) {
                if (Arrays.equals(this.c, ixgVar instanceof ixg ? ixgVar.c : ixgVar.c) && this.d.equals(ixgVar.d)) {
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
        return "Data{timestamp=" + j + ", sessionId=" + j2 + ", protoBytes=" + arrays + ", extraFieldValues=" + obj + "}";
    }

    public ixg() {
    }
}
