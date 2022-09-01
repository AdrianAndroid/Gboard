package defpackage;

/* compiled from: PG */
/* renamed from: chn  reason: default package */
/* loaded from: classes.dex */
public final class chn extends nfm implements nha {
    public static final chn f;
    private static volatile nhf g;
    public int a;
    public cho b;
    public chk c;
    public chm d;
    public nga e = nhi.b;

    static {
        chn chnVar = new chn();
        f = chnVar;
        nfm.L(chn.class, chnVar);
    }

    private chn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", chq.class});
            }
            if (i2 == 3) {
                return new chn();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (chn.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
