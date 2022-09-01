package defpackage;

/* compiled from: PG */
/* renamed from: nlh  reason: default package */
/* loaded from: classes2.dex */
public final class nlh extends nfm implements nha {
    public static final nlh e;
    public static final ngt f;
    private static volatile nhf g;
    public int a;
    public nga b = nhi.b;
    public String c = "";
    public String d = "";

    static {
        nlh nlhVar = new nlh();
        e = nlhVar;
        nfm.L(nlh.class, nlhVar);
        f = nfm.P(nlz.f, nlhVar, nlhVar, 420374974, nik.MESSAGE);
    }

    private nlh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", nmj.class, "c", "d"});
            }
            if (i2 == 3) {
                return new nlh();
            }
            if (i2 == 4) {
                return new nfh((short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (nlh.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
