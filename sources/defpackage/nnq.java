package defpackage;

/* compiled from: PG */
/* renamed from: nnq  reason: default package */
/* loaded from: classes2.dex */
public final class nnq extends nfm implements nha {
    public static final nnq i;
    private static volatile nhf j;
    public int a;
    public boolean c;
    public int e;
    public int f;
    public String b = "";
    public String d = "";
    public String g = "";
    public String h = "";

    static {
        nnq nnqVar = new nnq();
        i = nnqVar;
        nfm.L(nnq.class, nnqVar);
    }

    private nnq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "e", mxe.o, "f", mxe.p, "g", "h"});
            }
            if (i3 == 3) {
                return new nnq();
            }
            if (i3 == 4) {
                return new nfh(i);
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = j;
            if (nhfVar == null) {
                synchronized (nnq.class) {
                    nhfVar = j;
                    if (nhfVar == null) {
                        nhfVar = new nfi(i);
                        j = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
