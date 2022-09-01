package defpackage;

/* compiled from: PG */
/* renamed from: mqa  reason: default package */
/* loaded from: classes2.dex */
public final class mqa extends nfm implements nha {
    public static final mqa f;
    private static volatile nhf g;
    public int a;
    public int b;
    public nga c = nhi.b;
    public mqf d;
    public mqb e;

    static {
        mqa mqaVar = new mqa();
        f = mqaVar;
        nfm.L(mqa.class, mqaVar);
    }

    private mqa() {
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0004ဉ\u0001\u0006ဉ\u0002", new Object[]{"a", "b", mqc.c(), "c", mvo.class, "d", "e"});
            }
            if (i2 == 3) {
                return new mqa();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mqa.class) {
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
