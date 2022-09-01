package defpackage;

/* compiled from: PG */
/* renamed from: nja  reason: default package */
/* loaded from: classes2.dex */
public final class nja extends nfm implements nha {
    public static final nja m;
    private static volatile nhf n;
    public int a;
    public int c;
    public long d;
    public long e;
    public long f;
    public int h;
    public int i;
    public niy j;
    public String b = "";
    public String g = "";
    public nfv k = ngp.b;
    public String l = "";

    static {
        nja njaVar = new nja();
        m = njaVar;
        nfm.L(nja.class, njaVar);
    }

    private nja() {
    }

    public final void c() {
        nfv nfvVar = this.k;
        if (!nfvVar.c()) {
            this.k = nfm.F(nfvVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဂ\u0004\u0005ဈ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\t\u0014\u000bဈ\u000b\fင\u0001\rဉ\t", new Object[]{"a", "b", "d", "e", "f", "g", "h", mxe.l, "i", mxe.k, "k", "l", "c", "j"});
            }
            if (i2 == 3) {
                return new nja();
            }
            if (i2 == 4) {
                return new nfh((short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = n;
            if (nhfVar == null) {
                synchronized (nja.class) {
                    nhfVar = n;
                    if (nhfVar == null) {
                        nhfVar = new nfi(m);
                        n = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
