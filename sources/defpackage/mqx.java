package defpackage;

/* compiled from: PG */
/* renamed from: mqx  reason: default package */
/* loaded from: classes2.dex */
public final class mqx extends nfm implements nha {
    public static final mqx c;
    private static volatile nhf e;
    public boolean a;
    public String b = "";
    private int d;

    static {
        mqx mqxVar = new mqx();
        c = mqxVar;
        nfm.L(mqx.class, mqxVar);
    }

    private mqx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new mqx();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mqx.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
