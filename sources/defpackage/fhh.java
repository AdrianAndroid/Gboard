package defpackage;

/* compiled from: PG */
/* renamed from: fhh  reason: default package */
/* loaded from: classes.dex */
public final class fhh extends nfm implements nha {
    public static final fhh b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        fhh fhhVar = new fhh();
        b = fhhVar;
        nfm.L(fhh.class, fhhVar);
    }

    private fhh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new fhh();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (fhh.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
