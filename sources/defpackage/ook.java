package defpackage;

/* compiled from: PG */
/* renamed from: ook  reason: default package */
/* loaded from: classes2.dex */
public final class ook extends nfm implements nha {
    public static final ook o;
    private static volatile nhf p;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ooo i;
    public nga j = nhi.b;
    public int k;
    public int l;
    public int m;
    public ooo n;

    static {
        ook ookVar = new ook();
        o = ookVar;
        nfm.L(ook.class, ookVar);
    }

    private ook() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"a", "b", "c", "e", "h", "j", ooj.class, "k", "d", "f", "g", "i", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new ook();
            }
            if (i2 == 4) {
                return new nfh((byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = p;
            if (nhfVar == null) {
                synchronized (ook.class) {
                    nhfVar = p;
                    if (nhfVar == null) {
                        nhfVar = new nfi(o);
                        p = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
