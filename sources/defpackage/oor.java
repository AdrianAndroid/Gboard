package defpackage;

/* compiled from: PG */
/* renamed from: oor  reason: default package */
/* loaded from: classes2.dex */
public final class oor extends nfm implements nha {
    public static final oor d;
    private static volatile nhf e;
    public int a;
    public long b;
    public int c;

    static {
        oor oorVar = new oor();
        d = oorVar;
        nfm.L(oor.class, oorVar);
    }

    private oor() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", ons.k});
            }
            if (i2 == 3) {
                return new oor();
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
                synchronized (oor.class) {
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
