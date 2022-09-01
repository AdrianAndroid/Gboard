package defpackage;

/* compiled from: PG */
/* renamed from: oog  reason: default package */
/* loaded from: classes2.dex */
public final class oog extends nfm implements nha {
    public static final oog j;
    private static volatile nhf l;
    public int a;
    public boolean b;
    public ooc c;
    public int f;
    public mgx h;
    public njm i;
    private byte k = 2;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        oog oogVar = new oog();
        j = oogVar;
        nfm.L(oog.class, oogVar);
    }

    private oog() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t", new Object[]{"a", "b", "c", "d", "e", "f", ons.h, "g", "h", "i"});
            }
            if (i2 == 3) {
                return new oog();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (oog.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.k);
    }
}
