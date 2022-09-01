package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.keyboard.client.delight5.Decoder;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: caj  reason: default package */
/* loaded from: classes.dex */
public final class caj implements AutoCloseable {
    public static final lug a = lug.i(Decoder.TAG);
    public final cbz e;
    public final idk f;
    public final cby g;
    public final mkr h;
    public volatile cbg i;
    public mko k;
    public mko l;
    public mko m;
    public mvi q;
    public final gjz s;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Object c = new Object();
    public List d = new ArrayList();
    public final Object j = new Object();
    public boolean n = false;
    public final List o = new ArrayList();
    public int r = 10;
    public final AtomicReference p = new AtomicReference();

    public caj(Context context, Decoder decoder) {
        ieh j = ieh.j();
        hyn hynVar = new hyn();
        cby a2 = cby.a(context);
        Optional empty = Optional.empty();
        gjz gjzVar = gvs.a;
        this.e = new cbz(decoder, hynVar, j);
        this.f = j;
        this.g = a2;
        this.h = (mkr) empty.orElseGet(cag.a);
        this.s = gjzVar;
    }

    public static msg e(long j, cbg cbgVar, mtv mtvVar, idu iduVar) {
        nfh t = msg.l.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msg msgVar = (msg) t.b;
        msgVar.a |= 4;
        msgVar.d = j;
        int a2 = cbgVar.a(j);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msg msgVar2 = (msg) t.b;
        int i = msgVar2.a | 2;
        msgVar2.a = i;
        msgVar2.c = a2;
        msgVar2.b = mtvVar.d;
        msgVar2.a = i | 1;
        boolean booleanValue = ((Boolean) cas.K.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msg msgVar3 = (msg) t.b;
        msgVar3.a |= 256;
        msgVar3.j = booleanValue;
        long a3 = iduVar.a(iwd.a);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msg msgVar4 = (msg) t.b;
        msgVar4.a |= 512;
        msgVar4.k = a3;
        return (msg) t.cz();
    }

    public static msg f(long j, cbg cbgVar, idu iduVar) {
        return e(j, cbgVar, cbgVar.f(), iduVar);
    }

    public final int a() {
        int i = this.r;
        if (i > 0) {
            return i;
        }
        return 10;
    }

    public final mko b(final mvm mvmVar) {
        final idu b = this.f.b();
        return this.h.hR(new Runnable() { // from class: caf
            @Override // java.lang.Runnable
            public final void run() {
                caq caqVar;
                caj cajVar = caj.this;
                mvm mvmVar2 = mvmVar;
                idu iduVar = b;
                luc lucVar = (luc) ((luc) caj.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "loadLanguageModel", 629, "Delight5DecoderWrapper.java");
                mvl b2 = mvl.b(mvmVar2.b);
                if (b2 == null) {
                    b2 = mvl.UNKNOWN;
                }
                mvl b3 = mvl.b(mvmVar2.b);
                if (b3 == null) {
                    b3 = mvl.UNKNOWN;
                }
                lucVar.G("loadLanguageModel() : %s, version [%s]", b2, b3 == mvl.MAIN ? String.valueOf(mvmVar2.j) : "n/a");
                mvl b4 = mvl.b(mvmVar2.b);
                if (b4 == null) {
                    b4 = mvl.UNKNOWN;
                }
                if (b4 != mvl.MAIN || !cajVar.q(mvmVar2.g)) {
                    mvl b5 = mvl.b(mvmVar2.b);
                    if (b5 == null) {
                        b5 = mvl.UNKNOWN;
                    }
                    int ordinal = b5.ordinal();
                    if (ordinal == 1) {
                        caqVar = caq.DELIGHT_LOAD_LANGUAGE_MODEL_MAIN;
                    } else if (ordinal == 2) {
                        caqVar = caq.DELIGHT_LOAD_LANGUAGE_MODEL_CONTACTS;
                    } else if (ordinal == 3) {
                        caqVar = caq.DELIGHT_LOAD_LANGUAGE_MODEL_USER_HISTORY;
                    } else if (ordinal == 4) {
                        caqVar = caq.DELIGHT_LOAD_LANGUAGE_MODEL_PERSONAL;
                    } else if (ordinal == 8) {
                        caqVar = caq.DELIGHT_LOAD_LANGUAGE_MODEL_BLOCKLIST;
                    } else if (ordinal == 11) {
                        caqVar = caq.DELIGHT_LOAD_LANGUAGE_MODEL_EMOJI_ANNOTATION;
                    } else if (ordinal == 14) {
                        caqVar = caq.DELIGHT_LOAD_LANGUAGE_MODEL_EMAIL;
                    } else {
                        ((luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "getTimerTypeForLoadLanguageModule", 778, "Delight5DecoderWrapper.java")).u("Cannot find timer type for loading language model %d", b5.A);
                        caqVar = caq.DELIGHT_LOAD_LANGUAGE_MODEL_UNKNOWN;
                    }
                    mvl b6 = mvl.b(mvmVar2.b);
                    if (b6 == null) {
                        b6 = mvl.UNKNOWN;
                    }
                    if (b6 == mvl.MAIN) {
                        synchronized (cajVar.c) {
                            boolean f = cajVar.e.f(mvmVar2, caqVar, iduVar);
                            synchronized (cajVar.b) {
                                if (f) {
                                    luc lucVar2 = (luc) ((luc) caj.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "loadLanguageModel", 651, "Delight5DecoderWrapper.java");
                                    mvl b7 = mvl.b(mvmVar2.b);
                                    if (b7 == null) {
                                        b7 = mvl.UNKNOWN;
                                    }
                                    lucVar2.G("Loaded main LM %s.%s", b7, mvmVar2.g);
                                    cajVar.d.add(mvmVar2);
                                    cajVar.b.set(true);
                                    cajVar.b.notifyAll();
                                } else {
                                    luc lucVar3 = (luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "loadLanguageModel", 657, "Delight5DecoderWrapper.java");
                                    mvl b8 = mvl.b(mvmVar2.b);
                                    if (b8 == null) {
                                        b8 = mvl.UNKNOWN;
                                    }
                                    lucVar3.z("Failed to load main LM %d.%s", b8.A, mvmVar2.g);
                                    cajVar.n = true;
                                    cajVar.f.e(cap.DELIGHT_LOAD_MAIN_LM_FAILED, new Object[0]);
                                    cajVar.o.add(jaz.b(mvmVar2.g, mvmVar2.h));
                                }
                            }
                        }
                        return;
                    } else if (cajVar.e.f(mvmVar2, caqVar, iduVar)) {
                        luc lucVar4 = (luc) ((luc) caj.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "loadLanguageModel", 670, "Delight5DecoderWrapper.java");
                        mvl b9 = mvl.b(mvmVar2.b);
                        if (b9 == null) {
                            b9 = mvl.UNKNOWN;
                        }
                        lucVar4.G("Loaded dynamic LM %s.%s", b9, mvmVar2.g);
                        mvl b10 = mvl.b(mvmVar2.b);
                        if (b10 == null) {
                            b10 = mvl.UNKNOWN;
                        }
                        if (b10 != mvl.USER_HISTORY) {
                            return;
                        }
                        ieh.j().e(cap.USER_HISTORY_LM_SIZE, Long.valueOf(cbw.a(mvmVar2)));
                        return;
                    } else {
                        luc lucVar5 = (luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "loadLanguageModel", 677, "Delight5DecoderWrapper.java");
                        mvl b11 = mvl.b(mvmVar2.b);
                        if (b11 == null) {
                            b11 = mvl.UNKNOWN;
                        }
                        lucVar5.z("Failed to load dynamic LM %d.%s", b11.A, mvmVar2.g);
                        idk idkVar = cajVar.f;
                        cap capVar = cap.DELIGHT_LOAD_DYNAMIC_LM_FAILED;
                        Object[] objArr = new Object[1];
                        mvl b12 = mvl.b(mvmVar2.b);
                        if (b12 == null) {
                            b12 = mvl.UNKNOWN;
                        }
                        objArr[0] = Integer.valueOf(b12.A);
                        idkVar.e(capVar, objArr);
                        return;
                    }
                }
                ((luc) ((luc) caj.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "loadLanguageModel", 637, "Delight5DecoderWrapper.java")).J("Main LM for locale already loaded %s-%s-%d", mvmVar2.g, mvmVar2.h, Long.valueOf(mvmVar2.j));
            }
        }, null);
    }

    public final mko c(mwf mwfVar) {
        return this.h.hR(new bue(this, mwfVar, this.f.b(), 4), null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.i = null;
        this.p.set(null);
        this.e.c = null;
    }

    public final mko d(mvm mvmVar) {
        return this.h.hR(new bue(this, mvmVar, this.f.b(), 3), null);
    }

    public final msr g(boolean z) {
        nfh t = msq.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msq msqVar = (msq) t.b;
        msqVar.a |= 1;
        msqVar.b = z;
        cbz cbzVar = this.e;
        long o = cbzVar.d.o();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msq msqVar2 = (msq) t.b;
        msqVar2.a |= 2;
        msqVar2.c = o;
        cbzVar.d(mti.GET_INPUT_CONTEXT);
        msr inputContext = cbzVar.a.getInputContext((msq) t.cz());
        cbzVar.e(mti.GET_INPUT_CONTEXT);
        cbzVar.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(((msq) t.b).c));
        return inputContext;
    }

    public final mud h() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            cbz cbzVar = this.e;
            cbzVar.d(mti.GET_TRAINING_CONTEXT);
            mud trainingContext = cbzVar.a.getTrainingContext();
            cbzVar.e(mti.GET_TRAINING_CONTEXT);
            return trainingContext;
        } finally {
            this.f.g(caq.DELIGHT5_GET_TRAINING_CONTEXT, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }

    public final List i() {
        synchronized (this.b) {
            if (this.d.isEmpty()) {
                return llp.q();
            }
            return llp.o(this.d);
        }
    }

    public final void j(mrm mrmVar) {
        this.h.hP(new bwt(this, mrmVar, 5));
    }

    public final void k(cbg cbgVar, ifn ifnVar) {
        if (cbgVar != null) {
            this.i = cbgVar;
        }
        this.p.set(ifnVar);
        this.e.c = ifnVar;
    }

    public final void l(long j, hln hlnVar) {
        m(j, hlnVar, false, 0);
    }

    public final void m(long j, hln hlnVar, boolean z, int i) {
        String str;
        mrw mrwVar;
        cbg cbgVar = this.i;
        if (cbgVar == null) {
            return;
        }
        String str2 = true != z ? "selectTextCandidate" : "selectInlineSuggestion";
        if (!cbgVar.F()) {
            ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "selectTextCandidateOrInlineSuggestion", 1648, "Delight5DecoderWrapper.java")).w("%s(): Decoder state is invalid", str2);
            return;
        }
        msg f = f(j, cbgVar, this.f.b());
        nfh nfhVar = (nfh) f.N(5);
        nfhVar.cG(f);
        nfh t = mtz.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mtz mtzVar = (mtz) t.b;
        mtzVar.b = 1;
        mtzVar.a |= 1;
        Object obj = hlnVar.j;
        if (obj instanceof cci) {
            int a2 = ((cci) obj).a();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mtz mtzVar2 = (mtz) t.b;
            mtzVar2.a |= 2;
            mtzVar2.c = a2;
            int i2 = hlnVar.h;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            msg msgVar = (msg) nfhVar.b;
            msg msgVar2 = msg.l;
            msgVar.a |= 8;
            msgVar.e = i2;
            int i3 = hlnVar.i;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            msg msgVar3 = (msg) nfhVar.b;
            int i4 = msgVar3.a | 16;
            msgVar3.a = i4;
            msgVar3.f = i3;
            msgVar3.a = i4 | 32;
            msgVar3.g = z;
            if (hlnVar.e == hlm.UNDO_REVERT) {
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                msg msgVar4 = (msg) nfhVar.b;
                msgVar4.a |= 128;
                msgVar4.i = true;
            }
            if (z) {
                switch (i) {
                    case -10132:
                        ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "selectTextCandidateOrInlineSuggestion", 1680, "Delight5DecoderWrapper.java")).t("clearcut: swipe on spacebar");
                        if (nfhVar.c) {
                            nfhVar.cD();
                            nfhVar.c = false;
                        }
                        msg msgVar5 = (msg) nfhVar.b;
                        msgVar5.h = 3;
                        msgVar5.a |= 64;
                        break;
                    case -10131:
                        ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "selectTextCandidateOrInlineSuggestion", 1675, "Delight5DecoderWrapper.java")).t("clearcut: swipe");
                        if (nfhVar.c) {
                            nfhVar.cD();
                            nfhVar.c = false;
                        }
                        msg msgVar6 = (msg) nfhVar.b;
                        msgVar6.h = 2;
                        msgVar6.a |= 64;
                        break;
                    case -10130:
                        ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "selectTextCandidateOrInlineSuggestion", 1670, "Delight5DecoderWrapper.java")).t("clearcut: click");
                        if (nfhVar.c) {
                            nfhVar.cD();
                            nfhVar.c = false;
                        }
                        msg msgVar7 = (msg) nfhVar.b;
                        msgVar7.h = 1;
                        msgVar7.a |= 64;
                        break;
                    default:
                        ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "selectTextCandidateOrInlineSuggestion", 1685, "Delight5DecoderWrapper.java")).t("inline suggestion select key code is invalid.");
                        break;
                }
            }
        }
        int i5 = ((msg) nfhVar.b).c;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mtz mtzVar3 = (mtz) t.b;
        msg msgVar8 = (msg) nfhVar.cz();
        msgVar8.getClass();
        mtzVar3.d = msgVar8;
        mtzVar3.a |= 4;
        ifn ifnVar = (ifn) this.p.get();
        if (ifnVar != null) {
            ifnVar.v = SystemClock.uptimeMillis();
        }
        cbz cbzVar = this.e;
        long o = cbzVar.d.o();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mtz mtzVar4 = (mtz) t.b;
        mtzVar4.a |= 8;
        mtzVar4.e = o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cbzVar.d(mti.ON_SUGGESTION_PRESS);
        mua onSuggestionPress = cbzVar.a.onSuggestionPress((mtz) t.cz());
        cbzVar.e(mti.ON_SUGGESTION_PRESS);
        cbzVar.b.g(caq.DELIGHT_SELECT_TEXT_CANDIDATE, SystemClock.elapsedRealtime() - elapsedRealtime);
        mtz mtzVar5 = (mtz) t.b;
        long j2 = mtzVar5.e;
        msg msgVar9 = mtzVar5.d;
        if (msgVar9 == null) {
            msgVar9 = msg.l;
        }
        long j3 = msgVar9.d;
        ifn ifnVar2 = cbzVar.c;
        if (ifnVar2 != null) {
            str = str2;
            cbzVar.b.e(cap.LOG_NATIVE_METRICS_WITH_TYPING_METRICS, Long.valueOf(j2), ihm.b(ifnVar2), Long.valueOf(ifnVar2.v), Boolean.valueOf(ifnVar2.w), Long.valueOf(j3));
        } else {
            str = str2;
            cbzVar.b.e(cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID, Long.valueOf(((mtz) t.b).e), Long.valueOf(j3));
        }
        if (t(onSuggestionPress.d, str)) {
            return;
        }
        lvw.e(new cae(onSuggestionPress, 2));
        if ((onSuggestionPress.a & 2) != 0) {
            mrwVar = onSuggestionPress.c;
            if (mrwVar == null) {
                mrwVar = mrw.h;
            }
        } else {
            mrwVar = null;
        }
        mrw mrwVar2 = mrwVar;
        msf msfVar = msf.OPERATION_SELECT_TEXT_CANDIDATE;
        msh mshVar = onSuggestionPress.b;
        if (mshVar == null) {
            mshVar = msh.c;
        }
        cbgVar.i(mrwVar2, msfVar, mshVar, false, j, 0L, ifnVar);
    }

    public final void n(mvi mviVar) {
        cbz cbzVar = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nfh t = mvj.d.t();
        long o = cbzVar.d.o();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mvj mvjVar = (mvj) t.b;
        int i = mvjVar.a | 2;
        mvjVar.a = i;
        mvjVar.c = o;
        mviVar.getClass();
        mvjVar.b = mviVar;
        mvjVar.a = i | 1;
        mvj mvjVar2 = (mvj) t.cz();
        cbzVar.d(mti.SET_RUNTIME_PARAMS);
        cbzVar.a.setRuntimeParams(mvjVar2);
        cbzVar.e(mti.SET_RUNTIME_PARAMS);
        cbzVar.b.g(caq.DELIGHT_SET_RUNTIME_PARAMS, SystemClock.elapsedRealtime() - elapsedRealtime);
        cbzVar.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(mvjVar2.c));
        this.q = mviVar;
    }

    public final void o() {
        cbz cbzVar = this.e;
        mpz a2 = bxm.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cbzVar.d(mti.CRANK_SET_RUNTIME_PARAMS);
        cbzVar.a.setDispatcherRuntimeParams(a2);
        cbzVar.e(mti.CRANK_SET_RUNTIME_PARAMS);
        cbzVar.b.g(cac.CRANK_SET_RUNTIME_PARAMS, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    public final boolean p() {
        return this.b.get();
    }

    public final boolean q(String str) {
        synchronized (this.b) {
            for (mvm mvmVar : this.d) {
                if (TextUtils.equals(mvmVar.g, str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean r() {
        return this.b.get() && s();
    }

    public final boolean s() {
        return this.e.a.isReadyForTouch();
    }

    public final boolean t(int i, String str) {
        if (i == 0) {
            return false;
        }
        ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "responseInvalid", 1018, "Delight5DecoderWrapper.java")).E("responseInvalid(): operation=%s, errorCode=%d", str, i);
        this.f.e(cap.INPUT_CONTEXT_VALIDATION_ERROR, Integer.valueOf(i));
        return true;
    }

    public final boolean u(long j, String str) {
        if (this.i != null) {
            long c = this.i.c();
            if (j >= c) {
                return false;
            }
            Long valueOf = Long.valueOf(j);
            ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "shouldAbandonMessage", 1945, "Delight5DecoderWrapper.java")).J("Detected old [%s] request in background: %s<%s", str, valueOf, Long.valueOf(c));
            this.f.e(cap.ABANDON_REQUEST_DUE_TO_STALE_CLIENT_REQUEST, str, Long.valueOf(c - j), valueOf);
            return true;
        }
        return false;
    }

    public final boolean v(long j) {
        if (this.b.get()) {
            return true;
        }
        if (j <= 0) {
            return false;
        }
        synchronized (this.b) {
            try {
                this.b.wait(j);
            } catch (InterruptedException e) {
                ((luc) ((luc) ((luc) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "waitForMainLanguageModel", (char) 498, "Delight5DecoderWrapper.java")).t("waitForMainLanguageModel() : Timed out");
            }
        }
        return this.b.get();
    }

    public final void w() {
        cbz cbzVar = this.e;
        long o = cbzVar.d.o();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cbzVar.a.flushPersonalizedDataToDisk(o);
        cbzVar.b.g(caq.DELIGHT_FLUSH_PERSONALIZED_DATA, SystemClock.elapsedRealtime() - elapsedRealtime);
        cbzVar.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(o));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mtl x(nfh nfhVar) {
        ((mtk) nfhVar.b).c.size();
        int i = ((mtk) nfhVar.b).a;
        cbz cbzVar = this.e;
        long o = cbzVar.d.o();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mtk mtkVar = (mtk) nfhVar.b;
        mtkVar.a |= 4;
        mtkVar.e = o;
        mtl overrideDecodedCandidates = cbzVar.a.overrideDecodedCandidates((mtk) nfhVar.cz());
        msg msgVar = ((mtk) nfhVar.b).b;
        if (msgVar == null) {
            msgVar = msg.l;
        }
        cbzVar.b.e(cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID, Long.valueOf(((mtk) nfhVar.b).e), Long.valueOf(msgVar.d));
        return overrideDecodedCandidates;
    }
}
