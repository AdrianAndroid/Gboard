package defpackage;

/* compiled from: PG */
/* renamed from: mqi  reason: default package */
/* loaded from: classes2.dex */
public final class mqi extends nfm implements nha {
    public static final mqi d;
    private static volatile nhf e;
    public int a;
    public mqh b;
    public mqk c;

    static {
        mqi mqiVar = new mqi();
        d = mqiVar;
        nfm.L(mqi.class, mqiVar);
    }

    private mqi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0000\u0000\u0004ဉ\u0001\u0007ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mqi();
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
                synchronized (mqi.class) {
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
