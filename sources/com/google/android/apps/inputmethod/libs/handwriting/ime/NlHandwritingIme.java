package com.google.android.apps.inputmethod.libs.handwriting.ime;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NlHandwritingIme extends HandwritingIme {
    public static final ltg n = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme");
    boolean o;
    boolean p;

    public NlHandwritingIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
        this.o = false;
        ((ltd) ((ltd) n.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "<init>", 48, "NlHandwritingIme.java")).w("LanguageTag = %s", iavVar.e);
        boolean z = iavVar.q.d(R.id.f54880_resource_name_obfuscated_res_0x7f0b01d0, false) && ((Boolean) cfd.g.c()).booleanValue();
        this.p = z;
        if (z) {
            Delight5Facilitator F = F();
            dfv.b();
            this.o = F.E(Collections.singletonList(dfv.a(this.d)), iavVar.f.c, false);
        }
    }

    protected final Delight5Facilitator F() {
        return Delight5Facilitator.h(this.D);
    }

    protected final ino G() {
        return ino.M(this.D);
    }

    protected final void H(boolean z, boolean z2) {
        gpg a;
        String concat;
        String str;
        int i;
        int i2;
        String[] strArr;
        NlHandwritingIme nlHandwritingIme;
        String str2;
        hlm hlmVar;
        if (!this.p) {
            this.h.clear();
            return;
        }
        ltg ltgVar = n;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "predictAndUpdateCandidates", 343, "NlHandwritingIme.java")).I("predictAndUpdateCandidates(): fromSpacebarPress = %b, fromSelectedCandidate = %b", z, z2);
        dhb dhbVar = this.k;
        if (dhbVar != null) {
            gpi gpiVar = (gpi) ((dgz) dhbVar).l.get();
            if (gpiVar != null) {
                a = gpiVar.a();
                if (a != null || !a.f.a) {
                    this.h.clear();
                }
                hqk hT = this.E.hT(40, 40, 0);
                if (hT.e()) {
                    return;
                }
                caj cajVar = F().h;
                boolean aj = G().aj(R.string.f162160_resource_name_obfuscated_res_0x7f1406f9);
                boolean aj2 = G().aj(R.string.f161650_resource_name_obfuscated_res_0x7f1406c6);
                CharSequence d = hT.d();
                CharSequence b = hT.b();
                CharSequence c = hT.c();
                String obj = b.toString();
                boolean z3 = d.length() >= 40;
                boolean z4 = c.length() >= 40;
                int max = Math.max(0, d.length() - 39);
                int min = Math.min(c.length(), 39);
                if (z || z2) {
                    concat = String.valueOf(d.toString().substring(max, d.length())).concat(" ");
                    str = "";
                } else {
                    concat = d.toString().substring(max, d.length());
                    str = c.toString().substring(0, min);
                }
                ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "predictAndUpdateCandidates", 374, "NlHandwritingIme.java")).w("predictAndUpdateCandidates(): surroundingText = %s", hT);
                mrz mrzVar = (mrz) msa.h.t();
                if (mrzVar.c) {
                    mrzVar.cD();
                    mrzVar.c = false;
                }
                msa msaVar = (msa) mrzVar.b;
                int i3 = msaVar.a | 1;
                msaVar.a = i3;
                msaVar.b = 10;
                concat.getClass();
                int i4 = i3 | 2;
                msaVar.a = i4;
                msaVar.c = concat;
                obj.getClass();
                int i5 = i4 | 4;
                msaVar.a = i5;
                msaVar.d = obj;
                str.getClass();
                int i6 = i5 | 8;
                msaVar.a = i6;
                msaVar.e = str;
                int i7 = i6 | 16;
                msaVar.a = i7;
                msaVar.f = z3;
                msaVar.a = i7 | 32;
                msaVar.g = z4;
                cbz cbzVar = cajVar.e;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                cbzVar.d(mti.DECODE_FOR_HANDWRITING);
                msd decodeForHandwriting = cbzVar.a.decodeForHandwriting(mrzVar);
                cbzVar.e(mti.DECODE_FOR_HANDWRITING);
                cbzVar.b.g(caq.DELIGHT_DECODE_FOR_HANDWRITING, SystemClock.elapsedRealtime() - elapsedRealtime);
                int a2 = msc.a(decodeForHandwriting.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 != 2) {
                    ((ltd) ((ltd) ltgVar.c()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme$PredictionInContext", "predict", 254, "NlHandwritingIme.java")).u("Calling decodeForHandwriting() in PredictionInContext failed: un-successful, code: %s", a2 - 1);
                    strArr = new String[0];
                    i = 0;
                    i2 = 0;
                } else {
                    i = decodeForHandwriting.d;
                    i2 = decodeForHandwriting.e;
                    if (!fhr.t(i, i2, 2) || aj) {
                        if (fhr.t(i, i2, 2) || aj2) {
                            String[] strArr2 = (String[]) decodeForHandwriting.c.toArray(new String[0]);
                            for (int i8 = 0; i8 < strArr2.length; i8++) {
                                if (z2) {
                                    strArr2[i8] = " ".concat(String.valueOf(strArr2[i8]));
                                }
                            }
                            strArr = strArr2;
                        } else {
                            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme$PredictionInContext", "predict", 273, "NlHandwritingIme.java")).t("Spelling correction disabled, not returning candidates.");
                            strArr = new String[0];
                        }
                    } else {
                        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme$PredictionInContext", "predict", 269, "NlHandwritingIme.java")).t("Next word prediction disabled, not returning candidates.");
                        strArr = new String[0];
                    }
                }
                if (!fhr.t(i, i2, a2)) {
                    str2 = "com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme";
                    ((ltd) ((ltd) n.b()).k(str2, "predictAndUpdateCandidates", 377, "NlHandwritingIme.java")).t("predictAndUpdateCandidates(): this is spelling correction");
                    nlHandwritingIme = this;
                    nlHandwritingIme.E.f(fhr.s(i, a2), fhr.r(i2, a2), null);
                } else {
                    nlHandwritingIme = this;
                    str2 = "com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme";
                    ((ltd) ((ltd) n.b()).k(str2, "predictAndUpdateCandidates", 383, "NlHandwritingIme.java")).t("predictAndUpdateCandidates(): this is next word prediction");
                    nlHandwritingIme.E.hW();
                }
                if (fhr.t(i, i2, a2)) {
                    hlmVar = hlm.PREDICTION;
                } else {
                    hlmVar = hlm.RECOMMENDATION;
                }
                int min2 = Math.min(3, strArr.length);
                nlHandwritingIme.h.clear();
                for (int i9 = 0; i9 < min2; i9++) {
                    ((ltd) ((ltd) n.b()).k(str2, "updateAdditionalCandidates", 325, "NlHandwritingIme.java")).w("updateAdditionalCandidates(): Add candidate %s", strArr[i9]);
                    List list = nlHandwritingIme.h;
                    hlk hlkVar = new hlk();
                    hlkVar.a = nlHandwritingIme.d(strArr[i9]);
                    hlkVar.j = strArr[i9];
                    hlkVar.e = hlmVar;
                    hlkVar.i = fhr.u(i9, min2, nlHandwritingIme);
                    hlkVar.h = i9;
                    list.add(hlkVar.a());
                }
                return;
            }
            ((ltd) ((ltd) dgz.f.c()).k("com/google/android/apps/inputmethod/libs/handwriting/recognition/AbstractHandwritingRecognizerWrapper", "getSettings", 353, "AbstractHandwritingRecognizerWrapper.java")).t("getSettings(): recognizer not set");
        }
        a = null;
        if (a != null) {
        }
        this.h.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme
    public final void g(CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        ltg ltgVar = n;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "commitTextAndDoPrediction", 522, "NlHandwritingIme.java")).J("commitTextAndDoPrediction(): doPrediction = %b, fromSpacebarPress = %b, fromSelectedCandidate = %b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        if (TextUtils.equals(charSequence, this.j)) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "commitTextAndDoPrediction", 527, "NlHandwritingIme.java")).t("commitTextAndDoPrediction(): finishing composition");
            this.E.hW();
        } else {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "commitTextAndDoPrediction", 530, "NlHandwritingIme.java")).t("commitTextAndDoPrediction(): committing text");
            this.E.hV(charSequence, false, 1);
        }
        if (!z || !this.p) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "commitTextAndDoPrediction", 539, "NlHandwritingIme.java")).t("commitTextAndDoPrediction(): clearing additional candidates");
            this.h.clear();
            return;
        }
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "commitTextAndDoPrediction", 535, "NlHandwritingIme.java")).t("commitTextAndDoPrediction(): triggering prediction and candidate update");
        H(z2, z3);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gY(hln hlnVar, boolean z) {
        mbi mbiVar;
        ltg ltgVar = n;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "selectTextCandidate", 441, "NlHandwritingIme.java")).H("selectTextCandidate(): candidate: %s, commit? %b", hlnVar, z);
        if (!z) {
            return;
        }
        CharSequence charSequence = (CharSequence) hlnVar.j;
        if (charSequence == null) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "selectTextCandidate", 447, "NlHandwritingIme.java")).t("selectTextCandidate data is null, which should never happen by construction of the candidates.");
            return;
        }
        if (hlnVar.e == hlm.RESTORABLE_TEXT) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "selectTextCandidate", 454, "NlHandwritingIme.java")).t("selectTextCandidate(): restored text");
            this.l = null;
            this.E.x();
            this.E.hW();
            g(charSequence, true, false, true);
            this.E.D();
        } else {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "selectTextCandidate", 465, "NlHandwritingIme.java")).w("selectTextCandidate(): #commitText('%s')", hlnVar.a);
            g(charSequence, true, false, true);
            int ordinal = hlnVar.e.ordinal();
            if (ordinal == 0) {
                ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "selectTextCandidate", 487, "NlHandwritingIme.java")).t("Candidate source: spelling correction");
                if (hlnVar.h == 0) {
                    mbiVar = mbi.SELECT_FIRST_CANDIDATE_SPELLING_CORRECTION;
                } else {
                    mbiVar = mbi.SELECT_OTHER_CANDIDATE_SPELLING_CORRECTION;
                }
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "selectTextCandidate", 480, "NlHandwritingIme.java")).t("Candidate source: next word prediction");
                    if (hlnVar.h == 0) {
                        mbiVar = mbi.SELECT_FIRST_CANDIDATE_NEXT_WORD_PREDICTION;
                    } else {
                        mbiVar = mbi.SELECT_OTHER_CANDIDATE_NEXT_WORD_PREDICTION;
                    }
                } else {
                    ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "selectTextCandidate", 494, "NlHandwritingIme.java")).w("Unexpected type of selected candidate: %s.", hlnVar.e);
                    x(true);
                    return;
                }
            } else if (hlnVar.h == 0) {
                mbiVar = mbi.SELECT_FIRST_CANDIDATE;
            } else {
                mbiVar = mbi.SELECT_OTHER_CANDIDATE;
            }
            V().e(dgt.HANDWRITING_OPERATION, mbiVar, this.d, Integer.valueOf(charSequence.length()));
        }
        x(true);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void i(EditorInfo editorInfo, boolean z) {
        super.i(editorInfo, z);
        ((ltd) ((ltd) n.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "onActivate", 86, "NlHandwritingIme.java")).w("onActivate() LanguageTag = %s", this.d);
        if (this.p && !this.o) {
            Delight5Facilitator F = F();
            dfv.b();
            this.o = F.E(Collections.singletonList(dfv.a(this.d)), this.F.f.c, true);
        }
        caj cajVar = F().h;
        nfh t = mvi.K.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mvi.c((mvi) t.b);
        cajVar.n((mvi) t.cz());
        x(true);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void l(ibz ibzVar, boolean z) {
        super.l(ibzVar, z);
        if (!this.p || ibzVar != ibz.a) {
            return;
        }
        H(false, false);
        x(true);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void p(hqe hqeVar, int i, int i2, int i3, int i4) {
        ltg ltgVar = n;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "onSelectionChanged", 400, "NlHandwritingIme.java")).L("onSelectionChanged(): %s %d %d %d %d", hqeVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (hqeVar == hqe.IME) {
            return;
        }
        enx enxVar = this.e;
        if (enxVar != null) {
            enxVar.e(hqeVar);
            if (this.e.h) {
                return;
            }
        }
        z(jbx.SELECTION_CHANGE);
        if (this.j.length() > 0) {
            V().e(dgt.HANDWRITING_OPERATION, mbi.CONFIRM_PLACE_CURSOR, this.d, Integer.valueOf(this.j.length()));
        }
        this.f.c();
        if (i == 0) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme", "onSelectionChanged", 432, "NlHandwritingIme.java")).t("onSelectionChanged(): triggering prediction and candidate update");
            H(false, false);
        }
        x(true);
    }
}
