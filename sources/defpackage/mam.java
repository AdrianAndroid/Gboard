package defpackage;

/* compiled from: PG */
/* renamed from: mam  reason: default package */
/* loaded from: classes.dex */
public final class mam extends nfm implements nha {
    public static final mam d;
    private static volatile nhf e;
    public int a;
    public int b;
    public int c;

    static {
        mam mamVar = new mam();
        d = mamVar;
        nfm.L(mam.class, mamVar);
    }

    private mam() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", jih.r, "c", jih.q});
            }
            if (i2 == 3) {
                return new mam();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mam.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
