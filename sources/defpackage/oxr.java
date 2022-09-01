package defpackage;

/* compiled from: PG */
/* renamed from: oxr  reason: default package */
/* loaded from: classes2.dex */
public final class oxr extends nfm implements nha {
    public static final oxr b;
    private static volatile nhf c;
    public ngu a = ngu.a;

    static {
        oxr oxrVar = new oxr();
        b = oxrVar;
        nfm.L(oxr.class, oxrVar);
    }

    private oxr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", oxq.a});
            }
            if (i2 == 3) {
                return new oxr();
            }
            if (i2 == 4) {
                return new nfh((byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (oxr.class) {
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
