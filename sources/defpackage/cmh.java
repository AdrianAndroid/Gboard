package defpackage;

/* compiled from: PG */
/* renamed from: cmh  reason: default package */
/* loaded from: classes.dex */
public final class cmh extends nfm implements nha {
    public static final cmh d;
    private static volatile nhf e;
    public String a = "";
    public int b;
    public int c;

    static {
        cmh cmhVar = new cmh();
        d = cmhVar;
        nfm.L(cmh.class, cmhVar);
    }

    private cmh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\f", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cmh();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (cmh.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
