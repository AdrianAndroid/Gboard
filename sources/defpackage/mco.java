package defpackage;

import org.chromium.net.UrlRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mco  reason: default package */
/* loaded from: classes.dex */
public final class mco implements nfq {
    private final /* synthetic */ int v;
    static final nfq u = new mco(20);
    static final nfq t = new mco(19);
    static final nfq s = new mco(18);
    static final nfq r = new mco(17);
    static final nfq q = new mco(16);
    static final nfq p = new mco(15);
    static final nfq o = new mco(14);
    static final nfq n = new mco(13);
    static final nfq m = new mco(12);
    static final nfq l = new mco(11);
    static final nfq k = new mco(10);
    static final nfq j = new mco(9);
    static final nfq i = new mco(8);
    static final nfq h = new mco(7);
    static final nfq g = new mco(6);
    static final nfq f = new mco(5);
    static final nfq e = new mco(4);
    static final nfq d = new mco(3);
    static final nfq c = new mco(2);
    static final nfq b = new mco(1);
    static final nfq a = new mco(0);

    private mco(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                if (mcp.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                return mcn.b(i2) != null;
            case 2:
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
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return lxj.j(i2) != 0;
            case 7:
                return mcy.b(i2) != null;
            case 8:
                switch (i2) {
                    case 0:
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return true;
                    case 2:
                    default:
                        return false;
                }
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
                        return true;
                    default:
                        return false;
                }
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return mdh.b(i2) != null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return mdj.b(i2) != null;
            case 15:
                return lxj.i(i2) != 0;
            case 16:
                return mhb.h(i2) != 0;
            case 17:
                return mhb.g(i2) != 0;
            case 18:
                return mdq.b(i2) != null;
            case 19:
                return mdr.b(i2) != null;
            default:
                if (mdt.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
