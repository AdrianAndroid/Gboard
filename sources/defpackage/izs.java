package defpackage;

/* compiled from: PG */
/* renamed from: izs  reason: default package */
/* loaded from: classes.dex */
public final class izs extends nfm implements nha {
    public static final izs d;
    private static volatile nhf f;
    public int a;
    public izr b;
    private byte e = 2;
    public nga c = nhi.b;

    static {
        izs izsVar = new izs();
        d = izsVar;
        nfm.L(izs.class, izsVar);
    }

    private izs() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new izs();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (izs.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
