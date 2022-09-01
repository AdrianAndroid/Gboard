package defpackage;

/* compiled from: PG */
/* renamed from: mrh  reason: default package */
/* loaded from: classes2.dex */
public final class mrh extends nfm implements nha {
    public static final mrh l;
    private static volatile nhf m;
    public int a;
    public float b = -0.15f;
    public float c = -0.05f;
    public float d = 0.006f;
    public float e = 0.01f;
    public float f = 0.003f;
    public float g = 0.12f;
    public float h = -0.05f;
    public float i = 0.005f;
    public float j = 0.012f;
    public float k = 0.001f;

    static {
        mrh mrhVar = new mrh();
        l = mrhVar;
        nfm.L(mrh.class, mrhVar);
    }

    private mrh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new mrh();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (mrh.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
