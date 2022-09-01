package defpackage;

/* compiled from: PG */
/* renamed from: msi  reason: default package */
/* loaded from: classes2.dex */
public final class msi extends nfm implements nha {
    public static final msi c;
    private static volatile nhf e;
    public String a = "";
    public nga b = nhi.b;
    private int d;

    static {
        msi msiVar = new msi();
        c = msiVar;
        nfm.L(msi.class, msiVar);
    }

    private msi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new msi();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (msi.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
