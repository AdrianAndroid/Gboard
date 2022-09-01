package defpackage;

/* compiled from: PG */
/* renamed from: bkr  reason: default package */
/* loaded from: classes.dex */
public final class bkr extends nfm implements nha {
    public static final bkr d;
    private static volatile nhf e;
    public String a = "";
    public boolean b;
    public ney c;

    static {
        bkr bkrVar = new bkr();
        d = bkrVar;
        nfm.L(bkr.class, bkrVar);
    }

    private bkr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bkr();
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
                synchronized (bkr.class) {
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
