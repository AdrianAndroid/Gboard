package defpackage;

/* compiled from: PG */
/* renamed from: mwi  reason: default package */
/* loaded from: classes2.dex */
public final class mwi extends nfm implements nha {
    public static final mwi d;
    private static volatile nhf e;
    public int a;
    public nga b = nhi.b;
    public boolean c;

    static {
        mwi mwiVar = new mwi();
        d = mwiVar;
        nfm.L(mwi.class, mwiVar);
    }

    private mwi() {
    }

    public final void b() {
        nga ngaVar = this.b;
        if (!ngaVar.c()) {
            this.b = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"a", "b", mwj.class, "c"});
            }
            if (i2 == 3) {
                return new mwi();
            }
            if (i2 == 4) {
                return new nfh((boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mwi.class) {
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
