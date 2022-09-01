package defpackage;

/* compiled from: PG */
/* renamed from: nje  reason: default package */
/* loaded from: classes2.dex */
public final class nje extends nfm implements nha {
    public static final nje a;
    private static volatile nhf c;
    private byte b = 2;

    static {
        nje njeVar = new nje();
        a = njeVar;
        nfm.L(nje.class, njeVar);
    }

    private nje() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new nje();
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
                synchronized (nje.class) {
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
