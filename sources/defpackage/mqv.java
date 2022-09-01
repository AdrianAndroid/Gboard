package defpackage;

/* compiled from: PG */
/* renamed from: mqv  reason: default package */
/* loaded from: classes2.dex */
public final class mqv extends nfm implements nha {
    public static final mqv d;
    private static volatile nhf e;
    public int a;
    public nem b = nem.b;
    public nga c = nhi.b;

    static {
        mqv mqvVar = new mqv();
        d = mqvVar;
        nfm.L(mqv.class, mqvVar);
    }

    private mqv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mqv();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mqv.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
