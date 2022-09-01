package defpackage;

/* compiled from: PG */
/* renamed from: jis  reason: default package */
/* loaded from: classes.dex */
public final class jis extends nfm implements nha {
    public static final jis e;
    private static volatile nhf f;
    public int a;
    public nhy b;
    public nga c = nhi.b;
    public boolean d;

    static {
        jis jisVar = new jis();
        e = jisVar;
        nfm.L(jis.class, jisVar);
    }

    private jis() {
    }

    public final void b() {
        nga ngaVar = this.c;
        if (!ngaVar.c()) {
            this.c = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", "c", jil.class, "d"});
            }
            if (i2 == 3) {
                return new jis();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (jis.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
