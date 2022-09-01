package defpackage;

/* compiled from: PG */
/* renamed from: onc  reason: default package */
/* loaded from: classes2.dex */
public final class onc extends nfm implements nha {
    public static final onc k;
    private static volatile nhf m;
    public int a;
    public int b;
    public long c;
    public onm f;
    public int g;
    public long h;
    public onl i;
    public long j;
    private byte l = 2;
    public String d = "";
    public String e = "";

    static {
        onc oncVar = new onc();
        k = oncVar;
        nfm.L(onc.class, oncVar);
    }

    private onc() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004", new Object[]{"a", "b", onb.c(), "g", onb.c(), "h", "i", "j", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new onc();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (onc.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.l);
    }
}
