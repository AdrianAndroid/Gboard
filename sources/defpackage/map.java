package defpackage;

/* compiled from: PG */
/* renamed from: map  reason: default package */
/* loaded from: classes.dex */
public final class map extends nfm implements nha {
    public static final map d;
    private static volatile nhf e;
    public int a;
    public int b;
    public String c = "";

    static {
        map mapVar = new map();
        d = mapVar;
        nfm.L(map.class, mapVar);
    }

    private map() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", jih.s, "c"});
            }
            if (i2 == 3) {
                return new map();
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
                synchronized (map.class) {
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
