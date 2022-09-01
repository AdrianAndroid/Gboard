package defpackage;

/* compiled from: PG */
/* renamed from: mru  reason: default package */
/* loaded from: classes2.dex */
public final class mru extends nfm implements nha {
    public static final mru l;
    private static volatile nhf m;
    public int a;
    public int b;
    public int c;
    public long e;
    public boolean f;
    public boolean i;
    public nga j;
    public nga k;
    public String d = "";
    public String g = "";
    public String h = "";

    static {
        mru mruVar = new mru();
        l = mruVar;
        nfm.L(mru.class, mruVar);
    }

    private mru() {
        nhi nhiVar = nhi.b;
        this.j = nhiVar;
        this.k = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001g\n\u0000\u0002\u0000\u0001င\u0001\u0002ဈ\u0002\u0003ဂ\u0003\u0004ဌ\u0000\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006eဇ\u0007f\u001ag\u001a", new Object[]{"a", "c", "d", "e", "b", mgk.u, "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new mru();
            }
            if (i2 == 4) {
                return new mrt();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (mru.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
