package defpackage;

/* compiled from: PG */
/* renamed from: mrl  reason: default package */
/* loaded from: classes2.dex */
public final class mrl extends nfm implements nha {
    public static final mrl j;
    private static volatile nhf k;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public boolean e;
    public float f;
    public float g;
    public float h;
    public float i;

    static {
        mrl mrlVar = new mrl();
        j = mrlVar;
        nfm.L(mrl.class, mrlVar);
    }

    private mrl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0001\u0002ခ\u0004\u0003ခ\u0005\u0004ခ\u0006\u0005ခ\u0007\u0006င\u0000\u0007ဇ\u0003\tဈ\u0002", new Object[]{"a", "c", "f", "g", "h", "i", "b", "e", "d"});
            }
            if (i2 == 3) {
                return new mrl();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (mrl.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
