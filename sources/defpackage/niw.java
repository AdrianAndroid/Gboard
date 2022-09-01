package defpackage;

/* compiled from: PG */
/* renamed from: niw  reason: default package */
/* loaded from: classes2.dex */
public final class niw extends nfm implements nha {
    public static final niw c;
    private static volatile nhf d;
    public nfs a = nfn.b;
    public nga b = nhi.b;

    static {
        niw niwVar = new niw();
        c = niwVar;
        nfm.L(niw.class, niwVar);
    }

    private niw() {
    }

    public static nfh c() {
        return c.t();
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"a", mxe.j, "b", nix.class});
            }
            if (i2 == 3) {
                return new niw();
            }
            if (i2 == 4) {
                return new nfh((float[][]) null);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (niw.class) {
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
}
