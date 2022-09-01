package defpackage;

/* compiled from: PG */
/* renamed from: nlq  reason: default package */
/* loaded from: classes2.dex */
public final class nlq extends nfk implements nha {
    public static final nlq f;
    private static volatile nhf i;
    public int a;
    public nmc c;
    public nmd e;
    private nlt g;
    private byte h = 2;
    public nga b = nhi.b;

    static {
        nlq nlqVar = new nlq();
        f = nlqVar;
        nfm.L(nlq.class, nlqVar);
    }

    private nlq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0001\u0000\u0001\u001a\u0004ဉ\u0005\u0007ဉ\u0007\rဉ\u0004", new Object[]{"a", "b", "c", "e", "g"});
            }
            if (i3 == 3) {
                return new nlq();
            }
            if (i3 == 4) {
                return new nfj(f);
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (nlq.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
