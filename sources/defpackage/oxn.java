package defpackage;

/* compiled from: PG */
/* renamed from: oxn  reason: default package */
/* loaded from: classes2.dex */
public final class oxn extends nfm implements nha {
    public static final oxn b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        oxn oxnVar = new oxn();
        b = oxnVar;
        nfm.L(oxn.class, oxnVar);
    }

    private oxn() {
    }

    public final void c() {
        nga ngaVar = this.a;
        if (!ngaVar.c()) {
            this.a = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new oxn();
            }
            if (i2 == 4) {
                return new nfh((byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (oxn.class) {
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
