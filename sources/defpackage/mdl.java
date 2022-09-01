package defpackage;

/* compiled from: PG */
/* renamed from: mdl  reason: default package */
/* loaded from: classes.dex */
public final class mdl extends nfm implements nha {
    public static final mdl h;
    private static volatile nhf i;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        mdl mdlVar = new mdl();
        h = mdlVar;
        nfm.L(mdl.class, mdlVar);
    }

    private mdl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", mco.p, "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new mdl();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (mdl.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
