package defpackage;

/* compiled from: PG */
/* renamed from: ong  reason: default package */
/* loaded from: classes2.dex */
public final class ong extends nfm implements nha {
    public static final ong e;
    private static volatile nhf f;
    public int a;
    public nga b;
    public nga c;
    public onf d;

    static {
        ong ongVar = new ong();
        e = ongVar;
        nfm.L(ong.class, ongVar);
    }

    private ong() {
        nhi nhiVar = nhi.b;
        this.b = nhiVar;
        this.c = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", onj.class, "c", one.class, "d"});
            }
            if (i2 == 3) {
                return new ong();
            }
            if (i2 == 4) {
                return new nfh((int[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ong.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
