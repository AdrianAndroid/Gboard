package defpackage;

/* compiled from: PG */
/* renamed from: euw  reason: default package */
/* loaded from: classes.dex */
public final class euw extends nfm implements nha {
    public static final euw c;
    private static volatile nhf d;
    public nga a;
    public nga b;

    static {
        euw euwVar = new euw();
        c = euwVar;
        nfm.L(euw.class, euwVar);
    }

    private euw() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
    }

    public final void b() {
        nga ngaVar = this.a;
        if (!ngaVar.c()) {
            this.a = nfm.H(ngaVar);
        }
    }

    public final void c() {
        nga ngaVar = this.b;
        if (!ngaVar.c()) {
            this.b = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", euv.class, "b", eux.class});
            }
            if (i2 == 3) {
                return new euw();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (euw.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
