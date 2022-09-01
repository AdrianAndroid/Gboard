package defpackage;

/* compiled from: PG */
/* renamed from: nkr  reason: default package */
/* loaded from: classes2.dex */
public final class nkr extends nfk implements nha {
    public static final nkr a;
    public static final ngt b;
    private static volatile nhf e;
    private byte c = 2;

    static {
        nkr nkrVar = new nkr();
        a = nkrVar;
        nfm.L(nkr.class, nkrVar);
        b = nfm.P(nks.f, nkrVar, nkrVar, 47096292, nik.MESSAGE);
    }

    private nkr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new nkr();
            }
            if (i2 == 4) {
                return new nfj(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (nkr.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.c);
    }
}
