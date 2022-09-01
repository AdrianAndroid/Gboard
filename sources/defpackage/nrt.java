package defpackage;

/* compiled from: PG */
/* renamed from: nrt  reason: default package */
/* loaded from: classes2.dex */
public final class nrt extends nfm implements nha {
    public static final nrt j;
    private static volatile nhf l;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    private boolean k;

    static {
        nrt nrtVar = new nrt();
        j = nrtVar;
        nfm.L(nrt.class, nrtVar);
    }

    private nrt() {
    }

    public static /* synthetic */ void c(nrt nrtVar) {
        nrtVar.a |= 32;
        nrtVar.k = false;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0002\u0002#\b\u0000\u0000\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0006ဇ\u0005\bခ\u0007\tဋ\b\nဌ\t\"ဋ!#ဋ\"", new Object[]{"a", "b", "c", "d", "k", "e", "f", "g", nlc.r, "h", "i"});
            }
            if (i2 == 3) {
                return new nrt();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (nrt.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
