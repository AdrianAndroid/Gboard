package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: nlc  reason: default package */
/* loaded from: classes2.dex */
public final class nlc implements nfq {
    private final /* synthetic */ int v;
    public static final nfq u = new nlc(20);
    public static final nfq t = new nlc(19);
    public static final nfq s = new nlc(18);
    public static final nfq r = new nlc(17);
    public static final nfq q = new nlc(16);
    public static final nfq p = new nlc(15);
    public static final nfq o = new nlc(14);
    public static final nfq n = new nlc(13);
    public static final nfq m = new nlc(12);
    public static final nfq l = new nlc(11);
    public static final nfq k = new nlc(10);
    public static final nfq j = new nlc(9);
    static final nfq i = new nlc(8);
    static final nfq h = new nlc(7);
    static final nfq g = new nlc(6);
    static final nfq f = new nlc(5);
    static final nfq e = new nlc(4);
    static final nfq d = new nlc(3);
    static final nfq c = new nlc(2);
    public static final nfq b = new nlc(1);
    static final nfq a = new nlc(0);

    private nlc(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
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
                        return true;
                    default:
                        return false;
                }
            case 4:
                return ndb.aa(i2) != 0;
            case 5:
                return ndb.Z(i2) != 0;
            case 6:
                return ndb.Y(i2) != 0;
            case 7:
                return ndb.W(i2) != 0;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 11:
                return i2 == 0 || i2 == 1;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return nni.b(i2) != null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 16:
                return ndb.V(i2) != 0;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 18:
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
                        return true;
                    default:
                        return false;
                }
            case 19:
                return ols.d(i2) != 0;
            default:
                return onb.b(i2) != null;
        }
    }
}
