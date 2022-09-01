package defpackage;

/* compiled from: PG */
/* renamed from: jij  reason: default package */
/* loaded from: classes.dex */
public final class jij extends nfm implements nha {
    public static final jij f;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    static {
        jij jijVar = new jij();
        f = jijVar;
        nfm.L(jij.class, jijVar);
    }

    private jij() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0003\u0004ဂ\u0002", new Object[]{"a", "b", jih.e, "c", jih.d, "e", jih.c, "d"});
            }
            if (i2 == 3) {
                return new jij();
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
                synchronized (jij.class) {
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
