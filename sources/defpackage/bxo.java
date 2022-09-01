package defpackage;

import android.text.TextUtils;
import j$.util.Collection$EL;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bxo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bxo implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bxo(bxp bxpVar, bxr bxrVar, int i) {
        this.c = i;
        this.a = bxpVar;
        this.b = bxrVar;
    }

    public /* synthetic */ bxo(byj byjVar, byl bylVar, int i) {
        this.c = i;
        this.a = byjVar;
        this.b = bylVar;
    }

    public /* synthetic */ bxo(bzr bzrVar, int i) {
        this.c = i;
        this.a = bzrVar;
        this.b = "delight";
    }

    public /* synthetic */ bxo(bzr bzrVar, String str, int i) {
        this.c = i;
        this.a = bzrVar;
        this.b = str;
    }

    public /* synthetic */ bxo(ccd ccdVar, mvm mvmVar, int i) {
        this.c = i;
        this.a = ccdVar;
        this.b = mvmVar;
    }

    public /* synthetic */ bxo(cdv cdvVar, jav javVar, int i) {
        this.c = i;
        this.a = cdvVar;
        this.b = javVar;
    }

    public /* synthetic */ bxo(ceq ceqVar, jsq jsqVar, int i) {
        this.c = i;
        this.a = ceqVar;
        this.b = jsqVar;
    }

    public /* synthetic */ bxo(cfd cfdVar, String str, int i) {
        this.c = i;
        this.a = cfdVar;
        this.b = str;
    }

    public /* synthetic */ bxo(cfd cfdVar, jsq jsqVar, int i) {
        this.c = i;
        this.a = cfdVar;
        this.b = jsqVar;
    }

    public /* synthetic */ bxo(clg clgVar, llr llrVar, int i) {
        this.c = i;
        this.a = clgVar;
        this.b = llrVar;
    }

    public /* synthetic */ bxo(cly clyVar, String str, int i) {
        this.c = i;
        this.a = clyVar;
        this.b = str;
    }

    public /* synthetic */ bxo(cqq cqqVar, cqp cqpVar, int i) {
        this.c = i;
        this.b = cqqVar;
        this.a = cqpVar;
    }

    public /* synthetic */ bxo(cqq cqqVar, cra craVar, int i) {
        this.c = i;
        this.a = cqqVar;
        this.b = craVar;
    }

    public /* synthetic */ bxo(dhj dhjVar, jre jreVar, int i) {
        this.c = i;
        this.a = dhjVar;
        this.b = jreVar;
    }

    @Override // defpackage.miy
    public final mko a(Object obj) {
        lfb g;
        hiz n;
        switch (this.c) {
            case 0:
                Object obj2 = this.a;
                Object obj3 = this.b;
                Throwable th = (Throwable) obj;
                ((ltd) ((ltd) bxp.a.d()).k("com/google/android/apps/inputmethod/libs/crank/conceptpredictor/ConceptPredictorEngineLoader", "lambda$loadCrankEngine$2", 192, "ConceptPredictorEngineLoader.java")).t("cannot get the emoji data");
                return ((bxp) obj2).b((bxr) obj3, lrr.a);
            case 1:
                return ((bxp) this.a).b((bxr) this.b, (Set) obj);
            case 2:
                return ((byj) this.a).b((byl) this.b, (Set) obj);
            case 3:
                Object obj4 = this.a;
                Object obj5 = this.b;
                Throwable th2 = (Throwable) obj;
                ((ltd) ((ltd) byj.a.d()).k("com/google/android/apps/inputmethod/libs/crank/transformerexpression/TransformerExpressionEngineLoader", "lambda$loadCrankEngine$2", 196, "TransformerExpressionEngineLoader.java")).t("cannot get the emoji data");
                return ((byj) obj4).b((byl) obj5, lrr.a);
            case 4:
                Void r13 = (Void) obj;
                return kcu.K(new byy(((jqx) ((bzr) this.a).k.get()).b((String) this.b)));
            case 5:
                Object obj6 = this.a;
                Object obj7 = this.b;
                List<jss> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (jss jssVar : list) {
                    bzr bzrVar = (bzr) obj6;
                    arrayList.add(mio.h(bzrVar.d((String) obj7, jssVar.a()), new bzf(jssVar, 0), bzrVar.i));
                }
                return kcu.G(arrayList);
            case 6:
                Object obj8 = this.a;
                Object obj9 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ccd ccdVar = (ccd) obj8;
                    mvm mvmVar = (mvm) obj9;
                    ccdVar.b.A(mvmVar, true);
                    ccdVar.b.B(mvmVar, mvk.DECODING);
                    return ccdVar.b.h.b(mvmVar);
                }
                return mkk.a;
            case 7:
                Object obj10 = this.a;
                Object obj11 = this.b;
                for (jav javVar : (Collection) obj) {
                    if (TextUtils.equals(javVar.g, ((jav) obj11).g)) {
                        ((ltd) ((ltd) cdv.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper", "lambda$getInputMethodEntryMatchingLanguage$7", 577, "LanguageIdentifierWrapper.java")).G("getBestInputMethodEntryForLanguage(): Found entry [%s] that supports language [%s].", javVar, obj11);
                        return ((cdv) obj10).n.c(javVar);
                    }
                }
                ((ltd) ((ltd) cdv.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper", "lambda$getInputMethodEntryMatchingLanguage$7", 584, "LanguageIdentifierWrapper.java")).w("getBestInputMethodEntryForLanguage(): Could not find an entry to that matches %s", obj11);
                return kcu.K(null);
            case 8:
                Object obj12 = this.a;
                Object obj13 = this.b;
                hqt hqtVar = (hqt) obj;
                if (hqtVar != null) {
                    return kcu.K(hqtVar);
                }
                cdv cdvVar = (cdv) obj12;
                hqy hqyVar = cdvVar.n;
                jau H = jav.H();
                jav javVar2 = (jav) obj13;
                H.e(javVar2.g);
                return mio.h(hqyVar.c(H.a()), new bxo(cdvVar, javVar2, 9), mjl.a);
            case 9:
                Object obj14 = this.a;
                Object obj15 = this.b;
                hqt hqtVar2 = (hqt) obj;
                if (hqtVar2 == null) {
                    cdv cdvVar2 = (cdv) obj14;
                    return mio.h(cdvVar2.n.f(), new bxo(cdvVar2, (jav) obj15, 7), mjl.a);
                }
                return kcu.K(hqtVar2);
            case 10:
                Object obj16 = this.a;
                Object obj17 = this.b;
                Integer num = (Integer) obj;
                if (num.intValue() < 0) {
                    return kcu.J(new cel("delight_apps"));
                }
                ((luc) ((luc) ceq.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightAppsSuperpacksManager", "lambda$syncAppSpecificLanguageModels$3", 148, "SuperDelightAppsSuperpacksManager.java")).G("SuperDelightManager#syncOverridesLanguageModels(%s): Syncing for version %d", "delight_apps", num);
                return ((ceq) obj16).b.h("delight_apps", new cep(), (jsq) obj17);
            case 11:
                Object obj18 = this.a;
                Object obj19 = this.b;
                jre jreVar = (jre) obj;
                if (jreVar.f()) {
                    return kcu.K(jreVar);
                }
                ((luc) ((luc) cfd.h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "lambda$syncDownloadableLanguageModels$10", 597, "SuperDelightManager.java")).G("SuperDelightManager#syncDownloadableLanguageModels(%s): Syncing again after result %s", "delight", jreVar);
                cfd cfdVar = (cfd) obj18;
                return cfdVar.j.h("delight", new cev(cfdVar.i, ((bzr) cfdVar.j).j), (jsq) obj19);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jre jreVar2 = (jre) obj;
                return ((cfd) this.a).j.b((String) this.b);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj20 = this.a;
                Object obj21 = this.b;
                Integer num2 = (Integer) obj;
                if (num2.intValue() < 0) {
                    throw new cel("delight_overrides");
                }
                ((luc) ((luc) cfd.h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "lambda$syncOverridesLanguageModels$13", 671, "SuperDelightManager.java")).G("SuperDelightManager#syncOverridesLanguageModels(%s): Syncing for version %d", "delight_overrides", num2);
                return ((cfd) obj20).j.h("delight_overrides", new cff(), (jsq) obj21);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj22 = this.a;
                Object obj23 = this.b;
                ((luc) ((luc) cfd.h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "lambda$syncBundledLanguageModels$16", 772, "SuperDelightManager.java")).w("SuperDelightManager#syncBundledLanguageModels(): Syncing for version %d", (Integer) obj);
                cfd cfdVar2 = (cfd) obj22;
                return cfdVar2.j.h("bundled_delight", new cet(cfdVar2.i), (jsq) obj23);
            case 15:
                Void r132 = (Void) obj;
                cfd cfdVar3 = (cfd) this.a;
                return cfdVar3.j.h("delight", new cev(cfdVar3.i, ((bzr) cfdVar3.j).j), (jsq) this.b);
            case 16:
                Object obj24 = this.a;
                Object obj25 = this.b;
                final lmz lmzVar = (lmz) obj;
                lls h = llw.h();
                final clg clgVar = (clg) obj24;
                clgVar.l = cln.a(clgVar.f);
                lsz it = clgVar.l.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    dxs dxsVar = clgVar.n;
                    cyh i = cyi.i();
                    i.f(str);
                    i.d((String) dzn.d.c());
                    i.e();
                    i.c(-1L);
                    ((cxs) i).b = 2;
                    h.a(str, hjg.b(dxsVar.k(i.a())));
                }
                final llw l = h.l();
                final llg values = l.values();
                final llr llrVar = (llr) obj25;
                return hiz.K(values).d(new Callable() { // from class: cle
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        iht ihtVar;
                        clg clgVar2 = clg.this;
                        llr llrVar2 = llrVar;
                        lmz lmzVar2 = lmzVar;
                        llg llgVar = values;
                        llw llwVar = l;
                        lmz p = lmz.p(lvw.j(llrVar2.u(), lvw.i(lmzVar2, clgVar2.l)));
                        llr d = clg.d(llrVar2, new cjm(p, 3));
                        ((ltd) ((ltd) clg.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "lambda$getKeywordToRequiredContentMap$8", 367, "ContentDownloadTask.java")).y("Retaining %d cached images for %d keyword(s)", lmz.p(d.r()).size(), p.size());
                        lmh lmhVar = new lmh();
                        for (Map.Entry entry : d.z().entrySet()) {
                            lmhVar.d(entry.getKey(), (Iterable) entry.getValue());
                        }
                        ((ltd) ((ltd) clg.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "lambda$getKeywordToRequiredContentMap$8", 374, "ContentDownloadTask.java")).u("Attempting to fetch featured response from Tenor for %d keyword(s)", llgVar.size());
                        lsz it2 = llwVar.entrySet().iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            String str2 = (String) entry2.getKey();
                            try {
                                cyn cynVar = (cyn) kcu.S((hiz) entry2.getValue());
                                int i3 = ((lrl) cynVar.d()).c;
                                llp i4 = llp.i(lre.aa(cynVar.d(), ((Long) clg.e.c()).intValue()));
                                if (i4.size() != ((lrl) cynVar.d()).c) {
                                    i4.size();
                                }
                                int size = i4.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    llq.b(str2, (cqp) i4.get(i5), lmhVar);
                                }
                            } catch (ExecutionException e) {
                                if ((e.getCause() instanceof iht) && (ihtVar = (iht) lgf.b(e, iht.class)) != null && ihtVar.a.a().b != 404) {
                                    clgVar2.k.add(str2);
                                }
                                i2++;
                                ((ltd) ((ltd) ((ltd) clg.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "lambda$getKeywordToRequiredContentMap$8", 398, "ContentDownloadTask.java")).w("Failed to fetch featured response for %s", str2);
                            }
                        }
                        nfh nfhVar = clgVar2.m;
                        if (nfhVar.c) {
                            nfhVar.cD();
                            nfhVar.c = false;
                        }
                        maj majVar = (maj) nfhVar.b;
                        maj majVar2 = maj.h;
                        majVar.a |= 32;
                        majVar.g = i2;
                        clgVar2.m = nfhVar;
                        llr a = llq.a(lmhVar);
                        ((ltd) ((ltd) clg.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "lambda$getKeywordToRequiredContentMap$8", 422, "ContentDownloadTask.java")).v("Total of %d images expected on disk on successful task completion", Collection$EL.stream(a.r()).map(byw.q).distinct().count());
                        return a;
                    }
                }, clgVar.h);
            case 17:
                Object obj26 = this.a;
                Object obj27 = this.b;
                if (((jre) obj).e() || ((cly) obj26).j.get(obj27) == null) {
                    return ((cly) obj26).d.b((String) obj27);
                }
                return kcu.K(bze.a);
            case 18:
                Object obj28 = this.a;
                Object obj29 = this.b;
                File file = (File) obj;
                cra craVar = (cra) obj29;
                if (!cnx.e(craVar.a.d())) {
                    g = ldu.a;
                } else if (((Boolean) cqq.a.c()).booleanValue()) {
                    g = ldu.a;
                } else if (!((Boolean) cqq.b.c()).booleanValue()) {
                    g = ldu.a;
                } else {
                    cqq cqqVar = (cqq) obj28;
                    if (crp.b(cqqVar.e, craVar.c)) {
                        g = cqqVar.b() ? lfb.g(cre.WHATSAPP_WEBP) : ldu.a;
                    } else {
                        g = lfb.g(cre.PNG);
                    }
                }
                if (g.e()) {
                    cre creVar = (cre) g.a();
                    cqq cqqVar2 = (cqq) obj28;
                    hiz x = hiz.p(new cak(cqqVar2, craVar, creVar, 2), cqqVar2.f).x(cqq.d, TimeUnit.MILLISECONDS, cqqVar2.g);
                    x.F(new bvo(cqqVar2, creVar, 8), mjl.a);
                    n = x.c(obj29);
                } else {
                    n = hiz.n(obj29);
                }
                cqq cqqVar3 = (cqq) obj28;
                return n.u(new cjq(cqqVar3, file, 2), cqqVar3.f);
            case 19:
                Throwable th3 = (Throwable) obj;
                cqq cqqVar4 = (cqq) this.b;
                return crk.b(cqqVar4.e, (cqp) this.a, cqqVar4.f);
            default:
                Object obj30 = this.a;
                ((ltd) ((ltd) dhj.a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingOnlineSuperpacks", "lambda$syncInternal$0", 261, "HandwritingOnlineSuperpacks.java")).G("syncInternal(): used %s to update cache, success=%s", this.b, (Boolean) obj);
                dhj dhjVar = (dhj) obj30;
                bze bzeVar = dhjVar.k;
                String str2 = ((dhn) obj30).l;
                dhk dhkVar = new dhk(dhjVar, dhjVar.h, ((bzr) bzeVar).j, dhjVar.e);
                jyu g2 = jsq.g();
                g2.e("useForeground", true);
                return bzeVar.h(str2, dhkVar, g2.b());
        }
    }
}
