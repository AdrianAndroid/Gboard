package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cgs  reason: default package */
/* loaded from: classes.dex */
public final class cgs implements nfq {
    private final /* synthetic */ int v;
    public static final nfq u = new cgs(20);
    public static final nfq t = new cgs(19);
    public static final nfq s = new cgs(18);
    public static final nfq r = new cgs(17);
    public static final nfq q = new cgs(16);
    public static final nfq p = new cgs(15);
    public static final nfq o = new cgs(14);
    public static final nfq n = new cgs(13);
    public static final nfq m = new cgs(12);
    public static final nfq l = new cgs(11);
    public static final nfq k = new cgs(10);
    public static final nfq j = new cgs(9);
    public static final nfq i = new cgs(8);
    public static final nfq h = new cgs(7);
    public static final nfq g = new cgs(6);
    public static final nfq f = new cgs(5);
    public static final nfq e = new cgs(4);
    public static final nfq d = new cgs(3);
    static final nfq c = new cgs(2);
    public static final nfq b = new cgs(1);
    static final nfq a = new cgs(0);

    private cgs(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return cog.j(i2) != 0;
            case 1:
                return bvq.e(i2) != 0;
            case 2:
                return efq.t(i2) != 0;
            case 3:
                return efq.p(i2) != 0;
            case 4:
                return ckc.b(i2) != null;
            case 5:
                return eup.b(i2) != null;
            case 6:
                return eur.b(i2) != null;
            case 7:
                return eus.b(i2) != null;
            case 8:
                return euu.b(i2) != null;
            case 9:
                return evc.b(i2) != null;
            case 10:
                return gfu.b(i2) != null;
            case 11:
                return gqn.i(i2) != 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i2 == 0 || i2 == 1;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
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
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 15:
                return gqn.h(i2) != 0;
            case 16:
                return ggi.b(i2) != null;
            case 17:
                return ggk.b(i2) != null;
            case 18:
                return guw.g(i2) != 0;
            case 19:
                return i2 == 0 || i2 == 1;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2;
        }
    }
}
