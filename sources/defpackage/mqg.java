package defpackage;

/* compiled from: PG */
/* renamed from: mqg  reason: default package */
/* loaded from: classes2.dex */
public final class mqg extends nfm implements nha {
    public static final mqg d;
    private static volatile nhf f;
    public int a;
    public int b;
    public mqf c;
    private mqg e;

    static {
        mqg mqgVar = new mqg();
        d = mqgVar;
        nfm.L(mqg.class, mqgVar);
    }

    private mqg() {
        nhi nhiVar = nhi.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", mgk.n, "c", "e"});
            }
            if (i2 == 3) {
                return new mqg();
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
                synchronized (mqg.class) {
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
