package defpackage;

/* compiled from: PG */
/* renamed from: mxm  reason: default package */
/* loaded from: classes2.dex */
public final class mxm extends nfm implements nha {
    public static final mxm h;
    private static volatile nhf j;
    public int a;
    public long b;
    public mvt c;
    public mwk e;
    private byte i = 2;
    public nga d = nhi.b;
    public String f = "";
    public String g = "";

    static {
        mxm mxmVar = new mxm();
        h = mxmVar;
        nfm.L(mxm.class, mxmVar);
    }

    private mxm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002\u0005ဈ\u0003\u0006\u001b\u0007ဈ\u0004", new Object[]{"a", "b", "c", "e", "f", "d", mvm.class, "g"});
            }
            if (i2 == 3) {
                return new mxm();
            }
            if (i2 == 4) {
                return new nfh((float[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            nhf nhfVar = j;
            if (nhfVar == null) {
                synchronized (mxm.class) {
                    nhfVar = j;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        j = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.i);
    }
}
