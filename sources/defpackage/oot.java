package defpackage;

/* compiled from: PG */
/* renamed from: oot  reason: default package */
/* loaded from: classes2.dex */
public final class oot extends nfm implements nha {
    public static final oot a;
    private static volatile nhf b;

    static {
        oot ootVar = new oot();
        a = ootVar;
        nfm.L(oot.class, ootVar);
    }

    private oot() {
        nhi nhiVar = nhi.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new oot();
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
            nhf nhfVar = b;
            if (nhfVar == null) {
                synchronized (oot.class) {
                    nhfVar = b;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        b = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}