package defpackage;

import android.content.Context;
import android.content.Intent;
import android.speech.SpeechRecognizer;

/* compiled from: PG */
/* renamed from: fcu  reason: default package */
/* loaded from: classes.dex */
public final class fcu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionRunner");
    public final SpeechRecognizer b;
    public final Intent c;
    public final fez d;
    public final fcr e;

    public fcu(Context context, jav javVar, fev fevVar, ffe ffeVar, fcw fcwVar, boolean z) {
        SpeechRecognizer speechRecognizer = null;
        if (!SpeechRecognizer.isOnDeviceRecognitionAvailable(context)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionRunner", "createSpeechRecognizer", 158, "AiAiRecognitionRunner.java")).t("AiAi onDeviceSpeechRecognizer not available.");
        } else {
            SpeechRecognizer createOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(context);
            if (createOnDeviceSpeechRecognizer == null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionRunner", "createSpeechRecognizer", 164, "AiAiRecognitionRunner.java")).t("failed to create AiAiSpeechRecognizer.");
            } else {
                speechRecognizer = createOnDeviceSpeechRecognizer;
            }
        }
        this.b = speechRecognizer;
        fez fezVar = new fez(gxo.c(5), new fci(fevVar, 3), ((Long) ffa.h.c()).longValue());
        this.d = fezVar;
        fcr fcrVar = new fcr(context, new fct(fevVar, fezVar), ffeVar, fcwVar);
        this.e = fcrVar;
        if (speechRecognizer != null) {
            speechRecognizer.setRecognitionListener(fcrVar);
        }
        this.c = new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("calling_package", context.getPackageName()).putExtra("android.speech.extra.LANGUAGE", javVar.n).putExtra("android.speech.extra.PARTIAL_RESULTS", true).putExtra("com.google.recognition.extra.MASK_OFFENSIVE_WORDS", z).putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        SpeechRecognizer speechRecognizer = this.b;
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
        }
    }
}
