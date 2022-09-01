package defpackage;

/* compiled from: PG */
/* renamed from: mse  reason: default package */
/* loaded from: classes2.dex */
public final class mse extends nfm implements nha {
    public static final mse p;
    private static volatile nhf q;
    public int a;
    public int b;
    public int c;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public msu n;
    public String d = "";
    public String i = "";
    public String o = "";

    static {
        mse mseVar = new mse();
        p = mseVar;
        nfm.L(mse.class, mseVar);
    }

    private mse() {
        nff nffVar = nff.b;
        nhi nhiVar = nhi.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(p, "\u0001\r\u0000\u0002\u00013\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0003\u0007င\u0007\fဌ\u0014\u000eင\u0015\u0011ဈ\u0016\u0014ဇ\u0018\u001dဇ\u001f#င!$ဌ\"%ဉ#3ဈ&", new Object[]{"a", "b", "c", mgk.t, "d", "e", "f", "g", msb.e, "h", "i", "j", "k", "l", "m", mrs.c(), "n", "o"});
            }
            if (i2 == 3) {
                return new mse();
            }
            if (i2 == 4) {
                return new nfh(p);
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = q;
            if (nhfVar == null) {
                synchronized (mse.class) {
                    nhfVar = q;
                    if (nhfVar == null) {
                        nhfVar = new nfi(p);
                        q = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
