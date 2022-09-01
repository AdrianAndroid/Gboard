package defpackage;

/* compiled from: PG */
/* renamed from: mat  reason: default package */
/* loaded from: classes.dex */
public final class mat extends nfm implements nha {
    public static final mat i;
    private static volatile nhf j;
    public int a;
    public nga b;
    public nga c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        mat matVar = new mat();
        i = matVar;
        nfm.L(mat.class, matVar);
    }

    private mat() {
        nhi nhiVar = nhi.b;
        this.b = nhiVar;
        this.c = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000\u0004င\u0001\u0005င\u0002\u0006ဌ\u0003\u0007င\u0004", new Object[]{"a", "b", mar.class, "c", maq.class, "d", "e", "f", "g", mas.c(), "h"});
            }
            if (i3 == 3) {
                return new mat();
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
                synchronized (mat.class) {
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
