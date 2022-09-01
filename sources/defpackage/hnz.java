package defpackage;

/* compiled from: PG */
/* renamed from: hnz  reason: default package */
/* loaded from: classes.dex */
public final class hnz extends nfm implements nha {
    public static final hnz b;
    private static volatile nhf d;
    private byte c = 2;
    public nga a = nhi.b;

    static {
        hnz hnzVar = new hnz();
        b = hnzVar;
        nfm.L(hnz.class, hnzVar);
    }

    private hnz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", hny.class});
            }
            if (i2 == 3) {
                return new hnz();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (hnz.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.c);
    }
}
