package defpackage;

/* compiled from: PG */
/* renamed from: gge  reason: default package */
/* loaded from: classes.dex */
public final class gge extends nfm implements nha {
    public static final gge h;
    private static volatile nhf i;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e = 1700;
    public int f;
    public boolean g;

    static {
        gge ggeVar = new gge();
        h = ggeVar;
        nfm.L(gge.class, ggeVar);
    }

    private gge() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002င\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005င\u0003\u0006င\u0004\u0007ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new gge();
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
                synchronized (gge.class) {
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
