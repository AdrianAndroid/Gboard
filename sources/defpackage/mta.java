package defpackage;

/* compiled from: PG */
/* renamed from: mta  reason: default package */
/* loaded from: classes2.dex */
public final class mta extends nfm implements nha {
    public static final mta e;
    private static volatile nhf g;
    public int a;
    public mro b;
    public long c;
    public long d;
    private byte f = 2;

    static {
        mta mtaVar = new mta();
        e = mtaVar;
        nfm.L(mta.class, mtaVar);
    }

    private mta() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mta();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mta.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
