package defpackage;

/* compiled from: PG */
/* renamed from: oof  reason: default package */
/* loaded from: classes2.dex */
public final class oof extends nfm implements nha {
    public static final oof a;
    private static volatile nhf e;
    private int b;
    private mgs c;
    private byte d = 2;

    static {
        oof oofVar = new oof();
        a = oofVar;
        nfm.L(oof.class, oofVar);
    }

    private oof() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new oof();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (oof.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.d);
    }
}
