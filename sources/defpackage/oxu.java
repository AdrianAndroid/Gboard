package defpackage;

/* compiled from: PG */
/* renamed from: oxu  reason: default package */
/* loaded from: classes2.dex */
public final class oxu extends nfm implements nha {
    public static final oxu d;
    private static volatile nhf e;
    public int a;
    public nem b = nem.b;
    public nga c = nhi.b;

    static {
        oxu oxuVar = new oxu();
        d = oxuVar;
        nfm.L(oxu.class, oxuVar);
    }

    private oxu() {
        nfn nfnVar = nfn.b;
        nff nffVar = nff.b;
        nex nexVar = nex.b;
        ngp ngpVar = ngp.b;
        ned nedVar = ned.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\b\u0003\u0000\u0001\u0000\u0001\f\u0004\n\b\u001c", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new oxu();
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
                synchronized (oxu.class) {
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
