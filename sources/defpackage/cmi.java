package defpackage;

/* compiled from: PG */
/* renamed from: cmi  reason: default package */
/* loaded from: classes.dex */
public final class cmi extends nfm implements nha {
    public static final cmi d;
    private static volatile nhf e;
    public int a;
    public nga b = nhi.b;
    public String c = "";

    static {
        cmi cmiVar = new cmi();
        d = cmiVar;
        nfm.L(cmi.class, cmiVar);
    }

    private cmi() {
    }

    public final void b() {
        nga ngaVar = this.b;
        if (!ngaVar.c()) {
            this.b = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ለ\u0000", new Object[]{"a", "b", cmh.class, "c"});
            }
            if (i2 == 3) {
                return new cmi();
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
                synchronized (cmi.class) {
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
