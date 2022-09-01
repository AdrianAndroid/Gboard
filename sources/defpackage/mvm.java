package defpackage;

/* compiled from: PG */
/* renamed from: mvm  reason: default package */
/* loaded from: classes2.dex */
public final class mvm extends nfm implements nha {
    public static final mvm l;
    private static volatile nhf m;
    public int a;
    public int b;
    public int c;
    public int e;
    public int f;
    public long j;
    public String d = "";
    public String g = "";
    public String h = "";
    public nga i = nhi.b;
    public int k = 87010621;

    static {
        mvm mvmVar = new mvm();
        l = mvmVar;
        nfm.L(mvm.class, mvmVar);
    }

    private mvm() {
        nem nemVar = nem.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဈ\u0002\u0005င\u0003\u0006င\u0004\u0007ဈ\u0006\bဈ\u0007\tဂ\b\u000bဌ\t\r\u001a", new Object[]{"a", "b", mvl.c(), "c", msb.r, "d", "e", "f", "g", "h", "j", "k", msb.q, "i"});
            }
            if (i2 == 3) {
                return new mvm();
            }
            if (i2 == 4) {
                return new nfh((boolean[]) null);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (mvm.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
