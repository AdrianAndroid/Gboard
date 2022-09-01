package defpackage;

/* compiled from: PG */
/* renamed from: ooa  reason: default package */
/* loaded from: classes2.dex */
public final class ooa extends nfm implements nha {
    public static final ooa a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        ooa ooaVar = new ooa();
        a = ooaVar;
        nfm.L(ooa.class, ooaVar);
    }

    private ooa() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0000\u0010\u0010\u0001\u0001\u0000\u0000\u00102", new Object[]{"b", onz.a});
            }
            if (i2 == 3) {
                return new ooa();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (ooa.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
