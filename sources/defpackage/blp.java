package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: blp  reason: default package */
/* loaded from: classes.dex */
public final class blp {
    public static final blp a = new blp(lzs.UNDEFINED);
    public static final blp b = new blp(lzs.UNKNOWN);
    public static final blp c = new blp(lzs.QUALITY_MET);
    public final lzs d;
    public final blb e;

    private blp(lzs lzsVar) {
        this.d = lzsVar;
        this.e = null;
    }

    public blp(lzs lzsVar, blb blbVar) {
        boolean z = true;
        if (lzsVar != lzs.OFFLINE && lzsVar != lzs.QUALITY_NOT_MET && lzsVar != lzs.NETWORK_LEVEL_NOT_MET && lzsVar != lzs.UNSTABLE_NOT_MET) {
            z = false;
        }
        jdg.A(z, "This constructor cannot be used with the given connectivity result (%s), use static constants instead.", lzsVar);
        this.d = lzsVar;
        this.e = blbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            blp blpVar = (blp) obj;
            blb blbVar = this.e;
            Integer num = null;
            Integer valueOf = blbVar == null ? null : Integer.valueOf(blbVar.a);
            blb blbVar2 = blpVar.e;
            if (blbVar2 != null) {
                num = Integer.valueOf(blbVar2.a);
            }
            if (this.d == blpVar.d && jdg.W(valueOf, num)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        return "ConnectivityCheckResult(connectivityResult=" + valueOf + " offlineException=" + valueOf2 + ")";
    }
}
