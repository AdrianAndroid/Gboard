package defpackage;

import android.speech.tts.TextToSpeech;

/* compiled from: PG */
/* renamed from: dtt  reason: default package */
/* loaded from: classes.dex */
public final class dtt implements TextToSpeech.OnInitListener {
    public rj a;
    public final mko b = iq.b(new dts(this, 0));

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        if (i != 0) {
            this.a.d(new IllegalStateException(String.format("Speech initialization failed with status %s", Integer.valueOf(i))));
        } else {
            this.a.c(null);
        }
    }
}
