package defpackage;

/* compiled from: PG */
/* renamed from: mva  reason: default package */
/* loaded from: classes2.dex */
public final class mva extends nfm implements nha {
    public static final mva c;
    private static volatile nhf e;
    public int a;
    public String b = "";
    private int d;

    static {
        mva mvaVar = new mva();
        c = mvaVar;
        nfm.L(mva.class, mvaVar);
    }

    private mva() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new mva();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mva.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
