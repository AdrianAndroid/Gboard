package defpackage;

/* compiled from: PG */
/* renamed from: bwx  reason: default package */
/* loaded from: classes.dex */
public final class bwx extends nfm implements nha {
    public static final bwx h;
    private static volatile nhf i;
    public int a;
    public int d;
    public int e;
    public long g;
    public String b = "";
    public String c = "";
    public String f = "";

    static {
        bwx bwxVar = new bwx();
        h = bwxVar;
        nfm.L(bwx.class, bwxVar);
    }

    private bwx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new bwx();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (bwx.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
