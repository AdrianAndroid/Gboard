package androidx.media;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(akr akrVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) akrVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = akrVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, akr akrVar) {
        akrVar.i(audioAttributesImplApi26.a, 1);
        akrVar.h(audioAttributesImplApi26.b, 2);
    }
}
