package defpackage;

/* compiled from: PG */
/* renamed from: mqo  reason: default package */
/* loaded from: classes2.dex */
public final class mqo extends nfm implements nha {
    public static final mqo g;
    private static volatile nhf i;
    public int a;
    public mvi b;
    public mro c;
    public mql d;
    public msv e;
    public mqq f;
    private byte h = 2;

    static {
        mqo mqoVar = new mqo();
        g = mqoVar;
        nfm.L(mqo.class, mqoVar);
    }

    private mqo() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0003ဉ\u0004\bᐉ\u0002\tဉ\u0003\u000bဉ\t", new Object[]{"a", "b", "e", "c", "d", "f"});
            }
            if (i3 == 3) {
                return new mqo();
            }
            if (i3 == 4) {
                return new nfh(g);
            }
            if (i3 == 5) {
                return g;
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
                synchronized (mqo.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
