package defpackage;

/* compiled from: PG */
/* renamed from: mgi  reason: default package */
/* loaded from: classes.dex */
public final class mgi extends nfm implements nha {
    public static final mgi g;
    private static volatile nhf h;
    public int a;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;
    public String f = "";

    static {
        mgi mgiVar = new mgi();
        g = mgiVar;
        nfm.L(mgi.class, mgiVar);
    }

    private mgi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0006\u0002\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0001\u0004ြ\u0001\u0005ဈ\u0005\u0006ြ\u0001", new Object[]{"c", "b", "e", "d", "a", mgf.class, mgh.class, mgg.class, mgc.class, "f", mgd.class});
            }
            if (i2 == 3) {
                return new mgi();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mgi.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
