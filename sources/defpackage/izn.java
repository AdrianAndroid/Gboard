package defpackage;

/* compiled from: PG */
/* renamed from: izn  reason: default package */
/* loaded from: classes.dex */
public final class izn extends nfm implements nha {
    public static final izn a;
    private static volatile nhf e;
    private ngu b = ngu.a;
    private ngu c;
    private ngu d;

    static {
        izn iznVar = new izn();
        a = iznVar;
        nfm.L(izn.class, iznVar);
    }

    private izn() {
        ngu nguVar = ngu.a;
        this.c = nguVar;
        this.d = nguVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", izm.a, "c", izk.a, "d", izl.a});
            }
            if (i2 == 3) {
                return new izn();
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
                synchronized (izn.class) {
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
