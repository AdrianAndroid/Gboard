package defpackage;

/* compiled from: PG */
/* renamed from: fhq  reason: default package */
/* loaded from: classes.dex */
public final class fhq extends nfm implements nha {
    public static final fhq c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        fhq fhqVar = new fhq();
        c = fhqVar;
        nfm.L(fhq.class, fhqVar);
    }

    private fhq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"b", "a", fhp.class});
            }
            if (i2 == 3) {
                return new fhq();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (fhq.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
