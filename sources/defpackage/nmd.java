package defpackage;

/* compiled from: PG */
/* renamed from: nmd  reason: default package */
/* loaded from: classes2.dex */
public final class nmd extends nfm implements nha {
    public static final nmd d;
    private static volatile nhf f;
    public long a;
    public long b;
    public float c;
    private int e;

    static {
        nmd nmdVar = new nmd();
        d = nmdVar;
        nfm.L(nmd.class, nmdVar);
    }

    private nmd() {
        ngp ngpVar = ngp.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဂ\u0003\u0004ဂ\u0005\u0005ခ\u0006", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new nmd();
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
                synchronized (nmd.class) {
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
