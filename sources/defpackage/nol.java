package defpackage;

/* compiled from: PG */
/* renamed from: nol  reason: default package */
/* loaded from: classes2.dex */
public final class nol extends nfk implements nha {
    public static final nol j;
    private static volatile nhf l;
    public int a;
    public long b;
    public long c;
    public int e;
    public boolean h;
    private byte k = 2;
    public nem f = nem.b;
    public long g = 180000;
    public String i = "";

    static {
        nol nolVar = new nol();
        j = nolVar;
        nfm.L(nol.class, nolVar);
    }

    private nol() {
        nhi nhiVar = nhi.b;
        nem nemVar = nem.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(j, "\u0001\u0007\u0000\u0001\u0001\u001c\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0006ည\n\u000bင\u0004\u000fတ\u0010\u0011ဂ\u0001\u0019ဇ\u0017\u001cဈ\u0018", new Object[]{"a", "b", "f", "e", "g", "c", "h", "i"});
            }
            if (i2 == 3) {
                return new nol();
            }
            if (i2 == 4) {
                return new nfj(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (nol.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.k);
    }
}
