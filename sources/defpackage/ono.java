package defpackage;

/* compiled from: PG */
/* renamed from: ono  reason: default package */
/* loaded from: classes2.dex */
public final class ono extends nfm implements nha {
    public static final ono i;
    private static volatile nhf j;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    static {
        ono onoVar = new ono();
        i = onoVar;
        nfm.L(ono.class, onoVar);
    }

    private ono() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(i, "\u0001\u0007\u0000\u0001\u0011\u0018\u0007\u0000\u0000\u0000\u0011င\u0011\u0012င\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new ono();
            }
            if (i3 == 4) {
                return new nfh(i);
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = j;
            if (nhfVar == null) {
                synchronized (ono.class) {
                    nhfVar = j;
                    if (nhfVar == null) {
                        nhfVar = new nfi(i);
                        j = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
