package defpackage;

/* compiled from: PG */
/* renamed from: mxp  reason: default package */
/* loaded from: classes2.dex */
public final class mxp extends nfm implements nha {
    public static final mxp m;
    private static volatile nhf n;
    public int a;
    public long b;
    public nga c = nhi.b;
    public nem d = nem.b;
    public nem e;
    public nem f;
    public nem g;
    public nem h;
    public nem i;
    public nem j;
    public nem k;
    public nem l;

    static {
        mxp mxpVar = new mxp();
        m = mxpVar;
        nfm.L(mxp.class, mxpVar);
    }

    private mxp() {
        nem nemVar = nem.b;
        this.e = nemVar;
        this.f = nemVar;
        this.g = nemVar;
        this.h = nemVar;
        this.i = nemVar;
        this.j = nemVar;
        this.k = nemVar;
        this.l = nemVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001\u001c\u0002ည\u0001\u0003ည\u0002\u0004ဂ\u0000\u0005ည\u0004\u0006ည\u0005\u0007ည\u0006\bည\u0003\tည\u0007\u000bည\t\fည\n", new Object[]{"a", "c", "d", "e", "b", "g", "h", "i", "f", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new mxp();
            }
            if (i2 == 4) {
                return new nfh((float[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = n;
            if (nhfVar == null) {
                synchronized (mxp.class) {
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
