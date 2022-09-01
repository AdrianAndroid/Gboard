package defpackage;

/* compiled from: PG */
/* renamed from: mcv  reason: default package */
/* loaded from: classes.dex */
public final class mcv extends nfm implements nha {
    public static final mcv h;
    private static volatile nhf i;
    public int a;
    public String b = "";
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;

    static {
        mcv mcvVar = new mcv();
        h = mcvVar;
        nfm.L(mcv.class, mcvVar);
    }

    private mcv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new mcv();
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
                synchronized (mcv.class) {
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
