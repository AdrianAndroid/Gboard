package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jih  reason: default package */
/* loaded from: classes.dex */
public final class jih implements nfq {
    private final /* synthetic */ int v;
    public static final nfq u = new jih(20);
    public static final nfq t = new jih(19);
    public static final nfq s = new jih(18);
    public static final nfq r = new jih(17);
    public static final nfq q = new jih(16);
    public static final nfq p = new jih(15);
    public static final nfq o = new jih(14);
    public static final nfq n = new jih(13);
    public static final nfq m = new jih(12);
    public static final nfq l = new jih(11);
    public static final nfq k = new jih(10);
    public static final nfq j = new jih(9);
    public static final nfq i = new jih(8);
    public static final nfq h = new jih(7);
    public static final nfq g = new jih(6);
    static final nfq f = new jih(5);
    static final nfq e = new jih(4);
    static final nfq d = new jih(3);
    static final nfq c = new jih(2);
    static final nfq b = new jih(1);
    static final nfq a = new jih(0);

    private jih(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return ker.g(i2) != 0;
            case 1:
                return ker.h(i2) != 0;
            case 2:
                return kez.l(i2) != 0;
            case 3:
                return kez.k(i2) != 0;
            case 4:
                return kez.j(i2) != 0;
            case 5:
                return jip.b(i2) != null;
            case 6:
                return jez.o(i2) != 0;
            case 7:
                return kez.b(i2) != 0;
            case 8:
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
            case 9:
                return lzt.b(i2) != null;
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
                        return true;
                    default:
                        return false;
                }
            case 11:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return mad.b(i2) != null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 16:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 19:
                return mas.b(i2) != null;
            default:
                if (i2 != 0) {
                    switch (i2) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
        }
    }
}
