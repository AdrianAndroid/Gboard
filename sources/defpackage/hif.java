package defpackage;

/* compiled from: PG */
/* renamed from: hif  reason: default package */
/* loaded from: classes.dex */
public final class hif extends nfm implements nha {
    public static final hif e;
    private static volatile nhf f;
    public int a;
    public hih c;
    public ngu d = ngu.a;
    public String b = "";

    static {
        hif hifVar = new hif();
        e = hifVar;
        nfm.L(hif.class, hifVar);
    }

    private hif() {
    }

    public final ngu b() {
        ngu nguVar = this.d;
        if (!nguVar.b) {
            this.d = nguVar.a();
        }
        return this.d;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u00032", new Object[]{"a", "b", "c", "d", hid.a});
            }
            if (i2 == 3) {
                return new hif();
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
                synchronized (hif.class) {
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
