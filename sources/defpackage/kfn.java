package defpackage;

/* compiled from: PG */
/* renamed from: kfn  reason: default package */
/* loaded from: classes.dex */
public final class kfn extends nfm implements nha {
    public static final kfn d;
    private static volatile nhf f;
    public String a = "";
    public nga b = nhi.b;
    public boolean c;
    private int e;

    static {
        kfn kfnVar = new kfn();
        d = kfnVar;
        nfm.L(kfn.class, kfnVar);
    }

    private kfn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "a", "b", kfm.class, "c"});
            }
            if (i2 == 3) {
                return new kfn();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (kfn.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
