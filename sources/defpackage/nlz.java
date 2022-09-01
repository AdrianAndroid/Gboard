package defpackage;

/* compiled from: PG */
/* renamed from: nlz  reason: default package */
/* loaded from: classes2.dex */
public final class nlz extends nfk implements nha {
    public static final nlz f;
    private static volatile nhf k;
    public int a;
    public nly b;
    public nlp c;
    public nlo e;
    private nlt g;
    private nmh h;
    private nls i;
    private byte j = 2;

    static {
        nlz nlzVar = new nlz();
        f = nlzVar;
        nfm.L(nlz.class, nlzVar);
    }

    private nlz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(f, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0003\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0005ဉ\u0005\u0007ᐉ\u0007\nဉ\u000f", new Object[]{"a", "g", "b", "c", "e", "h", "i"});
            }
            if (i2 == 3) {
                return new nlz();
            }
            if (i2 == 4) {
                return new nfj(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (nlz.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.j);
    }
}
