package defpackage;

/* compiled from: PG */
/* renamed from: noo  reason: default package */
/* loaded from: classes2.dex */
public final class noo extends nfm implements nha {
    public static final noo e;
    private static volatile nhf f;
    public int a;
    public long b;
    public nga c = nhi.b;
    public nem d = nem.b;

    static {
        noo nooVar = new noo();
        e = nooVar;
        nfm.L(noo.class, nooVar);
    }

    private noo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"a", "b", "c", non.class, "d"});
            }
            if (i2 == 3) {
                return new noo();
            }
            if (i2 == 4) {
                return new nfh((float[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (noo.class) {
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
