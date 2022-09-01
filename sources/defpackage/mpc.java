package defpackage;

/* compiled from: PG */
/* renamed from: mpc  reason: default package */
/* loaded from: classes2.dex */
public final class mpc extends nfm implements nha {
    public static final mpc e;
    private static volatile nhf f;
    public int a;
    public mvv c;
    public String b = "";
    public nga d = nhi.b;

    static {
        mpc mpcVar = new mpc();
        e = mpcVar;
        nfm.L(mpc.class, mpcVar);
    }

    private mpc() {
    }

    public final void b() {
        nga ngaVar = this.d;
        if (!ngaVar.c()) {
            this.d = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0006\u001b", new Object[]{"a", "b", "c", "d", mpb.class});
            }
            if (i2 == 3) {
                return new mpc();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mpc.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
