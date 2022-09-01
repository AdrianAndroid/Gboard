package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ipb  reason: default package */
/* loaded from: classes.dex */
public final class ipb {
    public final String a;
    public final ipt b;
    public final ngz c;
    public final byte[] d;

    public ipb() {
    }

    public ipb(String str, ipt iptVar, ngz ngzVar, byte[] bArr) {
        this.a = str;
        this.b = iptVar;
        this.c = ngzVar;
        this.d = bArr;
    }

    public static osr a() {
        osr osrVar = new osr((short[]) null);
        osrVar.c = null;
        osrVar.b = null;
        return osrVar;
    }

    public final boolean equals(Object obj) {
        ngz ngzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ipb) {
            ipb ipbVar = (ipb) obj;
            if (this.a.equals(ipbVar.a) && this.b.equals(ipbVar.b) && ((ngzVar = this.c) != null ? ngzVar.equals(ipbVar.c) : ipbVar.c == null)) {
                boolean z = ipbVar instanceof ipb;
                if (Arrays.equals(this.d, ipbVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        ngz ngzVar = this.c;
        return ((hashCode ^ (ngzVar == null ? 0 : ngzVar.hashCode())) * 1000003) ^ Arrays.hashCode(this.d);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String arrays = Arrays.toString(this.d);
        return "DataItem{tableName=" + str + ", additionalFields=" + valueOf + ", message=" + valueOf2 + ", protoBytes=" + arrays + "}";
    }
}
