package defpackage;

/* compiled from: PG */
/* renamed from: kjy  reason: default package */
/* loaded from: classes.dex */
public final class kjy extends nfm implements nha {
    public static final kjy e;
    private static volatile nhf f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        kjy kjyVar = new kjy();
        e = kjyVar;
        nfm.L(kjy.class, kjyVar);
    }

    private kjy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001း\u0000\u0002်\u0000\u0003ဳ\u0000\u0004ျ\u0000\u0005ွ\u0000\nဈ\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new kjy();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (kjy.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
