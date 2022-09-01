package androidx.media;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(akr akrVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) akrVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = akrVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, akr akrVar) {
        akrVar.i(audioAttributesImplApi21.a, 1);
        akrVar.h(audioAttributesImplApi21.b, 2);
    }
}
