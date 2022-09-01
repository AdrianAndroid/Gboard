package defpackage;

/* compiled from: PG */
/* renamed from: mdk  reason: default package */
/* loaded from: classes.dex */
public final class mdk extends nfm implements nha {
    public static final mdk h;
    private static volatile nhf i;
    public int a;
    public mai b;
    public int c;
    public int d;
    public int e;
    public int f;
    public mak g;

    static {
        mdk mdkVar = new mdk();
        h = mdkVar;
        nfm.L(mdk.class, mdkVar);
    }

    private mdk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0006င\u0005\u0007င\u0006\tဌ\b\nဌ\t\u000bဉ\n", new Object[]{"a", "b", "c", "d", "e", mdh.c(), "f", mdj.c(), "g"});
            }
            if (i3 == 3) {
                return new mdk();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (mdk.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
