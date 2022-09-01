package defpackage;

/* compiled from: PG */
/* renamed from: jnz  reason: default package */
/* loaded from: classes.dex */
public final class jnz extends nfm implements nha {
    public static final jnz d;
    private static volatile nhf e;
    public String a = "";
    public int b;
    public jod c;

    static {
        jnz jnzVar = new jnz();
        d = jnzVar;
        nfm.L(jnz.class, jnzVar);
    }

    private jnz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new jnz();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (jnz.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
