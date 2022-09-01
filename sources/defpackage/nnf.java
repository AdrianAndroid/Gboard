package defpackage;

/* compiled from: PG */
/* renamed from: nnf  reason: default package */
/* loaded from: classes2.dex */
public final class nnf extends nfm implements nha {
    public static final nnf g;
    private static volatile nhf i;
    public int a;
    public boolean c;
    public nnz d;
    public nng e;
    public int f;
    private byte h = 2;
    public String b = "";

    static {
        nnf nnfVar = new nnf();
        g = nnfVar;
        nfm.L(nnf.class, nnfVar);
    }

    private nnf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0005ᐉ\u0005\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", nlc.l});
            }
            if (i3 == 3) {
                return new nnf();
            }
            if (i3 == 4) {
                return new nfh(g);
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (nnf.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
