package defpackage;

/* compiled from: PG */
/* renamed from: onr  reason: default package */
/* loaded from: classes2.dex */
public final class onr extends nfk implements nha {
    public static final onr h;
    private static volatile nhf j;
    public int a;
    public onq b;
    public ooc c;
    public int e;
    public onp f;
    private byte i = 2;
    public String g = "";

    static {
        onr onrVar = new onr();
        h = onrVar;
        nfm.L(onr.class, onrVar);
    }

    private onr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "e", ons.b, "f", "g"});
            }
            if (i2 == 3) {
                return new onr();
            }
            if (i2 == 4) {
                return new nfj(h);
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
                synchronized (onr.class) {
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
