package defpackage;

/* compiled from: PG */
/* renamed from: mqr  reason: default package */
/* loaded from: classes2.dex */
public final class mqr extends nfm implements nha {
    public static final mqr d;
    private static volatile nhf f;
    public int a;
    public boolean b;
    public nga c = nhi.b;
    private int e;

    static {
        mqr mqrVar = new mqr();
        d = mqrVar;
        nfm.L(mqr.class, mqrVar);
    }

    private mqr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0001\u0003\u001a", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new mqr();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mqr.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
