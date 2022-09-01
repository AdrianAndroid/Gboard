package defpackage;

/* compiled from: PG */
/* renamed from: eut  reason: default package */
/* loaded from: classes.dex */
public final class eut extends nfm implements nha {
    public static final nft f = new euq(1);
    public static final nft h = new euq(0);
    public static final eut j;
    private static volatile nhf k;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public nfs e;
    public nfs g;
    public double i;

    static {
        eut eutVar = new eut();
        j = eutVar;
        nfm.L(eut.class, eutVar);
    }

    private eut() {
        nhi nhiVar = nhi.b;
        nfn nfnVar = nfn.b;
        this.e = nfnVar;
        this.g = nfnVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0002\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0005\u001e\u0006\u001e\nက\u0004", new Object[]{"a", "b", "c", "d", "e", eur.c(), "g", eus.c(), "i"});
            }
            if (i2 == 3) {
                return new eut();
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
                synchronized (eut.class) {
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
