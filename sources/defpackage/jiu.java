package defpackage;

/* compiled from: PG */
/* renamed from: jiu  reason: default package */
/* loaded from: classes.dex */
public final class jiu extends nfm implements nha {
    public static final jiu h;
    private static volatile nhf i;
    public int a;
    public int c;
    public boolean d;
    public long e;
    public int g;
    public String b = "";
    public String f = "";

    static {
        jiu jiuVar = new jiu();
        h = jiuVar;
        nfm.L(jiu.class, jiuVar);
    }

    private jiu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဌ\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004\u000bင\u0005", new Object[]{"a", "b", "c", jip.c(), "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new jiu();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (jiu.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
