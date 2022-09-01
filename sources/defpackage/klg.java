package defpackage;

/* compiled from: PG */
/* renamed from: klg  reason: default package */
/* loaded from: classes.dex */
public final class klg extends nfm implements nha {
    public static final klg e;
    private static volatile nhf f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        klg klgVar = new klg();
        e = klgVar;
        nfm.L(klg.class, klgVar);
    }

    private klg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003်\u0000\u0004ဳ\u0000\u0005ျ\u0000\u0006ွ\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new klg();
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
                synchronized (klg.class) {
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
