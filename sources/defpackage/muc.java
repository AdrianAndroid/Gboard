package defpackage;

/* compiled from: PG */
/* renamed from: muc  reason: default package */
/* loaded from: classes2.dex */
public final class muc extends nfm implements nha {
    public static final muc f;
    private static volatile nhf h;
    public int a;
    public String b = "";
    public nga c = nhi.b;
    public boolean d;
    public boolean e;
    private int g;

    static {
        muc mucVar = new muc();
        f = mucVar;
        nfm.L(muc.class, mucVar);
    }

    private muc() {
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0005\u001b\bဇ\n\nဇ\f", new Object[]{"g", "a", msb.l, "b", "c", mse.class, "d", "e"});
            }
            if (i2 == 3) {
                return new muc();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (muc.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
