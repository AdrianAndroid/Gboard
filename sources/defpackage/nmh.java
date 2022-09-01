package defpackage;

/* compiled from: PG */
/* renamed from: nmh  reason: default package */
/* loaded from: classes2.dex */
public final class nmh extends nfk implements nha {
    public static final nmh a;
    private static volatile nhf f;
    private int b;
    private nmg c;
    private byte e = 2;

    static {
        nmh nmhVar = new nmh();
        a = nmhVar;
        nfm.L(nmh.class, nmhVar);
    }

    private nmh() {
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new nmh();
            }
            if (i2 == 4) {
                return new nfj(a);
            }
            if (i2 == 5) {
                return a;
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
                synchronized (nmh.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
