package defpackage;

/* compiled from: PG */
/* renamed from: gfz  reason: default package */
/* loaded from: classes.dex */
public final class gfz extends nfm implements nha {
    public static final gfz e;
    private static volatile nhf f;
    public int a;
    public float c;
    public String b = "";
    public nga d = nhi.b;

    static {
        gfz gfzVar = new gfz();
        e = gfzVar;
        nfm.L(gfz.class, gfzVar);
    }

    private gfz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0004\u001a", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new gfz();
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
                synchronized (gfz.class) {
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
