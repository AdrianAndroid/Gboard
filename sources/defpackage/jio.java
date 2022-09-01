package defpackage;

/* compiled from: PG */
/* renamed from: jio  reason: default package */
/* loaded from: classes.dex */
public final class jio extends nfm implements nha {
    public static final jio d;
    private static volatile nhf e;
    public ngu a = ngu.a;
    public ngu b = ngu.a;
    public nga c = nhi.b;

    static {
        jio jioVar = new jio();
        d = jioVar;
        nfm.L(jio.class, jioVar);
    }

    private jio() {
    }

    public final ngu b() {
        ngu nguVar = this.a;
        if (!nguVar.b) {
            this.a = nguVar.a();
        }
        return this.a;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"a", jim.a, "b", jin.a, "c", jig.class});
            }
            if (i2 == 3) {
                return new jio();
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
                synchronized (jio.class) {
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
