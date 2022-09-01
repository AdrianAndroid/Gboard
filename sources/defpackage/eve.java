package defpackage;

/* compiled from: PG */
/* renamed from: eve  reason: default package */
/* loaded from: classes.dex */
public final class eve extends nfm implements nha {
    public static final eve k;
    private static volatile nhf l;
    public int a;
    public int b;
    public nga c;
    public nga d;
    public nga f;
    public boolean g;
    public boolean i;
    public boolean j;
    public String e = "";
    public String h = "";

    static {
        eve eveVar = new eve();
        k = eveVar;
        nfm.L(eve.class, eveVar);
    }

    private eve() {
        nhi nhiVar = nhi.b;
        this.c = nhiVar;
        this.d = nhiVar;
        this.f = nhiVar;
    }

    public final void b() {
        nga ngaVar = this.c;
        if (!ngaVar.c()) {
            this.c = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001ဋ\u0000\u0002\u001a\u0003\u001b\u0004ဈ\u0001\u0005\u001b\u0006ဇ\u0002\u0007ဈ\u0003\bဇ\u0004\tဇ\u0005", new Object[]{"a", "b", "c", "d", evd.class, "e", "f", evb.class, "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new eve();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (eve.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
