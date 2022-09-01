package defpackage;

/* compiled from: PG */
/* renamed from: nly  reason: default package */
/* loaded from: classes2.dex */
public final class nly extends nfk implements nha {
    public static final nly f;
    private static volatile nhf i;
    public Object b;
    public int c;
    private int g;
    public int a = 0;
    private byte h = 2;
    public nga e = nhi.b;

    static {
        nly nlyVar = new nly();
        f = nlyVar;
        nfm.L(nly.class, nlyVar);
    }

    private nly() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(f, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0001\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ဌ\u0003\u0004ᐼ\u0000\u0007\u001b", new Object[]{"b", "a", "g", nlq.class, nlv.class, "c", nlc.h, nlx.class, "e", nlu.class});
            }
            if (i3 == 3) {
                return new nly();
            }
            if (i3 == 4) {
                return new nfj(f);
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (nly.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
