package defpackage;

/* compiled from: PG */
/* renamed from: mox  reason: default package */
/* loaded from: classes2.dex */
public final class mox extends nfm implements nha {
    public static final mox g;
    private static volatile nhf k;
    public int a;
    public nga c;
    public nga d;
    public int f;
    private boolean h;
    private int i;
    private int j;
    public String b = "";
    public String e = "";

    static {
        mox moxVar = new mox();
        g = moxVar;
        nfm.L(mox.class, moxVar);
    }

    private mox() {
        nhi nhiVar = nhi.b;
        this.c = nhiVar;
        this.d = nhiVar;
    }

    public static /* synthetic */ void b(mox moxVar) {
        moxVar.a |= 2;
        moxVar.h = false;
    }

    public static /* synthetic */ void c(mox moxVar) {
        moxVar.a |= 8;
        moxVar.i = 10000;
    }

    public static /* synthetic */ void d(mox moxVar) {
        moxVar.a |= 16;
        moxVar.j = 20000;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0002\u0005င\u0003\u0006င\u0004\u0007င\u0005\tဇ\u0001", new Object[]{"a", "b", "c", "d", "e", "i", "j", "f", "h"});
            }
            if (i2 == 3) {
                return new mox();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (mox.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
