package defpackage;

/* compiled from: PG */
/* renamed from: ghh  reason: default package */
/* loaded from: classes.dex */
public final class ghh extends nfm implements nha {
    public static final ghh g;
    private static volatile nhf h;
    public int a;
    public nga b;
    public ghk c;
    public boolean d;
    public long e;
    public nga f;

    static {
        ghh ghhVar = new ghh();
        g = ghhVar;
        nfm.L(ghh.class, ghhVar);
    }

    private ghh() {
        nhi nhiVar = nhi.b;
        this.b = nhiVar;
        this.f = nhiVar;
    }

    public final void b() {
        nga ngaVar = this.f;
        if (!ngaVar.c()) {
            this.f = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005\u001b", new Object[]{"a", "b", ghg.class, "c", "d", "e", "f", ghj.class});
            }
            if (i2 == 3) {
                return new ghh();
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
                synchronized (ghh.class) {
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
