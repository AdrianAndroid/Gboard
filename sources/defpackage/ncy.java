package defpackage;

/* compiled from: PG */
/* renamed from: ncy  reason: default package */
/* loaded from: classes2.dex */
public final class ncy extends nfm implements nha {
    public static final ncy g;
    private static volatile nhf h;
    public int b;
    public nco c;
    public String a = "";
    public String d = "";
    public String e = "";
    public nga f = nhi.b;

    static {
        ncy ncyVar = new ncy();
        g = ncyVar;
        nfm.L(ncy.class, ncyVar);
    }

    private ncy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0000\u0006\u0000\u0000\u0001\u0013\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0006Ȉ\bȈ\u0011\u001b\u0013\t", new Object[]{"a", "b", "d", "e", "f", ncw.class, "c"});
            }
            if (i2 == 3) {
                return new ncy();
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
                synchronized (ncy.class) {
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
