package defpackage;

/* compiled from: PG */
/* renamed from: kag  reason: default package */
/* loaded from: classes.dex */
public final class kag extends nfm implements nha {
    public static final kag l;
    private static volatile nhf m;
    public String a = "";
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;
    public boolean g;
    public boolean h;
    public long i;
    public long j;
    public int k;

    static {
        kag kagVar = new kag();
        l = kagVar;
        nfm.L(kag.class, kagVar);
    }

    private kag() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0000\u000b\u0000\u0000\u0001\f\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0002\u0007\u0002\b\u0004\n\u0007\u000b\u0001\f\u0004", new Object[]{"a", "b", "d", "e", "h", "i", "j", "k", "g", "f", "c"});
            }
            if (i2 == 3) {
                return new kag();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (kag.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
