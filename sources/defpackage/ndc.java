package defpackage;

/* compiled from: PG */
/* renamed from: ndc  reason: default package */
/* loaded from: classes2.dex */
public final class ndc extends nfm implements nha {
    public static final ndc h;
    private static volatile nhf i;
    public ncp a;
    public nga c;
    public int d;
    public ncx f;
    public nga g;
    public String b = "";
    public String e = "";

    static {
        ndc ndcVar = new ndc();
        h = ndcVar;
        nfm.L(ndc.class, ndcVar);
    }

    private ndc() {
        nhi nhiVar = nhi.b;
        this.c = nhiVar;
        this.g = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\t\u0002Ȉ\u0003Ț\u0004\f\u0005Ȉ\u0006\t\u0007Ț", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new ndc();
            }
            if (i3 == 4) {
                return new nfh((short[][][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (ndc.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
