package defpackage;

/* compiled from: PG */
/* renamed from: fhy  reason: default package */
/* loaded from: classes.dex */
public final class fhy extends nfm implements nha {
    public static final fhy d;
    private static volatile nhf e;
    public int a = 0;
    public Object b;
    public ney c;

    static {
        fhy fhyVar = new fhy();
        d = fhyVar;
        nfm.L(fhy.class, fhyVar);
    }

    private fhy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001<\u0000\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b\t", new Object[]{"b", "a", fhx.class, fht.class, fhu.class, nez.class, fhv.class, "c"});
            }
            if (i2 == 3) {
                return new fhy();
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
                synchronized (fhy.class) {
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
