package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mep  reason: default package */
/* loaded from: classes.dex */
public enum mep implements nfp {
    UNKNOWN_NODE(0),
    APP_CLASS_LOADED(1),
    APP_ON_CREATE_FINISHED(2),
    GIMS_CLASS_LOADED(3),
    GIMS_ON_CREATE(4),
    GIMS_ON_CREATE_IM_INTERFACE_FINISHED(5),
    GIMS_ON_CREATE_IM_SESSION_INTERFACE(6),
    GIMS_ON_START_INPUT_FINISHED(7),
    GIMS_ON_SHOW_INPUT_REQUEST(8),
    KEYBOARD_INTERACTIVE(9),
    M_APP_ON_CREATE(10),
    M_GIMS_ON_CREATE(11),
    M_GIMS_ON_START_INPUT(12),
    M_GIMS_ON_CRATE_INPUT_VIEW(13),
    M_GIMS_ON_START_INPUT_VIEW(14);
    
    public final int p;

    mep(int i) {
        this.p = i;
    }

    public static mep b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_NODE;
            case 1:
                return APP_CLASS_LOADED;
            case 2:
                return APP_ON_CREATE_FINISHED;
            case 3:
                return GIMS_CLASS_LOADED;
            case 4:
                return GIMS_ON_CREATE;
            case 5:
                return GIMS_ON_CREATE_IM_INTERFACE_FINISHED;
            case 6:
                return GIMS_ON_CREATE_IM_SESSION_INTERFACE;
            case 7:
                return GIMS_ON_START_INPUT_FINISHED;
            case 8:
                return GIMS_ON_SHOW_INPUT_REQUEST;
            case 9:
                return KEYBOARD_INTERACTIVE;
            case 10:
                return M_APP_ON_CREATE;
            case 11:
                return M_GIMS_ON_CREATE;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return M_GIMS_ON_START_INPUT;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return M_GIMS_ON_CRATE_INPUT_VIEW;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return M_GIMS_ON_START_INPUT_VIEW;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mdw.j;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
