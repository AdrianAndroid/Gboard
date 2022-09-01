package defpackage;

/* compiled from: PG */
/* renamed from: nks  reason: default package */
/* loaded from: classes2.dex */
public final class nks extends nfk implements nha {
    public static final nks f;
    private static volatile nhf h;
    public int a;
    public boolean e;
    private byte g = 2;
    public String b = "";
    public boolean c = true;

    static {
        nks nksVar = new nks();
        f = nksVar;
        nfm.L(nks.class, nksVar);
    }

    private nks() {
    }

    public static /* synthetic */ void f(nks nksVar) {
        nksVar.a |= 8;
        nksVar.e = true;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0003", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new nks();
            }
            if (i2 == 4) {
                return new nfj(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (nks.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
