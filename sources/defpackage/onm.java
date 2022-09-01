package defpackage;

/* compiled from: PG */
/* renamed from: onm  reason: default package */
/* loaded from: classes2.dex */
public final class onm extends nfk implements nha {
    public static final onm a;
    private static volatile nhf c;
    private byte b = 2;

    static {
        onm onmVar = new onm();
        a = onmVar;
        nfm.L(onm.class, onmVar);
    }

    private onm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new onm();
            }
            if (i2 == 4) {
                return new nfj(a);
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
                synchronized (onm.class) {
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
