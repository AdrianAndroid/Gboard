package defpackage;

/* compiled from: PG */
/* renamed from: pcd  reason: default package */
/* loaded from: classes2.dex */
public final class pcd extends nfm implements nha {
    public static final pcd h;
    private static volatile nhf i;
    public nfs e;
    public nfs f;
    public ngu a = ngu.a;
    public ngu b = ngu.a;
    public nga c = nhi.b;
    public nfv d = ngp.b;
    public nfv g = ngp.b;

    static {
        pcd pcdVar = new pcd();
        h = pcdVar;
        nfm.L(pcd.class, pcdVar);
    }

    private pcd() {
        nfn nfnVar = nfn.b;
        this.e = nfnVar;
        this.f = nfnVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0007\u0000\u0000\u0002\n\u0007\u0002\u0005\u0000\u00022\u00032\u0006\u001b\u0007%\b'\t'\n%", new Object[]{"a", pcb.a, "b", pcc.a, "c", pbz.class, "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new pcd();
            }
            if (i3 == 4) {
                return new nfh((short[]) null, (short[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (pcd.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
