package defpackage;

/* compiled from: PG */
/* renamed from: mdb  reason: default package */
/* loaded from: classes.dex */
public final class mdb extends nfm implements nha {
    public static final mdb d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public float c;

    static {
        mdb mdbVar = new mdb();
        d = mdbVar;
        nfm.L(mdb.class, mdbVar);
    }

    private mdb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ခ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mdb();
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
                synchronized (mdb.class) {
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
