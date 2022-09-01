package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mbm  reason: default package */
/* loaded from: classes.dex */
final class mbm implements nfq {
    private final /* synthetic */ int v;
    static final nfq u = new mbm(20);
    static final nfq t = new mbm(19);
    static final nfq s = new mbm(18);
    static final nfq r = new mbm(17);
    static final nfq q = new mbm(16);
    static final nfq p = new mbm(15);
    static final nfq o = new mbm(14);
    static final nfq n = new mbm(13);
    static final nfq m = new mbm(12);
    static final nfq l = new mbm(11);
    static final nfq k = new mbm(10);
    static final nfq j = new mbm(9);
    static final nfq i = new mbm(8);
    static final nfq h = new mbm(7);
    static final nfq g = new mbm(6);
    static final nfq f = new mbm(5);
    static final nfq e = new mbm(4);
    static final nfq d = new mbm(3);
    static final nfq c = new mbm(2);
    static final nfq b = new mbm(1);
    static final nfq a = new mbm(0);

    private mbm(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return mbn.b(i2) != null;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 2:
                return mbr.b(i2) != null;
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 4:
                return lwm.k(i2) != 0;
            case 5:
                return lxj.l(i2) != 0;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 9:
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
                        return true;
                    default:
                        return false;
                }
            case 10:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return mcb.b(i2) != null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 16:
                return lxj.k(i2) != 0;
            case 17:
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
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return true;
                    case 22:
                    case 23:
                    default:
                        return false;
                }
            case 18:
                return mcg.b(i2) != null;
            case 19:
                return mch.b(i2) != null;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2;
        }
    }
}
