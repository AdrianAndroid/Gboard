package defpackage;

/* compiled from: PG */
/* renamed from: mcs  reason: default package */
/* loaded from: classes.dex */
public final class mcs extends nfm implements nha {
    public static final mcs c;
    private static volatile nhf d;
    public nga a;
    public nga b;

    static {
        mcs mcsVar = new mcs();
        c = mcsVar;
        nfm.L(mcs.class, mcsVar);
    }

    private mcs() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mcs();
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
                synchronized (mcs.class) {
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

    public final void b() {
        nga ngaVar = this.b;
        if (!ngaVar.c()) {
            this.b = nfm.H(ngaVar);
        }
    }
}
