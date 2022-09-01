package defpackage;

/* compiled from: PG */
/* renamed from: msz  reason: default package */
/* loaded from: classes2.dex */
public final class msz extends nfm implements nha {
    public static final msz e;
    private static volatile nhf f;
    public int a;
    public msh b;
    public mrw c;
    public int d;

    static {
        msz mszVar = new msz();
        e = mszVar;
        nfm.L(msz.class, mszVar);
    }

    private msz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new msz();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (msz.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
