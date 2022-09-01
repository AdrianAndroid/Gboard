package defpackage;

/* compiled from: PG */
/* renamed from: nmo  reason: default package */
/* loaded from: classes2.dex */
public final class nmo extends nfm implements nha {
    public static final nmo d;
    private static volatile nhf f;
    public int a;
    private byte e = 2;
    public String b = "";
    public nga c = nhi.b;

    static {
        nmo nmoVar = new nmo();
        d = nmoVar;
        nfm.L(nmo.class, nmoVar);
    }

    private nmo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"a", "b", "c", nmp.class});
            }
            if (i2 == 3) {
                return new nmo();
            }
            if (i2 == 4) {
                return new nfh((int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (nmo.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
