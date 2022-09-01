package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: evc  reason: default package */
/* loaded from: classes.dex */
public enum evc implements nfp {
    INVALID(0),
    BORDER(1),
    SW400DP(2),
    SW600DP(3),
    SW768DP(4),
    LANDSCAPE(5),
    LDPI(6),
    MDPI(7),
    HDPI(8),
    XHDPI(9),
    XXHDPI(10),
    XXXHDPI(11),
    IS_LIGHT(12),
    POPUP(14);
    
    public final int o;

    evc(int i) {
        this.o = i;
    }

    public static evc b(int i) {
        switch (i) {
            case 0:
                return INVALID;
            case 1:
                return BORDER;
            case 2:
                return SW400DP;
            case 3:
                return SW600DP;
            case 4:
                return SW768DP;
            case 5:
                return LANDSCAPE;
            case 6:
                return LDPI;
            case 7:
                return MDPI;
            case 8:
                return HDPI;
            case 9:
                return XHDPI;
            case 10:
                return XXHDPI;
            case 11:
                return XXXHDPI;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return IS_LIGHT;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            default:
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return POPUP;
        }
    }

    public static nfq c() {
        return cgs.j;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
