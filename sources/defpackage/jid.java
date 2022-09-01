package defpackage;

/* compiled from: PG */
/* renamed from: jid  reason: default package */
/* loaded from: classes.dex */
public final class jid extends nfm implements nha {
    public static final jid b;
    private static volatile nhf d;
    public String a = "";
    private int c;

    static {
        jid jidVar = new jid();
        b = jidVar;
        nfm.L(jid.class, jidVar);
    }

    private jid() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new jid();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (jid.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
