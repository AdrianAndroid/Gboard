package defpackage;

import android.net.Uri;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ehk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ehk implements leq {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ehk u = new ehk(20);
    public static final /* synthetic */ ehk t = new ehk(19);
    public static final /* synthetic */ ehk s = new ehk(18);
    public static final /* synthetic */ ehk r = new ehk(17);
    public static final /* synthetic */ ehk q = new ehk(16);
    public static final /* synthetic */ ehk p = new ehk(15);
    public static final /* synthetic */ ehk o = new ehk(14);
    public static final /* synthetic */ ehk n = new ehk(13);
    public static final /* synthetic */ ehk m = new ehk(12);
    public static final /* synthetic */ ehk l = new ehk(11);
    public static final /* synthetic */ ehk k = new ehk(10);
    public static final /* synthetic */ ehk j = new ehk(9);
    public static final /* synthetic */ ehk i = new ehk(8);
    public static final /* synthetic */ ehk h = new ehk(7);
    public static final /* synthetic */ ehk g = new ehk(6);
    public static final /* synthetic */ ehk f = new ehk(5);
    public static final /* synthetic */ ehk e = new ehk(4);
    public static final /* synthetic */ ehk d = new ehk(3);
    public static final /* synthetic */ ehk c = new ehk(2);
    public static final /* synthetic */ ehk b = new ehk(1);
    public static final /* synthetic */ ehk a = new ehk(0);

    private /* synthetic */ ehk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return efq.d((cxc) obj);
            case 1:
                return efq.c((cxc) obj);
            case 2:
                return efq.f((cxf) obj);
            case 3:
                return efq.e((cxc) obj);
            case 4:
                return efq.e((cxc) obj);
            case 5:
                return efq.d((cxc) obj);
            case 6:
                return efq.f((cxf) obj);
            case 7:
                return efq.e((cxc) obj);
            case 8:
                return efq.e((cxc) obj);
            case 9:
                return efq.c((cxc) obj);
            case 10:
                int b2 = ((efx) obj).b() - 1;
                if (b2 == 0 || b2 == 1) {
                    return 0;
                }
                if (b2 != 3) {
                    return 1;
                }
                return 2;
            case 11:
                switch (((ehj) obj).a() - 1) {
                    case 1:
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                        return 2;
                    case 5:
                        throw new IllegalStateException("StickerPromo() should not be used in sticker revamp keyboard peer.");
                    case 6:
                        return 3;
                    default:
                        return 0;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                switch (((ehj) obj).a() - 1) {
                    case 1:
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                        return 2;
                    case 5:
                        throw new IllegalStateException("StickerPromo() should not be used in sticker revamp keyboard peer.");
                    case 6:
                        return 3;
                    default:
                        return 0;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Integer.valueOf(((egu) obj).b().d);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(((eib) obj).b() - 1);
            case 15:
                return ((cww) obj).a();
            case 16:
                String str = (String) obj;
                hhl hhlVar = ejq.a;
                cqo t2 = cqp.t();
                t2.h(Uri.parse(str));
                t2.l("curated_gif");
                t2.e(mbr.TENOR_GIF);
                t2.c = Uri.parse(str).getHost();
                t2.j(iil.q);
                return t2.a();
            case 17:
                return ((cqp) obj).d();
            case 18:
                return ((cww) obj).a();
            case 19:
                return ((mwv) obj).a;
            default:
                return Integer.valueOf(((eka) obj).ordinal());
        }
    }
}
