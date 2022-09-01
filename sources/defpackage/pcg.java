package defpackage;

/* compiled from: PG */
/* renamed from: pcg  reason: default package */
/* loaded from: classes2.dex */
public final class pcg extends nfm implements nha {
    public static final pcg f;
    private static volatile nhf g;
    public ngu a = ngu.a;
    public ngu b = ngu.a;
    public nga c = nhi.b;
    public nfs d = nfn.b;
    public nga e = nhi.b;

    static {
        pcg pcgVar = new pcg();
        f = pcgVar;
        nfm.L(pcg.class, pcgVar);
    }

    private pcg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u00012\u00022\u0003\u001b\u0004'\u0005\u001b", new Object[]{"a", pce.a, "b", pcf.a, "c", pcd.class, "d", "e", pca.class});
            }
            if (i2 == 3) {
                return new pcg();
            }
            if (i2 == 4) {
                return new nfh((short[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (pcg.class) {
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
