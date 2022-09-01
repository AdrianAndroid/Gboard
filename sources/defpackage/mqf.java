package defpackage;

/* compiled from: PG */
/* renamed from: mqf  reason: default package */
/* loaded from: classes2.dex */
public final class mqf extends nfm implements nha {
    public static final mqf b;
    private static volatile nhf c;
    public ngu a = ngu.a;

    static {
        mqf mqfVar = new mqf();
        b = mqfVar;
        nfm.L(mqf.class, mqfVar);
    }

    private mqf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", mqe.a});
            }
            if (i2 == 3) {
                return new mqf();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (mqf.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
