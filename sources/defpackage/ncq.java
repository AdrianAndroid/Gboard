package defpackage;

/* compiled from: PG */
/* renamed from: ncq  reason: default package */
/* loaded from: classes2.dex */
public final class ncq extends nfm implements nha {
    public static final ncq b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        ncq ncqVar = new ncq();
        b = ncqVar;
        nfm.L(ncq.class, ncqVar);
    }

    private ncq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003Ț", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new ncq();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (ncq.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
