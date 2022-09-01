package defpackage;

/* compiled from: PG */
/* renamed from: myt  reason: default package */
/* loaded from: classes2.dex */
public final class myt extends nfm implements nha {
    public static final myt e;
    private static volatile nhf f;
    public String a = "";
    public nga b = nhi.b;
    public String c = "";
    public String d = "";

    static {
        myt mytVar = new myt();
        e = mytVar;
        nfm.L(myt.class, mytVar);
    }

    private myt() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", myp.class, "c", "d"});
            }
            if (i2 == 3) {
                return new myt();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (myt.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
