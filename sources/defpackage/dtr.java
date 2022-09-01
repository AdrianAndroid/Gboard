package defpackage;

import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dtr  reason: default package */
/* loaded from: classes.dex */
public final class dtr extends UtteranceProgressListener {
    final /* synthetic */ TextToSpeech a;
    final /* synthetic */ dtu b;

    public dtr(dtu dtuVar, TextToSpeech textToSpeech) {
        this.b = dtuVar;
        this.a = textToSpeech;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.a.shutdown();
        this.b.g.c(null);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        ((ltd) ((ltd) dtu.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/TextToSpeechController$1", "onError", 97, "TextToSpeechController.java")).w("Error while processing utterance: %s", str);
        ker.p(this.b.d, R.string.f158750_resource_name_obfuscated_res_0x7f140571, new Object[0]);
        this.a.shutdown();
        this.b.g.c(null);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}
