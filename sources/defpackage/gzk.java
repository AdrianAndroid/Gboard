package defpackage;

/* compiled from: PG */
/* renamed from: gzk  reason: default package */
/* loaded from: classes.dex */
public final class gzk extends nfm implements nha {
    public static final gzk d;
    private static volatile nhf f;
    public Object b;
    private int e;
    public int a = 0;
    public String c = "";

    static {
        gzk gzkVar = new gzk();
        d = gzkVar;
        nfm.L(gzk.class, gzkVar);
    }

    private gzk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002့\u0000\u0003ဴ\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006်\u0000", new Object[]{"b", "a", "e", "c"});
            }
            if (i2 == 3) {
                return new gzk();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (gzk.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
