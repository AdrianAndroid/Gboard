package defpackage;

/* compiled from: PG */
/* renamed from: onl  reason: default package */
/* loaded from: classes2.dex */
public final class onl extends nfm implements nha {
    public static final onl an;
    private static volatile nhf ao;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public onk F;
    public long G;
    public onk H;
    public onk I;
    public onk J;
    public onk K;
    public onk L;
    public onk M;
    public onk N;
    public onk O;
    public onk P;
    public onk Q;
    public onk R;
    public onk S;
    public onk T;
    public long U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public int a;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public onk aj;
    public long ak;
    public long al;
    public long am;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public nga g;
    public nga h;
    public nga i;
    public nga j;
    public nga k;
    public nga l;
    public onk m;
    public nga n;
    public nga o;
    public nga p;
    public nga q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        onl onlVar = new onl();
        an = onlVar;
        nfm.L(onl.class, onlVar);
    }

    private onl() {
        nhi nhiVar = nhi.b;
        this.g = nhiVar;
        this.h = nhiVar;
        this.i = nhiVar;
        this.j = nhiVar;
        this.k = nhiVar;
        this.l = nhiVar;
        this.n = nhiVar;
        this.o = nhiVar;
        this.p = nhiVar;
        this.q = nhiVar;
    }

    public final void Q(long j) {
        this.a |= 4096;
        this.y = j;
    }

    public final void R(long j) {
        this.a |= 8192;
        this.z = j;
    }

    public final void S(long j) {
        this.a |= 16384;
        this.A = j;
    }

    public final void T(long j) {
        this.a |= 32768;
        this.B = j;
    }

    public final void U(long j) {
        this.a |= 65536;
        this.C = j;
    }

    public final void V(long j) {
        this.a |= 131072;
        this.D = j;
    }

    public final void W(long j) {
        this.a |= 262144;
        this.E = j;
    }

    public final void X(onk onkVar) {
        this.F = onkVar;
        this.a |= 524288;
    }

    public final void Y(long j) {
        this.a |= 1048576;
        this.G = j;
    }

    public final void Z(onk onkVar) {
        this.H = onkVar;
        this.a |= 2097152;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(an, "\u0001?\u0000\u0002\u0001@?\u0000\n\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000bဉ\u0004\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010ဂ\u0005\u0011ဂ\u0006\u0012ဂ\u0007\u0013ဂ\b\u0014ဂ\t\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u0018ဂ\r\u0019ဂ\u000e\u001aဂ\u000f\u001bဂ\u0010\u001cဂ\u0011\u001dဂ\u0012\u001eဉ\u0013\u001fဂ\u0014 ဉ\u0015!ဉ\u0016\"ဉ\u0017#ဉ\u0018$ဉ\u0019%ဉ\u001a&ဉ\u001b'ဉ\u001c(ဉ\u001d)ဉ\u001e*ဉ\u001f+ဉ ,ဉ!-ဂ\".ဂ#/ဂ$0ဂ%1ဂ&2ဂ'3ဂ(4ဂ)5ဂ*6ဂ+7ဂ,8ဂ-9ဂ.:ဂ/;ဂ0=ဉ1>ဂ2?ဂ3@ဂ4", new Object[]{"a", "b", "c", "d", "e", "f", "g", onk.class, "h", onk.class, "i", onk.class, "j", onk.class, "k", onk.class, "l", onk.class, "m", "n", onk.class, "o", onh.class, "p", oni.class, "q", ong.class, "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am"});
            }
            if (i2 == 3) {
                return new onl();
            }
            if (i2 == 4) {
                return new nfh((byte[][][]) null);
            }
            if (i2 == 5) {
                return an;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = ao;
            if (nhfVar == null) {
                synchronized (onl.class) {
                    nhfVar = ao;
                    if (nhfVar == null) {
                        nhfVar = new nfi(an);
                        ao = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }

    public final boolean aA() {
        return (this.b & 1048576) != 0;
    }

    public final void aa(onk onkVar) {
        this.I = onkVar;
        this.a |= 4194304;
    }

    public final void ab(onk onkVar) {
        this.J = onkVar;
        this.a |= 8388608;
    }

    public final void ac(onk onkVar) {
        this.K = onkVar;
        this.a |= 16777216;
    }

    public final void ad(onk onkVar) {
        this.L = onkVar;
        this.a |= 33554432;
    }

    public final void ae(onk onkVar) {
        this.M = onkVar;
        this.a |= 67108864;
    }

    public final void af(onk onkVar) {
        this.N = onkVar;
        this.a |= 134217728;
    }

    public final void ag(onk onkVar) {
        this.O = onkVar;
        this.a |= 268435456;
    }

    public final void ah(onk onkVar) {
        this.P = onkVar;
        this.a |= 536870912;
    }

    public final void ai(onk onkVar) {
        this.Q = onkVar;
        this.a |= 1073741824;
    }

    public final void aj(onk onkVar) {
        this.R = onkVar;
        this.a |= Integer.MIN_VALUE;
    }

    public final void ak(onk onkVar) {
        this.S = onkVar;
        this.b |= 1;
    }

    public final void al(onk onkVar) {
        this.T = onkVar;
        this.b |= 2;
    }

    public final void am(long j) {
        this.b |= 4;
        this.U = j;
    }

    public final void an(long j) {
        this.b |= 8;
        this.V = j;
    }

    public final void ao(long j) {
        this.b |= 16;
        this.W = j;
    }

    public final void ap(long j) {
        this.b |= 32;
        this.X = j;
    }

    public final void aq(long j) {
        this.b |= 64;
        this.Y = j;
    }

    public final void ar(long j) {
        this.b |= 128;
        this.Z = j;
    }

    public final void as(long j) {
        this.b |= 256;
        this.aa = j;
    }

    public final void at(long j) {
        this.b |= 512;
        this.ab = j;
    }

    public final void au(long j) {
        this.b |= 1024;
        this.ac = j;
    }

    public final void av(long j) {
        this.b |= 2048;
        this.ad = j;
    }

    public final boolean aw() {
        return (this.b & 131072) != 0;
    }

    public final onk ax() {
        onk onkVar = this.aj;
        return onkVar == null ? onk.e : onkVar;
    }

    public final boolean ay() {
        return (this.b & 262144) != 0;
    }

    public final boolean az() {
        return (this.b & 524288) != 0;
    }

    public final void c() {
        nga ngaVar = this.g;
        if (!ngaVar.c()) {
            this.g = nfm.H(ngaVar);
        }
    }

    public final void e() {
        nga ngaVar = this.h;
        if (!ngaVar.c()) {
            this.h = nfm.H(ngaVar);
        }
    }

    public final void f() {
        nga ngaVar = this.i;
        if (!ngaVar.c()) {
            this.i = nfm.H(ngaVar);
        }
    }

    public final void g() {
        nga ngaVar = this.j;
        if (!ngaVar.c()) {
            this.j = nfm.H(ngaVar);
        }
    }

    public final void h() {
        nga ngaVar = this.k;
        if (!ngaVar.c()) {
            this.k = nfm.H(ngaVar);
        }
    }

    public final void i() {
        nga ngaVar = this.l;
        if (!ngaVar.c()) {
            this.l = nfm.H(ngaVar);
        }
    }

    public final void j() {
        nga ngaVar = this.n;
        if (!ngaVar.c()) {
            this.n = nfm.H(ngaVar);
        }
    }

    public final void k(long j) {
        this.a |= 1024;
        this.w = j;
    }

    public final void l(long j) {
        this.a |= 2048;
        this.x = j;
    }
}
