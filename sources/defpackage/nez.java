package defpackage;

/* compiled from: PG */
/* renamed from: nez  reason: default package */
/* loaded from: classes2.dex */
public final class nez extends nfm implements nha {
    public static final nez a;
    private static volatile nhf b;

    static {
        nez nezVar = new nez();
        a = nezVar;
        nfm.L(nez.class, nezVar);
    }

    private nez() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new nez();
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
                synchronized (nez.class) {
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
