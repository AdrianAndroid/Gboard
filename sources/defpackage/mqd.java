package defpackage;

/* compiled from: PG */
/* renamed from: mqd  reason: default package */
/* loaded from: classes2.dex */
public final class mqd extends nfm implements nha {
    public static final mqd f;
    private static volatile nhf g;
    public int a;
    public boolean b;
    public int c;
    public float d;
    public nga e = nhi.b;

    static {
        mqd mqdVar = new mqd();
        f = mqdVar;
        nfm.L(mqd.class, mqdVar);
    }

    private mqd() {
    }

    public final void b() {
        nga ngaVar = this.e;
        if (!ngaVar.c()) {
            this.e = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u001a", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mqd();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mqd.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
