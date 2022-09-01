package defpackage;

/* compiled from: PG */
/* renamed from: ooq  reason: default package */
/* loaded from: classes2.dex */
public final class ooq extends nfm implements nha {
    public static final ooq d;
    private static volatile nhf g;
    public int a;
    public int b;
    private oop e;
    private byte f = 2;
    public int c = 1;

    static {
        ooq ooqVar = new ooq();
        d = ooqVar;
        nfm.L(ooq.class, ooqVar);
    }

    private ooq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", ons.j, "c", "e"});
            }
            if (i2 == 3) {
                return new ooq();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
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
                synchronized (ooq.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
