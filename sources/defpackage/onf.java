package defpackage;

/* compiled from: PG */
/* renamed from: onf  reason: default package */
/* loaded from: classes2.dex */
public final class onf extends nfm implements nha {
    public static final onf d;
    private static volatile nhf e;
    public int a;
    public long b;
    public String c = "";

    static {
        onf onfVar = new onf();
        d = onfVar;
        nfm.L(onf.class, onfVar);
    }

    private onf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new onf();
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
                synchronized (onf.class) {
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
