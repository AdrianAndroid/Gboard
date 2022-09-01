package defpackage;

/* compiled from: PG */
/* renamed from: mrm  reason: default package */
/* loaded from: classes2.dex */
public final class mrm extends nfm implements nha {
    public static final mrm p;
    private static volatile nhf q;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public nga f;
    public nga g;
    public nga h;
    public float i;
    public float j;
    public String k = "";
    public String l = "";
    public nga m;
    public float n;
    public int o;

    static {
        mrm mrmVar = new mrm();
        p = mrmVar;
        nfm.L(mrm.class, mrmVar);
    }

    private mrm() {
        nhi nhiVar = nhi.b;
        this.f = nhiVar;
        this.g = nhiVar;
        this.h = nhiVar;
        this.m = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0004\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\bခ\u0004\tခ\u0005\nဈ\u0006\u000bဈ\u0007\f\u001b\rခ\b\u000eင\t", new Object[]{"a", "b", "c", "d", "e", "f", mrl.class, "g", mrj.class, "h", mrk.class, "i", "j", "k", "l", "m", mrl.class, "n", "o"});
            }
            if (i2 == 3) {
                return new mrm();
            }
            if (i2 == 4) {
                return new nfh((short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = q;
            if (nhfVar == null) {
                synchronized (mrm.class) {
                    nhfVar = q;
                    if (nhfVar == null) {
                        nhfVar = new nfi(p);
                        q = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
