package defpackage;

/* compiled from: PG */
/* renamed from: mvh  reason: default package */
/* loaded from: classes2.dex */
public final class mvh extends nfm implements nha {
    public static final mvh o;
    private static volatile nhf p;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public mrf f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;

    static {
        mvh mvhVar = new mvh();
        o = mvhVar;
        nfm.L(mvh.class, mvhVar);
    }

    private mvh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(o, "\u0001\r\u0000\u0001\u0004\u001d\r\u0000\u0000\u0000\u0004ဇ\u0000\u0006ဇ\u0001\tဇ\u0002\nခ\u0003\u0015ဉ\u0004\u0016ဇ\u0005\u0017ဇ\u0006\u0018ဇ\u0007\u0019င\b\u001aင\t\u001bဇ\n\u001cဇ\u000b\u001dဇ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new mvh();
            }
            if (i2 == 4) {
                return new nfh(o);
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = p;
            if (nhfVar == null) {
                synchronized (mvh.class) {
                    nhfVar = p;
                    if (nhfVar == null) {
                        nhfVar = new nfi(o);
                        p = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
