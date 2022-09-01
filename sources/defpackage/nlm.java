package defpackage;

/* compiled from: PG */
/* renamed from: nlm  reason: default package */
/* loaded from: classes2.dex */
public final class nlm extends nfk implements nha {
    public static final nlm f;
    private static volatile nhf i;
    public int a;
    private nll g;
    private byte h = 2;
    public boolean b = true;
    public String c = "";
    public String e = "";

    static {
        nlm nlmVar = new nlm();
        f = nlmVar;
        nfm.L(nlm.class, nlmVar);
    }

    private nlm() {
        nff nffVar = nff.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\n\u001b\u0004\u0000\u0000\u0000\nဇ\n\rဈ\u000f\u0018ဈ\u001f\u001bဉ\u0016", new Object[]{"a", "b", "c", "e", "g"});
            }
            if (i3 == 3) {
                return new nlm();
            }
            if (i3 == 4) {
                return new nfj(f);
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (nlm.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
