package defpackage;

import android.content.Context;
import android.os.PersistableBundle;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.google.android.apps.inputmethod.libs.hmm.DataManagerImpl;
import com.google.android.apps.inputmethod.libs.languageselection.preference.KeyboardLayoutListPreference;
import com.google.android.apps.inputmethod.libs.trainingcache.replaycache.precomputedfeature.speech.examplestoreservice.SpeechPrecomputedFeatureExampleStoreService;
import com.google.android.apps.inputmethod.libs.voiceime.backend.ondevice.OnDevicePackDownloadRunner;
import com.google.android.inputmethod.latin.R;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bvo  reason: default package */
/* loaded from: classes.dex */
public final class bvo implements mka {
    final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bvo(bvp bvpVar, buk bukVar, int i) {
        this.c = i;
        this.a = bvpVar;
        this.b = bukVar;
    }

    public bvo(bvp bvpVar, List list, int i) {
        this.c = i;
        this.b = bvpVar;
        this.a = list;
    }

    public bvo(byb bybVar, Locale locale, int i) {
        this.c = i;
        this.b = bybVar;
        this.a = locale;
    }

    public bvo(cdv cdvVar, jav javVar, int i) {
        this.c = i;
        this.b = cdvVar;
        this.a = javVar;
    }

    public bvo(cfd cfdVar, String str, int i) {
        this.c = i;
        this.b = cfdVar;
        this.a = str;
    }

    public bvo(cfn cfnVar, HashSet hashSet, int i) {
        this.c = i;
        this.b = cfnVar;
        this.a = hashSet;
    }

    public bvo(cfn cfnVar, Locale locale, int i) {
        this.c = i;
        this.b = cfnVar;
        this.a = locale;
    }

    public bvo(cqq cqqVar, cre creVar, int i) {
        this.c = i;
        this.b = cqqVar;
        this.a = creVar;
    }

    public bvo(cvl cvlVar, Locale locale, int i) {
        this.c = i;
        this.b = cvlVar;
        this.a = locale;
    }

    public bvo(dij dijVar, dki dkiVar, int i) {
        this.c = i;
        this.b = dijVar;
        this.a = dkiVar;
    }

    public bvo(dne dneVar, mko mkoVar, int i) {
        this.c = i;
        this.b = dneVar;
        this.a = mkoVar;
    }

    public bvo(dnm dnmVar, mko mkoVar, int i) {
        this.c = i;
        this.b = dnmVar;
        this.a = mkoVar;
    }

    public bvo(duk dukVar, oin oinVar, int i) {
        this.c = i;
        this.b = dukVar;
        this.a = oinVar;
    }

    public bvo(exg exgVar, evg evgVar, int i) {
        this.c = i;
        this.a = exgVar;
        this.b = evgVar;
    }

    public bvo(feb febVar, jav javVar, int i) {
        this.c = i;
        this.b = febVar;
        this.a = javVar;
    }

    public bvo(fwi fwiVar, String str, int i) {
        this.c = i;
        this.b = fwiVar;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v32, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v34, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v36, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v37, types: [fwi, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        switch (this.c) {
            case 0:
                ((ltd) ((ltd) ((ltd) bvp.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardDataHandler$4", "onFailure", (char) 565, "ClipboardDataHandler.java")).t("Failed to insert clip item to database.");
                return;
            case 1:
                ((bvp) this.a).f((buk) this.b);
                ((ltd) ((ltd) ((ltd) bvp.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardDataHandler$3", "onFailure", (char) 434, "ClipboardDataHandler.java")).t("Failed to get entity items.");
                return;
            case 2:
                ((ltd) ((ltd) ((ltd) bvp.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardDataHandler$5", "onFailure", (char) 585, "ClipboardDataHandler.java")).t("Failed to insert clip item to database.");
                return;
            case 3:
                ((luc) ((luc) ((luc) ((byb) this.b).c.d()).i(th)).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager$1", "onFailure", (char) 437, "AbstractModelManager.java")).t("sync()");
                return;
            case 4:
                ((ltd) ((ltd) cdv.a.a(hip.a).i(th)).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper$5", "onFailure", 428, "LanguageIdentifierWrapper.java")).w("Failed to get best entry for language [%s]", this.a);
                return;
            case 5:
                ((luc) ((luc) ((luc) cfd.h.d()).i(th)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager$2", "onFailure", 641, "SuperDelightManager.java")).s();
                return;
            case 6:
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) cfn.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKLPDownloader$2", "onFailure", 165, "DelightKLPDownloader.java")).w("Error downloading klp for %s", this.a);
                return;
            case 8:
                ((cqq) this.b).i.e(cqw.BITMOJI_SHARE_API_RESPONSE, Integer.valueOf(((cre) this.a).f));
                if (th instanceof CancellationException) {
                    ((cqq) this.b).i.e(cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE, 4);
                    return;
                } else if (!(th instanceof TimeoutException)) {
                    return;
                } else {
                    ((cqq) this.b).i.e(cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE, 3);
                    return;
                }
            case 9:
                ((cvl) this.b).f.e(ctf.BITMOJI_CACHE_STORE_GET_PACKS, cvl.a(th));
                return;
            case 10:
                DataManagerImpl J = ((dij) this.b).J();
                if (J == null) {
                    return;
                }
                J.b(((dki) this.a).g);
                return;
            case 11:
                ((ltd) ((ltd) ((ltd) dne.c.c()).i(th)).k("com/google/android/apps/inputmethod/libs/languageselection/preference/AddLanguagePreferenceFragment$2", "onFailure", (char) 373, "AddLanguagePreferenceFragment.java")).t("Failed to get language search results.");
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ?? r0 = this.a;
                if (r0 != ((dnm) this.b).aj || r0.isCancelled()) {
                    return;
                }
                dnm dnmVar = (dnm) this.b;
                dnmVar.al = false;
                dnmVar.aj = null;
                ((ltd) ((ltd) dnm.c.a(hip.a).i(th)).k("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageSpecificSettingFragment$1", "onFailure", 427, "LanguageSpecificSettingFragment.java")).t("Failed to initialize");
                gyc.b.hP(new dgd(this, 13, null));
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (((dnm) this.b).ak != this.a) {
                    return;
                }
                ((ltd) ((ltd) ((ltd) dnm.c.c()).i(th)).k("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageSpecificSettingFragment$2", "onFailure", (char) 714, "LanguageSpecificSettingFragment.java")).t("Failed to reload input method entries");
                dnm.aS((dnm) this.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ltd) ((ltd) ((ltd) duk.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardDictationServiceGrpcImpl$1", "onFailure", 258, "KeyboardDictationServiceGrpcImpl.java")).w("Failed to get emoji predictions: %s.", th.getMessage());
                this.a.b(nvu.k.f("Failed to get emoji predictions.").g());
                return;
            case 15:
                ((ltd) ((ltd) ((ltd) duk.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardDictationServiceGrpcImpl$2", "onFailure", 303, "KeyboardDictationServiceGrpcImpl.java")).w("Failed to get concept emojis: %s.", th.getMessage());
                this.a.b(nvu.k.f("Failed to get concept emojis.").g());
                return;
            case 16:
                ((ltd) ((ltd) ((ltd) duk.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardDictationServiceGrpcImpl$4", "onFailure", 393, "KeyboardDictationServiceGrpcImpl.java")).w("Failed to get search emoji: %s.", th.getMessage());
                this.a.b(nvu.k.f("Failed to search emoji.").g());
                return;
            case 17:
                ((ltd) ((ltd) ((ltd) exg.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationTrainerManager$1", "onFailure", 't', "LanguageModelPersonalizationTrainerManager.java")).t("Failed to get language model personalization packs.");
                return;
            case 18:
                ((ltd) ((ltd) ((ltd) SpeechPrecomputedFeatureExampleStoreService.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService$1", "onFailure", (char) 153, "SpeechPrecomputedFeatureExampleStoreService.java")).t("startQuery() : Failed reading pre-computed features.");
                this.b.a(13, "startQuery() : Failed reading pre-computed features from path ".concat(String.valueOf(this.a)));
                return;
            case 19:
                ((ltd) ((ltd) ((ltd) feb.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider$1", "onFailure", (char) 340, "OnDeviceRecognitionProvider.java")).t("maybeExecuteForegroundDownload() : Download failed");
                return;
            default:
                ((ltd) ((ltd) ((ltd) feb.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider$2", "onFailure", (char) 383, "OnDeviceRecognitionProvider.java")).t("maybeScheduleAutoPackDownload() : Failed to download");
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v140, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v146, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v152, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v105, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v113, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v120, types: [fwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        cvk cvkVar;
        int i = 3;
        Editable editable = null;
        int i2 = 0;
        switch (this.c) {
            case 0:
                Void r1 = (Void) obj;
                Object obj2 = this.b;
                long j = ((buk) this.a.get(0)).e;
                bvp bvpVar = (bvp) obj2;
                if (j < bvpVar.q.o(R.string.f160590_resource_name_obfuscated_res_0x7f140658, 0L)) {
                    bvpVar.q.t(R.string.f160590_resource_name_obfuscated_res_0x7f140658, j);
                }
                Object obj3 = this.b;
                final int i3 = ((lrl) this.a).c;
                final bvp bvpVar2 = (bvp) obj3;
                if (bvpVar2.i == null) {
                    bvpVar2.i = gxo.a(10).hQ(new Callable() { // from class: bvk
                        /* JADX WARN: Removed duplicated region for block: B:51:0x00de A[Catch: all -> 0x012e, TryCatch #2 {RuntimeException -> 0x014a, blocks: (B:10:0x003e, B:22:0x006d, B:12:0x0043, B:20:0x0068, B:67:0x0127, B:17:0x0057, B:29:0x0076, B:32:0x007d, B:35:0x0084, B:36:0x009b, B:38:0x00a1, B:42:0x00b3, B:44:0x00c5, B:48:0x00c9, B:49:0x00d4, B:51:0x00de, B:55:0x00e5, B:58:0x00ec, B:59:0x00fd, B:61:0x0103, B:63:0x0116, B:64:0x011f, B:71:0x0053, B:72:0x004b), top: B:9:0x003e }] */
                        /* JADX WARN: Removed duplicated region for block: B:67:0x0127 A[Catch: all -> 0x013c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x014a, blocks: (B:10:0x003e, B:22:0x006d, B:12:0x0043, B:20:0x0068, B:67:0x0127, B:17:0x0057, B:29:0x0076, B:32:0x007d, B:35:0x0084, B:36:0x009b, B:38:0x00a1, B:42:0x00b3, B:44:0x00c5, B:48:0x00c9, B:49:0x00d4, B:51:0x00de, B:55:0x00e5, B:58:0x00ec, B:59:0x00fd, B:61:0x0103, B:63:0x0116, B:64:0x011f, B:71:0x0053, B:72:0x004b), top: B:9:0x003e }] */
                        /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instructions count: 353
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.call():java.lang.Object");
                        }
                    });
                    kcu.U(bvpVar2.i, new buo(bvpVar2, 2), gxo.a(10));
                }
                Object obj4 = this.b;
                ?? r2 = this.a;
                ieh j2 = ieh.j();
                String j3 = ((buk) r2.get(0)).j();
                if (!TextUtils.isEmpty(j3)) {
                    bwa bwaVar = bwa.ADD_ITEM_EVENT;
                    Object[] objArr = new Object[1];
                    if (true != bvu.l(((bvp) obj4).c, j3)) {
                        i = 5;
                    }
                    objArr[0] = Integer.valueOf(i);
                    j2.e(bwaVar, objArr);
                    return;
                }
                j2.e(bwa.ADD_ITEM_EVENT, 0);
                return;
            case 1:
                llp llpVar = (llp) obj;
                if (llpVar != null) {
                    ((bvp) this.a).g(llpVar);
                    ieh.j().e(bwa.ENTITY_NUMBER_IN_ORIGINAL_TEXT, Integer.valueOf(llpVar.size() - 1));
                    return;
                }
                ((bvp) this.a).f((buk) this.b);
                return;
            case 2:
                Void r12 = (Void) obj;
                ltg ltgVar = bvp.a;
                lta listIterator = ((llp) this.a).listIterator();
                while (listIterator.hasNext()) {
                    buk bukVar = (buk) listIterator.next();
                    bwi bwiVar = ((bvp) this.b).r;
                    if (bwiVar != null) {
                        bwiVar.u(bukVar);
                    }
                }
                return;
            case 3:
                jre jreVar = (jre) obj;
                Object obj5 = this.a;
                if (obj5 != null && ((byb) this.b).k((Locale) obj5, null) == null) {
                    return;
                }
                Iterator it = ((byb) this.b).e.iterator();
                while (it.hasNext()) {
                    ((byd) it.next()).b();
                }
                return;
            case 4:
                hqt hqtVar = (hqt) obj;
                if (hqtVar == null || ((cdv) this.b).n.q(hqtVar)) {
                    ((ltd) cdv.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper$5", "onSuccess", 419, "LanguageIdentifierWrapper.java")).w("Can't enable [%s], its already enabled, or not yet supported.", this.a);
                    return;
                }
                cdv cdvVar = (cdv) this.b;
                ((AtomicInteger) cdvVar.r.d).incrementAndGet();
                String format = String.format(cdvVar.b.getString(R.string.f159110_resource_name_obfuscated_res_0x7f1405a2), jav.f(hqtVar.i().g).m(cdvVar.b));
                jav i4 = hqtVar.i();
                ieh.j().e(cap.LANG_ID_POSTED_SUGGESTION_NOTICE, i4);
                hkr a = hkt.a();
                a.i(format);
                a.e("LangIdWrapper");
                a.f(((Long) cas.o.c()).longValue());
                a.g(1);
                a.c = new bwt(cdvVar, hqtVar, 7);
                a.d = new bwt(cdvVar, i4, 8);
                a.f = bon.d;
                hkv.b(a.a());
                return;
            case 5:
                byy byyVar = (byy) obj;
                ((luc) ((luc) cfd.h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager$2", "onSuccess", 633, "SuperDelightManager.java")).w("%s sync success, adding to data file manager", this.a);
                Context context = ((cfd) this.b).i;
                if (byyVar == null) {
                    byyVar = byy.a;
                }
                ffb.m(context, byyVar, (String) this.a);
                return;
            case 6:
                for (String str : (List) obj) {
                    if (str.startsWith("__KLP") && !((HashSet) this.a).contains(str)) {
                        ((ltd) ((ltd) cfn.a.b()).k("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKLPDownloader$1", "onSuccess", 106, "DelightKLPDownloader.java")).w("removing filegroup %s", str);
                        ((cfn) this.b).b.g(str);
                    }
                }
                return;
            case 7:
                jho jhoVar = (jho) obj;
                Object obj6 = this.b;
                Object obj7 = this.a;
                File e = ((cfn) obj6).b.e((jhn) jhoVar.g.get(0));
                if (e == null) {
                    throw new IllegalStateException(String.format("Downloaded file %s not found", ((jhn) jhoVar.g.get(0)).c));
                }
                nfh t = gzf.j.t();
                String absolutePath = e.getAbsolutePath();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gzf gzfVar = (gzf) t.b;
                absolutePath.getClass();
                int i5 = gzfVar.a | 4;
                gzfVar.a = i5;
                gzfVar.d = absolutePath;
                gzfVar.a = 1 | i5;
                gzfVar.b = "delight";
                String languageTag = ((Locale) obj7).toLanguageTag();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gzf gzfVar2 = (gzf) t.b;
                languageTag.getClass();
                int i6 = gzfVar2.a | 2;
                gzfVar2.a = i6;
                gzfVar2.c = languageTag;
                int i7 = jhoVar.e;
                int i8 = i6 | 32;
                gzfVar2.a = i8;
                gzfVar2.g = i7;
                gzfVar2.a = i8 | 128;
                gzfVar2.i = "mdd";
                gzf gzfVar3 = (gzf) t.cz();
                Object obj8 = this.b;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gzfVar3);
                ArrayList arrayList2 = new ArrayList();
                cfn cfnVar = (cfn) obj8;
                llp c = cfnVar.d.c(gzfVar3.b, gzfVar3.c);
                int size = c.size();
                while (i2 < size) {
                    gzf gzfVar4 = (gzf) c.get(i2);
                    if (TextUtils.equals(gzfVar4.i, gzfVar3.i)) {
                        if (gzfVar4.g == gzfVar3.g) {
                            arrayList.remove(gzfVar3);
                        } else {
                            arrayList2.add(gzfVar4);
                        }
                    }
                    i2++;
                }
                cfnVar.d.a(cfnVar.e, arrayList, arrayList2);
                ((ltd) ((ltd) cfn.a.b()).k("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKLPDownloader$2", "onSuccess", 159, "DelightKLPDownloader.java")).E("klp %s downloaded with version %d", this.a, jhoVar.e);
                return;
            case 8:
                idk idkVar = ((cqq) this.b).i;
                cqw cqwVar = cqw.BITMOJI_SHARE_API_RESPONSE;
                Object[] objArr2 = new Object[1];
                objArr2[0] = Integer.valueOf(((cra) obj).a.l().isEmpty() ? ((cre) this.a).f : ((cre) this.a).e);
                idkVar.e(cqwVar, objArr2);
                return;
            case 9:
                llp llpVar2 = (llp) obj;
                boolean i9 = cvl.i(((cvl) this.b).d, (Locale) this.a);
                if (llpVar2 == null || llpVar2.isEmpty()) {
                    if (i9) {
                        cvkVar = cvk.SUCCESS_WITH_STALE_EMPTY_RESULT;
                    } else {
                        cvkVar = cvk.SUCCESS_WITH_EMPTY_RESULT;
                    }
                } else if (i9) {
                    cvkVar = cvk.SUCCESS_WITH_STALE_RESULT;
                } else {
                    cvkVar = cvk.SUCCESS;
                }
                ((cvl) this.b).f.e(ctf.BITMOJI_CACHE_STORE_GET_PACKS, cvkVar);
                return;
            case 10:
                Boolean bool = (Boolean) obj;
                DataManagerImpl J = ((dij) this.b).J();
                if (J != null) {
                    J.b(((dki) this.a).g);
                }
                if (bool == null || bool.booleanValue()) {
                    if (((dki) this.a).f.exists()) {
                        ((dki) this.a).f.delete();
                    }
                    dki dkiVar = (dki) this.a;
                    if (!dkj.b(dkiVar.i, dkiVar.f)) {
                        return;
                    }
                    if (((dki) this.a).h.exists()) {
                        ((dki) this.a).h.delete();
                    }
                    Object obj9 = this.b;
                    String name = ((dki) this.a).f.getName();
                    dki dkiVar2 = (dki) this.a;
                    ((dij) obj9).F(name, dkiVar2.c, dkiVar2.d, dkiVar2.e);
                    ((dij) this.b).I(3);
                    return;
                }
                ((luc) ((luc) dkj.a.d()).k("com/google/android/apps/inputmethod/libs/hmm/userdictionary/UserDictVersionManager$1", "onSuccess", 134, "UserDictVersionManager.java")).w("Migrating user dictionary fails: %s", ((dki) this.a).c);
                return;
            case 11:
                llp<Preference> llpVar3 = (llp) obj;
                Object obj10 = this.a;
                Object obj11 = this.b;
                dne dneVar = (dne) obj11;
                if (obj10 != dneVar.ad) {
                    return;
                }
                dneVar.am.ae();
                SearchView searchView = dneVar.ac;
                if (searchView != null) {
                    editable = searchView.a.getText();
                }
                String trim = editable != null ? editable.toString().trim() : "";
                if (trim.isEmpty()) {
                    dneVar.aC();
                } else if (llpVar3.isEmpty()) {
                    an anVar = (an) obj11;
                    Preference preference = new Preference(anVar.fT());
                    preference.Q(anVar.L(R.string.f163240_resource_name_obfuscated_res_0x7f140774, trim));
                    preference.J(false);
                    preference.F = R.layout.f144650_resource_name_obfuscated_res_0x7f0e04f6;
                    dneVar.am.ah(preference);
                } else {
                    for (Preference preference2 : llpVar3) {
                        preference2.M(Integer.MAX_VALUE);
                        dneVar.am.ah(preference2);
                    }
                    gyc.b.hP(new dgd(dneVar, 10));
                }
                ((dnn) this.b).aE().v(false);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Boolean bool2 = (Boolean) obj;
                Object obj12 = this.a;
                dnm dnmVar = (dnm) this.b;
                if (obj12 != dnmVar.aj) {
                    return;
                }
                dnmVar.aj = null;
                dnmVar.al = bool2.booleanValue();
                if (((dnm) this.b).al) {
                    return;
                }
                gyc.b.hP(new dgd(this, 12, null));
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                List list = (List) obj;
                dnm dnmVar2 = (dnm) this.b;
                if (dnmVar2.ak != this.a) {
                    return;
                }
                dnm.aS(dnmVar2);
                while (i2 < list.size()) {
                    hqt hqtVar2 = (hqt) list.get(i2);
                    if (hqtVar2 != null) {
                        dnb dnbVar = (dnb) ((dnm) this.b).ah.get(i2);
                        dnb dnbVar2 = new dnb(hqtVar2, dnbVar.b);
                        dnbVar2.c = dnbVar.c;
                        ((dnm) this.b).ah.set(i2, dnbVar2);
                    }
                    i2++;
                }
                dnm dnmVar3 = (dnm) this.b;
                KeyboardLayoutListPreference keyboardLayoutListPreference = dnmVar3.af;
                if (keyboardLayoutListPreference == null) {
                    return;
                }
                keyboardLayoutListPreference.k(dnmVar3.aF(), ((dnm) this.b).aG());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                mwd mwdVar = (mwd) obj;
                ((duk) this.b).g.e(ctd.DICTATION_RANKED_EMOJI_PREDICTION_RESULTS, Integer.valueOf(mwdVar.a.size()));
                ((duk) this.b).g.e(ctd.DICTATION_RANKED_EMOJI_PREDICTION_CONCEPT_NAME_RESULTS, Integer.valueOf((int) Collection$EL.stream(mwdVar.a).filter(dzj.b).count()));
                ?? r22 = this.a;
                nfh t2 = fil.b.t();
                Stream map = Collection$EL.stream(mwdVar.a).map(byw.u);
                Objects.requireNonNull(t2);
                map.forEach(new chf(t2, 11));
                r22.c((fil) t2.cz());
                this.a.a();
                return;
            case 15:
                mwb mwbVar = (mwb) obj;
                ((duk) this.b).g.e(ctd.DICTATION_GET_EMOJI_FROM_CONCEPT_RESULTS, Integer.valueOf(mwbVar.a.size()));
                ?? r23 = this.a;
                nfh t3 = fhh.b.t();
                nga ngaVar = mwbVar.a;
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                fhh fhhVar = (fhh) t3.b;
                nga ngaVar2 = fhhVar.a;
                if (!ngaVar2.c()) {
                    fhhVar.a = nfm.H(ngaVar2);
                }
                ndt.cs(ngaVar, fhhVar.a);
                r23.c((fhh) t3.cz());
                this.a.a();
                return;
            case 16:
                mwb mwbVar2 = (mwb) obj;
                ((duk) this.b).g.e(ctd.DICTATION_GET_EMOJI_FROM_QUERY_RESULTS, Integer.valueOf(mwbVar2.a.size()));
                ?? r24 = this.a;
                nfh t4 = fip.b.t();
                nga ngaVar3 = mwbVar2.a;
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                fip fipVar = (fip) t4.b;
                nga ngaVar4 = fipVar.a;
                if (!ngaVar4.c()) {
                    fipVar.a = nfm.H(ngaVar4);
                }
                ndt.cs(ngaVar3, fipVar.a);
                r24.c((fip) t4.cz());
                this.a.a();
                return;
            case 17:
                llp llpVar4 = (llp) obj;
                int size2 = llpVar4.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    exn exnVar = (exn) llpVar4.get(i10);
                    Object obj13 = this.a;
                    Object obj14 = this.b;
                    File file = new File(exnVar.b, "local_computation_plan.pb");
                    if (file.exists()) {
                        String concat = "LMPersonalization-".concat(exnVar.a);
                        exg exgVar = (exg) obj13;
                        File file2 = new File(new File(exgVar.c.getFilesDir(), "personalization/lm" + File.separator + exnVar.a), "brella_outputs");
                        nfh t5 = nnq.i.t();
                        String str2 = exnVar.d.n;
                        if (t5.c) {
                            t5.cD();
                            t5.c = false;
                        }
                        nnq nnqVar = (nnq) t5.b;
                        str2.getClass();
                        nnqVar.a |= 1;
                        nnqVar.b = str2;
                        String name2 = exnVar.c.name();
                        if (t5.c) {
                            t5.cD();
                            t5.c = false;
                        }
                        nnq nnqVar2 = (nnq) t5.b;
                        name2.getClass();
                        int i11 = nnqVar2.a | 4;
                        nnqVar2.a = i11;
                        nnqVar2.d = name2;
                        evg evgVar = (evg) obj14;
                        boolean z = evgVar.a;
                        nnqVar2.a = i11 | 2;
                        nnqVar2.c = z;
                        gen c2 = gbh.c(exgVar.c, exgVar.e, exc.b(exgVar.c, concat, file, exnVar.b, file2, evgVar, (nnq) t5.cz()));
                        c2.l(exgVar.e, ewr.b);
                        c2.h(exgVar.e, exf.a);
                        c2.l(exgVar.e, new exi(exgVar, exnVar, 1));
                    } else {
                        ((ltd) ((ltd) exg.a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationTrainerManager", "registerTrainer", 131, "LanguageModelPersonalizationTrainerManager.java")).w("Local computation plan is not available, skip personalization for %s.", exnVar.a);
                    }
                }
                return;
            case 18:
                ((ltd) ((ltd) SpeechPrecomputedFeatureExampleStoreService.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService$1", "onSuccess", 147, "SpeechPrecomputedFeatureExampleStoreService.java")).t("startQuery() : Success reading pre-computed features.");
                this.b.b(new eya(((List) obj).iterator(), 0));
                return;
            case 19:
                Boolean bool3 = (Boolean) obj;
                if (bool3 == null || !bool3.booleanValue()) {
                    return;
                }
                ((ltd) ((ltd) feb.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider$1", "onSuccess", 328, "OnDeviceRecognitionProvider.java")).t("maybeExecuteForegroundDownload() : Pack available to download");
                ieh.j().e(fbm.ON_DEVICE_FOREGROUND_AUTO_DOWNLOAD_STATUS, 1);
                feo feoVar = ((feb) this.b).d;
                Object obj15 = this.a;
                ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "syncPacksOnWifiInForeground", 316, "SpeechPackManager.java")).t("syncPacksOnWifiInForeground()");
                feoVar.h(true, true, false, (jav) obj15);
                return;
            default:
                Boolean bool4 = (Boolean) obj;
                if (bool4 == null || !bool4.booleanValue()) {
                    return;
                }
                ((ltd) ((ltd) feb.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider$2", "onSuccess", 369, "OnDeviceRecognitionProvider.java")).t("maybeScheduleAutoPackDownload() : Success");
                ((feb) this.b).f.i("last_schedule_auto_download_time", System.currentTimeMillis());
                ino inoVar = ((feb) this.b).f;
                inoVar.h("number_of_schedule_times", inoVar.b("number_of_schedule_times", 0) + 1);
                isf a2 = ism.a(((feb) this.b).h);
                Object obj16 = this.a;
                ((ltd) ((ltd) OnDevicePackDownloadRunner.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadRunner", "schedulesPackDownload", 60, "OnDevicePackDownloadRunner.java")).w("schedule pack download : %s", obj16);
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("language_tag", ((jav) obj16).n);
                isn isnVar = OnDevicePackDownloadRunner.b;
                isnVar.i = persistableBundle;
                a2.c(isnVar.a());
                ieh.j().e(fbm.ON_DEVICE_AUTO_DOWNLOAD_STATUS, 0);
                return;
        }
    }
}
