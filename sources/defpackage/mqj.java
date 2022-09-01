package defpackage;

/* compiled from: PG */
/* renamed from: mqj  reason: default package */
/* loaded from: classes2.dex */
public final class mqj extends nfm implements nha {
    public static final mqj e;
    private static volatile nhf f;
    public int a;
    public int b;
    public float c;
    public float d;

    static {
        mqj mqjVar = new mqj();
        e = mqjVar;
        nfm.L(mqj.class, mqjVar);
    }

    private mqj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mqj();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mqj.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
