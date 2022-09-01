package defpackage;

/* compiled from: PG */
/* renamed from: mrf  reason: default package */
/* loaded from: classes2.dex */
public final class mrf extends nfm implements nha {
    public static final mrf ah;
    private static volatile nhf ai;
    public mrh A;
    public boolean B;
    public boolean C;
    public mri D;
    public mrg E;
    public int F;
    public boolean H;
    public boolean I;
    public int J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public float O;
    public boolean P;
    public float R;
    public int S;
    public int T;
    public boolean U;
    public float V;
    public int W;
    public float X;
    public boolean Y;
    public boolean Z;
    public int a;
    public int aa;
    public boolean ab;
    public boolean ac;
    public float ad;
    public float ae;
    public boolean af;
    public boolean ag;
    public int b;
    public long c;
    public boolean e;
    public boolean g;
    public float j;
    public float k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean z;
    public float d = 0.8f;
    public float f = 500.0f;
    public float h = 1.0f;
    public float i = 1.0f;
    public float v = 2.06E-9f;
    public float w = -1.0f;
    public float x = -1.0f;
    public float y = -1.0f;
    public int G = 5000;
    public float Q = 1.0f;

    static {
        mrf mrfVar = new mrf();
        ah = mrfVar;
        nfm.L(mrf.class, mrfVar);
    }

    private mrf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(ah, "\u00019\u0000\u0002\u0002>9\u0000\u0000\u0000\u0002ဂ\u0000\u0004ခ\u0001\u0005ဇ\u0002\u0007ခ\u0003\bဇ\u0004\tခ\u0005\nခ\u0006\u000bခ\u000b\fဇ\u000e\rခ\u000f\u000eခ\u0007\u000fခ\b\u0010ဇ\t\u0011ခ\n\u0012ခ\u0013\u0014ဇ\u0018\u0015ဉ\u0019\u0016ဇ\u001a\u0017ဉ\u001c\u0019င\u001e\u001aဇ\u001b\u001bင\u001f\u001cဇ \u001dဇ!\u001eင\"\u001fခ# ခ$!ခ%\"ဇ&#ခ'$ဇ(%ခ)&ခ*'င+(ခ\f)ဇ\u0010*ဇ\u0011+ခ\u0014,ခ\u0015-ခ\u0016.ဇ-/ခ.0င/1ခ02ဌ,3ဇ14ဇ25င36ဇ47ဇ58ခ69ခ7:ဇ8;ဇ9<ခ\r=ဉ\u001d>ဇ\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "n", "q", "r", "j", "k", "l", "m", "v", "z", "A", "B", "D", "F", "C", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "o", "s", "t", "w", "x", "y", "U", "V", "W", "X", "T", mgk.q, "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "p", "E", "u"});
            }
            if (i2 == 3) {
                return new mrf();
            }
            if (i2 == 4) {
                return new nfh(ah);
            }
            if (i2 == 5) {
                return ah;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = ai;
            if (nhfVar == null) {
                synchronized (mrf.class) {
                    nhfVar = ai;
                    if (nhfVar == null) {
                        nhfVar = new nfi(ah);
                        ai = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
