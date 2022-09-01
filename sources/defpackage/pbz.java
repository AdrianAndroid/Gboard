package defpackage;

/* compiled from: PG */
/* renamed from: pbz  reason: default package */
/* loaded from: classes2.dex */
public final class pbz extends nfm implements nha {
    public static final pbz e;
    private static volatile nhf f;
    public int a;
    public int b;
    public ngu c = ngu.a;
    public nfs d = nfn.b;

    static {
        pbz pbzVar = new pbz();
        e = pbzVar;
        nfm.L(pbz.class, pbzVar);
    }

    private pbz() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0001\u0001\u0000\u0002င\u0001\u00032\u0005'", new Object[]{"a", "b", "c", pby.a, "d"});
            }
            if (i2 == 3) {
                return new pbz();
            }
            if (i2 == 4) {
                return new nfh((byte[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (pbz.class) {
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
