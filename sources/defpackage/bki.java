package defpackage;

/* compiled from: PG */
/* renamed from: bki  reason: default package */
/* loaded from: classes.dex */
public final class bki extends nfm implements nha {
    public static final bki c;
    private static volatile nhf d;
    public String a = "";
    public boolean b;

    static {
        bki bkiVar = new bki();
        c = bkiVar;
        nfm.L(bki.class, bkiVar);
    }

    private bki() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bki();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (bki.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
