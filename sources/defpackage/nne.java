package defpackage;

/* compiled from: PG */
/* renamed from: nne  reason: default package */
/* loaded from: classes2.dex */
public final class nne extends nfm implements nha {
    public static final nne e;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public String c = "";
    public long d;

    static {
        nne nneVar = new nne();
        e = nneVar;
        nfm.L(nne.class, nneVar);
    }

    private nne() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new nne();
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
                synchronized (nne.class) {
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
