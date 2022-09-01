package defpackage;

/* compiled from: PG */
/* renamed from: kin  reason: default package */
/* loaded from: classes.dex */
public final class kin extends nfm implements nha {
    public static final kin h;
    public static final ngt i;
    private static volatile nhf j;
    public int a;
    public boolean d;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public nfs g = nfn.b;

    static {
        kin kinVar = new kin();
        h = kinVar;
        nfm.L(kin.class, kinVar);
        i = nfm.P(kig.c, kinVar, kinVar, 334728578, nik.MESSAGE);
    }

    private kin() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006'", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new kin();
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
            nhf nhfVar = j;
            if (nhfVar == null) {
                synchronized (kin.class) {
                    nhfVar = j;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        j = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
