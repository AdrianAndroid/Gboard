package defpackage;

/* compiled from: PG */
/* renamed from: mmg  reason: default package */
/* loaded from: classes2.dex */
public final class mmg extends nfm implements nha {
    public static final mmg c;
    private static volatile nhf d;
    public long a;
    public long b;

    static {
        mmg mmgVar = new mmg();
        c = mmgVar;
        nfm.L(mmg.class, mmgVar);
    }

    private mmg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mmg();
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
                synchronized (mmg.class) {
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
