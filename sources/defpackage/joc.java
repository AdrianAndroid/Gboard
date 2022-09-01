package defpackage;

/* compiled from: PG */
/* renamed from: joc  reason: default package */
/* loaded from: classes.dex */
public final class joc extends nfm implements nha {
    public static final joc f;
    private static volatile nhf g;
    public ney a;
    public boolean b;
    public boolean c;
    public boolean d;
    public nec e;

    static {
        joc jocVar = new joc();
        f = jocVar;
        nfm.L(joc.class, jocVar);
    }

    private joc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\u0007\u0003\u0007\u0004\u0007\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new joc();
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
                synchronized (joc.class) {
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
