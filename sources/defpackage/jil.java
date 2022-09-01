package defpackage;

/* compiled from: PG */
/* renamed from: jil  reason: default package */
/* loaded from: classes.dex */
public final class jil extends nfm implements nha {
    public static final jil h;
    private static volatile nhf i;
    public int a;
    public jiq b;
    public long c;
    public String d = "";
    public int e;
    public long f;
    public long g;

    static {
        jil jilVar = new jil();
        h = jilVar;
        nfm.L(jil.class, jilVar);
    }

    private jil() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0003\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဈ\u0002", new Object[]{"a", "b", "c", "e", "f", "g", "d"});
            }
            if (i3 == 3) {
                return new jil();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (jil.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
