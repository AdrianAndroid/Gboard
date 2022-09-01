package defpackage;

/* compiled from: PG */
/* renamed from: njq  reason: default package */
/* loaded from: classes2.dex */
public final class njq extends nfm implements nha {
    public static final njq c;
    private static volatile nhf d;
    public int a;
    public String b = "";

    static {
        njq njqVar = new njq();
        c = njqVar;
        nfm.L(njq.class, njqVar);
    }

    private njq() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new njq();
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
                synchronized (njq.class) {
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
