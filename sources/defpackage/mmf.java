package defpackage;

/* compiled from: PG */
/* renamed from: mmf  reason: default package */
/* loaded from: classes2.dex */
public final class mmf extends nfm implements nha {
    public static final mmf c;
    private static volatile nhf d;
    public int a;
    public nga b = nhi.b;

    static {
        mmf mmfVar = new mmf();
        c = mmfVar;
        nfm.L(mmf.class, mmfVar);
    }

    private mmf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"a", "b", mmd.class});
            }
            if (i2 == 3) {
                return new mmf();
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
                synchronized (mmf.class) {
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
