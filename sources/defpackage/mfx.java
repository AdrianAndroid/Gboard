package defpackage;

/* compiled from: PG */
/* renamed from: mfx  reason: default package */
/* loaded from: classes.dex */
public final class mfx extends nfm implements nha {
    public static final mfx h;
    private static volatile nhf i;
    public int a;
    public mfy b;
    public mgm c;
    public mga d;
    public mgn e;
    public mfz f;
    public mgi g;

    static {
        mfx mfxVar = new mfx();
        h = mfxVar;
        nfm.L(mfx.class, mfxVar);
    }

    private mfx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0007ဉ\u0006\u000bဉ\n\u000eဉ\f\u000fဉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new mfx();
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
                synchronized (mfx.class) {
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
