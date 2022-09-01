package defpackage;

/* compiled from: PG */
/* renamed from: mra  reason: default package */
/* loaded from: classes2.dex */
public final class mra extends nfm implements nha {
    public static final mra d;
    private static volatile nhf e;
    public int a;
    public long b;
    public nga c = nhi.b;

    static {
        mra mraVar = new mra();
        d = mraVar;
        nfm.L(mra.class, mraVar);
    }

    private mra() {
    }

    public final void b() {
        nga ngaVar = this.c;
        if (!ngaVar.c()) {
            this.c = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001c", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mra();
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
                synchronized (mra.class) {
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
