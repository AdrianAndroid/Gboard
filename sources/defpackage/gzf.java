package defpackage;

/* compiled from: PG */
/* renamed from: gzf  reason: default package */
/* loaded from: classes.dex */
public final class gzf extends nfm implements nha {
    public static final gzf j;
    private static volatile nhf k;
    public int a;
    public int e;
    public int f;
    public int g;
    public String b = "";
    public String c = "";
    public String d = "";
    public String h = "";
    public String i = "";

    static {
        gzf gzfVar = new gzf();
        j = gzfVar;
        nfm.L(gzf.class, gzfVar);
    }

    private gzf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new gzf();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (gzf.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
