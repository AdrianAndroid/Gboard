package defpackage;

/* compiled from: PG */
/* renamed from: mfy  reason: default package */
/* loaded from: classes.dex */
public final class mfy extends nfm implements nha {
    public static final mfy c;
    private static volatile nhf e;
    public int a;
    public String b = "";
    private boolean d;

    static {
        mfy mfyVar = new mfy();
        c = mfyVar;
        nfm.L(mfy.class, mfyVar);
    }

    private mfy() {
    }

    public static /* synthetic */ void b(mfy mfyVar) {
        mfyVar.a |= 2;
        mfyVar.d = true;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new mfy();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mfy.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
