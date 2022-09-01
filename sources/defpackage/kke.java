package defpackage;

/* compiled from: PG */
/* renamed from: kke  reason: default package */
/* loaded from: classes.dex */
public final class kke extends nfm implements nha {
    public static final kke d;
    private static volatile nhf e;
    public int a;
    public nga b = nhi.b;
    public String c = "";

    static {
        kke kkeVar = new kke();
        d = kkeVar;
        nfm.L(kke.class, kkeVar);
    }

    private kke() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new kke();
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
                synchronized (kke.class) {
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
