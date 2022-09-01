package defpackage;

/* compiled from: PG */
/* renamed from: mrb  reason: default package */
/* loaded from: classes2.dex */
public final class mrb extends nfm implements nha {
    public static final mrb c;
    private static volatile nhf e;
    public String a = "";
    public nga b = nhi.b;
    private int d;

    static {
        mrb mrbVar = new mrb();
        c = mrbVar;
        nfm.L(mrb.class, mrbVar);
    }

    private mrb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new mrb();
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
                synchronized (mrb.class) {
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
