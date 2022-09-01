package defpackage;

/* compiled from: PG */
/* renamed from: nmn  reason: default package */
/* loaded from: classes2.dex */
public final class nmn extends nfk implements nha {
    public static final nmn h;
    private static volatile nhf k;
    public int a;
    public nml c;
    public nmv e;
    public nld f;
    public boolean g;
    private nlt i;
    private byte j = 2;
    public boolean b = true;

    static {
        nmn nmnVar = new nmn();
        h = nmnVar;
        nfm.L(nmn.class, nmnVar);
    }

    private nmn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0002\u0014\u0006\u0000\u0000\u0001\u0002ဇ\u0000\u0004ဉ\u0003\u0005ᐉ\u0005\nဉ\b\fဇ\n\u0014ဉ\u0011", new Object[]{"a", "b", "c", "e", "f", "g", "i"});
            }
            if (i2 == 3) {
                return new nmn();
            }
            if (i2 == 4) {
                return new nfj(h);
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (nmn.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.j);
    }
}
