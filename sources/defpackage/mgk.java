package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mgk  reason: default package */
/* loaded from: classes.dex */
public final class mgk implements nfq {
    private final /* synthetic */ int v;
    public static final nfq u = new mgk(20);
    public static final nfq t = new mgk(19);
    public static final nfq s = new mgk(18);
    public static final nfq r = new mgk(17);
    public static final nfq q = new mgk(16);
    public static final nfq p = new mgk(15);
    public static final nfq o = new mgk(14);
    public static final nfq n = new mgk(13);
    public static final nfq m = new mgk(12);
    public static final nfq l = new mgk(11);
    public static final nfq k = new mgk(10);
    public static final nfq j = new mgk(9);
    public static final nfq i = new mgk(8);
    public static final nfq h = new mgk(7);
    public static final nfq g = new mgk(6);
    public static final nfq f = new mgk(5);
    public static final nfq e = new mgk(4);
    public static final nfq d = new mgk(3);
    static final nfq c = new mgk(2);
    static final nfq b = new mgk(1);
    static final nfq a = new mgk(0);

    private mgk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return mgl.b(i2) != null;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 2:
                return mhb.c(i2) != 0;
            case 3:
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
                        return true;
                    default:
                        return false;
                }
            case 4:
                return kcu.y(i2) != 0;
            case 5:
                return msc.g(i2) != 0;
            case 6:
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
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 8:
                return i2 == 0 || i2 == 1;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 10:
                return msc.f(i2) != 0;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return mqc.b(i2) != null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return msc.e(i2) != 0;
            case 15:
                return msc.d(i2) != 0;
            case 16:
                return msc.c(i2) != 0;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 18:
                return mrs.b(i2) != null;
            case 19:
                return msc.b(i2) != 0;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
        }
    }
}
