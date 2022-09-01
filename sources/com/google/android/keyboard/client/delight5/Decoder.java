package com.google.android.keyboard.client.delight5;

import android.content.Context;
import android.util.Base64;
import android.util.Printer;
import j$.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Decoder implements gzv {
    public static final String TAG = "Delight5Decoder";
    private static final lug logger = lug.i(TAG);
    final AtomicBoolean hasNativeDecoder;
    final AtomicBoolean hasRuntimeParams;
    private mql latestDecoderExperimentParams;
    private mro latestKeyboardDecoderParams;
    private mvi latestKeyboardRuntimeParams;
    private final idk metrics;
    private final iov protoUtils;

    public Decoder(Context context) {
        this(context, new iov());
    }

    private static native byte[] abortComposingNative(byte[] bArr);

    private static native long addEngineNative(byte[] bArr);

    private static native void beginSessionNative(byte[] bArr);

    private static native byte[] checkSpellingNative(byte[] bArr);

    private static native long createOrResetDecoderNative(byte[] bArr);

    private static native void declareLandscapeNative();

    private static native void declarePortraitNative();

    private static native byte[] decodeForHandwritingNative(byte[] bArr);

    private static native byte[] decodeNative(byte[] bArr);

    private static native byte[] decompressFstLanguageModelNative(byte[] bArr);

    private static void dump(Printer printer, String str, ngz ngzVar) {
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = str;
        if (ngzVar != null) {
            i = ngzVar.s();
        }
        objArr[1] = Integer.valueOf(i);
        gzu.a(printer, "[%s][SerializedSize : %d]", objArr);
        if (ngzVar != null) {
            printer.println(lyk.d.i(ngzVar.q()));
        }
    }

    private static native byte[] finishComposingNative(byte[] bArr);

    private static native byte[] finishSessionNative(byte[] bArr);

    private static native boolean flushPersonalizedDataToDiskNative(long j);

    private static native byte[] getAllPendingMetricsNative();

    private static native byte[] getBlocklistedWordsNative();

    private static native byte[] getDebugStateNative();

    private static native byte[] getDumpNative(boolean z);

    private static native byte[] getInputContextNative(byte[] bArr);

    private static native byte[] getKeyboardLayoutNative();

    private static native byte[] getLanguageModelsContainingTermsNative(byte[] bArr);

    private static native long getLmContentVersionNative(byte[] bArr);

    private static native byte[] getMetricsByClientIdNative(long j);

    private static native byte[] getMetricsInfoBlockingNative();

    private static native byte[] getSpatialModelVersionNative();

    private static native byte[] getTrainingContextNative();

    public static void incrementBooleanHistogram(String str, boolean z) {
        ieh.j().e(cap.CLEARCUT_BOOL_HISTOGRAM, str, Boolean.valueOf(z));
    }

    public static void incrementCounter(String str) {
        ieh.j().e(cap.CLEARCUT_COUNTER, str);
    }

    public static void incrementIntegerHistogram(String str, int i) {
        ieh.j().e(cap.CLEARCUT_INT_HISTOGRAM, str, Integer.valueOf(i));
    }

    public static void incrementLongHistogram(String str, long j) {
        ieh.j().e(cap.CLEARCUT_LONG_HISTOGRAM, str, Long.valueOf(j));
    }

    private static native boolean isLanguageModelCompatibleNative(byte[] bArr);

    private static native boolean loadEmojiShortcutMapNative(byte[] bArr);

    private static native boolean loadLanguageModelNative(byte[] bArr);

    private static native boolean loadShortcutMapNative(byte[] bArr);

    private static native byte[] onKeyPressNative(byte[] bArr);

    private static native byte[] onScrubDeleteNative(byte[] bArr);

    private static native byte[] onSuggestionPressNative(byte[] bArr);

    private static native byte[] onVoiceTranscriptionNative(byte[] bArr);

    private static native byte[] overrideDecodedCandidatesNative(byte[] bArr);

    private static native byte[] parseInputContextNative(byte[] bArr);

    private static native byte[] performKeyCorrectionNative(byte[] bArr);

    private static native void preemptiveDecodeNative(byte[] bArr);

    private static native byte[] reDecodeNative();

    private static native byte[] recapitalizeSelectionNative(byte[] bArr);

    private static native long removeEngineNative(byte[] bArr);

    private static native byte[] replaceTextNative(byte[] bArr);

    private static native void setDecoderExperimentParamsNative(byte[] bArr);

    private static native long setDispatcherRuntimeParamsNative(byte[] bArr);

    private static native long setEngineRuntimeParamsNative(byte[] bArr);

    private static native void setKeyboardLayoutNative(byte[] bArr);

    private static native long setRankerNative(byte[] bArr);

    private static native void setRuntimeParamsNative(byte[] bArr);

    private static mro trimParamsForDump(mro mroVar) {
        nfh nfhVar = (nfh) mroVar.N(5);
        nfhVar.cG(mroVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mro mroVar2 = mro.l;
        ((mro) nfhVar.b).b = mro.G();
        for (int i = 0; i < mroVar.b.size(); i++) {
            muv muvVar = (muv) mroVar.b.get(i);
            nfh nfhVar2 = (nfh) muvVar.N(5);
            nfhVar2.cG(muvVar);
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            muv muvVar2 = (muv) nfhVar2.b;
            muv muvVar3 = muv.x;
            muvVar2.q = null;
            muvVar2.a &= -16385;
            muv muvVar4 = (muv) nfhVar2.cz();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mro mroVar3 = (mro) nfhVar.b;
            muvVar4.getClass();
            mroVar3.b();
            mroVar3.b.add(muvVar4);
        }
        return (mro) nfhVar.cz();
    }

    private static native boolean tryInitializeNative(long j);

    private static native void unloadLanguageModelNative(byte[] bArr);

    public mrq abortComposing(mrp mrpVar) {
        if (!isReadyForLiteral()) {
            return mrq.c;
        }
        byte[] b = this.protoUtils.b(mrpVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "abortComposing", 964, "Decoder.java")).t("abortComposing() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_ABORT_COMPOSING);
            return mrq.c;
        }
        mrq mrqVar = (mrq) this.protoUtils.a((nhf) mrq.c.N(7), abortComposingNative(b));
        return mrqVar == null ? mrq.c : mrqVar;
    }

    public void addEngine(mqa mqaVar) {
        addEngineNative(mqaVar.q());
    }

    public void beginSession(mrr mrrVar) {
        beginSessionNative(mrrVar.q());
    }

    public mrv checkSpelling(mrt mrtVar) {
        mrv mrvVar;
        mrv mrvVar2 = mrv.c;
        if (!isReadyForLiteral()) {
            return mrvVar2;
        }
        byte[] b = this.protoUtils.b(mrtVar.cz());
        if (b != null) {
            try {
                mrvVar = (mrv) nfm.z(mrv.c, checkSpellingNative(b), nfb.b());
            } catch (ngd e) {
                ((luc) ((luc) ((luc) logger.d()).i(e)).k("com/google/android/keyboard/client/delight5/Decoder", "checkSpelling", (char) 639, "Decoder.java")).t("Failed to deserialize proto");
                mrvVar = null;
            }
            return mrvVar == null ? mrvVar2 : mrvVar;
        }
        ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "checkSpelling", 626, "Decoder.java")).t("checkSpelling() : Failed to serialize proto");
        this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_CHECK_SPELLING);
        return mrvVar2;
    }

    public boolean createOrResetDecoder(mta mtaVar) {
        this.hasRuntimeParams.set(false);
        this.hasNativeDecoder.set(false);
        byte[] b = this.protoUtils.b(mtaVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "createOrResetDecoder", 316, "Decoder.java")).t("createOrResetDecoder() : Failed to serialize proto");
            return false;
        }
        createOrResetDecoderNative(b);
        this.hasNativeDecoder.set(true);
        mro mroVar = mtaVar.b;
        if (mroVar == null) {
            mroVar = mro.l;
        }
        this.latestKeyboardDecoderParams = trimParamsForDump(mroVar);
        this.metrics.e(iwc.KEYBOARD_DECODER_PARAMS, this.latestKeyboardDecoderParams);
        return true;
    }

    public void declareLandscape() {
        declareLandscapeNative();
    }

    public void declarePortrait() {
        declarePortraitNative();
    }

    public mtc decode(mtb mtbVar) {
        mtc mtcVar = mtc.e;
        if (!isReadyForTouch()) {
            return mtcVar;
        }
        byte[] b = this.protoUtils.b(mtbVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "decode", 695, "Decoder.java")).t("decode() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_DECODE_TOUCH);
            return mtcVar;
        }
        mtc mtcVar2 = (mtc) this.protoUtils.a((nhf) mtc.e.N(7), decodeNative(b));
        return mtcVar2 == null ? mtc.e : mtcVar2;
    }

    public msd decodeForHandwriting(mrz mrzVar) {
        if (!isReadyForLiteral()) {
            nfh t = msd.f.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            msd msdVar = (msd) t.b;
            msdVar.b = 3;
            msdVar.a |= 1;
            return (msd) t.cz();
        }
        byte[] b = this.protoUtils.b(mrzVar.cz());
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "decodeForHandwriting", 656, "Decoder.java")).t("decodeForHandwriting() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_DECODE_FOR_HANDWRITING);
            nfh t2 = msd.f.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            msd msdVar2 = (msd) t2.b;
            msdVar2.b = 4;
            msdVar2.a |= 1;
            return (msd) t2.cz();
        }
        try {
            return (msd) nfm.z(msd.f, decodeForHandwritingNative(b), nfb.b());
        } catch (ngd e) {
            ((luc) ((luc) ((luc) logger.d()).i(e)).k("com/google/android/keyboard/client/delight5/Decoder", "decodeForHandwriting", (char) 669, "Decoder.java")).t("Failed to deserialize proto");
            nfh t3 = msd.f.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            msd msdVar3 = (msd) t3.b;
            msdVar3.b = 4;
            msdVar3.a |= 1;
            return (msd) t3.cz();
        }
    }

    public msn decompressFstLanguageModel(mvn mvnVar) {
        msn msnVar;
        msn msnVar2 = msn.b;
        byte[] b = this.protoUtils.b(mvnVar);
        if (b != null) {
            try {
                msnVar = (msn) nfm.z(msn.b, decompressFstLanguageModelNative(b), nfb.b());
            } catch (ngd e) {
                ((luc) ((luc) ((luc) logger.d()).i(e)).k("com/google/android/keyboard/client/delight5/Decoder", "decompressFstLanguageModel", (char) 481, "Decoder.java")).t("Failed to deserialize proto");
                msnVar = null;
            }
            return msnVar == null ? msn.b : msnVar;
        }
        ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "decompressFstLanguageModel", 468, "Decoder.java")).t("decompressFstLanguageModel() : Failed to serialize proto");
        this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_DECOMPRESS_FST_LANGUAGE_MODEL);
        return msnVar2;
    }

    public msl finishComposing(msk mskVar) {
        byte[] b = this.protoUtils.b(mskVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "finishComposing", 980, "Decoder.java")).t("finishComposing() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_FINISH_COMPOSING);
            return msl.a;
        }
        msl mslVar = (msl) this.protoUtils.a((nhf) msl.a.N(7), finishComposingNative(b));
        return mslVar == null ? msl.a : mslVar;
    }

    public mvd finishSession(msm msmVar) {
        byte[] b = this.protoUtils.b(msmVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "finishSession", 1036, "Decoder.java")).t("finishSession() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_FINISH_SESSION);
            return mvd.b;
        }
        byte[] finishSessionNative = finishSessionNative(b);
        if (finishSessionNative.length == 0) {
            return mvd.b;
        }
        mvd mvdVar = (mvd) this.protoUtils.a((nhf) mvd.b.N(7), finishSessionNative);
        return mvdVar == null ? mvd.b : mvdVar;
    }

    public boolean flushPersonalizedDataToDisk(long j) {
        if (!this.hasNativeDecoder.get()) {
            return false;
        }
        return flushPersonalizedDataToDiskNative(j);
    }

    public mvd getAllPendingMetrics() {
        mvd mvdVar = (mvd) this.protoUtils.a((nhf) mvd.b.N(7), getAllPendingMetricsNative());
        return mvdVar == null ? mvd.b : mvdVar;
    }

    public mso getBlocklistedWords() {
        mso msoVar = mso.a;
        mso msoVar2 = (mso) this.protoUtils.a((nhf) msoVar.N(7), getBlocklistedWordsNative());
        return msoVar2 == null ? msoVar : msoVar2;
    }

    public msp getDebugState() {
        msp mspVar = (msp) this.protoUtils.a((nhf) msp.a.N(7), getDebugStateNative());
        return mspVar == null ? msp.a : mspVar;
    }

    @Override // defpackage.gzv
    public String getDumpableTag() {
        return TAG;
    }

    public msr getInputContext(msq msqVar) {
        if (!isReadyForLiteral()) {
            return msr.c;
        }
        byte[] b = this.protoUtils.b(msqVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "getInputContext", 1000, "Decoder.java")).t("getInputContext() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_GET_INPUT_CONTEXT);
            return msr.c;
        }
        msr msrVar = (msr) this.protoUtils.a((nhf) msr.c.N(7), getInputContextNative(b));
        return msrVar == null ? msr.c : msrVar;
    }

    public byte[] getKeyboardLayout() {
        if (!this.hasNativeDecoder.get()) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "getKeyboardLayout", 366, "Decoder.java")).t("getKeyboardLayout() : Native lib is not ready.");
            return null;
        }
        return getKeyboardLayoutNative();
    }

    public mst getLanguageModelsContainingTerms(mss mssVar) {
        if (!isReadyForTouch()) {
            return mst.a;
        }
        byte[] b = this.protoUtils.b(mssVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "getLanguageModelsContainingTerms", 939, "Decoder.java")).t("getLanguageModelsContainingTerms() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_GET_LANGUAGE_MODEL_CONTAINING_TERMS);
            return mst.a;
        }
        mst mstVar = (mst) this.protoUtils.a((nhf) mst.a.N(7), getLanguageModelsContainingTermsNative(b));
        return mstVar == null ? mst.a : mstVar;
    }

    public long getLmContentVersion(mvn mvnVar) {
        byte[] b = this.protoUtils.b(mvnVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "getLmContentVersion", 447, "Decoder.java")).t("getLmContentVersion() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_GET_LM_CONTENT_VERSION);
            return -1L;
        }
        return getLmContentVersionNative(b);
    }

    public mve getMetricsByClientId(long j) {
        mve mveVar = (mve) this.protoUtils.a((nhf) mve.g.N(7), getMetricsByClientIdNative(j));
        return mveVar == null ? mve.g : mveVar;
    }

    public mve getMetricsInfoBlocking() {
        return (mve) this.protoUtils.a((nhf) mve.g.N(7), getMetricsInfoBlockingNative());
    }

    public String getSpatialModelVersion() {
        try {
            return new String(getSpatialModelVersionNative(), StandardCharsets.UTF_8);
        } catch (RuntimeException unused) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "getSpatialModelVersion", 1089, "Decoder.java")).t("Failed to get spatial model version.");
            return "";
        }
    }

    public mud getTrainingContext() {
        mud mudVar;
        mud mudVar2 = mud.b;
        return (isReadyForLiteral() && (mudVar = (mud) this.protoUtils.a((nhf) mud.b.N(7), getTrainingContextNative())) != null) ? mudVar : mudVar2;
    }

    public boolean isLanguageModelCompatible(mvn mvnVar) {
        byte[] b = this.protoUtils.b(mvnVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "isLanguageModelCompatible", 538, "Decoder.java")).t("isLanguageModelCompatible() : Failed to serialize proto");
            return false;
        }
        return isLanguageModelCompatibleNative(b);
    }

    public boolean isReadyForLiteral() {
        return this.hasNativeDecoder.get();
    }

    public boolean isReadyForTouch() {
        return this.hasNativeDecoder.get();
    }

    public boolean loadEmojiShortcutMap(mtw mtwVar) {
        if (!this.hasNativeDecoder.get()) {
            return false;
        }
        byte[] b = this.protoUtils.b(mtwVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "loadEmojiShortcutMap", 520, "Decoder.java")).t("loadEmojiShortcutMap() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_LOAD_EMOJI_SHORTCUT_MAP);
            return false;
        }
        return loadEmojiShortcutMapNative(b);
    }

    public boolean loadLanguageModel(mvn mvnVar) {
        if (!this.hasNativeDecoder.get()) {
            return false;
        }
        byte[] b = this.protoUtils.b(mvnVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "loadLanguageModel", 562, "Decoder.java")).t("loadLanguageModel() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_LOAD_LANGUAGE_MODEL);
            return false;
        }
        return loadLanguageModelNative(b);
    }

    public boolean loadShortcutMap(mtx mtxVar) {
        if (!this.hasNativeDecoder.get()) {
            return false;
        }
        byte[] b = this.protoUtils.b(mtxVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "loadShortcutMap", 498, "Decoder.java")).t("loadShortcutMap() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_LOAD_SHORTCUT_MAP);
            return false;
        }
        return loadShortcutMapNative(b);
    }

    public msz onKeyPress(msy msyVar) {
        if (!isReadyForTouch()) {
            return msz.e;
        }
        byte[] b = this.protoUtils.b(msyVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "onKeyPress", 774, "Decoder.java")).t("onKeyPress() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_DECODE_TOUCH);
            return msz.e;
        }
        msz mszVar = (msz) this.protoUtils.a((nhf) msz.e.N(7), onKeyPressNative(b));
        return mszVar == null ? msz.e : mszVar;
    }

    public mtu onScrubDelete(mtt mttVar) {
        mtu mtuVar = mtu.e;
        if (!isReadyForTouch()) {
            return mtuVar;
        }
        try {
            byte[] b = this.protoUtils.b(mttVar);
            if (b == null) {
                ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "onScrubDelete", 829, "Decoder.java")).t("onScrubDelete() : Failed to serialize proto");
                this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_SCRUB_DELETE_START);
                return mtuVar;
            }
            try {
                mtu mtuVar2 = (mtu) this.protoUtils.a((nhf) mtu.e.N(7), onScrubDeleteNative(b));
                return mtuVar2 == null ? mtuVar : mtuVar2;
            } catch (IllegalArgumentException unused) {
                nfh t = mtu.e.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mtu.b((mtu) t.b);
                return (mtu) t.cz();
            }
        } catch (IllegalArgumentException unused2) {
            nfh t2 = mtu.e.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mtu.b((mtu) t2.b);
            return (mtu) t2.cz();
        }
    }

    public mua onSuggestionPress(mtz mtzVar) {
        if (!isReadyForTouch()) {
            return mua.e;
        }
        byte[] b = this.protoUtils.b(mtzVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "onSuggestionPress", 864, "Decoder.java")).t("onSuggestionPress() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_FETCH_SUGGESTIONS);
            return mua.e;
        }
        mua muaVar = (mua) this.protoUtils.a((nhf) mua.e.N(7), onSuggestionPressNative(b));
        return muaVar == null ? mua.e : muaVar;
    }

    public muh onVoiceTranscription(mug mugVar) {
        if (!isReadyForTouch()) {
            return muh.e;
        }
        byte[] b = this.protoUtils.b(mugVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "onVoiceTranscription", 888, "Decoder.java")).t("onVoiceTranscription() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_PROCESS_VOICE_TRANSCRIPTION);
            return muh.e;
        }
        muh muhVar = (muh) this.protoUtils.a((nhf) muh.e.N(7), onVoiceTranscriptionNative(b));
        return muhVar == null ? muh.e : muhVar;
    }

    public mtl overrideDecodedCandidates(mtk mtkVar) {
        if (!isReadyForLiteral()) {
            return mtl.b;
        }
        byte[] b = this.protoUtils.b(mtkVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "overrideDecodedCandidates", 1064, "Decoder.java")).t("overrideDecodedCandidates() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_OVERRIDE_DECODED_CANDIDATES);
            return mtl.b;
        }
        mtl mtlVar = (mtl) this.protoUtils.a((nhf) mtl.b.N(7), overrideDecodedCandidatesNative(b));
        return mtlVar == null ? mtl.b : mtlVar;
    }

    public mtn parseInputContext(mtm mtmVar) {
        mtn mtnVar = mtn.g;
        if (!this.hasNativeDecoder.get()) {
            return mtnVar;
        }
        byte[] b = this.protoUtils.b(mtmVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "parseInputContext", 912, "Decoder.java")).t("parseInputContext() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_PARSE_INPUT_CONTEXT);
            return mtnVar;
        }
        mtn mtnVar2 = (mtn) this.protoUtils.a((nhf) mtn.g.N(7), parseInputContextNative(b));
        return mtnVar2 == null ? mtnVar : mtnVar2;
    }

    public msx performKeyCorrection(msw mswVar) {
        msx msxVar = msx.f;
        if (!isReadyForTouch()) {
            return msxVar;
        }
        byte[] b = this.protoUtils.b(mswVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "performKeyCorrection", 1132, "Decoder.java")).t("performKeyCorrection(): Failed to serialize proto.");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_PERFORM_KEY_CORRECTION);
            return msxVar;
        }
        msx msxVar2 = (msx) this.protoUtils.a((nhf) msx.f.N(7), performKeyCorrectionNative(b));
        return msxVar2 == null ? msx.f : msxVar2;
    }

    public void preemptiveDecode(mtb mtbVar) {
        byte[] b;
        if (isReadyForTouch() && (b = this.protoUtils.b(mtbVar)) != null) {
            preemptiveDecodeNative(b);
        }
    }

    public mqo reDecode() {
        nfh nfhVar;
        String obj;
        mqo mqoVar = (mqo) this.protoUtils.a((nhf) mqo.g.N(7), reDecodeNative());
        if (mqoVar == null) {
            nfhVar = mqo.g.t();
        } else {
            nfh nfhVar2 = (nfh) mqoVar.N(5);
            nfhVar2.cG(mqoVar);
            nfhVar = nfhVar2;
        }
        Collection<hhl> m = hhq.m();
        nfh t = mqq.b.t();
        for (hhl hhlVar : m) {
            Object c = hhlVar.c();
            if (c != null) {
                if (c instanceof byte[]) {
                    obj = Base64.encodeToString((byte[]) c, 0);
                } else {
                    obj = c.toString();
                }
                nfh t2 = mqp.d.t();
                String d = hhlVar.d();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mqp mqpVar = (mqp) t2.b;
                d.getClass();
                int i = mqpVar.a | 1;
                mqpVar.a = i;
                mqpVar.b = d;
                obj.getClass();
                mqpVar.a = i | 2;
                mqpVar.c = obj;
                mqp mqpVar2 = (mqp) t2.cz();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mqq mqqVar = (mqq) t.b;
                mqpVar2.getClass();
                nga ngaVar = mqqVar.a;
                if (!ngaVar.c()) {
                    mqqVar.a = nfm.H(ngaVar);
                }
                mqqVar.a.add(mqpVar2);
            }
        }
        mvi mviVar = this.latestKeyboardRuntimeParams;
        if (mviVar != null) {
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mqo mqoVar2 = (mqo) nfhVar.b;
            mqoVar2.b = mviVar;
            mqoVar2.a |= 1;
        }
        mro mroVar = this.latestKeyboardDecoderParams;
        if (mroVar != null) {
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mqo mqoVar3 = (mqo) nfhVar.b;
            mqoVar3.c = mroVar;
            mqoVar3.a |= 4;
        }
        mql mqlVar = this.latestDecoderExperimentParams;
        if (mqlVar != null) {
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mqo mqoVar4 = (mqo) nfhVar.b;
            mqoVar4.d = mqlVar;
            mqoVar4.a |= 8;
        }
        mqq mqqVar2 = (mqq) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mqo mqoVar5 = (mqo) nfhVar.b;
        mqqVar2.getClass();
        mqoVar5.f = mqqVar2;
        mqoVar5.a |= 512;
        return (mqo) nfhVar.cz();
    }

    public mtq recapitalizeSelection(mtp mtpVar) {
        mtq mtqVar = mtq.e;
        if (!isReadyForTouch()) {
            return mtqVar;
        }
        byte[] b = this.protoUtils.b(mtpVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "recapitalizeSelection", 797, "Decoder.java")).t("recapitalizeSelection() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_RECAPITALIZE_SELECTION);
            return mtqVar;
        }
        mtq mtqVar2 = (mtq) this.protoUtils.a((nhf) mtq.e.N(7), recapitalizeSelectionNative(b));
        return mtqVar2 == null ? mtqVar : mtqVar2;
    }

    public void removeEngine(mqa mqaVar) {
        removeEngineNative(mqaVar.q());
    }

    public mts replaceText(mtr mtrVar) {
        mts mtsVar = mts.f;
        if (!isReadyForTouch()) {
            return mtsVar;
        }
        byte[] b = this.protoUtils.b(mtrVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "replaceText", 1154, "Decoder.java")).t("performKeyCorrection(): Failed to serialize proto.");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_REPLACE_TEXT);
            return mtsVar;
        }
        mts mtsVar2 = (mts) this.protoUtils.a((nhf) mts.f.N(7), replaceTextNative(b));
        return mtsVar2 == null ? mts.f : mtsVar2;
    }

    public boolean setDecoderExperimentParams(mqm mqmVar) {
        if (!this.hasNativeDecoder.get()) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "setDecoderExperimentParams", 403, "Decoder.java")).t("setDecoderExperimentParams() : Native lib is not ready.");
            return false;
        }
        byte[] b = this.protoUtils.b(mqmVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "setDecoderExperimentParams", 409, "Decoder.java")).t("setDecoderExperimentParams() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_SET_DECODER_EXPERIMENT_PARAMS);
            return false;
        }
        setDecoderExperimentParamsNative(b);
        mql mqlVar = mqmVar.b;
        if (mqlVar == null) {
            mqlVar = mql.cN;
        }
        this.latestDecoderExperimentParams = mqlVar;
        this.metrics.e(iwc.DECODER_EXPERIMENT_PARAMS, this.latestDecoderExperimentParams);
        return true;
    }

    public void setDispatcherRuntimeParams(mpz mpzVar) {
        setDispatcherRuntimeParamsNative(mpzVar.q());
    }

    public void setEngineRuntimeParams(mqb mqbVar) {
        setEngineRuntimeParamsNative(mqbVar.q());
    }

    public boolean setKeyboardLayout(mrn mrnVar) {
        if (!this.hasNativeDecoder.get()) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "setKeyboardLayout", 346, "Decoder.java")).t("setKeyboardLayout() : Native lib is not ready.");
            return false;
        }
        byte[] b = this.protoUtils.b(mrnVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "setKeyboardLayout", 352, "Decoder.java")).t("setKeyboardLayout() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_SET_KEYBOARD_LAYOUT);
            return false;
        }
        setKeyboardLayoutNative(b);
        return true;
    }

    public void setRanker(mqg mqgVar) {
        setRankerNative(mqgVar.q());
    }

    public boolean setRuntimeParams(mvj mvjVar) {
        if (!this.hasNativeDecoder.get()) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "setRuntimeParams", 379, "Decoder.java")).t("setRuntimeParams() : Native lib is not ready.");
            return false;
        }
        byte[] b = this.protoUtils.b(mvjVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "setRuntimeParams", 385, "Decoder.java")).t("setRuntimeParams() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_SET_RUNTIME_PARAMS);
            return false;
        }
        setRuntimeParamsNative(b);
        this.hasRuntimeParams.set(true);
        mvi mviVar = mvjVar.b;
        if (mviVar == null) {
            mviVar = mvi.K;
        }
        this.latestKeyboardRuntimeParams = mviVar;
        this.metrics.e(iwc.KEYBOARD_RUNTIME_PARAMS, this.latestKeyboardRuntimeParams);
        return true;
    }

    public boolean tryInitialize(long j) {
        if (!this.hasNativeDecoder.get()) {
            return false;
        }
        return tryInitializeNative(j);
    }

    public boolean unloadLanguageModel(mvn mvnVar) {
        if (!this.hasNativeDecoder.get()) {
            return false;
        }
        byte[] b = this.protoUtils.b(mvnVar);
        if (b == null) {
            ((luc) ((luc) logger.d()).k("com/google/android/keyboard/client/delight5/Decoder", "unloadLanguageModel", 585, "Decoder.java")).t("unloadLanguageModel() : Failed to serialize proto");
            this.metrics.e(cap.CLIENT_NATIVE_COMMUNICATION_ERROR, msf.OPERATION_UNLOAD_LANGUAGE_MODEL);
            return false;
        }
        unloadLanguageModelNative(b);
        return true;
    }

    public Decoder(Context context, iov iovVar) {
        this.hasNativeDecoder = new AtomicBoolean(false);
        this.hasRuntimeParams = new AtomicBoolean(false);
        this.metrics = ieh.j();
        this.protoUtils = iovVar;
        JniUtil.loadLibrary(cbd.c.b(context).getAbsolutePath());
        gzt.a.a(this);
    }

    @Override // defpackage.gzv
    public void dump(Printer printer, boolean z) {
        printer.println(new String(getDumpNative(z), StandardCharsets.UTF_8));
        dump(printer, "KeyboardDecoderParams", this.latestKeyboardDecoderParams);
        dump(printer, "KeyboardRuntimeParams", this.latestKeyboardRuntimeParams);
        dump(printer, "DecoderExperimentParams", this.latestDecoderExperimentParams);
    }
}
