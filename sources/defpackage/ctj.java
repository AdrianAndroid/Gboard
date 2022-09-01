package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ctj  reason: default package */
/* loaded from: classes.dex */
public final class ctj implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessor");
    public final cti b;
    public final nfh c;
    private final Context d;
    private final ino e;
    private final das f = das.a();
    private idb g;

    public ctj(Context context, ino inoVar, idi idiVar) {
        nfh t = mbh.aT.t();
        this.c = t;
        this.d = context;
        this.e = inoVar;
        this.b = new cti(idiVar, inoVar);
        mde mdeVar = ieo.a().a;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbh mbhVar = (mbh) t.b;
        mdeVar.getClass();
        mbhVar.A = mdeVar;
        mbhVar.a |= 536870912;
    }

    private static maz aB(maz mazVar) {
        nfh u = maz.k.u(mazVar);
        if (u.c) {
            u.cD();
            u.c = false;
        }
        maz mazVar2 = (maz) u.b;
        mazVar2.a &= -129;
        mazVar2.i = maz.k.i;
        return (maz) u.cz();
    }

    private final idb aC() {
        if (this.g == null) {
            this.g = new ctk(this);
        }
        return this.g;
    }

    public static final mai ax(hfl hflVar, String str) {
        nfh t = mai.d.t();
        if (hflVar != null) {
            int a2 = cte.a(hflVar);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mai maiVar = (mai) t.b;
            maiVar.c = a2 - 1;
            maiVar.a |= 2;
        }
        if (!TextUtils.isEmpty(str)) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mai maiVar2 = (mai) t.b;
            str.getClass();
            maiVar2.a |= 1;
            maiVar2.b = str;
        }
        return (mai) t.cz();
    }

    public static int ay(String str) {
        if (IBitmojiExtension.class.getName().equals(str)) {
            return 2;
        }
        return IStickerExtension.class.getName().equals(str) ? 3 : 1;
    }

    public final void A(int i) {
        this.b.d("Dictation.SearchEmoji.Results", i);
    }

    public final void B(int i) {
        this.b.d("Dictation.PredictEmoji.Concept", i);
    }

    public final void C() {
        this.b.c("Dictation.PredictEmoji.Request");
    }

    public final void D(int i) {
        this.b.d("Dictation.PredictEmoji.Results", i);
    }

    public final void E(mdh mdhVar) {
        nfh nfhVar = this.c;
        nfh t = mdk.h.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdk mdkVar = (mdk) t.b;
        mdkVar.e = mdhVar.c;
        mdkVar.a |= 256;
        mdk mdkVar2 = (mdk) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdkVar2.getClass();
        mbhVar.ak = mdkVar2;
        mbhVar.c |= 8388608;
        az(this.c, 266);
    }

    public final void F(String str) {
        av(str);
        az(this.c, 265);
    }

    public final void G() {
        nfh nfhVar = this.c;
        nfh t = mam.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mam mamVar = (mam) t.b;
        mamVar.b = 1;
        mamVar.a = 1 | mamVar.a;
        mam mamVar2 = (mam) t.b;
        mamVar2.c = 2;
        mamVar2.a = 2 | mamVar2.a;
        mam mamVar3 = (mam) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mamVar3.getClass();
        mbhVar.ay = mamVar3;
        mbhVar.d |= 256;
        az(this.c, 246);
    }

    public final void H() {
        nfh nfhVar = this.c;
        nfh t = mam.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mam mamVar = (mam) t.b;
        mamVar.b = 1;
        mamVar.a |= 1;
        mam mamVar2 = (mam) t.b;
        mamVar2.c = 1;
        mamVar2.a |= 2;
        mam mamVar3 = (mam) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mamVar3.getClass();
        mbhVar.ay = mamVar3;
        mbhVar.d |= 256;
        az(this.c, 246);
    }

    public final void I(may mayVar) {
        nfh nfhVar = this.c;
        nfh t = maz.k.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maz mazVar = (maz) t.b;
        mazVar.c = 2;
        int i = 2 | mazVar.a;
        mazVar.a = i;
        mazVar.g = mayVar.A;
        mazVar.a = i | 32;
        maz mazVar2 = (maz) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mazVar2.getClass();
        mbhVar.aP = mazVar2;
        mbhVar.d |= 67108864;
        az(this.c, 296);
    }

    public final void J(may mayVar) {
        nfh nfhVar = this.c;
        nfh t = maz.k.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maz mazVar = (maz) t.b;
        mazVar.c = 1;
        int i = mazVar.a | 2;
        mazVar.a = i;
        mazVar.g = mayVar.A;
        mazVar.a = i | 32;
        maz mazVar2 = (maz) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mazVar2.getClass();
        mbhVar.aP = mazVar2;
        mbhVar.d |= 67108864;
        az(this.c, 296);
    }

    public final void K(max maxVar) {
        nfh nfhVar = this.c;
        nfh t = maz.k.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maz mazVar = (maz) t.b;
        maxVar.getClass();
        mazVar.j = maxVar;
        mazVar.a |= 256;
        maz mazVar2 = (maz) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mazVar2.getClass();
        mbhVar.aP = mazVar2;
        mbhVar.d |= 67108864;
        az(this.c, 304);
    }

    public final void L(maz mazVar) {
        nfh nfhVar = this.c;
        maz aB = aB(mazVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        aB.getClass();
        mbhVar.aP = aB;
        mbhVar.d |= 67108864;
        az(this.c, 299);
    }

    public final void M(maz mazVar) {
        nfh nfhVar = this.c;
        maz aB = aB(mazVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        aB.getClass();
        mbhVar.aP = aB;
        mbhVar.d |= 67108864;
        az(this.c, 298);
    }

    public final void N(maz mazVar) {
        nfh nfhVar = this.c;
        maz aB = aB(mazVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        aB.getClass();
        mbhVar.aP = aB;
        mbhVar.d |= 67108864;
        az(this.c, 297);
    }

    public final void O(maz mazVar) {
        nfh nfhVar = this.c;
        maz aB = aB(mazVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        aB.getClass();
        mbhVar.aP = aB;
        mbhVar.d |= 67108864;
        az(this.c, 300);
    }

    public final void P(mbc mbcVar) {
        nfh nfhVar = this.c;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mbcVar.getClass();
        mbhVar.as = mbcVar;
        mbhVar.d |= 4;
        az(this.c, 232);
    }

    public final void Q() {
        this.b.c("ExpressionBackup.backup.attempt");
    }

    public final void R(chr chrVar) {
        this.b.e("ExpressionBackup.backup.fileSize", chrVar.a);
        this.b.d("ExpressionBackup.backup.favStickerPack", chrVar.b);
        this.b.d("ExpressionBackup.backup.emojiShare", chrVar.c);
        this.b.d("ExpressionBackup.backup.emoticonShare", chrVar.d);
        this.b.d("ExpressionBackup.backup.gifShare", chrVar.e);
        this.b.d("ExpressionBackup.backup.stickerShare", chrVar.f);
        this.b.d("ExpressionBackup.backup.bitmojiShare", chrVar.g);
        this.b.d("ExpressionBackup.backup.contentSuggestionShare", chrVar.h);
    }

    public final void S(chr chrVar) {
        this.b.e("ExpressionBackup.restore.fileSize", chrVar.a);
        this.b.d("ExpressionBackup.restore.favStickerPack", chrVar.b);
        this.b.d("ExpressionBackup.restore.emojiShare", chrVar.c);
        this.b.d("ExpressionBackup.restore.emoticonShare", chrVar.d);
        this.b.d("ExpressionBackup.restore.gifShare", chrVar.e);
        this.b.d("ExpressionBackup.restore.stickerShare", chrVar.f);
        this.b.d("ExpressionBackup.restore.bitmojiShare", chrVar.g);
        this.b.d("ExpressionBackup.restore.contentSuggestionShare", chrVar.h);
    }

    public final void T(int i) {
        this.b.d("ExpressionHeader.elements", i);
    }

    public final void U() {
        this.b.d("ExpressionHeader.Emoji.usage", 1);
    }

    public final void V() {
        this.b.d("ExpressionHeader.Emoji.usage", 0);
    }

    public final void W(int i) {
        this.b.d("ExpressionMomentCandidate.click", i);
    }

    public final void X(long j) {
        this.b.e("ExpressionMomentCandidate.OpenToShare.latency", j);
    }

    public final void Y(int i) {
        this.b.d("ExpressionMomentCandidate.Type.click", i);
    }

    public final void Z(int i) {
        this.b.d("ExpressionMomentCandidate.Type.shown", i);
    }

    public final void a(hln hlnVar) {
        cci cciVar;
        ckj ckjVar;
        if (hlnVar.e == hlm.EXPRESSION) {
            Object obj = hlnVar.j;
            if (obj instanceof ckj) {
                ckjVar = (ckj) obj;
            } else {
                ckjVar = ckj.a;
            }
            String str = ckjVar.c.d;
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 7;
            mbcVar.a |= 1;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 9;
            mbcVar2.a |= 2;
            int c = cte.c(ckjVar.c);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.l = c - 1;
            mbcVar3.a |= 4096;
            nfh t2 = mdl.h.t();
            int f = ckjVar.f();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mdl mdlVar = (mdl) t2.b;
            mdlVar.b = f - 1;
            int i = mdlVar.a | 1;
            mdlVar.a = i;
            boolean z = ckjVar.d;
            mdlVar.a = i | 32;
            mdlVar.g = z;
            mdl mdlVar2 = (mdl) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar4 = (mbc) t.b;
            mdlVar2.getClass();
            mbcVar4.k = mdlVar2;
            mbcVar4.a |= 2048;
            as(str, (mbc) t.cz());
        } else if (hlnVar.e != hlm.EMOJI) {
        } else {
            Object obj2 = hlnVar.j;
            if (obj2 instanceof cci) {
                cciVar = (cci) obj2;
            } else {
                cciVar = cci.b;
            }
            String str2 = cciVar.b().d;
            nfh t3 = mbc.p.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar5 = (mbc) t3.b;
            mbcVar5.b = 7;
            mbcVar5.a |= 1;
            mbc mbcVar6 = (mbc) t3.b;
            mbcVar6.c = 9;
            mbcVar6.a |= 2;
            int c2 = cte.c(cciVar.b());
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar7 = (mbc) t3.b;
            mbcVar7.l = c2 - 1;
            mbcVar7.a |= 4096;
            nfh t4 = mdl.h.t();
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mdl mdlVar3 = (mdl) t4.b;
            mdlVar3.b = 1;
            mdlVar3.a |= 1;
            mdl mdlVar4 = (mdl) t4.cz();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar8 = (mbc) t3.b;
            mdlVar4.getClass();
            mbcVar8.k = mdlVar4;
            mbcVar8.a |= 2048;
            as(str2, (mbc) t3.cz());
        }
    }

    public final void aA(String str, String str2, String str3, String str4) {
        nfh t;
        nfh t2;
        mbh mbhVar = (mbh) this.c.b;
        if ((mbhVar.a & 8388608) == 0) {
            t = mbg.d.t();
        } else {
            mbg mbgVar = mbhVar.u;
            if (mbgVar == null) {
                mbgVar = mbg.d;
            }
            t = (nfh) mbgVar.N(5);
            t.cG(mbgVar);
        }
        if (!TextUtils.isEmpty(str)) {
            nfh t3 = mbb.g.t();
            if (!TextUtils.isEmpty(str)) {
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbb mbbVar = (mbb) t3.b;
                str.getClass();
                mbbVar.a |= 1;
                mbbVar.b = str;
            }
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbb mbbVar2 = (mbb) t3.b;
            mbbVar2.c = 0;
            int i = mbbVar2.a | 2;
            mbbVar2.a = i;
            mbbVar2.a = i | 4;
            mbbVar2.d = -1;
            mbb mbbVar3 = (mbb) t3.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbg mbgVar2 = (mbg) t.b;
            mbbVar3.getClass();
            mbgVar2.c = mbbVar3;
            mbgVar2.a |= 512;
        }
        if (!TextUtils.isEmpty(str2)) {
            mbh mbhVar2 = (mbh) this.c.b;
            if ((mbhVar2.a & 128) == 0) {
                t2 = mca.j.t();
            } else {
                mca mcaVar = mbhVar2.j;
                if (mcaVar == null) {
                    mcaVar = mca.j;
                }
                t2 = (nfh) mcaVar.N(5);
                t2.cG(mcaVar);
            }
            nfh nfhVar = this.c;
            String b = ieo.a().b(str2);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mca mcaVar2 = (mca) t2.b;
            b.getClass();
            mcaVar2.a |= 8;
            mcaVar2.e = b;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar3 = (mbh) nfhVar.b;
            mca mcaVar3 = (mca) t2.cz();
            mcaVar3.getClass();
            mbhVar3.j = mcaVar3;
            mbhVar3.a |= 128;
        }
        if (!TextUtils.isEmpty(str3)) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbg mbgVar3 = (mbg) t.b;
            str3.getClass();
            mbgVar3.a |= 4;
            mbgVar3.b = str3;
        }
        nfh t4 = mce.e.t();
        if (!TextUtils.isEmpty(str4)) {
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mce mceVar = (mce) t4.b;
            str4.getClass();
            mceVar.a |= 1;
            mceVar.b = str4;
        }
        nfh nfhVar2 = this.c;
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mbh mbhVar4 = (mbh) nfhVar2.b;
        mce mceVar2 = (mce) t4.cz();
        mceVar2.getClass();
        mbhVar4.r = mceVar2;
        mbhVar4.a |= 524288;
        nfh nfhVar3 = this.c;
        if (nfhVar3.c) {
            nfhVar3.cD();
            nfhVar3.c = false;
        }
        mbh mbhVar5 = (mbh) nfhVar3.b;
        mbg mbgVar4 = (mbg) t.cz();
        mbgVar4.getClass();
        mbhVar5.u = mbgVar4;
        mbhVar5.a |= 8388608;
        az(this.c, 37);
    }

    public final void aa() {
        this.b.d("ExpressionMomentCarousel.EntryPoint.Usage", 1);
    }

    public final void ab() {
        this.b.d("ExpressionMomentCarousel.EntryPoint.Usage", 0);
    }

    public final void ac(int i) {
        this.b.d("ExpressionMoment.DynamicArt.Absent.reason", i);
    }

    public final void ad() {
        this.b.c("ExpressionMoment.ResultAbsent");
    }

    public final void ae(int i) {
        this.b.d("ExpressionMoment.Supplier.NotSupport", i);
    }

    public final void af(int i) {
        this.b.d("ExpressionMoment.Supplier.ResultAbsent", i);
    }

    public final void ag() {
        az(this.c, 288);
    }

    public final void ah(float f, float f2) {
        nfh nfhVar = this.c;
        nfh t = mbf.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbf mbfVar = (mbf) t.b;
        int i = mbfVar.a | 1;
        mbfVar.a = i;
        mbfVar.b = f;
        mbfVar.a = i | 2;
        mbfVar.c = f2;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbf mbfVar2 = (mbf) t.cz();
        mbh mbhVar2 = mbh.aT;
        mbfVar2.getClass();
        mbhVar.G = mbfVar2;
        mbhVar.b |= 256;
        az(this.c, 69);
    }

    public final void ai(hln hlnVar, mse mseVar) {
        nfh t = maf.o.t();
        int b = msc.b(mseVar.c);
        if (b == 0) {
            b = 1;
        }
        int i = b - 1;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar = (maf) t.b;
        int i2 = mafVar.a | 8;
        mafVar.a = i2;
        mafVar.c = i;
        int i3 = hlnVar.i;
        int i4 = i2 | 128;
        mafVar.a = i4;
        mafVar.f = i3;
        int i5 = hlnVar.h;
        int i6 = i4 | 256;
        mafVar.a = i6;
        mafVar.g = i5;
        int i7 = mseVar.f;
        mafVar.a = i6 | 1;
        mafVar.b = i7;
        maf mafVar2 = (maf) t.cz();
        nfh nfhVar = this.c;
        nfh t2 = mfa.w.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mfa mfaVar = (mfa) t2.b;
        int i8 = mfaVar.a | 1;
        mfaVar.a = i8;
        mfaVar.b = 0;
        int i9 = i8 | 2;
        mfaVar.a = i9;
        mfaVar.c = 0;
        mafVar2.getClass();
        mfaVar.e = mafVar2;
        mfaVar.a = i9 | 32;
        mfa mfaVar2 = (mfa) t2.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mfaVar2.getClass();
        mbhVar.f = mfaVar2;
        mbhVar.a |= 2;
        nfh nfhVar2 = this.c;
        nfh t3 = mcf.k.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mcf mcfVar = (mcf) t3.b;
        mafVar2.getClass();
        mcfVar.f = mafVar2;
        int i10 = mcfVar.a | 64;
        mcfVar.a = i10;
        int i11 = hlnVar.i;
        int i12 = i10 | 1;
        mcfVar.a = i12;
        mcfVar.b = i11;
        int i13 = hlnVar.h;
        int i14 = i12 | 2;
        mcfVar.a = i14;
        mcfVar.c = i13;
        int i15 = i14 | 4;
        mcfVar.a = i15;
        mcfVar.d = 0;
        int i16 = i15 | 8;
        mcfVar.a = i16;
        mcfVar.e = 0;
        mcfVar.a = i16 | 8192;
        mcfVar.j = 2;
        mcf mcfVar2 = (mcf) t3.cz();
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mbh mbhVar3 = (mbh) nfhVar2.b;
        mcfVar2.getClass();
        mbhVar3.g = mcfVar2;
        mbhVar3.a |= 8;
        az(this.c, 22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a8, code lost:
        if (r3 == defpackage.mbr.DYNAMIC_ART_STICKER) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aj(defpackage.mbc r24, defpackage.crc r25) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctj.aj(mbc, crc):void");
    }

    public final void al() {
        nfh nfhVar = this.c;
        nfh t = mam.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mam mamVar = (mam) t.b;
        mamVar.b = 4;
        mamVar.a |= 1;
        mam mamVar2 = (mam) t.b;
        mamVar2.c = 2;
        mamVar2.a = 2 | mamVar2.a;
        mam mamVar3 = (mam) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mamVar3.getClass();
        mbhVar.ay = mamVar3;
        mbhVar.d |= 256;
        az(this.c, 246);
    }

    public final void am() {
        nfh nfhVar = this.c;
        nfh t = mam.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mam mamVar = (mam) t.b;
        mamVar.b = 4;
        mamVar.a |= 1;
        mam mamVar2 = (mam) t.b;
        mamVar2.c = 1;
        mamVar2.a |= 2;
        mam mamVar3 = (mam) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mamVar3.getClass();
        mbhVar.ay = mamVar3;
        mbhVar.d |= 256;
        az(this.c, 246);
    }

    public final void an(int i) {
        nfh t = mdo.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdo mdoVar = (mdo) t.b;
        mdoVar.a |= 2;
        mdoVar.c = 3;
        int m = lwm.m(i);
        if (m != 0) {
            mdo mdoVar2 = (mdo) t.b;
            mdoVar2.b = m - 1;
            mdoVar2.a |= 1;
        }
        nfh nfhVar = this.c;
        mdo mdoVar3 = (mdo) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdoVar3.getClass();
        mbhVar.ad = mdoVar3;
        mbhVar.c |= 16384;
        az(this.c, 170);
    }

    public final void ao(int i) {
        nfh t = mdo.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdo mdoVar = (mdo) t.b;
        mdoVar.a |= 2;
        mdoVar.c = 3;
        int m = lwm.m(i);
        if (m != 0) {
            mdo mdoVar2 = (mdo) t.b;
            mdoVar2.b = m - 1;
            mdoVar2.a |= 1;
        }
        nfh nfhVar = this.c;
        mdo mdoVar3 = (mdo) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdoVar3.getClass();
        mbhVar.ad = mdoVar3;
        mbhVar.c |= 16384;
        az(this.c, 171);
    }

    public final void ap(int i, int i2) {
        nfh t = mdo.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdo mdoVar = (mdo) t.b;
        mdoVar.a |= 2;
        mdoVar.c = i2;
        int m = lwm.m(i);
        if (m != 0) {
            mdo mdoVar2 = (mdo) t.b;
            mdoVar2.b = m - 1;
            mdoVar2.a |= 1;
        }
        nfh nfhVar = this.c;
        mdo mdoVar3 = (mdo) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdoVar3.getClass();
        mbhVar.ad = mdoVar3;
        mbhVar.c |= 16384;
        az(this.c, 172);
    }

    public final void aq(clx clxVar, int i) {
        clx clxVar2 = clx.UNKNOWN;
        int ordinal = clxVar.ordinal();
        int i2 = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessor", "processSearchEmojiDataError", 371, "ExpressionMetricsProcessor.java")).t("processSearchEmojiDataError called with no valid error");
                return;
            } else if (ordinal == 2) {
                i2 = 4;
            } else if (ordinal == 3) {
                i2 = 5;
            } else if (ordinal == 4) {
                i2 = 3;
            } else if (ordinal == 5) {
                i2 = 6;
            }
        }
        nfh nfhVar = this.c;
        nfh t = mav.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mav mavVar = (mav) t.b;
        mavVar.c = i2 - 1;
        int i3 = mavVar.a | 8;
        mavVar.a = i3;
        mavVar.a = i3 | 16;
        mavVar.d = i;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mav mavVar2 = (mav) t.cz();
        mbh mbhVar2 = mbh.aT;
        mavVar2.getClass();
        mbhVar.W = mavVar2;
        mbhVar.c |= 16;
        az(this.c, 147);
    }

    public final void ar(String str) {
        nfh nfhVar = this.c;
        nfh t = mav.e.t();
        nfh t2 = mai.d.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mai maiVar = (mai) t2.b;
        str.getClass();
        maiVar.a |= 1;
        maiVar.b = str;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mav mavVar = (mav) t.b;
        mai maiVar2 = (mai) t2.cz();
        maiVar2.getClass();
        mavVar.b = maiVar2;
        mavVar.a |= 4;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mav mavVar2 = (mav) t.cz();
        mbh mbhVar2 = mbh.aT;
        mavVar2.getClass();
        mbhVar.W = mavVar2;
        mbhVar.c |= 16;
        az(this.c, 124);
    }

    public final void as(String str, mbc mbcVar) {
        mdl mdlVar = mbcVar.k;
        if (mdlVar == null) {
            mdlVar = mdl.h;
        }
        int i = lxj.i(mdlVar.b);
        if (i != 0 && i == 2) {
            hbd h = hbd.h(this.d);
            String b = h.g().b(str);
            nfh nfhVar = (nfh) mbcVar.N(5);
            nfhVar.cG(mbcVar);
            mdl mdlVar2 = mbcVar.k;
            if (mdlVar2 == null) {
                mdlVar2 = mdl.h;
            }
            nfh nfhVar2 = (nfh) mdlVar2.N(5);
            nfhVar2.cG(mdlVar2);
            boolean equals = b.equals(str);
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mdl mdlVar3 = (mdl) nfhVar2.b;
            mdlVar3.a |= 8;
            mdlVar3.e = equals;
            boolean z = !h.g().a(b).isEmpty();
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mdl mdlVar4 = (mdl) nfhVar2.b;
            mdlVar4.a |= 16;
            mdlVar4.f = z;
            mdl mdlVar5 = (mdl) nfhVar2.cz();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbc mbcVar2 = (mbc) nfhVar.b;
            mdlVar5.getClass();
            mbcVar2.k = mdlVar5;
            mbcVar2.a |= 2048;
            mbcVar = (mbc) nfhVar.cz();
        }
        int i2 = mbcVar.b;
        int e = lxj.e(i2);
        if (e != 0 && e == 9) {
            this.e.t(R.string.f157170_resource_name_obfuscated_res_0x7f140485, this.g.c);
        } else {
            int e2 = lxj.e(i2);
            if (e2 != 0 && e2 == 2) {
                this.e.t(R.string.f157160_resource_name_obfuscated_res_0x7f140484, this.g.c);
            }
        }
        nfh nfhVar3 = this.c;
        if (nfhVar3.c) {
            nfhVar3.cD();
            nfhVar3.c = false;
        }
        mbh mbhVar = (mbh) nfhVar3.b;
        mbh mbhVar2 = mbh.aT;
        mbcVar.getClass();
        mbhVar.as = mbcVar;
        mbhVar.d |= 4;
        az(this.c, 228);
    }

    public final void at() {
        nfh nfhVar = this.c;
        nfh t = mam.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mam mamVar = (mam) t.b;
        mamVar.b = 5;
        mamVar.a |= 1;
        mam mamVar2 = (mam) t.b;
        mamVar2.c = 2;
        mamVar2.a = 2 | mamVar2.a;
        mam mamVar3 = (mam) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mamVar3.getClass();
        mbhVar.ay = mamVar3;
        mbhVar.d |= 256;
        az(this.c, 246);
    }

    public final void au() {
        nfh nfhVar = this.c;
        nfh t = mam.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mam mamVar = (mam) t.b;
        mamVar.b = 5;
        mamVar.a |= 1;
        mam mamVar2 = (mam) t.b;
        mamVar2.c = 1;
        mamVar2.a |= 2;
        mam mamVar3 = (mam) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mamVar3.getClass();
        mbhVar.ay = mamVar3;
        mbhVar.d |= 256;
        az(this.c, 246);
    }

    public final void av(String str) {
        nfh t;
        if (!TextUtils.isEmpty(str)) {
            mbh mbhVar = (mbh) this.c.b;
            if ((mbhVar.a & 128) == 0) {
                t = mca.j.t();
            } else {
                mca mcaVar = mbhVar.j;
                if (mcaVar == null) {
                    mcaVar = mca.j;
                }
                t = (nfh) mcaVar.N(5);
                t.cG(mcaVar);
            }
            nfh nfhVar = this.c;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mca mcaVar2 = (mca) t.b;
            str.getClass();
            mcaVar2.a |= 8;
            mcaVar2.e = str;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar2 = (mbh) nfhVar.b;
            mca mcaVar3 = (mca) t.cz();
            mcaVar3.getClass();
            mbhVar2.j = mcaVar3;
            mbhVar2.a |= 128;
        }
    }

    public final void aw(String str) {
        if (!TextUtils.isEmpty(str)) {
            nfh nfhVar = this.c;
            nfh t = mce.e.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mce mceVar = (mce) t.b;
            str.getClass();
            mceVar.a |= 1;
            mceVar.b = str;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar = (mbh) nfhVar.b;
            mce mceVar2 = (mce) t.cz();
            mbh mbhVar2 = mbh.aT;
            mceVar2.getClass();
            mbhVar.r = mceVar2;
            mbhVar.a |= 524288;
        }
    }

    public final void az(nfh nfhVar, int i) {
        this.b.f((mbh) nfhVar.cz(), i, aC().c, aC().d);
        nfhVar.b = (nfm) nfhVar.b.N(4);
        mde mdeVar = ieo.a().a;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdeVar.getClass();
        mbhVar.A = mdeVar;
        mbhVar.a |= 536870912;
    }

    public final void b() {
        az(this.c, 263);
    }

    public final void c() {
        az(this.c, 151);
    }

    public final void d() {
        az(this.c, 150);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final void f() {
        this.b.a();
        this.b.close();
    }

    public final void g() {
        az(this.c, 155);
    }

    public final void h() {
        az(this.c, 154);
    }

    public final void i() {
        az(this.c, 153);
    }

    public final void j() {
        az(this.c, 152);
    }

    public final void k(mbc mbcVar) {
        nfh nfhVar = this.c;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mbcVar.getClass();
        mbhVar.as = mbcVar;
        mbhVar.d |= 4;
        az(this.c, 229);
    }

    public final void l(mbc mbcVar) {
        nfh nfhVar = this.c;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mbcVar.getClass();
        mbhVar.as = mbcVar;
        mbhVar.d |= 4;
        az(this.c, 231);
    }

    public final void m() {
        nfh nfhVar = this.c;
        nfh t = mam.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mam mamVar = (mam) t.b;
        mamVar.b = 3;
        mamVar.a |= 1;
        mam mamVar2 = (mam) t.b;
        mamVar2.c = 2;
        mamVar2.a = 2 | mamVar2.a;
        mam mamVar3 = (mam) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mamVar3.getClass();
        mbhVar.ay = mamVar3;
        mbhVar.d |= 256;
        az(this.c, 246);
    }

    public final void n() {
        nfh nfhVar = this.c;
        nfh t = mam.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mam mamVar = (mam) t.b;
        mamVar.b = 3;
        mamVar.a |= 1;
        mam mamVar2 = (mam) t.b;
        mamVar2.c = 1;
        mamVar2.a |= 2;
        mam mamVar3 = (mam) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mamVar3.getClass();
        mbhVar.ay = mamVar3;
        mbhVar.d |= 256;
        az(this.c, 246);
    }

    public final void o(maj majVar) {
        nfh nfhVar = this.c;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        majVar.getClass();
        mbhVar.ao = majVar;
        mbhVar.c |= 536870912;
        az(this.c, 214);
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        aC().b(idoVar, iduVar, j, j2, objArr);
    }

    public final void q(int i, int i2) {
        nfh nfhVar = this.c;
        nfh t = mdk.h.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdk mdkVar = (mdk) t.b;
        int i3 = mdkVar.a | 32;
        mdkVar.a = i3;
        mdkVar.c = i;
        mdkVar.a = i3 | 64;
        mdkVar.d = i2;
        mdk mdkVar2 = (mdk) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdkVar2.getClass();
        mbhVar.ak = mdkVar2;
        mbhVar.c |= 8388608;
        az(this.c, 213);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final boolean s() {
        return false;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        aC();
        return ctk.a;
    }

    public final void u(String str, mdj mdjVar, long j, long j2, long j3) {
        av(str);
        nfh nfhVar = this.c;
        nfh t = mdk.h.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdk mdkVar = (mdk) t.b;
        mdkVar.f = mdjVar.d;
        mdkVar.a |= 512;
        nfh t2 = mak.e.t();
        int i = (int) j;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mak makVar = (mak) t2.b;
        int i2 = makVar.a | 1;
        makVar.a = i2;
        makVar.b = i;
        int i3 = i2 | 2;
        makVar.a = i3;
        makVar.c = (int) j2;
        makVar.a = i3 | 4;
        makVar.d = (int) j3;
        mak makVar2 = (mak) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdk mdkVar2 = (mdk) t.b;
        makVar2.getClass();
        mdkVar2.g = makVar2;
        mdkVar2.a |= 1024;
        mdk mdkVar3 = (mdk) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdkVar3.getClass();
        mbhVar.ak = mdkVar3;
        mbhVar.c |= 8388608;
        az(this.c, 180);
    }

    public final void v(String str, String str2) {
        av(str2);
        nfh nfhVar = this.c;
        nfh t = mdk.h.t();
        nfh t2 = mai.d.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mai maiVar = (mai) t2.b;
        str.getClass();
        maiVar.a |= 1;
        maiVar.b = str;
        mai maiVar2 = (mai) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdk mdkVar = (mdk) t.b;
        maiVar2.getClass();
        mdkVar.b = maiVar2;
        mdkVar.a |= 1;
        mdk mdkVar2 = (mdk) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdkVar2.getClass();
        mbhVar.ak = mdkVar2;
        mbhVar.c |= 8388608;
        az(this.c, 179);
    }

    public final void w() {
        this.b.c("Dictation.GetConceptList");
    }

    public final void x() {
        this.b.c("Dictation.ConceptEmoji.Request");
    }

    public final void y(int i) {
        this.b.d("Dictation.ConceptEmoji.Results", i);
    }

    public final void z() {
        this.b.c("Dictation.SearchEmoji.Request");
    }

    public final void ak(mbc mbcVar) {
        int n = lwm.n(mbcVar.c);
        if (n != 0 && n == 16) {
            nga<mbt> ngaVar = mbcVar.o;
            ArrayList arrayList = new ArrayList();
            for (mbt mbtVar : ngaVar) {
                nfh u = mbt.e.u(mbtVar);
                if (u.c) {
                    u.cD();
                    u.c = false;
                }
                mbt mbtVar2 = (mbt) u.b;
                mbtVar2.d = null;
                mbtVar2.a &= -5;
                arrayList.add((mbt) u.cz());
            }
            nfh u2 = mbc.p.u(mbcVar);
            if (u2.c) {
                u2.cD();
                u2.c = false;
            }
            ((mbc) u2.b).o = mbc.G();
            u2.dh(arrayList);
            mbcVar = (mbc) u2.cz();
        }
        nfh nfhVar = this.c;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mbcVar.getClass();
        mbhVar.as = mbcVar;
        mbhVar.d |= 4;
        az(this.c, 230);
    }
}
