package defpackage;

/* compiled from: PG */
/* renamed from: mbs  reason: default package */
/* loaded from: classes.dex */
public final class mbs extends nfm implements nha {
    public static final mbs h;
    private static volatile nhf i;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;
    public mbp g;

    static {
        mbs mbsVar = new mbs();
        h = mbsVar;
        nfm.L(mbs.class, mbsVar);
    }

    private mbs() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", mcb.c(), "d", "e", mbm.d, "f", mbr.c(), "g"});
            }
            if (i3 == 3) {
                return new mbs();
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
                synchronized (mbs.class) {
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
