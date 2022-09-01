package defpackage;

/* compiled from: PG */
/* renamed from: nnd  reason: default package */
/* loaded from: classes2.dex */
public final class nnd extends nfm implements nha {
    public static final nnd f;
    private static volatile nhf i;
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    private int g;
    private nnn h;

    static {
        nnd nndVar = new nnd();
        f = nndVar;
        nfm.L(nnd.class, nndVar);
    }

    private nnd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(f, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\bဉ\u0006\nဂ\b", new Object[]{"g", "a", "b", "c", "d", "h", "e"});
            }
            if (i3 == 3) {
                return new nnd();
            }
            if (i3 == 4) {
                return new nfh(f);
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (nnd.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
