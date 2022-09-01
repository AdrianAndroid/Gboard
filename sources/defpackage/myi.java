package defpackage;

/* compiled from: PG */
/* renamed from: myi  reason: default package */
/* loaded from: classes2.dex */
public final class myi extends nfm implements nha {
    public static final myi f;
    private static volatile nhf i;
    public myc a;
    public mvs b;
    public int c;
    public int d;
    public boolean e;
    private int g;
    private byte h = 2;

    static {
        myi myiVar = new myi();
        f = myiVar;
        nfm.L(myi.class, myiVar);
    }

    private myi() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003င\u0002\u0005င\u0003\u0006ဇ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i3 == 3) {
                return new myi();
            }
            if (i3 == 4) {
                return new nfh(f);
            }
            if (i3 == 5) {
                return f;
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
                synchronized (myi.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
