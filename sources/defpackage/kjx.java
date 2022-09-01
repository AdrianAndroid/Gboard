package defpackage;

/* compiled from: PG */
/* renamed from: kjx  reason: default package */
/* loaded from: classes.dex */
public final class kjx extends nfm implements nha {
    public static final kjx i;
    private static volatile nhf j;
    public int a;
    public String b = "";
    public nem c = nem.b;
    public String d = "";
    public nga e;
    public nga f;
    public boolean g;
    public long h;

    static {
        kjx kjxVar = new kjx();
        i = kjxVar;
        nfm.L(kjx.class, kjxVar);
    }

    private kjx() {
        nhi nhiVar = nhi.b;
        this.e = nhiVar;
        this.f = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"a", "d", "b", "c", "e", kjy.class, "f", "g", "h"});
            }
            if (i3 == 3) {
                return new kjx();
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
                synchronized (kjx.class) {
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
