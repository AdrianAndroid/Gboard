package defpackage;

/* compiled from: PG */
/* renamed from: jhs  reason: default package */
/* loaded from: classes.dex */
public final class jhs extends nfm implements nha {
    public static final jhs h;
    private static volatile nhf i;
    public int a;
    public int d;
    public boolean e;
    public String b = "";
    public String c = "";
    public nga f = nhi.b;
    public String g = "";

    static {
        jhs jhsVar = new jhs();
        h = jhsVar;
        nfm.L(jhs.class, jhsVar);
    }

    private jhs() {
    }

    public final void b() {
        nga ngaVar = this.f;
        if (!ngaVar.c()) {
            this.f = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u001a\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0006ဈ\u0001\nင\u0002\u000eဇ\u000b\u001aဈ\u000f", new Object[]{"a", "b", "f", jhr.class, "c", "d", "e", "g"});
            }
            if (i3 == 3) {
                return new jhs();
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
                synchronized (jhs.class) {
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
