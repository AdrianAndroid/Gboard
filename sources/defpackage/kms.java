package defpackage;

/* compiled from: PG */
/* renamed from: kms  reason: default package */
/* loaded from: classes.dex */
public final class kms extends nfm implements nha {
    public static final kms b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        kms kmsVar = new kms();
        b = kmsVar;
        nfm.L(kms.class, kmsVar);
    }

    private kms() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", kmr.class});
            }
            if (i2 == 3) {
                return new kms();
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
                synchronized (kms.class) {
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
