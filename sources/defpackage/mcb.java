package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mcb  reason: default package */
/* loaded from: classes.dex */
public enum mcb implements nfp {
    KEYBOARD_IMAGE_INSERT_RESULT_UNKNOWN(0),
    KEYBOARD_IMAGE_INSERT_RESULT_FAILURE(1),
    KEYBOARD_IMAGE_INSERT_RESULT_SUCCESS_ORIGINAL(2),
    KEYBOARD_IMAGE_INSERT_RESULT_SUCCESS_FALLBACK(3),
    KEYBOARD_IMAGE_INSERT_RESULT_SUCCESS_INTENT(4),
    KEYBOARD_IMAGE_INSERT_RESULT_DISABLED(5),
    KEYBOARD_IMAGE_INSERT_RESULT_FAILURE_UNSHAREABLE(6),
    KEYBOARD_IMAGE_INSERT_RESULT_INVALID_STATE(7),
    KEYBOARD_IMAGE_INSERT_RESULT_EXCEPTION(8),
    KEYBOARD_IMAGE_INSERT_RESULT_NO_BEST_MIMETYPE_AND_URI(9),
    KEYBOARD_IMAGE_INSERT_RESULT_COMMIT_CONTENT_TO_APP_FAILED(10),
    KEYBOARD_IMAGE_INSERT_RESULT_SHARE_INTENT_FAILED(11),
    KEYBOARD_IMAGE_INSERT_RESULT_INPUT_SERVICE_IS_NULL(12),
    KEYBOARD_IMAGE_INSERT_RESULT_EDITOR_INFO_CHANGED(13);
    
    public final int o;

    mcb(int i) {
        this.o = i;
    }

    public static mcb b(int i) {
        switch (i) {
            case 0:
                return KEYBOARD_IMAGE_INSERT_RESULT_UNKNOWN;
            case 1:
                return KEYBOARD_IMAGE_INSERT_RESULT_FAILURE;
            case 2:
                return KEYBOARD_IMAGE_INSERT_RESULT_SUCCESS_ORIGINAL;
            case 3:
                return KEYBOARD_IMAGE_INSERT_RESULT_SUCCESS_FALLBACK;
            case 4:
                return KEYBOARD_IMAGE_INSERT_RESULT_SUCCESS_INTENT;
            case 5:
                return KEYBOARD_IMAGE_INSERT_RESULT_DISABLED;
            case 6:
                return KEYBOARD_IMAGE_INSERT_RESULT_FAILURE_UNSHAREABLE;
            case 7:
                return KEYBOARD_IMAGE_INSERT_RESULT_INVALID_STATE;
            case 8:
                return KEYBOARD_IMAGE_INSERT_RESULT_EXCEPTION;
            case 9:
                return KEYBOARD_IMAGE_INSERT_RESULT_NO_BEST_MIMETYPE_AND_URI;
            case 10:
                return KEYBOARD_IMAGE_INSERT_RESULT_COMMIT_CONTENT_TO_APP_FAILED;
            case 11:
                return KEYBOARD_IMAGE_INSERT_RESULT_SHARE_INTENT_FAILED;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return KEYBOARD_IMAGE_INSERT_RESULT_INPUT_SERVICE_IS_NULL;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return KEYBOARD_IMAGE_INSERT_RESULT_EDITOR_INFO_CHANGED;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mbm.n;
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
