package defpackage;

/* compiled from: PG */
/* renamed from: mto  reason: default package */
/* loaded from: classes2.dex */
public final class mto extends nfm implements nha {
    public static final mto f;
    private static volatile nhf g;
    public int a;
    public nga c;
    public nga d;
    public String b = "";
    public String e = "";

    static {
        mto mtoVar = new mto();
        f = mtoVar;
        nfm.L(mto.class, mtoVar);
    }

    private mto() {
        nhi nhiVar = nhi.b;
        this.c = nhiVar;
        this.d = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0004ဈ\u0002\u0005\u001a\u0006\u001a", new Object[]{"a", "b", "e", "c", "d"});
            }
            if (i2 == 3) {
                return new mto();
            }
            if (i2 == 4) {
                return new nfh((byte[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mto.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
