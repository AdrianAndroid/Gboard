package defpackage;

/* compiled from: PG */
/* renamed from: mcf  reason: default package */
/* loaded from: classes.dex */
public final class mcf extends nfm implements nha {
    public static final mcf k;
    private static volatile nhf l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public maf f;
    public nga g = nhi.b;
    public maf h;
    public boolean i;
    public int j;

    static {
        mcf mcfVar = new mcf();
        k = mcfVar;
        nfm.L(mcf.class, mcfVar);
    }

    private mcf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0001\u0012\t\u0000\u0001\u0000\u0001င\u0000\u0002င\u0002\u0003င\u0003\u0007င\u0001\bဉ\u0006\t\u001b\nဇ\t\u0010င\r\u0012ဉ\u0007", new Object[]{"a", "b", "d", "e", "c", "f", "g", maf.class, "i", "j", "h"});
            }
            if (i2 == 3) {
                return new mcf();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (mcf.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }

    public final void b() {
        nga ngaVar = this.g;
        if (!ngaVar.c()) {
            this.g = nfm.H(ngaVar);
        }
    }
}
