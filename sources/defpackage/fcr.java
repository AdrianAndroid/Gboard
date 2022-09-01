package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import j$.util.Collection$EL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: fcr  reason: default package */
/* loaded from: classes.dex */
public final class fcr implements RecognitionListener {
    public static final /* synthetic */ int c = 0;
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionListener");
    public final ffe a;
    boolean b = false;
    private final fev e;
    private final fcw f;
    private final ExecutorService g;
    private final Context h;
    private final fer i;

    public fcr(Context context, fev fevVar, ffe ffeVar, fcw fcwVar) {
        fdg a = fdg.a();
        ExecutorService a2 = fbg.a();
        this.h = context;
        this.e = fevVar;
        this.a = ffeVar;
        this.f = fcwVar;
        this.i = a;
        this.g = a2;
    }

    private static llp a(List list) {
        llp llpVar = (llp) Collection$EL.stream(list).limit(1L).filter(dzj.i).map(eoe.e).collect(ljr.a);
        b(llpVar);
        return llpVar;
    }

    private static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((bns) it.next()).b;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        fcw fcwVar = this.f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fcwVar.m.c(elapsedRealtime, few.AIAI);
        if (fcwVar.b > 0 && fcwVar.c < 0) {
            fcwVar.c = elapsedRealtime;
            fcwVar.g = fcwVar.c - fcwVar.b;
            fcwVar.l.g(fbp.AIAI_RECOGNIZER_SPEECH_START_TIME, fcwVar.g);
        }
        this.e.c();
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        this.e.a();
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        boolean z = bundle.getBoolean("final_result", false);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.isEmpty() || stringArrayList.get(0).isEmpty()) {
            return;
        }
        nfh t = bnq.b.t();
        if (!z) {
            llp llpVar = (llp) Collection$EL.stream(stringArrayList).filter(dzj.j).map(eoe.f).collect(ljr.a);
            b(llpVar);
            t.cI(llpVar);
        } else {
            t.cI(a(stringArrayList));
        }
        if (((bnq) t.b).a.size() == 0) {
            return;
        }
        this.e.i((bnq) t.cz());
        this.f.a(SystemClock.elapsedRealtime());
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        this.b = true;
        this.e.f();
        this.i.b(this.h);
        fcw fcwVar = this.f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (fcwVar.b > 0 && fcwVar.e < 0) {
            fcwVar.e = elapsedRealtime - fcwVar.b;
            fcwVar.l.g(fbp.AIAI_RECOGNIZER_READY_TIME, fcwVar.e);
        }
        this.g.execute(new fci(this, 2));
        this.e.a();
        fcw fcwVar2 = this.f;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        fcwVar2.d = elapsedRealtime2;
        fcwVar2.m.b(elapsedRealtime2, fbp.AIAI_MIC_TAP_TO_START_LISTENING_TIME);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return;
        }
        nfh t = bnq.b.t();
        t.cI(a(stringArrayList));
        if (((bnq) t.b).a.size() == 0) {
            return;
        }
        this.e.i((bnq) t.cz());
        this.f.a(SystemClock.elapsedRealtime());
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        this.e.d((int) f);
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        switch (i) {
            case 3:
                ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionListener", "logError", 173, "AiAiRecognitionListener.java")).t("Speech Recognizer Error : ERROR_AUDIO");
                break;
            case 4:
            default:
                ((ltd) ((ltd) d.c()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionListener", "logError", 192, "AiAiRecognitionListener.java")).u("Speech Recognizer Error Code : %d", i);
                break;
            case 5:
                ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionListener", "logError", 188, "AiAiRecognitionListener.java")).t("Speech Recognizer Error : ERROR_CLIENT");
                break;
            case 6:
                ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionListener", "logError", 182, "AiAiRecognitionListener.java")).t("Speech Recognizer Error : ERROR_SPEECH_TIMEOUT");
                break;
            case 7:
                ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionListener", "logError", 179, "AiAiRecognitionListener.java")).t("Speech Recognizer Error : ERROR_NO_MATCH");
                break;
            case 8:
                ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionListener", "logError", 185, "AiAiRecognitionListener.java")).t("Speech Recognizer Error : ERROR_RECOGNIZER_BUSY");
                break;
            case 9:
                ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionListener", "logError", 176, "AiAiRecognitionListener.java")).t("Speech Recognizer Error : ERROR_INSUFFICIENT_PERMISSIONS");
                break;
        }
        if (this.b) {
            int i2 = 2;
            if (i != 2 && i != 1) {
                i2 = 3;
                if (i == 3) {
                    i2 = 1;
                }
            }
            this.e.j(i2);
            return;
        }
        this.e.e();
    }
}
