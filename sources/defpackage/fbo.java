package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fbo  reason: default package */
/* loaded from: classes.dex */
public final class fbo implements fex {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeRecognizer");

    @Override // defpackage.fex
    public final few a() {
        return few.VOICE_IME;
    }

    @Override // defpackage.fex
    public final void b() {
    }

    @Override // defpackage.fex
    public final void c(fff fffVar) {
    }

    @Override // defpackage.fex
    public final void d() {
    }

    @Override // defpackage.fex
    public final void e(ffd ffdVar, fcp fcpVar, fev fevVar, boolean z) {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeRecognizer", "startRecognition", 41, "VoiceImeRecognizer.java")).t("startRecognition()");
        if (!fcpVar.d() || !fcpVar.f()) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeRecognizer", "startRecognition", 43, "VoiceImeRecognizer.java")).w("startRecognition(): Cannot run with %s", fcpVar);
            return;
        }
        hsk b = hsx.b();
        if (b instanceof Context) {
            if (jck.a((Context) b)) {
                return;
            }
            ((ltd) ((ltd) ltgVar.c()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeRecognizer", "startRecognition", 50, "VoiceImeRecognizer.java")).t("Failed to launch Voice IME.");
            fevVar.e();
            return;
        }
        ((ltd) ((ltd) ltgVar.c()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeRecognizer", "startRecognition", 54, "VoiceImeRecognizer.java")).t("InputMethodService not an instance of Context.");
    }
}
