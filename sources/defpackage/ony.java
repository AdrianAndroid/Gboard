package defpackage;

/* compiled from: PG */
/* renamed from: ony  reason: default package */
/* loaded from: classes2.dex */
public final class ony extends nfm implements nha {
    public static final ony e;
    private static volatile nhf g;
    public int a;
    public long c;
    private byte f = 2;
    public String b = "";
    public String d = "";

    static {
        ony onyVar = new ony();
        e = onyVar;
        nfm.L(ony.class, onyVar);
    }

    private ony() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ony();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (ony.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
