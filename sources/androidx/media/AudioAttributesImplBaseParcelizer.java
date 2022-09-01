package androidx.media;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(akr akrVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = akrVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = akrVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = akrVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = akrVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, akr akrVar) {
        akrVar.h(audioAttributesImplBase.a, 1);
        akrVar.h(audioAttributesImplBase.b, 2);
        akrVar.h(audioAttributesImplBase.c, 3);
        akrVar.h(audioAttributesImplBase.d, 4);
    }
}
