package defpackage;

/* compiled from: PG */
/* renamed from: ncw  reason: default package */
/* loaded from: classes2.dex */
public final class ncw extends nfm implements nha {
    public static final ncw g;
    private static volatile nhf h;
    public int b;
    public nco c;
    public String a = "";
    public String d = "";
    public nga e = nhi.b;
    public String f = "";

    static {
        ncw ncwVar = new ncw();
        g = ncwVar;
        nfm.L(ncw.class, ncwVar);
    }

    private ncw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0000\u0006\u0000\u0000\u0001\t\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\t\u0005Ȉ\b\u001b\tȈ", new Object[]{"a", "b", "c", "d", "e", ncq.class, "f"});
            }
            if (i2 == 3) {
                return new ncw();
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
                synchronized (ncw.class) {
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
