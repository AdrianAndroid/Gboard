package defpackage;

/* compiled from: PG */
/* renamed from: onp  reason: default package */
/* loaded from: classes2.dex */
public final class onp extends nfm implements nha {
    public static final onp c;
    private static volatile nhf d;
    public int a;
    public boolean b;

    static {
        onp onpVar = new onp();
        c = onpVar;
        nfm.L(onp.class, onpVar);
    }

    private onp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new onp();
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
                synchronized (onp.class) {
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
