package defpackage;

import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: coa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class coa implements miy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ coa(coc cocVar, int i) {
        this.b = i;
        this.a = cocVar;
    }

    public /* synthetic */ coa(cuc cucVar, int i) {
        this.b = i;
        this.a = cucVar;
    }

    public /* synthetic */ coa(cwc cwcVar, int i) {
        this.b = i;
        this.a = cwcVar;
    }

    public /* synthetic */ coa(czt cztVar, int i) {
        this.b = i;
        this.a = cztVar;
    }

    public /* synthetic */ coa(dhj dhjVar, int i) {
        this.b = i;
        this.a = dhjVar;
    }

    public /* synthetic */ coa(dkh dkhVar, int i) {
        this.b = i;
        this.a = dkhVar;
    }

    public /* synthetic */ coa(dlr dlrVar, int i) {
        this.b = i;
        this.a = dlrVar;
    }

    public /* synthetic */ coa(duz duzVar, int i) {
        this.b = i;
        this.a = duzVar;
    }

    public /* synthetic */ coa(dyt dytVar, int i) {
        this.b = i;
        this.a = dytVar;
    }

    public /* synthetic */ coa(ehp ehpVar, int i) {
        this.b = i;
        this.a = ehpVar;
    }

    public /* synthetic */ coa(eis eisVar, int i) {
        this.b = i;
        this.a = eisVar;
    }

    public /* synthetic */ coa(hja hjaVar, int i) {
        this.b = i;
        this.a = hjaVar;
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, hja] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, hja] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                cob cobVar = (cob) obj;
                if ((cobVar == null || cobVar.b()) && irv.b()) {
                    coc cocVar = (coc) obj2;
                    hji.h(cocVar.f);
                    cocVar.f = null;
                    dxs dxsVar = cocVar.g;
                    String str = (String) cyj.k.c();
                    if (str == null) {
                        throw new NullPointerException("Null baseUrl");
                    }
                    String str2 = (String) cyj.a.c();
                    if (str2 == null) {
                        throw new NullPointerException("Null contentFilterLevel");
                    }
                    cocVar.f = hiz.k(dxsVar.i(new cyf(str, str2)).u(cuv.q, dxsVar.b)).h(bzg.j, cocVar.d).u(new byi(cocVar, 14), cocVar.d);
                }
                if (cobVar != null) {
                    return kcu.K(cobVar);
                }
                return kcu.J(new AssertionError("remote categories unavailable"));
            case 1:
                ?? r0 = this.a;
                ((ltd) ((ltd) ((ltd) cmb.a.d()).i((iht) obj)).k("com/google/android/apps/inputmethod/libs/expression/data/gif/GifFetcherImpl", "lambda$search$1", 69, "GifFetcherImpl.java")).t("Tenor GIF search request failed, falling back to image search");
                return hjg.b(r0);
            case 2:
                Object obj3 = this.a;
                jqm jqmVar = (jqm) obj;
                jyu g = jsq.g();
                llp b = hqr.b();
                Locale[] localeArr = new Locale[b.size()];
                while (i < b.size()) {
                    localeArr[i] = ((hqt) b.get(i)).i().q();
                    i++;
                }
                g.e("enabled_locales", localeArr);
                jsq b2 = g.b();
                cuc cucVar = (cuc) obj3;
                return cucVar.d.h("sticker_pack_similarity", new cxr(cucVar.e), b2);
            case 3:
                Object obj4 = this.a;
                if (((jre) obj).e() || ((byy) ((cuc) obj4).f.get()).i()) {
                    return ((cuc) obj4).d.b("sticker_pack_similarity");
                }
                return kcu.K(bze.a);
            case 4:
                Object obj5 = this.a;
                llp llpVar = (llp) obj;
                if (llpVar.isEmpty()) {
                    return hiz.n(llp.q());
                }
                llp i2 = llp.i(lre.aa(llpVar, ((Long) cwc.a.c()).intValue()));
                llk e = llp.e();
                int size = i2.size();
                while (i < size) {
                    e.h(hjg.b(((cwc) obj5).c.e((String) i2.get(i))));
                    i++;
                }
                llp g2 = e.g();
                return hiz.K(g2).d(new cak((cwc) obj5, g2, "CONTEXTUAL/".concat(lex.c(';').f(i2)), 4), mjl.a);
            case 5:
                Object obj6 = this.a;
                llp llpVar2 = (llp) obj;
                if (llpVar2.isEmpty()) {
                    return hiz.n(llp.q());
                }
                llk e2 = llp.e();
                int size2 = llpVar2.size();
                while (i < size2) {
                    String str3 = (String) llpVar2.get(i);
                    e2.h(hjg.b(((cwc) obj6).c.e(str3)).u(new cus(str3, 2), mjl.a));
                    i++;
                }
                llp g3 = e2.g();
                return hiz.K(g3).d(new bof(g3, 10), mjl.a);
            case 6:
                jqm jqmVar2 = (jqm) obj;
                return ((czt) this.a).d.g("dynamic_art", jsq.a);
            case 7:
                jre jreVar = (jre) obj;
                return ((czt) this.a).d.b("dynamic_art");
            case 8:
                Object obj7 = this.a;
                jre jreVar2 = (jre) obj;
                ((ltd) ((ltd) dhj.a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingOnlineSuperpacks", "lambda$syncInternal$1", 237, "HandwritingOnlineSuperpacks.java")).t("syncInternal(): syncing packs");
                if (jreVar2 != null) {
                    dhn dhnVar = (dhn) obj7;
                    if (!(!dhnVar.k())) {
                        llp a = jreVar2.a();
                        int i3 = ((lrl) a).c;
                        boolean z = false;
                        while (i < i3) {
                            z |= ((juc) a.get(i)).i().startsWith("pack_mapping_v1_lstm");
                            i++;
                        }
                        if (!z) {
                            return kcu.K(jreVar2);
                        }
                    }
                    dhj dhjVar = (dhj) obj7;
                    return mio.h(dhnVar.j(), new bxo(dhjVar, jreVar2, 20), dhjVar.j);
                }
                ((ltd) ((ltd) dhj.a.c()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingOnlineSuperpacks", "lambda$syncInternal$1", 239, "HandwritingOnlineSuperpacks.java")).t("syncInternal(): null mapping result.");
                return kcu.K(null);
            case 9:
                jqm jqmVar3 = (jqm) obj;
                dkh dkhVar = (dkh) this.a;
                return dkhVar.d.c(dkhVar.e);
            case 10:
                Integer num = (Integer) obj;
                dkh dkhVar2 = (dkh) this.a;
                bze bzeVar = dkhVar2.d;
                return bzeVar.h(dkhVar2.e, dkhVar2.c(((bzr) bzeVar).j), jsq.a);
            case 11:
                Object obj8 = this.a;
                if (((jre) obj).e() || ((byy) ((dlr) obj8).f.get()).i()) {
                    return ((dlr) obj8).e.b("kc_tflite_model");
                }
                return kcu.K(bze.a);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jqm jqmVar4 = (jqm) obj;
                bze bzeVar2 = ((dlr) this.a).e;
                return bzeVar2.h("kc_tflite_model", new dyr(((bzr) bzeVar2).j, 1), jsq.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                nvw nvwVar = (nvw) obj;
                duz duzVar = (duz) this.a;
                return kcu.P(new clc(duzVar, 3), duzVar.b);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jqm jqmVar5 = (jqm) obj;
                bze bzeVar3 = ((dyt) this.a).g;
                return bzeVar3.h("ranking_model", new dyr(((bzr) bzeVar3).j, 0), jsq.a);
            case 15:
                Object obj9 = this.a;
                if (((jre) obj).e() || ((byy) ((dyt) obj9).h.get()).i()) {
                    return ((dyt) obj9).g.b("ranking_model");
                }
                return kcu.K(bze.a);
            case 16:
                Void r10 = (Void) obj;
                ehp ehpVar = (ehp) this.a;
                return ehpVar.h.b(kcu.K(ehpVar.o.b), ehpVar.u);
            case 17:
                Void r102 = (Void) obj;
                ehp ehpVar2 = (ehp) this.a;
                return ehpVar2.h.b(kcu.K(ehpVar2.o.b), ehpVar2.u);
            case 18:
                Void r103 = (Void) obj;
                eis eisVar = (eis) this.a;
                return eisVar.g.b(kcu.K(eisVar.n.b), eisVar.x);
            case 19:
                Void r104 = (Void) obj;
                eis eisVar2 = (eis) this.a;
                return eisVar2.g.b(kcu.K(eisVar2.n.b), eisVar2.x);
            default:
                ?? r02 = this.a;
                llp llpVar3 = (llp) obj;
                hhl hhlVar = ejq.a;
                if (!llpVar3.isEmpty()) {
                    return hiz.n(llpVar3);
                }
                return hjg.b(r02);
        }
    }
}
