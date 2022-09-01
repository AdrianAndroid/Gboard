package defpackage;

import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: opm  reason: default package */
/* loaded from: classes2.dex */
public final class opm {
    public static final opm a;
    public static final opm b = new opl(false).a();
    private static final opj[] g;
    private static final opj[] h;
    final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        opj opjVar = opj.p;
        opj opjVar2 = opj.q;
        opj opjVar3 = opj.r;
        opj opjVar4 = opj.s;
        opj opjVar5 = opj.i;
        opj opjVar6 = opj.k;
        opj opjVar7 = opj.j;
        opj opjVar8 = opj.l;
        opj opjVar9 = opj.n;
        opj opjVar10 = opj.m;
        opj[] opjVarArr = {opj.o, opjVar, opjVar2, opjVar3, opjVar4, opjVar5, opjVar6, opjVar7, opjVar8, opjVar9, opjVar10};
        g = opjVarArr;
        opj[] opjVarArr2 = {opj.o, opjVar, opjVar2, opjVar3, opjVar4, opjVar5, opjVar6, opjVar7, opjVar8, opjVar9, opjVar10, opj.g, opj.h, opj.e, opj.f, opj.c, opj.d, opj.b};
        h = opjVarArr2;
        opl oplVar = new opl(true);
        oplVar.e(opjVarArr);
        oplVar.f(oqp.TLS_1_3, oqp.TLS_1_2);
        oplVar.c();
        oplVar.a();
        opl oplVar2 = new opl(true);
        oplVar2.e(opjVarArr2);
        oplVar2.f(oqp.TLS_1_3, oqp.TLS_1_2, oqp.TLS_1_1, oqp.TLS_1_0);
        oplVar2.c();
        a = oplVar2.a();
        opl oplVar3 = new opl(true);
        oplVar3.e(opjVarArr2);
        oplVar3.f(oqp.TLS_1_0);
        oplVar3.c();
        oplVar3.a();
    }

    public opm(opl oplVar) {
        this.c = oplVar.a;
        this.e = oplVar.b;
        this.f = oplVar.c;
        this.d = oplVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.c) {
            return false;
        }
        if (this.f != null && !oqs.v(oqs.o, this.f, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        return this.e == null || oqs.v(opj.a, this.e, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof opm)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        opm opmVar = (opm) obj;
        boolean z = this.c;
        if (z != opmVar.c) {
            return false;
        }
        return !z || (Arrays.equals(this.e, opmVar.e) && Arrays.equals(this.f, opmVar.f) && this.d == opmVar.d);
    }

    public final int hashCode() {
        if (this.c) {
            return ((((Arrays.hashCode(this.e) + 527) * 31) + Arrays.hashCode(this.f)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.e;
        String str = "[all enabled]";
        String obj = strArr != null ? opj.a(strArr).toString() : str;
        String[] strArr2 = this.f;
        if (strArr2 != null) {
            str = oqp.a(strArr2).toString();
        }
        boolean z = this.d;
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + z + ")";
    }
}
