package defpackage;

import java.io.File;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bzg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bzg implements lfe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ bzg u = new bzg(20);
    public static final /* synthetic */ bzg t = new bzg(19);
    public static final /* synthetic */ bzg s = new bzg(18);
    public static final /* synthetic */ bzg r = new bzg(17);
    public static final /* synthetic */ bzg q = new bzg(16);
    public static final /* synthetic */ bzg p = new bzg(15);
    public static final /* synthetic */ bzg o = new bzg(14);
    public static final /* synthetic */ bzg n = new bzg(13);
    public static final /* synthetic */ bzg m = new bzg(12);
    public static final /* synthetic */ bzg l = new bzg(11);
    public static final /* synthetic */ bzg k = new bzg(10);
    public static final /* synthetic */ bzg j = new bzg(9);
    public static final /* synthetic */ bzg i = new bzg(8);
    public static final /* synthetic */ bzg h = new bzg(7);
    public static final /* synthetic */ bzg g = new bzg(6);
    public static final /* synthetic */ bzg f = new bzg(5);
    public static final /* synthetic */ bzg e = new bzg(4);
    public static final /* synthetic */ bzg d = new bzg(3);
    public static final /* synthetic */ bzg c = new bzg(2);
    public static final /* synthetic */ bzg b = new bzg(1);
    public static final /* synthetic */ bzg a = new bzg(0);

    private /* synthetic */ bzg(int i2) {
        this.v = i2;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                hhl hhlVar = bzr.b;
                return !((jsz) obj).b();
            case 1:
                return ((jsz) obj).b();
            case 2:
                return ((hiz) ((Map.Entry) obj).getValue()).D();
            case 3:
                return hji.d(((hiz) obj).c);
            case 4:
                return ((cvv) obj) != cvv.READY;
            case 5:
                int i2 = cjy.b;
                int b2 = msc.b(((mse) obj).c);
                return b2 != 0 && b2 == 28;
            case 6:
                int b3 = msc.b(((mse) obj).c);
                return b3 != 0 && b3 == 28;
            case 7:
                ltg ltgVar = clg.a;
                return !hji.f((hiz) obj);
            case 8:
                ltg ltgVar2 = clg.a;
                return jan.b.g(((cqp) ((Map.Entry) obj).getValue()).u());
            case 9:
                cyg cygVar = (cyg) obj;
                ltg ltgVar3 = coc.a;
                return cygVar == null || cygVar.a.isEmpty();
            case 10:
                return ((File) obj).exists();
            case 11:
                return ((cvv) obj) != cvv.READY;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ltg ltgVar4 = cwn.a;
                return ((String) obj).endsWith("StickerService/ListStickerPacks");
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ltg ltgVar5 = cwn.a;
                return ((String) obj).endsWith("StickerService/SuggestStickerQueries");
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ltg ltgVar6 = cwn.a;
                return ((String) obj).endsWith("StickerService/SearchStickers");
            case 15:
                return !((cyz) obj).h.e();
            case 16:
                cyz cyzVar = (cyz) obj;
                int i3 = cyn.b;
                return true;
            case 17:
                return ((dnb) obj).c;
            case 18:
                String str = (String) obj;
                for (int i4 = 0; i4 < str.length(); i4++) {
                    if (Character.isLetterOrDigit(str.charAt(i4))) {
                        return true;
                    }
                }
                return false;
            case 19:
                return jbs.l((String) obj);
            default:
                dyw dywVar = (dyw) obj;
                int i5 = dyw.i;
                return true;
        }
    }
}
