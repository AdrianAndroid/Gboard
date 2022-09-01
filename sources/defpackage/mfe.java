package defpackage;

/* compiled from: PG */
/* renamed from: mfe  reason: default package */
/* loaded from: classes.dex */
public final class mfe extends nfm implements nha {
    private static volatile nhf C;
    public static final mfe c;
    private njn A;
    private byte B = 2;
    public int a;
    public int b;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private mfd k;
    private mff l;
    private mff m;
    private lzq n;
    private oos o;
    private mfi p;
    private njg q;
    private mfg r;
    private mfh s;
    private mgo t;
    private lzo u;
    private lzj v;
    private ldk w;
    private mfk x;
    private mfv y;
    private mfl z;

    static {
        mfe mfeVar = new mfe();
        c = mfeVar;
        nfm.L(mfe.class, mfeVar);
    }

    private mfe() {
        nem nemVar = nem.b;
        nhi nhiVar = nhi.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(c, "\u0001\u0012\u0000\b\u0002ľ\u0012\u0000\u0000\u0010\u0002င\u0001/ᐉ67ᐉH8ᐉIlᐉivᐉq\u0081ᐉ~\u0088ᐉ\u0086\u0093ᐉ\u008eÀᐉ\u008fÃဉºßᐉÑäᐉ´ĠᐉãġᐉæħᐉòĻᐉéľᐉþ", new Object[]{"a", "d", "e", "f", "g", "h", "i", "j", "b", "k", "l", "m", "n", "o", "p", "q", "r", "s", "u", "v", "t", "w", "x", "z", "y", "A"});
            }
            if (i2 == 3) {
                return new mfe();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            }
            nhf nhfVar = C;
            if (nhfVar == null) {
                synchronized (mfe.class) {
                    nhfVar = C;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        C = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.B);
    }
}
