package defpackage;

/* compiled from: PG */
/* renamed from: mrw  reason: default package */
/* loaded from: classes2.dex */
public final class mrw extends nfm implements nha {
    public static final mrw h;
    private static volatile nhf i;
    public int a;
    public int b;
    public mub c;
    public mty d;
    public mtd e;
    public String f = "";
    public String g = "";

    static {
        mrw mrwVar = new mrw();
        h = mrwVar;
        nfm.L(mrw.class, mrwVar);
    }

    private mrw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new mrw();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (mrw.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
