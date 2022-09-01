package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mdw  reason: default package */
/* loaded from: classes.dex */
public final class mdw implements nfq {
    private final /* synthetic */ int v;
    public static final nfq u = new mdw(20);
    public static final nfq t = new mdw(19);
    public static final nfq s = new mdw(18);
    public static final nfq r = new mdw(17);
    public static final nfq q = new mdw(16);
    static final nfq p = new mdw(15);
    static final nfq o = new mdw(14);
    static final nfq n = new mdw(13);
    static final nfq m = new mdw(12);
    static final nfq l = new mdw(11);
    static final nfq k = new mdw(10);
    static final nfq j = new mdw(9);
    static final nfq i = new mdw(8);
    static final nfq h = new mdw(7);
    static final nfq g = new mdw(6);
    static final nfq f = new mdw(5);
    static final nfq e = new mdw(4);
    static final nfq d = new mdw(3);
    static final nfq c = new mdw(2);
    static final nfq b = new mdw(1);
    static final nfq a = new mdw(0);

    private mdw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return mdx.b(i2) != null;
            case 1:
                return mdu.b(i2) != null;
            case 2:
                return mdy.b(i2) != null;
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
                        return true;
                    default:
                        return false;
                }
            case 4:
                return meb.b(i2) != null;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 6:
                return mhb.f(i2) != 0;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 9:
                return mep.b(i2) != null;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 11:
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
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return mev.b(i2) != null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return mey.b(i2) != null;
            case 15:
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
            case 16:
                return mhb.e(i2) != 0;
            case 17:
                return mhb.d(i2) != 0;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 19:
                return mge.b(i2) != null;
            default:
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
        }
    }
}
