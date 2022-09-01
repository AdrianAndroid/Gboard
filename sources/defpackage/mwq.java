package defpackage;

/* compiled from: PG */
/* renamed from: mwq  reason: default package */
/* loaded from: classes2.dex */
public final class mwq extends nfm implements nha {
    public static final mwq c;
    private static volatile nhf g;
    public nga a;
    public nga b;
    private int d;
    private mwp e;
    private byte f = 2;

    static {
        mwq mwqVar = new mwq();
        c = mwqVar;
        nfm.L(mwq.class, mwqVar);
    }

    private mwq() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001\u001a\u0002Л\u0003ᐉ\u0000", new Object[]{"d", "a", "b", mwp.class, "e"});
            }
            if (i2 == 3) {
                return new mwq();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
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
                synchronized (mwq.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
