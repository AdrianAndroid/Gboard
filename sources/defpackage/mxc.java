package defpackage;

/* compiled from: PG */
/* renamed from: mxc  reason: default package */
/* loaded from: classes2.dex */
public final class mxc extends nfm implements nha {
    public static final mxc h;
    private static volatile nhf i;
    public int a;
    public mxf c;
    public mxb d;
    public ndy f;
    public ndy g;
    public String b = "";
    public String e = "";

    static {
        mxc mxcVar = new mxc();
        h = mxcVar;
        nfm.L(mxc.class, mxcVar);
    }

    private mxc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new mxc();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (mxc.class) {
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
