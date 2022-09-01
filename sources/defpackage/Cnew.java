package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: new  reason: invalid class name and default package */
/* loaded from: classes2.dex */
public abstract class Cnew extends nee {
    private static final Logger a = Logger.getLogger(Cnew.class.getName());
    public static final boolean e = nih.b;
    public mlu f;

    public static int G(byte[] bArr) {
        return R(bArr.length);
    }

    public static int H(int i, nem nemVar) {
        return ab(i) + I(nemVar);
    }

    public static int I(nem nemVar) {
        return R(nemVar.d());
    }

    public static int J(int i, int i2) {
        return ab(i) + N(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int K(int i, ngz ngzVar, nho nhoVar) {
        int ab = ab(i);
        int i2 = ab + ab;
        ndu nduVar = (ndu) ngzVar;
        int m = nduVar.m();
        if (m == -1) {
            m = nhoVar.a(nduVar);
            nduVar.o(m);
        }
        return i2 + m;
    }

    @Deprecated
    public static int L(ngz ngzVar) {
        return ngzVar.s();
    }

    public static int M(int i, int i2) {
        return ab(i) + N(i2);
    }

    public static int N(int i) {
        if (i >= 0) {
            return ad(i);
        }
        return 10;
    }

    public static int O(int i, long j) {
        return ab(i) + af(j);
    }

    public static int P(int i, ngj ngjVar) {
        return ab(i) + Q(ngjVar);
    }

    public static int Q(ngj ngjVar) {
        int s;
        if (ngjVar.b != null) {
            s = ngjVar.b.d();
        } else {
            s = ngjVar.a != null ? ngjVar.a.s() : 0;
        }
        return R(s);
    }

    public static int R(int i) {
        return ad(i) + i;
    }

    public static int S(ngz ngzVar) {
        return R(ngzVar.s());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(ngz ngzVar, nho nhoVar) {
        ndu nduVar = (ndu) ngzVar;
        int m = nduVar.m();
        if (m == -1) {
            m = nhoVar.a(nduVar);
            nduVar.o(m);
        }
        return R(m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int U(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int V(int i, int i2) {
        return ab(i) + W(i2);
    }

    public static int W(int i) {
        return ad(ag(i));
    }

    public static int X(int i, long j) {
        return ab(i) + Y(j);
    }

    public static int Y(long j) {
        return af(ah(j));
    }

    public static int Z(int i, String str) {
        return ab(i) + aa(str);
    }

    public static int aA(int i) {
        return ab(i) + 4;
    }

    public static int aB(int i) {
        return ab(i) + 4;
    }

    public static int aC(int i) {
        return ab(i) + 8;
    }

    public static int aa(String str) {
        int length;
        try {
            length = nij.b(str);
        } catch (nii unused) {
            length = str.getBytes(ngb.a).length;
        }
        return R(length);
    }

    public static int ab(int i) {
        return ad(nim.c(i, 0));
    }

    public static int ac(int i, int i2) {
        return ab(i) + ad(i2);
    }

    public static int ad(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int ae(int i, long j) {
        return ab(i) + af(j);
    }

    public static int af(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int ag(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long ah(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static Cnew ai(byte[] bArr) {
        return ak(bArr, 0, bArr.length);
    }

    public static Cnew aj(OutputStream outputStream, int i) {
        return new net(outputStream, i);
    }

    public static Cnew ak(byte[] bArr, int i, int i2) {
        return new neu(bArr, i, i2);
    }

    public static int aw(int i) {
        return ab(i) + 1;
    }

    public static int ax(int i) {
        return ab(i) + 8;
    }

    public static int ay(int i) {
        return ab(i) + 4;
    }

    public static int az(int i) {
        return ab(i) + 8;
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i, int i2);

    public abstract void C(int i);

    public abstract void D(int i, long j);

    public abstract void E(long j);

    public abstract void F(byte[] bArr, int i);

    @Override // defpackage.nee
    public abstract void a(byte[] bArr, int i, int i2);

    public final void al() {
        if (b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void am(String str, nii niiVar) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) niiVar);
        byte[] bytes = str.getBytes(ngb.a);
        try {
            int length = bytes.length;
            C(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new nev(e2);
        }
    }

    public final void an(int i, double d) {
        q(i, Double.doubleToRawLongBits(d));
    }

    public final void ao(double d) {
        r(Double.doubleToRawLongBits(d));
    }

    public final void ap(int i, float f) {
        o(i, Float.floatToRawIntBits(f));
    }

    public final void aq(float f) {
        p(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void ar(ngz ngzVar) {
        ngzVar.ii(this);
    }

    public final void as(int i, int i2) {
        B(i, ag(i2));
    }

    public final void at(int i) {
        C(ag(i));
    }

    public final void au(int i, long j) {
        D(i, ah(j));
    }

    public final void av(long j) {
        E(ah(j));
    }

    public abstract int b();

    public abstract void j(byte b);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, nem nemVar);

    public abstract void n(nem nemVar);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(int i, long j);

    public abstract void r(long j);

    public abstract void s(int i, int i2);

    public abstract void t(int i);

    public abstract void u(int i, ngz ngzVar, nho nhoVar);

    public abstract void v(ngz ngzVar);

    public abstract void w(int i, ngz ngzVar);

    public abstract void x(int i, nem nemVar);

    public abstract void y(int i, String str);

    public abstract void z(String str);
}
