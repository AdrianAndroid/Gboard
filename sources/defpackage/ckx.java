package defpackage;

/* compiled from: PG */
/* renamed from: ckx  reason: default package */
/* loaded from: classes.dex */
public final class ckx extends nfm implements nha {
    public static final ckx b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        ckx ckxVar = new ckx();
        b = ckxVar;
        nfm.L(ckx.class, ckxVar);
    }

    private ckx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new ckx();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (ckx.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
