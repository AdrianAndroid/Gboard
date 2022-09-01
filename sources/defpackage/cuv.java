package defpackage;

import android.net.Uri;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cuv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cuv implements leq {
    private final /* synthetic */ int u;
    public static final /* synthetic */ cuv t = new cuv(20);
    public static final /* synthetic */ cuv s = new cuv(19);
    public static final /* synthetic */ cuv r = new cuv(18);
    public static final /* synthetic */ cuv q = new cuv(17);
    public static final /* synthetic */ cuv p = new cuv(16);
    public static final /* synthetic */ cuv o = new cuv(15);
    public static final /* synthetic */ cuv n = new cuv(14);
    public static final /* synthetic */ cuv m = new cuv(13);
    public static final /* synthetic */ cuv l = new cuv(12);
    public static final /* synthetic */ cuv k = new cuv(11);
    public static final /* synthetic */ cuv j = new cuv(10);
    public static final /* synthetic */ cuv i = new cuv(9);
    public static final /* synthetic */ cuv h = new cuv(8);
    public static final /* synthetic */ cuv g = new cuv(7);
    public static final /* synthetic */ cuv f = new cuv(6);
    public static final /* synthetic */ cuv e = new cuv(5);
    public static final /* synthetic */ cuv d = new cuv(4);
    public static final /* synthetic */ cuv c = new cuv(2);
    public static final /* synthetic */ cuv b = new cuv(1);
    public static final /* synthetic */ cuv a = new cuv(0);

    public /* synthetic */ cuv(int i2) {
        this.u = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        r6 = false;
        r6 = false;
        boolean z = false;
        switch (this.u) {
            case 0:
                return 1;
            case 1:
                return ((cuq) obj).a;
            case 2:
                return 0;
            case 3:
                return -1;
            case 4:
                return (cxc) ((hiz) obj).B();
            case 5:
                ltg ltgVar = cwn.a;
                return Boolean.valueOf(!((knk) obj).b().a().isEmpty());
            case 6:
                llk e2 = llp.e();
                for (nda ndaVar : ((ncv) obj).a) {
                    if (ndaVar.a != null) {
                        try {
                            cwv b2 = cww.b();
                            ncw ncwVar = ndaVar.a;
                            if (ncwVar == null) {
                                ncwVar = ncw.g;
                            }
                            b2.b(ncwVar);
                            e2.h(b2.a());
                        } catch (IllegalStateException e3) {
                            ltd ltdVar = (ltd) ((ltd) ((ltd) cwo.a.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/expression/sticker/ExpressiveStickerFetcher", "parseStickers", 162, "ExpressiveStickerFetcher.java");
                            ncw ncwVar2 = ndaVar.a;
                            if (ncwVar2 == null) {
                                ncwVar2 = ncw.g;
                            }
                            ltdVar.w("search(): sticker %s isn't valid", ncwVar2.a);
                        }
                    } else {
                        ((ltd) ((ltd) cwo.a.d()).k("com/google/android/apps/inputmethod/libs/expression/sticker/ExpressiveStickerFetcher", "parseStickers", 166, "ExpressiveStickerFetcher.java")).t("search(): sticker is missing");
                    }
                }
                return e2.g();
            case 7:
                llk e4 = llp.e();
                llp e5 = ((cyn) obj).e(bzg.p);
                int i2 = ((lrl) e5).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    cqp cqpVar = (cqp) e5.get(i3);
                    try {
                        e4.h(cww.c(cqpVar));
                    } catch (IllegalStateException e6) {
                        ((ltd) ((ltd) ((ltd) cwo.a.d()).i(e6)).k("com/google/android/apps/inputmethod/libs/expression/sticker/ExpressiveStickerFetcher", "parseStickers", 182, "ExpressiveStickerFetcher.java")).w("search(): sticker for tenor result %s isn't valid", cqpVar);
                    }
                }
                return e4.g();
            case 8:
                llk e7 = llp.e();
                for (ncy ncyVar : (List) obj) {
                    try {
                        cxb a2 = cxc.a();
                        a2.e(ncyVar.a);
                        a2.d(ncyVar.d);
                        a2.a = ncyVar.d;
                        a2.c(ncyVar.e);
                        a2.b = 1;
                        int u = ndb.u(ncyVar.b);
                        if (u != 0 && u == 4) {
                            throw new IllegalStateException("Avatar sticker packs are not supported anymore.");
                            break;
                        }
                        a2.g(iil.p);
                        nco ncoVar = ncyVar.c;
                        if (ncoVar != null) {
                            a2.f(Uri.parse(ncoVar.a));
                        }
                        for (ncw ncwVar3 : ncyVar.f) {
                            try {
                                cwv b3 = cww.b();
                                b3.b(ncwVar3);
                                a2.b().h(b3.a());
                            } catch (IllegalStateException e8) {
                                ((ltd) ((ltd) ((ltd) cxc.a.d()).i(e8)).k("com/google/android/apps/inputmethod/libs/expression/sticker/StickerPack$Builder", "parseFrom", (char) 130, "StickerPack.java")).t("parseFrom(): Failed to build sticker");
                            }
                        }
                        e7.h(a2.a());
                    } catch (IllegalStateException e9) {
                        ((ltd) ((ltd) ((ltd) cwo.a.d()).i(e9)).k("com/google/android/apps/inputmethod/libs/expression/sticker/ExpressiveStickerFetcher", "parseStickerPacks", 147, "ExpressiveStickerFetcher.java")).w("getStickerPacks(): sticker pack %s isn't valid", ncyVar.a);
                    }
                }
                return e7.g();
            case 9:
                return ((cxc) obj).b;
            case 10:
                return cws.a(10, (llp) obj);
            case 11:
                return ((cxc) obj).b;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                cxl cxlVar = (cxl) obj;
                hhl hhlVar = cxm.a;
                return fhr.y(lkv.b(cxlVar.a, cxlVar.b), m);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((cxk) obj).b;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return cyg.b("", llp.q(), (iij) obj);
            case 15:
                int i4 = cyn.b;
                return cyn.b("", llp.q(), (iij) obj);
            case 16:
                cys cysVar = cys.GIF;
                return ((cys) obj).f;
            case 17:
                cyg cygVar = (cyg) iin.h((iij) obj, czb.b, n);
                if (!iin.i(cygVar)) {
                    throw new iht(cygVar);
                }
                return cygVar;
            case 18:
                czc czcVar = (czc) iin.h((iij) obj, czb.a, t);
                if (iin.i(czcVar)) {
                    return czcVar.a;
                }
                throw new iht(czcVar);
            case 19:
                cyn c2 = cyn.c((iij) obj);
                if (iin.i(c2)) {
                    if (iin.i(c2) && !"0".equals(c2.a) && !"".equals(c2.a)) {
                        z = true;
                    }
                    return hjd.a(c2, z);
                }
                throw new iht(c2);
            default:
                return czc.b(llp.q(), (iij) obj);
        }
    }
}
