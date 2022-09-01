package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: djt  reason: default package */
/* loaded from: classes.dex */
public final class djt implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessor");
    public final idi b;
    public final ino c;
    public hln g;
    public hln h;
    public nfh r;
    private nfh s;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    public int q = 1;
    public boolean p = false;
    private final idb t = new dju(this);
    public jav i = a(hqp.b());

    public djt(Context context, idi idiVar) {
        ino M = ino.M(context);
        this.b = idiVar;
        this.c = M;
    }

    public static jav a(hqt hqtVar) {
        if (hqtVar != null) {
            return hqtVar.i();
        }
        return null;
    }

    public static maf b(hln hlnVar, int i, boolean z) {
        int i2;
        nfh t = maf.o.t();
        hlm hlmVar = hlm.RECOMMENDATION;
        hqe hqeVar = hqe.UNKNOWN;
        int ordinal = hlnVar.e.ordinal();
        if (ordinal == 1) {
            i2 = 2;
        } else if (ordinal == 8) {
            i2 = 4;
        } else if (ordinal == 3) {
            i2 = 8;
        } else if (ordinal == 4) {
            i2 = 12;
        } else if (ordinal == 5) {
            i2 = 9;
        } else if (jbs.j(hlnVar.a)) {
            i2 = 6;
        } else if (jbs.m(hlnVar.a)) {
            i2 = 7;
        } else {
            i2 = jbs.l(hlnVar.a) ? 3 : 1;
        }
        int i3 = i2 - 1;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar = (maf) t.b;
        int i4 = 8 | mafVar.a;
        mafVar.a = i4;
        mafVar.c = i3;
        hlm hlmVar2 = hlnVar.e;
        if (hlmVar2 == hlm.PREDICTION) {
            int i5 = hlnVar.o;
            int i6 = i4 | 65536;
            mafVar.a = i6;
            mafVar.m = i5;
            int i7 = hlnVar.p;
            mafVar.a = i6 | 131072;
            mafVar.n = i7;
        }
        CharSequence charSequence = hlmVar2 == hlm.READING_TEXT ? hlnVar.b : hlnVar.a;
        if (charSequence != null) {
            int length = charSequence.length();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            maf mafVar2 = (maf) t.b;
            mafVar2.a |= 64;
            mafVar2.e = length;
            String obj = charSequence.toString();
            if (((maf) t.b).c == 0 && obj.contains(" ")) {
                int length2 = obj.split(" ").length;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                maf mafVar3 = (maf) t.b;
                mafVar3.a |= 32;
                mafVar3.d = length2;
            }
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar4 = (maf) t.b;
        int i8 = mafVar4.a | 4096;
        mafVar4.a = i8;
        mafVar4.i = z;
        int i9 = i8 | 128;
        mafVar4.a = i9;
        mafVar4.f = i;
        int i10 = hlnVar.m;
        if (i10 > 0) {
            i9 |= 16384;
            mafVar4.a = i9;
            mafVar4.j = i10;
        }
        int i11 = hlnVar.q;
        if (i11 > 0) {
            mafVar4.a = i9 | 32768;
            mafVar4.k = i11;
        }
        hll hllVar = hlnVar.r;
        if (hllVar != null) {
            if (hllVar.b > 0) {
                nfh t2 = mei.d.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mei meiVar = (mei) t2.b;
                meiVar.b = 2;
                int i12 = meiVar.a | 1;
                meiVar.a = i12;
                int i13 = hlnVar.r.b;
                meiVar.a = i12 | 2;
                meiVar.c = i13;
                t.dg((mei) t2.cz());
            }
            if (hlnVar.r.a > 0) {
                nfh t3 = mei.d.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mei meiVar2 = (mei) t3.b;
                meiVar2.b = 1;
                int i14 = meiVar2.a | 1;
                meiVar2.a = i14;
                int i15 = hlnVar.r.a;
                meiVar2.a = i14 | 2;
                meiVar2.c = i15;
                t.dg((mei) t3.cz());
            }
            if (hlnVar.r.c > 0) {
                nfh t4 = mei.d.t();
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                mei meiVar3 = (mei) t4.b;
                meiVar3.b = 3;
                int i16 = meiVar3.a | 1;
                meiVar3.a = i16;
                int i17 = hlnVar.r.c;
                meiVar3.a = i16 | 2;
                meiVar3.c = i17;
                t.dg((mei) t4.cz());
            }
            if (hlnVar.r.d > 0) {
                nfh t5 = mei.d.t();
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mei meiVar4 = (mei) t5.b;
                meiVar4.b = 4;
                int i18 = meiVar4.a | 1;
                meiVar4.a = i18;
                int i19 = hlnVar.r.d;
                meiVar4.a = i18 | 2;
                meiVar4.c = i19;
                t.dg((mei) t5.cz());
            }
            if (hlnVar.r.e > 0) {
                nfh t6 = mei.d.t();
                if (t6.c) {
                    t6.cD();
                    t6.c = false;
                }
                mei meiVar5 = (mei) t6.b;
                meiVar5.b = 5;
                int i20 = meiVar5.a | 1;
                meiVar5.a = i20;
                int i21 = hlnVar.r.e;
                meiVar5.a = i20 | 2;
                meiVar5.c = i21;
                t.dg((mei) t6.cz());
            }
        }
        int i22 = hlnVar.n;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar5 = (maf) t.b;
        mafVar5.a |= 1;
        mafVar5.b = i22;
        return (maf) t.cz();
    }

    public static mbl c(din dinVar, String str) {
        nfh t = mbl.e.t();
        int i = dinVar.b;
        hlm hlmVar = hlm.RECOMMENDATION;
        hqe hqeVar = hqe.UNKNOWN;
        int i2 = i - 1;
        int i3 = i2 != 0 ? i2 != 1 ? 4 : 3 : 2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbl mblVar = (mbl) t.b;
        mblVar.b = i3 - 1;
        int i4 = mblVar.a | 1;
        mblVar.a = i4;
        str.getClass();
        int i5 = i4 | 2;
        mblVar.a = i5;
        mblVar.c = str;
        int i6 = dinVar.a;
        mblVar.a = i5 | 4;
        mblVar.d = i6;
        return (mbl) t.cz();
    }

    public final void d() {
        List list = this.f;
        nfh t = mbz.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbz mbzVar = (mbz) t.b;
        mbzVar.a |= 64;
        mbzVar.c = true;
        int i = this.t.b == hxo.EMOJI_KEY_IGNORED ? 6 : 2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbz mbzVar2 = (mbz) t.b;
        mbzVar2.b = i - 1;
        mbzVar2.a |= 16;
        list.add((mbz) t.cz());
    }

    @Override // defpackage.idj
    public final void e() {
        mde mdeVar = ieo.a().b;
        nfh nfhVar = (nfh) mdeVar.N(5);
        nfhVar.cG(mdeVar);
        this.s = nfhVar;
    }

    @Override // defpackage.idj
    public final void f() {
        this.b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.q = 1;
        this.r = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = 0;
        h();
        this.e.clear();
    }

    public final void h() {
        this.g = null;
        this.h = null;
        this.d.clear();
        this.p = false;
    }

    public final void i() {
        int i = this.q;
        if ((i == 5 || i == 4) && this.r != null) {
            nfh t = mbh.aT.t();
            nfh nfhVar = this.r;
            boolean z = this.q == 4;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mfa mfaVar = (mfa) nfhVar.b;
            mfa mfaVar2 = mfa.w;
            mfaVar.a |= 262144;
            mfaVar.n = z;
            boolean z2 = this.n;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mfa mfaVar3 = (mfa) nfhVar.b;
            mfaVar3.a |= 268435456;
            mfaVar3.t = z2;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbh mbhVar = (mbh) t.b;
            mfa mfaVar4 = (mfa) nfhVar.cz();
            mfaVar4.getClass();
            mbhVar.q = mfaVar4;
            mbhVar.a |= 262144;
            k(t, 26);
            this.r = null;
        }
    }

    public final void j() {
        i();
        g();
    }

    public final void k(nfh nfhVar, int i) {
        jav javVar = this.i;
        if (javVar != null) {
            nfh nfhVar2 = this.s;
            String str = javVar.n;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mde mdeVar = (mde) nfhVar2.b;
            mde mdeVar2 = mde.i;
            str.getClass();
            mdeVar.a |= 4;
            mdeVar.d = str;
        }
        idi idiVar = this.b;
        nfh nfhVar3 = this.s;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mde mdeVar3 = (mde) nfhVar3.cz();
        mbh mbhVar2 = mbh.aT;
        mdeVar3.getClass();
        mbhVar.A = mdeVar3;
        mbhVar.a |= 536870912;
        mbh mbhVar3 = (mbh) nfhVar.cz();
        idb idbVar = this.t;
        idiVar.f(mbhVar3, i, idbVar.c, idbVar.d);
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.t.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return dju.a;
    }
}
