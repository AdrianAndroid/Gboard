package defpackage;

/* compiled from: PG */
/* renamed from: bkt  reason: default package */
/* loaded from: classes.dex */
public final class bkt extends nfm implements nha {
    public static final bkt d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public boolean c;

    static {
        bkt bktVar = new bkt();
        d = bktVar;
        nfm.L(bkt.class, bktVar);
    }

    private bkt() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0007", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bkt();
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
                synchronized (bkt.class) {
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
