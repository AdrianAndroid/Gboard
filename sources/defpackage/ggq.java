package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ggq  reason: default package */
/* loaded from: classes.dex */
public final class ggq implements nfq {
    private final /* synthetic */ int v;
    public static final nfq u = new ggq(20);
    public static final nfq t = new ggq(19);
    public static final nfq s = new ggq(18);
    public static final nfq r = new ggq(17);
    public static final nfq q = new ggq(16);
    public static final nfq p = new ggq(15);
    public static final nfq o = new ggq(14);
    public static final nfq n = new ggq(13);
    public static final nfq m = new ggq(12);
    static final nfq l = new ggq(11);
    static final nfq k = new ggq(10);
    static final nfq j = new ggq(9);
    static final nfq i = new ggq(8);
    static final nfq h = new ggq(7);
    static final nfq g = new ggq(6);
    static final nfq f = new ggq(5);
    static final nfq e = new ggq(4);
    static final nfq d = new ggq(3);
    static final nfq c = new ggq(2);
    static final nfq b = new ggq(1);
    static final nfq a = new ggq(0);

    private ggq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                if (i2 != 0 && i2 != 20 && i2 != 22 && i2 != 10 && i2 != 11 && i2 != 13 && i2 != 14 && i2 != 16 && i2 != 17 && i2 != 30 && i2 != 31) {
                    switch (i2) {
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i2) {
                                case 10000:
                                case 10001:
                                case 10002:
                                    break;
                                default:
                                    return false;
                            }
                    }
                }
                return true;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 2:
                return i2 == 0 || i2 == 1;
            case 3:
                return guw.f(i2) != 0;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 7:
                switch (i2) {
                    case -1:
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    default:
                        return false;
                }
            case 8:
                return i2 == 0 || i2 == 1;
            case 9:
                return giw.d(i2) != 0;
            case 10:
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
                        return true;
                    case 11:
                    default:
                        return false;
                }
            case 11:
                return ggz.b(i2) != null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return hqs.j(i2) != 0;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return hyd.b(i2) != null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return kez.m(i2) != 0;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 16:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 18:
                return jez.m(i2) != 0;
            case 19:
                return ker.j(i2) != 0;
            default:
                return ker.i(i2) != 0;
        }
    }
}
