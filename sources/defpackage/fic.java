package defpackage;

/* compiled from: PG */
/* renamed from: fic  reason: default package */
/* loaded from: classes.dex */
public final class fic extends nfm implements nha {
    public static final fic c;
    private static volatile nhf d;
    public String a = "";
    public nga b = nhi.b;

    static {
        fic ficVar = new fic();
        c = ficVar;
        nfm.L(fic.class, ficVar);
    }

    private fic() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", fie.class});
            }
            if (i2 == 3) {
                return new fic();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (fic.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
