package androidx.media;

import android.util.SparseIntArray;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesCompat implements aks {
    private static final SparseIntArray b;
    public AudioAttributesImpl a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, int i2) {
        if ((i & 1) == 1) {
            return 7;
        }
        if ((i & 4) == 4) {
            return 6;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                return 3;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.a);
        }
        return audioAttributesCompat.a == null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
