package defpackage;

/* compiled from: PG */
/* renamed from: bkv  reason: default package */
/* loaded from: classes.dex */
public final class bkv extends nfm implements nha {
    public static final bkv a;
    private static volatile nhf e;
    private int b;
    private ngu c = ngu.a;
    private bkx d;

    static {
        bkv bkvVar = new bkv();
        a = bkvVar;
        nfm.L(bkv.class, bkvVar);
    }

    private bkv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0001\u0000\u0000\u00042\u0005ဉ\u0003", new Object[]{"b", "c", bku.a, "d"});
            }
            if (i2 == 3) {
                return new bkv();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (bkv.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
