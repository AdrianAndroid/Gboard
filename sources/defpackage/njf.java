package defpackage;

/* compiled from: PG */
/* renamed from: njf  reason: default package */
/* loaded from: classes2.dex */
public final class njf extends nfm implements nha {
    public static final njf a;
    private static volatile nhf c;
    private byte b = 2;

    static {
        njf njfVar = new njf();
        a = njfVar;
        nfm.L(njf.class, njfVar);
    }

    private njf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new njf();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (njf.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.b);
    }
}
