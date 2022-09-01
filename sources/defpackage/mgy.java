package defpackage;

/* compiled from: PG */
/* renamed from: mgy  reason: default package */
/* loaded from: classes.dex */
public final class mgy extends nfm implements nha {
    public static final mgy h;
    private static volatile nhf i;
    public int a;
    public int c;
    public int e;
    public long f;
    public String b = "";
    public String d = "";
    public String g = "";

    static {
        mgy mgyVar = new mgy();
        h = mgyVar;
        nfm.L(mgy.class, mgyVar);
    }

    private mgy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0006ဂ\u0006\u0007ဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new mgy();
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
                synchronized (mgy.class) {
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
