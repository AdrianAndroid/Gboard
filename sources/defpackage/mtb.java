package defpackage;

/* compiled from: PG */
/* renamed from: mtb  reason: default package */
/* loaded from: classes2.dex */
public final class mtb extends nfm implements nha {
    public static final mtb i;
    private static volatile nhf j;
    public int a;
    public int b;
    public mwi c;
    public boolean d;
    public msg e;
    public long f;
    public int g;
    public long h;

    static {
        mtb mtbVar = new mtb();
        i = mtbVar;
        nfm.L(mtb.class, mtbVar);
    }

    private mtb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0006ဇ\u0003\u0007ဉ\u0004\bဂ\u0005\tဌ\u0006\nဂ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", mgk.r, "h"});
            }
            if (i3 == 3) {
                return new mtb();
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
                synchronized (mtb.class) {
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
