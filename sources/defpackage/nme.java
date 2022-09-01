package defpackage;

/* compiled from: PG */
/* renamed from: nme  reason: default package */
/* loaded from: classes2.dex */
public final class nme extends nfm implements nha {
    public static final nme a;
    private static volatile nhf b;

    static {
        nme nmeVar = new nme();
        a = nmeVar;
        nfm.L(nme.class, nmeVar);
    }

    private nme() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new nme();
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
                synchronized (nme.class) {
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
