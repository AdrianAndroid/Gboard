package defpackage;

/* compiled from: PG */
/* renamed from: med */
/* loaded from: classes.dex */
public final class med extends nfm implements nha {
    public static final med d;
    private static volatile nhf f;
    public int a;
    public nga b = nhi.b;
    public meg c;
    private boolean e;

    static {
        med medVar = new med();
        d = medVar;
        nfm.L(med.class, medVar);
    }

    private med() {
    }

    public static /* synthetic */ void b(med medVar) {
        medVar.a |= 1;
        medVar.e = true;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "e", "b", mef.class, "c"});
            }
            if (i2 == 3) {
                return new med();
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
                synchronized (med.class) {
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
