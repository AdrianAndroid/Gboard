package defpackage;

/* compiled from: PG */
/* renamed from: nde  reason: default package */
/* loaded from: classes2.dex */
public final class nde extends nfm implements nha {
    public static final nde d;
    private static volatile nhf e;
    public String a = "";
    public ney b;
    public ney c;

    static {
        nde ndeVar = new nde();
        d = ndeVar;
        nfm.L(nde.class, ndeVar);
    }

    private nde() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new nde();
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
                synchronized (nde.class) {
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
