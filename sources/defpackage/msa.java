package defpackage;

/* compiled from: PG */
/* renamed from: msa  reason: default package */
/* loaded from: classes2.dex */
public final class msa extends nfm implements nha {
    public static final msa h;
    private static volatile nhf i;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public boolean g;

    static {
        msa msaVar = new msa();
        h = msaVar;
        nfm.L(msa.class, msaVar);
    }

    private msa() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001င\u0000\u0005ဈ\u0001\u0006ဈ\u0002\u0007ဈ\u0003\bဇ\u0004\tဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new msa();
            }
            if (i3 == 4) {
                return new mrz();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (msa.class) {
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
