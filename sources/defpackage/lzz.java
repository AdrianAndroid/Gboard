package defpackage;

/* compiled from: PG */
/* renamed from: lzz  reason: default package */
/* loaded from: classes.dex */
public final class lzz extends nfm implements nha {
    public static final lzz a;
    private static volatile nhf b;

    static {
        lzz lzzVar = new lzz();
        a = lzzVar;
        nfm.L(lzz.class, lzzVar);
    }

    private lzz() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new lzz();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = b;
            if (nhfVar == null) {
                synchronized (lzz.class) {
                    nhfVar = b;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        b = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
