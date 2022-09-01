package defpackage;

/* compiled from: PG */
/* renamed from: mub  reason: default package */
/* loaded from: classes2.dex */
public final class mub extends nfm implements nha {
    public static final mub l;
    private static volatile nhf m;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public boolean j;
    public boolean k;

    static {
        mub mubVar = new mub();
        l = mubVar;
        nfm.L(mub.class, mubVar);
    }

    private mub() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\nဇ\b\u000bဇ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new mub();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (mub.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
