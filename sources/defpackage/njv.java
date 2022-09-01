package defpackage;

/* compiled from: PG */
/* renamed from: njv  reason: default package */
/* loaded from: classes2.dex */
public final class njv extends nfk implements nha {
    public static final njv a;
    private static volatile nhf i;
    private int b;
    private float c;
    private float e;
    private float f;
    private float g;
    private byte h = 2;

    static {
        njv njvVar = new njv();
        a = njvVar;
        nfm.L(njv.class, njvVar);
    }

    private njv() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new Object[]{"b", "c", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new njv();
            }
            if (i3 == 4) {
                return new nfj(a);
            }
            if (i3 == 5) {
                return a;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (njv.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
