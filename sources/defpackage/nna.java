package defpackage;

/* compiled from: PG */
/* renamed from: nna  reason: default package */
/* loaded from: classes2.dex */
public final class nna extends nfm implements nha {
    public static final nna k;
    public static final ngt l;
    private static volatile nhf n;
    public int a;
    public int b;
    public nju c;
    public boolean d;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private byte m = 2;
    public int e = 2;
    public String f = "";

    static {
        nna nnaVar = new nna();
        k = nnaVar;
        nfm.L(nna.class, nnaVar);
        l = nfm.P(nks.f, nnaVar, nnaVar, 294500, nik.MESSAGE);
    }

    private nna() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(k, "\u0001\b\u0000\u0002\u00012\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0005ဇ\u0003\u0007င\n\rဇ\u0011\u0014ဇ\u0019(ဇ')ဇ*2ဈ\u000e", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "j", "f"});
            }
            if (i2 == 3) {
                return new nna();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            nhf nhfVar = n;
            if (nhfVar == null) {
                synchronized (nna.class) {
                    nhfVar = n;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        n = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.m);
    }
}
