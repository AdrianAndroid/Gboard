package defpackage;

/* compiled from: PG */
/* renamed from: oom  reason: default package */
/* loaded from: classes2.dex */
public final class oom extends nfm implements nha {
    public static final oom f;
    private static volatile nhf g;
    public int a;
    public String b = "";
    public nfv c = ngp.b;
    public long d;
    public int e;

    static {
        oom oomVar = new oom();
        f = oomVar;
        nfm.L(oom.class, oomVar);
    }

    private oom() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003(\u0004ဌ\u0002", new Object[]{"a", "b", "d", "c", "e", ool.c()});
            }
            if (i2 == 3) {
                return new oom();
            }
            if (i2 == 4) {
                return new nfh((byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (oom.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
