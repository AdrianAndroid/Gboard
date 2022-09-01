package defpackage;

/* compiled from: PG */
/* renamed from: msx  reason: default package */
/* loaded from: classes2.dex */
public final class msx extends nfm implements nha {
    public static final msx f;
    private static volatile nhf h;
    public boolean a;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;
    private int g;

    static {
        msx msxVar = new msx();
        f = msxVar;
        nfm.L(msx.class, msxVar);
    }

    private msx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new msx();
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
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (msx.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
