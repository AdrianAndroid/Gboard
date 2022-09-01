package defpackage;

/* compiled from: PG */
/* renamed from: mqq  reason: default package */
/* loaded from: classes2.dex */
public final class mqq extends nfm implements nha {
    public static final mqq b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        mqq mqqVar = new mqq();
        b = mqqVar;
        nfm.L(mqq.class, mqqVar);
    }

    private mqq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mqp.class});
            }
            if (i2 == 3) {
                return new mqq();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (mqq.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
