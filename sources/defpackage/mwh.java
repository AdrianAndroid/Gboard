package defpackage;

/* compiled from: PG */
/* renamed from: mwh  reason: default package */
/* loaded from: classes2.dex */
public final class mwh extends nfm implements nha {
    public static final mwh g;
    private static volatile nhf h;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;

    static {
        mwh mwhVar = new mwh();
        g = mwhVar;
        nfm.L(mwh.class, mwhVar);
    }

    private mwh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new mwh();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mwh.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
