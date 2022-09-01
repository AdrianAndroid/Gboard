package defpackage;

/* compiled from: PG */
/* renamed from: oon  reason: default package */
/* loaded from: classes2.dex */
public final class oon extends nfm implements nha {
    public static final oon k;
    private static volatile nhf l;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public nga j = nhi.b;

    static {
        oon oonVar = new oon();
        k = oonVar;
        nfm.L(oon.class, oonVar);
    }

    private oon() {
    }

    public final void c() {
        nga ngaVar = this.j;
        if (!ngaVar.c()) {
            this.j = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", oom.class});
            }
            if (i2 == 3) {
                return new oon();
            }
            if (i2 == 4) {
                return new nfh((int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (oon.class) {
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
}
