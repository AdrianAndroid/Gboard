package defpackage;

/* compiled from: PG */
/* renamed from: mql  reason: default package */
/* loaded from: classes2.dex */
public final class mql extends nfm implements nha {
    public static final mql cN;
    private static volatile nhf cS;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public long G;
    public int H;
    public boolean I;
    public boolean J;
    public float L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public float V;
    public mqn X;
    public int a;
    public float aA;
    public float aB;
    public float aC;
    public float aE;
    public boolean aF;
    public boolean aG;
    public boolean aJ;
    public float aK;
    public float aL;
    public float aM;
    public int aN;
    public int aO;
    public float aP;
    public float aQ;
    public int aR;
    public long aS;
    public long aT;
    public long aU;
    public long aV;
    public long aW;
    public long aX;
    public long aY;
    public long aZ;
    public boolean ac;
    public boolean ah;
    public float ai;
    public float aj;
    public float ak;
    public int al;
    public float am;
    public float an;
    public float ao;
    public int ap;
    public float aq;
    public float ar;
    public float as;
    public float at;
    public boolean au;
    public boolean av;
    public float aw;
    public float ax;
    public float ay;
    public int az;
    public int b;
    public float bA;
    public boolean bB;
    public boolean bC;
    public boolean bD;
    public boolean bE;
    public boolean bG;
    public boolean bH;
    public boolean bI;
    public boolean bJ;
    public boolean bK;
    public boolean bL;
    public mvy bN;
    public float bS;
    public float bT;
    public boolean bY;
    public long ba;
    public int bb;
    public boolean bc;
    public boolean bd;
    public boolean be;
    public long bf;
    public int bg;
    public int bj;
    public boolean bk;
    public boolean bl;
    public boolean bm;
    public boolean bn;
    public int br;
    public boolean bs;
    public boolean bt;
    public boolean bu;
    public boolean bv;
    public boolean bw;
    public int bx;
    public int by;
    public float bz;
    public int c;
    public boolean cB;
    public boolean cC;
    public boolean cD;
    public boolean cE;
    public int cG;
    public boolean cH;
    public boolean cI;
    public boolean cJ;
    public boolean cK;
    public mqu cM;
    public boolean ca;
    public boolean cc;
    public boolean ce;
    public mvx cf;
    public float cg;
    public float ch;
    public float ci;
    public float cj;
    public int ck;
    public boolean cl;
    public boolean cm;
    public boolean cn;
    public boolean co;
    public boolean cp;
    public boolean cr;
    public boolean cs;
    public boolean ct;
    public long cu;
    public long cv;
    public long cw;
    public boolean cx;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public float p;
    public float q;
    public float r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public float k = 0.8f;
    public float K = 0.05f;
    public float U = 1.0f;
    public float W = 8.0f;
    public float Y = 1.0f;
    public float Z = 1.0f;
    public float aa = 1.0f;
    public float ab = -9.0f;
    public String ad = "";
    public String ae = "";
    public String af = "";
    public String ag = "";
    public String aD = "";
    public float aH = 3.0f;
    public float aI = 6.0f;
    public int bh = 5;
    public int bi = -1;
    public int bo = 500;
    public int bp = 25;
    public float bq = 100.0f;
    public boolean bF = true;
    public boolean bM = true;
    public float bO = -100.0f;
    public float bP = -100.0f;
    public float bQ = -100.0f;
    public float bR = -100.0f;
    public double bU = 1.0d;
    public float bV = -100.0f;
    public float bW = -100.0f;
    public boolean bX = true;
    public boolean bZ = true;
    public double cb = 1.0d;
    public String cd = "";
    public String cq = "";
    public float cy = 1000.0f;
    public int cz = 100;
    public float cA = 12.0f;
    public boolean cF = true;
    public String cL = "";

    static {
        mql mqlVar = new mql();
        cN = mqlVar;
        nfm.L(mql.class, mqlVar);
    }

    private mql() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(cN, "\u0001??\u0000\u0007\u0002????\u0000\u0000\u0000\u0002???\u009f\u0006???\u0004\u0007???\u0005\b???\u0006\t???\u0007\n???\b\f???\t\r???\n\u000e???\u000b\u000f???\f\u0013???\r\u0014???\u0010\u0018???\u0011\u0019???\u0012\u001d???\u0014 ???\u0017!???\u0018$???\u0019&???\u0013'???\u001b,???\u001a4???\u001c5???\u001d6???\u001e9???\u001f:??? <???!=???\">???#????$@???+A???,B???5C???6D???7E???8F???<J???>K????L???@N???BO???CQ???DR???9S???:T???;U???EV???FW???JX???PY???TZ???Y[???Z\\???[]???\\^???]_???^`???_a???`b???ac???bd???he???ig???Uh???Wi???Xj???Vo???fr???js???-t???ku???ly???mz???n{???o}???p~???q\u0080???s\u0081???t\u0082???r\u0083???u\u0084???w\u0086???.\u0087???/\u0088???0\u0089???K\u008a???L\u008c???R\u008d???S\u008e???Q\u008f???y\u0090???z\u0091???|\u0092???}\u0093???~\u0095???\u007f\u0096???\u0080\u0097???\u0081\u0098???v\u0099???\u0082\u009a???\u0083\u009b???\u0084\u009c???%\u009d???M\u009e???\u0085?????1?????2?????3?????4?????\u0086?????\u0087?????\u0089?????\u008a?????\u008b\u00ad???\u008d?????\u008e?????\u008f?????\u0090?????\u0091?????\u009e?????????????????????????????????\u0092?????\u0093?????\u0094?????\u0097?????\u009b?????\u0015?????\u0099????????????c?????d????????????\u0016????????????'????????????(?????)?????*????????????g?????\u00ad????????????\u000e????????????\u0003?????G?????H????????????I?????\u008c?????\u009a?????\u0095?????\u0096?????\u0098???????????????????????????????????????????????N?????????????????????????????????{?????????????????????????????????\u000f???????????????????e????????????\u0002???????????????????\u0001???????????????????\u0088????????????\u0000", new Object[]{"a", "b", "c", "d", "e", "f", "g", "cd", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "x", "y", "z", "B", "E", "F", "G", "A", "I", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "X", "Y", "ah", "ai", "aj", "ak", "ao", "ap", "aq", "ar", "as", "at", "au", "al", "am", "an", "av", "aw", "aA", "aF", "aJ", "aO", mgk.o, "aP", "aQ", "aR", "aS", "aT", "aU", "aV", "aW", "aX", "bd", "be", "aK", "aM", "aN", "aL", "bb", "bf", "Z", "bg", "bh", "bi", "bj", "bk", "bl", "bm", "bo", "bp", "bn", "bq", "bs", "aa", "ab", "ac", "aB", "aC", "aH", "aI", "aG", "bt", "bu", "bw", "bx", "by", "bz", "bA", "bB", "br", "bC", "bD", "bE", "S", "aD", "bF", "ad", "ae", "af", "ag", "bG", "bH", "bJ", "bK", "bL", "bN", "bO", "bP", "bQ", "bR", "cc", "ce", "cf", "ci", "cj", "bS", "bT", "bU", "bX", "cb", "C", "bZ", "ck", "aY", "aZ", "cl", "D", "cm", "T", "cn", "U", "V", "W", "co", "bc", "cp", "cq", "v", "cr", "k", "ax", "ay", "cs", "az", "bM", "ca", "bV", "bW", "bY", "cg", "ch", "cu", "cv", "cw", "cx", "aE", "cy", "cz", "cA", "cB", "bv", "cC", "cD", "cE", "ct", "w", "cF", "cG", "ba", "cH", "j", "cI", "cJ", "i", "cK", "cL", "bI", "cM", "h"});
            }
            if (i2 == 3) {
                return new mql();
            }
            if (i2 == 4) {
                return new mrt(null);
            }
            if (i2 == 5) {
                return cN;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = cS;
            if (nhfVar == null) {
                synchronized (mql.class) {
                    nhfVar = cS;
                    if (nhfVar == null) {
                        nhfVar = new nfi(cN);
                        cS = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }

    public final void b(boolean z) {
        this.a |= 2;
        this.i = z;
    }

    public final void c(boolean z) {
        this.a |= 128;
        this.o = z;
    }

    public final void d(boolean z) {
        this.a |= 131072;
        this.y = z;
    }

    public final void e(boolean z) {
        this.a |= 262144;
        this.z = z;
    }

    public final void f(float f) {
        this.c |= 1;
        this.ar = f;
    }

    public final void g(boolean z) {
        this.c |= 32;
        this.av = z;
    }

    public final void h(float f) {
        this.c |= 16384;
        this.aE = f;
    }

    public final void i(long j) {
        this.d |= 1024;
        this.bf = j;
    }

    public final void j(boolean z) {
        this.d |= 65536;
        this.bl = z;
    }

    public final void k(boolean z) {
        this.d |= 131072;
        this.bm = z;
    }

    public final void l(boolean z) {
        this.f |= 131072;
        this.ct = z;
    }
}
