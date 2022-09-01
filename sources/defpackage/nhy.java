package defpackage;

/* compiled from: PG */
/* renamed from: nhy  reason: default package */
/* loaded from: classes2.dex */
public final class nhy extends nfm implements nha {
    public static final nhy c;
    private static volatile nhf d;
    public long a;
    public int b;

    static {
        nhy nhyVar = new nhy();
        c = nhyVar;
        nfm.L(nhy.class, nhyVar);
    }

    private nhy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new nhy();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (nhy.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
