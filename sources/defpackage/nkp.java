package defpackage;

/* compiled from: PG */
/* renamed from: nkp  reason: default package */
/* loaded from: classes2.dex */
public final class nkp extends nfm implements nha {
    public static final nkp d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public int c;

    static {
        nkp nkpVar = new nkp();
        d = nkpVar;
        nfm.L(nkp.class, nkpVar);
    }

    private nkp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new nkp();
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
                synchronized (nkp.class) {
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
