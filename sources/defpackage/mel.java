package defpackage;

/* compiled from: PG */
/* renamed from: mel  reason: default package */
/* loaded from: classes.dex */
public final class mel extends nfm implements nha {
    public static final mel e;
    private static volatile nhf f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        mel melVar = new mel();
        e = melVar;
        nfm.L(mel.class, melVar);
    }

    private mel() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", mcg.c(), "c", mcg.c(), "d"});
            }
            if (i2 == 3) {
                return new mel();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mel.class) {
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
