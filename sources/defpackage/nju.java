package defpackage;

/* compiled from: PG */
/* renamed from: nju  reason: default package */
/* loaded from: classes2.dex */
public final class nju extends nfk implements nha {
    public static final nju c;
    private static volatile nhf g;
    public int a;
    public boolean b;
    private oxr e;
    private byte f = 2;

    static {
        nju njuVar = new nju();
        c = njuVar;
        nfm.L(nju.class, njuVar);
    }

    private nju() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0004\u001d\u0002\u0000\u0000\u0000\u0004ဇ\u0003\u001dဉ\u001b", new Object[]{"a", "b", "e"});
            }
            if (i2 == 3) {
                return new nju();
            }
            if (i2 == 4) {
                return new nfj(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (nju.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
