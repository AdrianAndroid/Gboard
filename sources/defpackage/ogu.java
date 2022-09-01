package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: ogu  reason: default package */
/* loaded from: classes2.dex */
public final class ogu {
    public static final ogu a;
    private static final ogt[] f;
    public final boolean b;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        ogt[] ogtVarArr = {ogt.TLS_AES_128_GCM_SHA256, ogt.TLS_AES_256_GCM_SHA384, ogt.TLS_CHACHA20_POLY1305_SHA256, ogt.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, ogt.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, ogt.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, ogt.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, ogt.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, ogt.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, ogt.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, ogt.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, ogt.TLS_RSA_WITH_AES_128_GCM_SHA256, ogt.TLS_RSA_WITH_AES_256_GCM_SHA384, ogt.TLS_RSA_WITH_AES_128_CBC_SHA, ogt.TLS_RSA_WITH_AES_256_CBC_SHA, ogt.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = ogtVarArr;
        opl oplVar = new opl(true);
        oplVar.h(ogtVarArr);
        oplVar.k(ohd.TLS_1_3, ohd.TLS_1_2);
        oplVar.j();
        ogu g = oplVar.g();
        a = g;
        opl oplVar2 = new opl(g);
        oplVar2.k(ohd.TLS_1_3, ohd.TLS_1_2, ohd.TLS_1_1, ohd.TLS_1_0);
        oplVar2.j();
        oplVar2.g();
        new opl(false).g();
    }

    public ogu(opl oplVar, byte[] bArr) {
        this.b = oplVar.a;
        this.c = oplVar.b;
        this.d = oplVar.c;
        this.e = oplVar.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ogu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ogu oguVar = (ogu) obj;
        boolean z = this.b;
        if (z != oguVar.b) {
            return false;
        }
        return !z || (Arrays.equals(this.c, oguVar.c) && Arrays.equals(this.d, oguVar.d) && this.e == oguVar.e);
    }

    public final int hashCode() {
        if (this.b) {
            return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List a2;
        if (this.b) {
            String[] strArr = this.c;
            int i = 0;
            if (strArr == null) {
                a2 = null;
            } else {
                ogt[] ogtVarArr = new ogt[strArr.length];
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.c;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    ogtVarArr[i2] = ogt.a(strArr2[i2]);
                    i2++;
                }
                a2 = ohe.a(ogtVarArr);
            }
            String obj = a2 == null ? "[use default]" : a2.toString();
            ohd[] ohdVarArr = new ohd[this.d.length];
            while (true) {
                String[] strArr3 = this.d;
                if (i < strArr3.length) {
                    ohdVarArr[i] = ohd.a(strArr3[i]);
                    i++;
                } else {
                    String valueOf = String.valueOf(ohe.a(ohdVarArr));
                    boolean z = this.e;
                    return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + valueOf + ", supportsTlsExtensions=" + z + ")";
                }
            }
        } else {
            return "ConnectionSpec()";
        }
    }
}
