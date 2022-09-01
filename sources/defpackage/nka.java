package defpackage;

/* compiled from: PG */
/* renamed from: nka  reason: default package */
/* loaded from: classes2.dex */
public final class nka extends nfk implements nha {
    public static final nka b;
    private static volatile nhf k;
    private int c;
    private njv e;
    private njv f;
    private njv g;
    private njv h;
    private njt i;
    private byte j = 2;
    public String a = "";

    static {
        nka nkaVar = new nka();
        b = nkaVar;
        nfm.L(nka.class, nkaVar);
    }

    private nka() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0006\u0000\u0001\u0001\u0015\u0006\u0000\u0000\u0005\u0001ဈ\u0000\u0003ᐉ\u0007\u0004ᐉ\b\u0006ᐉ\u000b\nᐉ\u0006\u0015ᐉ\t", new Object[]{"c", "a", "f", "g", "i", "e", "h"});
            }
            if (i2 == 3) {
                return new nka();
            }
            if (i2 == 4) {
                return new nfj(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (nka.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.j);
    }
}
