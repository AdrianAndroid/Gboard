package defpackage;

/* compiled from: PG */
/* renamed from: nec  reason: default package */
/* loaded from: classes2.dex */
public final class nec extends nfm implements nha {
    public static final nec b;
    private static volatile nhf c;
    public boolean a;

    static {
        nec necVar = new nec();
        b = necVar;
        nfm.L(nec.class, necVar);
    }

    private nec() {
    }

    public static nec c(boolean z) {
        nfh t = b.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((nec) t.b).a = z;
        return (nec) t.cz();
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new nec();
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
                synchronized (nec.class) {
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
