package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: msb  reason: default package */
/* loaded from: classes2.dex */
public final class msb implements nfq {
    private final /* synthetic */ int v;
    public static final nfq u = new msb(20);
    static final nfq t = new msb(19);
    static final nfq s = new msb(18);
    static final nfq r = new msb(17);
    static final nfq q = new msb(16);
    static final nfq p = new msb(15);
    static final nfq o = new msb(14);
    static final nfq n = new msb(13);
    static final nfq m = new msb(12);
    static final nfq l = new msb(11);
    static final nfq k = new msb(10);
    static final nfq j = new msb(9);
    static final nfq i = new msb(8);
    static final nfq h = new msb(7);
    static final nfq g = new msb(6);
    static final nfq f = new msb(5);
    static final nfq e = new msb(4);
    static final nfq d = new msb(3);
    static final nfq c = new msb(2);
    static final nfq b = new msb(1);
    static final nfq a = new msb(0);

    private msb(int i2) {
        this.v = i2;
    }

    @Override // defpackage.nfq
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                if (msc.a(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return mrx.b(i2) != null;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 3:
                return jco.F(i2) != 0;
            case 4:
                return jco.E(i2) != 0;
            case 5:
                return mti.b(i2) != null;
            case 6:
                return jco.D(i2) != 0;
            case 7:
                return jco.C(i2) != 0;
            case 8:
                return mtv.b(i2) != null;
            case 9:
                return jco.B(i2) != 0;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 11:
                return jco.A(i2) != 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return jco.z(i2) != 0;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 16:
                return jco.y(i2) != 0;
            case 17:
                return jco.x(i2) != 0;
            case 18:
                return mvl.b(i2) != null;
            case 19:
                return jco.w(i2) != 0;
            default:
                if (jco.v(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
