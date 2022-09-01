package defpackage;

/* compiled from: PG */
/* renamed from: bko  reason: default package */
/* loaded from: classes.dex */
public final class bko extends nfm implements nha {
    public static final bko i;
    private static volatile nhf j;
    public bkr a;
    public bkk b;
    public bkr c;
    public bkr d;
    public bkr e;
    public bks f;
    public bkr g;
    public bkr h;

    static {
        bko bkoVar = new bko();
        i = bkoVar;
        nfm.L(bko.class, bkoVar);
    }

    private bko() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0005\t\u0006\t\u0007\t\b\t\t\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new bko();
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
                synchronized (bko.class) {
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
