package defpackage;

/* compiled from: PG */
/* renamed from: mzh  reason: default package */
/* loaded from: classes2.dex */
public final class mzh extends nfm implements nha {
    public static final mzh d;
    private static volatile nhf e;
    public String a = "";
    public long b;
    public long c;

    static {
        mzh mzhVar = new mzh();
        d = mzhVar;
        nfm.L(mzh.class, mzhVar);
    }

    private mzh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mzh();
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
                synchronized (mzh.class) {
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
