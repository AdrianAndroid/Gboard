package defpackage;

/* compiled from: PG */
/* renamed from: mcc  reason: default package */
/* loaded from: classes.dex */
public final class mcc extends nfm implements nha {
    public static final mcc aB;
    private static volatile nhf aC;
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public int Z;
    public int a;
    public boolean aA;
    public int aa;
    public int ab;
    public int ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public int am;
    public float an;
    public float ao;
    public int ap;
    public boolean aq;
    public boolean ar;
    public boolean as;
    public nga at;
    public boolean au;
    public int av;
    public int aw;
    public boolean ax;
    public boolean ay;
    public float az;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public nga f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        mcc mccVar = new mcc();
        aB = mccVar;
        nfm.L(mcc.class, mccVar);
    }

    private mcc() {
        nhi nhiVar = nhi.b;
        this.f = nhiVar;
        this.at = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                nfq nfqVar = mbm.r;
                return K(aB, "\u0001K\u0000\u0004\u0001dK\u0000\u0002\u0000\u0001ဇ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\nဇ\b\fဇ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0011ဇ\u000f\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0016ဇ\u0015\u0017ဇ\u0016\u0018ဇ\u0017\u001fဇ\u001e!ဌ \"ဇ!#ဇ\"$ဌ#%ဌ$&ဇ%'ဇ&(ဇ')ဇ\u0010*ဇ(+င)2င05ဇ36ဇ47ဌ58ဇ69ဇ7;ဇ9<ဌ:=ဇ;>ဇ<?ဇ=@ဇ>Aဇ?Bင@CငADငBEငCFဇEGဇFHဇGIဇHJဇIKဇJLဇKOဇNPဇOQဌPRငDSခQTခRWငTZဇW[ဇX\\ဇY]\u001a^ဇZ_ဌ[`င\\aဇ]bဇ^cခ_dဇ`", new Object[]{"a", "b", "c", "d", "e", "f", mce.class, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "u", "v", "w", "x", "y", "z", "A", "B", nfqVar, "C", "D", "E", mbm.p, "F", nfqVar, "G", "H", "I", "t", "J", "K", "L", "M", "N", "O", mbm.o, "P", "Q", "R", "S", mco.i, "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", jih.u, "ac", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", mad.c(), "aw", "ax", "ay", "az", "aA"});
            } else if (i2 == 3) {
                return new mcc();
            } else {
                if (i2 == 4) {
                    return new nfh(aB);
                }
                if (i2 == 5) {
                    return aB;
                }
                if (i2 != 6) {
                    return null;
                }
                nhf nhfVar = aC;
                if (nhfVar == null) {
                    synchronized (mcc.class) {
                        nhfVar = aC;
                        if (nhfVar == null) {
                            nhfVar = new nfi(aB);
                            aC = nhfVar;
                        }
                    }
                }
                return nhfVar;
            }
        }
        return (byte) 1;
    }
}
