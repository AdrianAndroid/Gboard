package defpackage;

/* compiled from: PG */
/* renamed from: mpi  reason: default package */
/* loaded from: classes2.dex */
public final class mpi extends nfm implements nha {
    public static final mpi a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        mpi mpiVar = new mpi();
        a = mpiVar;
        nfm.L(mpi.class, mpiVar);
    }

    private mpi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"b", mph.a});
            }
            if (i2 == 3) {
                return new mpi();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (mpi.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
