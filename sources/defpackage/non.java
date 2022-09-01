package defpackage;

/* compiled from: PG */
/* renamed from: non  reason: default package */
/* loaded from: classes2.dex */
public final class non extends nfm implements nha {
    public static final non d;
    private static volatile nhf e;
    public Object b;
    public int a = 0;
    public nga c = nhi.b;

    static {
        non nonVar = new non();
        d = nonVar;
        nfm.L(non.class, nonVar);
    }

    private non() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001း\u0000\u0003\u001b\u0004ဵ\u0000", new Object[]{"b", "a", "c", nom.class});
            }
            if (i2 == 3) {
                return new non();
            }
            if (i2 == 4) {
                return new nfh((float[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (non.class) {
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
