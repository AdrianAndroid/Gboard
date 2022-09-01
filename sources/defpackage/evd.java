package defpackage;

/* compiled from: PG */
/* renamed from: evd  reason: default package */
/* loaded from: classes.dex */
public final class evd extends nfm implements nha {
    public static final evd d;
    private static volatile nhf e;
    public int a;
    public int b;
    public nga c = nhi.b;

    static {
        evd evdVar = new evd();
        d = evdVar;
        nfm.L(evd.class, evdVar);
    }

    private evd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"a", "b", evc.c(), "c"});
            }
            if (i2 == 3) {
                return new evd();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (evd.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
