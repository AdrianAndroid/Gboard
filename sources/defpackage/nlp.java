package defpackage;

/* compiled from: PG */
/* renamed from: nlp  reason: default package */
/* loaded from: classes2.dex */
public final class nlp extends nfk implements nha {
    public static final nlp b;
    private static volatile nhf f;
    public int a;
    private int c;
    private byte e = 2;

    static {
        nlp nlpVar = new nlp();
        b = nlpVar;
        nfm.L(nlp.class, nlpVar);
    }

    private nlp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", nlc.f});
            }
            if (i2 == 3) {
                return new nlp();
            }
            if (i2 == 4) {
                return new nfj(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (nlp.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
