package defpackage;

/* compiled from: PG */
/* renamed from: ijq  reason: default package */
/* loaded from: classes.dex */
public final class ijq extends nfm implements nha {
    public static final ijq a;
    private static volatile nhf b;

    static {
        ijq ijqVar = new ijq();
        a = ijqVar;
        nfm.L(ijq.class, ijqVar);
    }

    private ijq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ijq();
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
                synchronized (ijq.class) {
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
