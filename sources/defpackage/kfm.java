package defpackage;

/* compiled from: PG */
/* renamed from: kfm  reason: default package */
/* loaded from: classes.dex */
public final class kfm extends nfm implements nha {
    public static final kfm c;
    private static volatile nhf e;
    public int a;
    public String b = "";
    private int d;

    static {
        kfm kfmVar = new kfm();
        c = kfmVar;
        nfm.L(kfm.class, kfmVar);
    }

    private kfm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", jih.h, "b"});
            }
            if (i2 == 3) {
                return new kfm();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (kfm.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
