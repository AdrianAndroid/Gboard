package defpackage;

/* compiled from: PG */
/* renamed from: bkq  reason: default package */
/* loaded from: classes.dex */
public final class bkq extends nfm implements nha {
    public static final bkq k;
    private static volatile nhf l;
    public bkl a;
    public int b;
    public int c;
    public bkt d;
    public bkt e;
    public bkt f;
    public bkt g;
    public int h;
    public nga i;
    public nga j;

    static {
        bkq bkqVar = new bkq();
        k = bkqVar;
        nfm.L(bkq.class, bkqVar);
    }

    private bkq() {
        nhi nhiVar = nhi.b;
        this.i = nhiVar;
        this.j = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0000\n\u0000\u0000\u0002\f\n\u0000\u0002\u0000\u0002\t\u0003\f\u0004\u0004\u0005\t\u0006\t\u0007\t\b\t\t\f\u000b\u001b\fȚ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", fim.class, "j"});
            }
            if (i2 == 3) {
                return new bkq();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (bkq.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
