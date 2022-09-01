package defpackage;

/* compiled from: PG */
/* renamed from: oxs  reason: default package */
/* loaded from: classes2.dex */
public final class oxs extends nfm implements nha {
    public static final oxs b;
    private static volatile nhf c;
    public nfr a = nff.b;

    static {
        oxs oxsVar = new oxs();
        b = oxsVar;
        nfm.L(oxs.class, oxsVar);
    }

    private oxs() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new oxs();
            }
            if (i2 == 4) {
                return new nfh((boolean[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (oxs.class) {
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
