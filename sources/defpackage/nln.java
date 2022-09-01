package defpackage;

/* compiled from: PG */
/* renamed from: nln  reason: default package */
/* loaded from: classes2.dex */
public final class nln extends nfk implements nha {
    public static final nln g;
    private static volatile nhf i;
    public int a;
    public nlj b;
    public nlm c;
    public nlf f;
    private byte h = 2;
    public String e = "";

    static {
        nln nlnVar = new nln();
        g = nlnVar;
        nfm.L(nln.class, nlnVar);
    }

    private nln() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(g, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0003ᐉ\u0002\u0007ဈ\u0006\nဉ\t", new Object[]{"a", "b", "c", "e", "f"});
            }
            if (i3 == 3) {
                return new nln();
            }
            if (i3 == 4) {
                return new nfj(g);
            }
            if (i3 == 5) {
                return g;
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
                synchronized (nln.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
