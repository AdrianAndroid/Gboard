package defpackage;

/* compiled from: PG */
/* renamed from: joe  reason: default package */
/* loaded from: classes.dex */
public final class joe extends nfm implements nha {
    public static final joe p;
    private static volatile nhf q;
    public Object b;
    public int e;
    public nhy f;
    public nhy g;
    public nhy h;
    public nhy i;
    public nhy j;
    public joc l;
    public int m;
    public boolean o;
    public int a = 0;
    public String c = "";
    public String d = "";
    public String k = "";
    public nem n = nem.b;

    static {
        joe joeVar = new joe();
        p = joeVar;
        nfm.L(joe.class, joeVar);
    }

    private joe() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(p, "\u0000\u000f\u0001\u0000\u0001\u0010\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004<\u0000\u0005\t\u0006\t\u0007\t\b\t\t\t\nȈ\u000b\t\r<\u0000\u000e\f\u000f\n\u0010\u0007", new Object[]{"b", "a", "c", "d", "e", jnz.class, "f", "g", "h", "i", "j", "k", "l", joa.class, "m", "n", "o"});
            }
            if (i2 == 3) {
                return new joe();
            }
            if (i2 == 4) {
                return new nfh(p);
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = q;
            if (nhfVar == null) {
                synchronized (joe.class) {
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
