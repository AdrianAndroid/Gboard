package defpackage;

/* compiled from: PG */
/* renamed from: nkv  reason: default package */
/* loaded from: classes2.dex */
public final class nkv extends nfm implements nha {
    public static final nkv f;
    public static final ngt g;
    private static volatile nhf i;
    public int a;
    public nga b;
    public nkp c;
    public nga d;
    public boolean e;
    private byte h = 2;

    static {
        nkv nkvVar = new nkv();
        f = nkvVar;
        nfm.L(nkv.class, nkvVar);
        g = nfm.P(nks.f, nkvVar, nkvVar, 293000, nik.MESSAGE);
    }

    private nkv() {
        nhi nhiVar = nhi.b;
        this.b = nhiVar;
        this.d = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0002\u0014\u0004\u0000\u0002\u0001\u0002ဉ\u0000\u0004\u001b\tЛ\u0014ဇ\u000b", new Object[]{"a", "c", "d", nkp.class, "b", nko.class, "e"});
            }
            if (i3 == 3) {
                return new nkv();
            }
            if (i3 == 4) {
                return new nfh((float[][]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (nkv.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
