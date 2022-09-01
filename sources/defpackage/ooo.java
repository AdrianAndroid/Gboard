package defpackage;

/* compiled from: PG */
/* renamed from: ooo  reason: default package */
/* loaded from: classes2.dex */
public final class ooo extends nfm implements nha {
    public static final ooo c;
    private static volatile nhf d;
    public nfs a;
    public nfs b;

    static {
        ooo oooVar = new ooo();
        c = oooVar;
        nfm.L(ooo.class, oooVar);
    }

    private ooo() {
        nfn nfnVar = nfn.b;
        this.a = nfnVar;
        this.b = nfnVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ooo();
            }
            if (i2 == 4) {
                return new nfh((int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (ooo.class) {
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
