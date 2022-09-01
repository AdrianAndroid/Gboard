package defpackage;

/* compiled from: PG */
/* renamed from: mtm  reason: default package */
/* loaded from: classes2.dex */
public final class mtm extends nfm implements nha {
    public static final mtm j;
    private static volatile nhf k;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;
    public msg h;
    public long i;

    static {
        mtm mtmVar = new mtm();
        j = mtmVar;
        nfm.L(mtm.class, mtmVar);
    }

    private mtm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဉ\u0006\tဂ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new mtm();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (mtm.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
