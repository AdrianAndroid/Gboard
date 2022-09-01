package defpackage;

/* compiled from: PG */
/* renamed from: myq  reason: default package */
/* loaded from: classes2.dex */
public final class myq extends nfm implements nha {
    public static final myq b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        myq myqVar = new myq();
        b = myqVar;
        nfm.L(myq.class, myqVar);
    }

    private myq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", myt.class});
            }
            if (i2 == 3) {
                return new myq();
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
                synchronized (myq.class) {
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
