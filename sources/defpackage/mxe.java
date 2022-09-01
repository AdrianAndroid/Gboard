package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mxe  reason: default package */
/* loaded from: classes2.dex */
public final class mxe implements nfq {
    private final /* synthetic */ int v;
    public static final nfq u = new mxe(20);
    public static final nfq t = new mxe(19);
    public static final nfq s = new mxe(18);
    public static final nfq r = new mxe(17);
    public static final nfq q = new mxe(16);
    public static final nfq p = new mxe(15);
    public static final nfq o = new mxe(14);
    public static final nfq n = new mxe(13);
    public static final nfq m = new mxe(12);
    public static final nfq l = new mxe(11);
    public static final nfq k = new mxe(10);
    public static final nfq j = new mxe(9);
    public static final nfq i = new mxe(8);
    static final nfq h = new mxe(7);
    static final nfq g = new mxe(6);
    static final nfq f = new mxe(5);
    static final nfq e = new mxe(4);
    static final nfq d = new mxe(3);
    static final nfq c = new mxe(2);
    public static final nfq b = new mxe(1);
    static final nfq a = new mxe(0);

    private mxe(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                if (jco.t(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return jco.u(i2) != 0;
            case 2:
                return mxl.b(i2) != null;
            case 3:
                return mxo.b(i2) != null;
            case 4:
                return jco.s(i2) != 0;
            case 5:
                return mxz.b(i2) != null;
            case 6:
                return jco.r(i2) != 0;
            case 7:
                return jco.q(i2) != 0;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return niv.b(i2) != 0;
            case 10:
                return niz.a(i2) != 0;
            case 11:
                return ndb.aj(i2) != 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return njh.b(i2) != null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ndb.ah(i2) != 0;
            case 15:
                return ndb.ag(i2) != 0;
            case 16:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                        break;
                    default:
                        switch (i2) {
                            case 989:
                            case 990:
                            case 991:
                            case 992:
                            case 993:
                            case 994:
                            case 995:
                            case 996:
                            case 997:
                            case 998:
                            case 999:
                                break;
                            default:
                                return false;
                        }
                }
                return true;
            case 17:
                return ndb.af(i2) != 0;
            case 18:
                return ndb.ae(i2) != 0;
            case 19:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        return true;
                    default:
                        return false;
                }
            default:
                if (ndb.ab(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
