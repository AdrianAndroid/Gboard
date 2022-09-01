package defpackage;

/* compiled from: PG */
/* renamed from: jzw  reason: default package */
/* loaded from: classes.dex */
public final class jzw extends nfm implements nha {
    public static final jzw a;
    private static volatile nhf b;

    static {
        jzw jzwVar = new jzw();
        a = jzwVar;
        nfm.L(jzw.class, jzwVar);
    }

    private jzw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new jzw();
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
                synchronized (jzw.class) {
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
