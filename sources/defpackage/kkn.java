package defpackage;

/* compiled from: PG */
/* renamed from: kkn  reason: default package */
/* loaded from: classes.dex */
public final class kkn extends nfm implements nha {
    public static final kkn g;
    private static volatile nhf i;
    public String a = "";
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        kkn kknVar = new kkn();
        g = kknVar;
        nfm.L(kkn.class, kknVar);
    }

    private kkn() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဌ\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"h", "a", "b", "c", mgk.e, "d", "f", "e"});
            }
            if (i3 == 3) {
                return new kkn();
            }
            if (i3 == 4) {
                return new nfh(g);
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (kkn.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
