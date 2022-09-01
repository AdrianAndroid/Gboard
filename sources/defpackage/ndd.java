package defpackage;

/* compiled from: PG */
/* renamed from: ndd  reason: default package */
/* loaded from: classes2.dex */
public final class ndd extends nfm implements nha {
    public static final ndd d;
    private static volatile nhf e;
    public ndy a;
    public String b = "";
    public ndy c;

    static {
        ndd nddVar = new ndd();
        d = nddVar;
        nfm.L(ndd.class, nddVar);
    }

    private ndd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ndd();
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
                synchronized (ndd.class) {
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
