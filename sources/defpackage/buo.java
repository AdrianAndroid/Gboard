package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.PreferenceCategoryHeader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: buo  reason: default package */
/* loaded from: classes.dex */
public final class buo implements mka {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public buo(brw brwVar, int i) {
        this.b = i;
        this.a = brwVar;
    }

    public buo(buo buoVar, int i, byte[] bArr) {
        this.b = i;
        this.a = buoVar;
    }

    public buo(buq buqVar, int i) {
        this.b = i;
        this.a = buqVar;
    }

    public buo(bvp bvpVar, int i) {
        this.b = i;
        this.a = bvpVar;
    }

    public buo(bzm bzmVar, int i) {
        this.b = i;
        this.a = bzmVar;
    }

    public buo(ceq ceqVar, int i) {
        this.b = i;
        this.a = ceqVar;
    }

    public buo(cly clyVar, int i) {
        this.b = i;
        this.a = clyVar;
    }

    public buo(LatinIme latinIme, int i) {
        this.b = i;
        this.a = latinIme;
    }

    public buo(cqq cqqVar, int i) {
        this.b = i;
        this.a = cqqVar;
    }

    public buo(cvx cvxVar, int i) {
        this.b = i;
        this.a = cvxVar;
    }

    public buo(cwl cwlVar, int i) {
        this.b = i;
        this.a = cwlVar;
    }

    public buo(dbn dbnVar, int i) {
        this.b = i;
        this.a = dbnVar;
    }

    public buo(dfh dfhVar, int i) {
        this.b = i;
        this.a = dfhVar;
    }

    public buo(dkg dkgVar, int i) {
        this.b = i;
        this.a = dkgVar;
    }

    public buo(dne dneVar, int i) {
        this.b = i;
        this.a = dneVar;
    }

    public buo(dro droVar, int i) {
        this.b = i;
        this.a = droVar;
    }

    public buo(dtp dtpVar, int i) {
        this.b = i;
        this.a = dtpVar;
    }

    public buo(duf dufVar, int i) {
        this.b = i;
        this.a = dufVar;
    }

    public buo(oin oinVar, int i) {
        this.b = i;
        this.a = oinVar;
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v106, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [dro, java.lang.Object] */
    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        cvu cvuVar;
        cvu cvuVar2;
        cvu cvuVar3;
        switch (this.b) {
            case 0:
                List<buk> list = (List) obj;
                bup bupVar = ((buq) this.a).c;
                if (bupVar == null || list == null) {
                    return;
                }
                bvf bvfVar = (bvf) bupVar;
                bvfVar.p.clear();
                List list2 = bvfVar.p;
                ArrayList arrayList = new ArrayList();
                for (buk bukVar : list) {
                    String j = bukVar.j();
                    if (TextUtils.isEmpty(bukVar.i()) && !TextUtils.isEmpty(j)) {
                        try {
                            ((bvf) bupVar).e.put(j, MediaStore.Images.Media.getBitmap(((bvf) bupVar).f.getContentResolver(), Uri.parse(j)));
                        } catch (IOException | IllegalStateException | SecurityException e) {
                            arrayList.add(bukVar);
                            ((ltd) ((ltd) ((ltd) bvf.d.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardAdapter", "filterInaccessibleImageClipItems", (char) 629, "ClipboardAdapter.java")).t("Error getting bitmap from uri");
                        }
                    }
                }
                list.removeAll(arrayList);
                list2.addAll(list);
                bvfVar.H(false);
                ((ls) bupVar).fc();
                bvfVar.n.f();
                return;
            case 1:
                ((brw) this.a).d(4, Boolean.TRUE.equals((Boolean) obj));
                return;
            case 2:
                Void r0 = (Void) obj;
                bvp.s((bvp) this.a);
                return;
            case 3:
                if (((jqm) obj) != null) {
                    ((bzm) this.a).d.h.e(irk.STATE_REACHED, bzr.p(((bzm) this.a).a), 2);
                    return;
                } else {
                    ((ltd) ((ltd) bzr.c.c()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl$3$1", "onSuccess", 568, "SuperpacksManagerImpl.java")).w("%s.registerManifest() failed", ((bzm) this.a).a);
                    return;
                }
            case 4:
                Void r02 = (Void) obj;
                ceq ceqVar = (ceq) this.a;
                ffb.m(ceqVar.d, ceqVar.e, "delight_apps");
                return;
            case 5:
                ((cly) ((buo) this.a).a).i.set((jqm) obj);
                return;
            case 6:
                Integer num = (Integer) obj;
                if (num == null || num.intValue() == -1) {
                    return;
                }
                ((cly) this.a).g.set(num.intValue());
                kcu.U(((cly) this.a).d.d("emoji", num.intValue()), new buo(this, 5, null), ((cly) this.a).f);
                return;
            case 7:
                File file = (File) obj;
                ((cqq) this.a).i.e(cqw.BITMOJI_SHARE_API_RESPONSE, Integer.valueOf(cre.PNG.e));
                return;
            case 8:
                llp llpVar = (llp) obj;
                idk idkVar = ((cvx) this.a).c;
                ctf ctfVar = ctf.BITMOJI_FETCHER_GET_PACKS_REFRESH_CACHE;
                Object[] objArr = new Object[1];
                if (llpVar == null || llpVar.isEmpty()) {
                    cvuVar = cvu.SUCCESS_WITH_EMPTY_RESULT;
                } else {
                    cvuVar = cvu.SUCCESS;
                }
                objArr[0] = cvuVar;
                idkVar.e(ctfVar, objArr);
                return;
            case 9:
                llp llpVar2 = (llp) obj;
                idk idkVar2 = ((cvx) this.a).c;
                ctf ctfVar2 = ctf.BITMOJI_FETCHER_SEARCH;
                Object[] objArr2 = new Object[1];
                if (llpVar2 == null || llpVar2.isEmpty()) {
                    cvuVar2 = cvu.SUCCESS_WITH_EMPTY_RESULT;
                } else {
                    cvuVar2 = cvu.SUCCESS;
                }
                objArr2[0] = cvuVar2;
                idkVar2.e(ctfVar2, objArr2);
                return;
            case 10:
                llp llpVar3 = (llp) obj;
                idk idkVar3 = ((cvx) this.a).c;
                ctf ctfVar3 = ctf.BITMOJI_FETCHER_SUGGEST;
                Object[] objArr3 = new Object[1];
                if (llpVar3 == null || llpVar3.isEmpty()) {
                    cvuVar3 = cvu.SUCCESS_WITH_EMPTY_RESULT;
                } else {
                    cvuVar3 = cvu.SUCCESS;
                }
                objArr3[0] = cvuVar3;
                idkVar3.e(ctfVar3, objArr3);
                return;
            case 11:
                Void r03 = (Void) obj;
                ((aia) ((cwl) this.a).c.a()).f("pref_key_expressive_stickers_set_default_favorites", true);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                dcz dczVar = (dcz) obj;
                if (dczVar == null) {
                    return;
                }
                int i = dczVar.f.d;
                for (int i2 = 0; i2 < i; i2++) {
                    htf htfVar = (htf) dczVar.f.f(i2);
                    for (ice iceVar : ice.values()) {
                        htfVar.a.ab(iceVar);
                    }
                }
                int i3 = dczVar.f.d;
                for (int i4 = 0; i4 < i3; i4++) {
                    gvt.a(((htf) dczVar.f.f(i4)).a);
                }
                dczVar.f.clear();
                ((ltd) ((ltd) dbn.b.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension$3", "onSuccess", 524, "AbstractOpenableExtension.java")).w("KeyboardGroupManager destroyed in %s.", this.a.getClass().getSimpleName());
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ict[] ictVarArr = (ict[]) obj;
                dfh dfhVar = (dfh) this.a;
                if (dfhVar.w == ictVarArr) {
                    return;
                }
                dfhVar.w = ictVarArr;
                dfhVar.B();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((dkg) this.a).a.d((byy) obj);
                return;
            case 15:
                llp llpVar4 = (llp) obj;
                Object obj2 = this.a;
                Context fS = ((an) obj2).fS();
                if (fS == null) {
                    return;
                }
                ((dne) obj2).ai = new dng(fS, llpVar4);
                return;
            case 16:
                ((LatinIme) this.a).g().j((mrm) obj);
                return;
            case 17:
                byy byyVar = (byy) obj;
                for (String str : byyVar.h()) {
                    File f = byyVar.f(str);
                    lug lugVar = drp.a;
                    f.length();
                    this.a.a(f);
                }
                return;
            case 18:
                Void r04 = (Void) obj;
                if (!dtp.l()) {
                    return;
                }
                ((dtp) this.a).i.c();
                return;
            case 19:
                fid fidVar = (fid) obj;
                Object obj3 = this.a;
                ((ltd) ((ltd) duf.c.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/preference/VoiceCommandsListFragment", "renderContent", 88, "VoiceCommandsListFragment.java")).t("Rendering the commands");
                PreferenceScreen preferenceScreen = ((duf) obj3).e;
                an anVar = (an) obj3;
                ap B = anVar.B();
                if (preferenceScreen == null || B == null || !anVar.ai()) {
                    ((ltd) ((ltd) duf.c.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/preference/VoiceCommandsListFragment", "renderContent", 92, "VoiceCommandsListFragment.java")).t("Render callback on stopped fragment");
                    return;
                }
                preferenceScreen.ae();
                dxf b = dxf.b(B);
                for (fic ficVar : fidVar.b) {
                    PreferenceCategoryHeader preferenceCategoryHeader = new PreferenceCategoryHeader(B, null);
                    preferenceCategoryHeader.Q(b.a(ficVar.a));
                    preferenceScreen.ah(preferenceCategoryHeader);
                    for (fie fieVar : ficVar.b) {
                        due dueVar = new due(B);
                        bkj bkjVar = fieVar.a;
                        if (bkjVar == null) {
                            bkjVar = bkj.h;
                        }
                        dueVar.Q(b.a(bkjVar.a));
                        bkj bkjVar2 = fieVar.a;
                        if (bkjVar2 == null) {
                            bkjVar2 = bkj.h;
                        }
                        dueVar.n(b.a(bkjVar2.b));
                        dueVar.K(false);
                        dueVar.x = false;
                        dueVar.ad();
                        preferenceCategoryHeader.ah(dueVar);
                    }
                }
                due dueVar2 = new due(B);
                dueVar2.n(b.a(B.getString(R.string.f158880_resource_name_obfuscated_res_0x7f140580)));
                dueVar2.K(false);
                dueVar2.x = false;
                dueVar2.ad();
                preferenceScreen.ah(dueVar2);
                return;
            default:
                Void r05 = (Void) obj;
                this.a.c(nez.a);
                this.a.a();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r13v37, types: [oin, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((ltd) ((ltd) ((ltd) buq.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipItemDataSource$1", "onFailure", (char) 347, "ClipItemDataSource.java")).t("Failed to load data from data source.");
                return;
            case 1:
                ((ltd) ((ltd) ((ltd) brw.a.c()).i(th)).k("com/google/android/apps/inputmethod/latin/preference/dictionary/LatinSyncDictionarySettings$3", "onFailure", (char) 193, "LatinSyncDictionarySettings.java")).t("Failed to clear user dict.");
                ((brw) this.a).d(4, false);
                return;
            case 2:
                bvp.s((bvp) this.a);
                ((ltd) ((ltd) ((ltd) bvp.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardDataHandler$6", "onFailure", (char) 660, "ClipboardDataHandler.java")).t("Failed to delete expired items");
                return;
            case 3:
                if (th instanceof CancellationException) {
                    ((ltd) ((ltd) bzr.c.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl$3$1", "onFailure", 578, "SuperpacksManagerImpl.java")).w("%s.registerManifest() cancelled", ((bzm) this.a).a);
                    return;
                } else {
                    ((ltd) ((ltd) ((ltd) bzr.c.c()).i(th)).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl$3$1", "onFailure", 580, "SuperpacksManagerImpl.java")).w("%s.registerManifest() failed", ((bzm) this.a).a);
                    return;
                }
            case 4:
                if (((Long) cfd.f.c()).longValue() >= 0 || !(th instanceof cel)) {
                    ((luc) ((luc) ((luc) ceq.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightAppsSuperpacksManager$1", "onFailure", 192, "SuperDelightAppsSuperpacksManager.java")).s();
                    return;
                } else {
                    lug lugVar = ceq.a;
                    return;
                }
            case 5:
                ((ltd) ((ltd) ((ltd) cly.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSuperpacksManager$1$1", "onFailure", (char) 248, "EmojiSuperpacksManager.java")).t("getSuperpackManifest()");
                return;
            case 6:
                ((ltd) ((ltd) ((ltd) cly.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSuperpacksManager$1", "onFailure", (char) 257, "EmojiSuperpacksManager.java")).t("getRegisteredVersion()");
                return;
            case 7:
                ((cqq) this.a).i.e(cqw.BITMOJI_SHARE_API_RESPONSE, Integer.valueOf(cre.PNG.f));
                if (th instanceof CancellationException) {
                    ((cqq) this.a).i.e(cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE, 4);
                    return;
                } else if (!(th instanceof TimeoutException)) {
                    return;
                } else {
                    ((cqq) this.a).i.e(cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE, 3);
                    return;
                }
            case 8:
                ((cvx) this.a).c.e(ctf.BITMOJI_FETCHER_GET_PACKS_REFRESH_CACHE, cvx.a(th));
                return;
            case 9:
                ((cvx) this.a).c.e(ctf.BITMOJI_FETCHER_SEARCH, cvx.a(th));
                return;
            case 10:
                ((cvx) this.a).c.e(ctf.BITMOJI_FETCHER_SUGGEST, cvx.a(th));
                return;
            case 11:
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((ltd) ((ltd) dbn.b.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension$3", "onFailure", 532, "AbstractOpenableExtension.java")).w("Failed to load KeyboardGroupManager in %s.", this.a.getClass().getSimpleName());
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ltd) ((ltd) ((ltd) dfh.s.c()).i(th)).k("com/google/android/apps/inputmethod/libs/framework/keyboard/widget/PageableSoftKeyListHolderView$2", "onFailure", (char) 475, "PageableSoftKeyListHolderView.java")).t("Filtering softkey defs failed.");
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ltd) ((ltd) ((ltd) dkh.c.c()).i(th)).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/SuperpacksManagerBase$2$1", "onFailure", (char) 197, "SuperpacksManagerBase.java")).t("Error getting packs");
                return;
            case 15:
                ((ltd) ((ltd) ((ltd) dne.c.c()).i(th)).k("com/google/android/apps/inputmethod/libs/languageselection/preference/AddLanguagePreferenceFragment$1", "onFailure", (char) 200, "AddLanguagePreferenceFragment.java")).t("Failed to get available languages.");
                return;
            case 16:
                if (!(th instanceof IOException)) {
                    return;
                }
                ((ltd) ((ltd) ((ltd) LatinIme.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/latin5/LatinIme$6", "onFailure", (char) 731, "LatinIme.java")).t("Error reading or parsing keyboard layout file");
                return;
            case 17:
                ((luc) ((luc) ((luc) drp.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/mozc/ime/MozcSuperpacks$2", "onFailure", (char) 164, "MozcSuperpacks.java")).t("Failed to sync packs.");
                return;
            case 18:
                ((ltd) ((ltd) ((ltd) dtp.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/input/NgaInputManager$1", "onFailure", (char) 438, "NgaInputManager.java")).t("Read back failed.");
                if (!dtp.l()) {
                    return;
                }
                ((dtp) this.a).i.c();
                return;
            case 19:
                ((ltd) ((ltd) ((ltd) duf.c.c()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/preference/VoiceCommandsListFragment$1", "onFailure", 'K', "VoiceCommandsListFragment.java")).t("Failed to load commands");
                return;
            default:
                ((ltd) ((ltd) ((ltd) duk.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardDictationServiceGrpcImpl$3", "onFailure", 347, "KeyboardDictationServiceGrpcImpl.java")).w("Failed to set user emoji preference for concept: %s.", th.getMessage());
                this.a.b(nvu.k.f("Failed to set user emoji preference for concept.").g());
                return;
        }
    }
}
