package defpackage;

/* compiled from: PG */
/* renamed from: mfk  reason: default package */
/* loaded from: classes.dex */
public final class mfk extends nfm implements nha {
    public static final mfk a;
    private static volatile nhf f;
    private int b;
    private mfj c;
    private bkv d;
    private byte e = 2;

    static {
        mfk mfkVar = new mfk();
        a = mfkVar;
        nfm.L(mfk.class, mfkVar);
    }

    private mfk() {
        nem nemVar = nem.b;
        nhi nhiVar = nhi.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0002\u0000\u0001\u000b\u001e\u0002\u0000\u0000\u0001\u000bᐉ\n\u001eဉ\u0019", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new mfk();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mfk.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
