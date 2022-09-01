package defpackage;

/* compiled from: PG */
/* renamed from: mfn  reason: default package */
/* loaded from: classes.dex */
public final class mfn extends nfm implements nha {
    public static final mfn c;
    private static volatile nhf d;
    public String a = "";
    public String b = "";

    static {
        mfn mfnVar = new mfn();
        c = mfnVar;
        nfm.L(mfn.class, mfnVar);
    }

    private mfn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mfn();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (mfn.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
