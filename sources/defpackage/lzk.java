package defpackage;

/* compiled from: PG */
/* renamed from: lzk  reason: default package */
/* loaded from: classes.dex */
public final class lzk extends nfm implements nha {
    public static final lzk a;
    private static volatile nhf b;

    static {
        lzk lzkVar = new lzk();
        a = lzkVar;
        nfm.L(lzk.class, lzkVar);
    }

    private lzk() {
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
                return new lzk();
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
                synchronized (lzk.class) {
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
