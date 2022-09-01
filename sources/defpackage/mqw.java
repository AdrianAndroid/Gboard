package defpackage;

/* compiled from: PG */
/* renamed from: mqw  reason: default package */
/* loaded from: classes2.dex */
public final class mqw extends nfm implements nha {
    public static final mqw c;
    private static volatile nhf e;
    public mqx a;
    public nem b = nem.b;
    private int d;

    static {
        mqw mqwVar = new mqw();
        c = mqwVar;
        nfm.L(mqw.class, mqwVar);
    }

    private mqw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new mqw();
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
                synchronized (mqw.class) {
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
