package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ons  reason: default package */
/* loaded from: classes2.dex */
final class ons implements nfq {
    private final /* synthetic */ int l;
    static final nfq k = new ons(10);
    static final nfq j = new ons(9);
    static final nfq i = new ons(8);
    static final nfq h = new ons(7);
    static final nfq g = new ons(6);
    static final nfq f = new ons(5);
    static final nfq e = new ons(4);
    static final nfq d = new ons(3);
    static final nfq c = new ons(2);
    static final nfq b = new ons(1);
    static final nfq a = new ons(0);

    private ons(int i2) {
        this.l = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.l) {
            case 0:
                switch (i2) {
                    case -1:
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
            case 1:
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
            case 2:
                return onu.b(i2) != 0;
            case 3:
                return ofb.g(i2) != 0;
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
                        return true;
                    default:
                        return false;
                }
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 8:
                return ool.b(i2) != null;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return ofb.f(i2) != 0;
        }
    }
}
