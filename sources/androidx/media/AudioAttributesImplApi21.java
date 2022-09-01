package androidx.media;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        AudioAttributes audioAttributes = this.a;
        sb.append(audioAttributes);
        return "AudioAttributesCompat: audioattributes=".concat(String.valueOf(audioAttributes));
    }
}
