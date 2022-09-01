package defpackage;

/* compiled from: PG */
/* renamed from: mde  reason: default package */
/* loaded from: classes.dex */
public final class mde extends nfm implements nha {
    public static final mde i;
    private static volatile nhf j;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;

    static {
        mde mdeVar = new mde();
        i = mdeVar;
        nfm.L(mde.class, mdeVar);
    }

    private mde() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", mco.k, "c", mco.j, "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new mde();
            }
            if (i3 == 4) {
                return new nfh(i);
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = j;
            if (nhfVar == null) {
                synchronized (mde.class) {
                    nhfVar = j;
                    if (nhfVar == null) {
                        nhfVar = new nfi(i);
                        j = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
