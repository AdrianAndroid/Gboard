package defpackage;

import org.chromium.net.UrlRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: maw  reason: default package */
/* loaded from: classes.dex */
public final class maw implements nfq {
    private final /* synthetic */ int v;
    static final nfq u = new maw(20);
    static final nfq t = new maw(19);
    static final nfq s = new maw(18);
    static final nfq r = new maw(17);
    static final nfq q = new maw(16);
    static final nfq p = new maw(15);
    static final nfq o = new maw(14);
    static final nfq n = new maw(13);
    static final nfq m = new maw(12);
    static final nfq l = new maw(11);
    static final nfq k = new maw(10);
    static final nfq j = new maw(9);
    static final nfq i = new maw(8);
    static final nfq h = new maw(7);
    static final nfq g = new maw(6);
    static final nfq f = new maw(5);
    static final nfq e = new maw(4);
    static final nfq d = new maw(3);
    static final nfq c = new maw(2);
    static final nfq b = new maw(1);
    static final nfq a = new maw(0);

    private maw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 4:
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
            case 5:
                return may.b(i2) != null;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 7:
                return mba.b(i2) != null;
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
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 11:
                return lwm.d(i2) != 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return lxj.f(i2) != 0;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return lxj.e(i2) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return lwm.n(i2) != 0;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 16:
                return lwm.m(i2) != 0;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 18:
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
            case 19:
                return lwm.l(i2) != 0;
            default:
                return mbi.b(i2) != null;
        }
    }
}
