package defpackage;

/* compiled from: PG */
/* renamed from: bkj  reason: default package */
/* loaded from: classes.dex */
public final class bkj extends nfm implements nha {
    public static final bkj h;
    private static volatile nhf i;
    public bkr d;
    public ndy e;
    public int f;
    public String a = "";
    public String b = "";
    public String c = "";
    public String g = "";

    static {
        bkj bkjVar = new bkj();
        h = bkjVar;
        nfm.L(bkj.class, bkjVar);
    }

    private bkj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0000\u0007\u0000\u0000\u0002\t\u0007\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0005\t\u0006\t\u0007\f\bȈ\tȈ", new Object[]{"a", "c", "d", "e", "f", "g", "b"});
            }
            if (i3 == 3) {
                return new bkj();
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
                synchronized (bkj.class) {
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
