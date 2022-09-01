package defpackage;

/* compiled from: PG */
/* renamed from: myc  reason: default package */
/* loaded from: classes2.dex */
public final class myc extends nfm implements nha {
    public static final myc h;
    private static volatile nhf i;
    public int a;
    public mye b;
    public long c;
    public boolean d;
    public int e;
    public myb f;
    public boolean g;

    static {
        myc mycVar = new myc();
        h = mycVar;
        nfm.L(myc.class, mycVar);
    }

    private myc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0005\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            }
            if (i3 == 3) {
                return new myc();
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
                synchronized (myc.class) {
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
