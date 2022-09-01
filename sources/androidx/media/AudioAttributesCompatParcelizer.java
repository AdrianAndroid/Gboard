package androidx.media;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(akr akrVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) akrVar.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, akr akrVar) {
        akrVar.u(audioAttributesCompat.a);
    }
}
