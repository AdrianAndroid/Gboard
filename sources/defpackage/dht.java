package defpackage;

/* compiled from: PG */
/* renamed from: dht  reason: default package */
/* loaded from: classes.dex */
public final class dht extends nfm implements nha {
    public static final dht b;
    private static volatile nhf c;
    public boolean a;

    static {
        dht dhtVar = new dht();
        b = dhtVar;
        nfm.L(dht.class, dhtVar);
    }

    private dht() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dht();
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
                synchronized (dht.class) {
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
