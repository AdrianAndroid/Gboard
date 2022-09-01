package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.onboardingflow.KeyboardPreviewItemView;
import com.google.android.apps.inputmethod.libs.sharing.GboardSharingSetupDonePage;
import com.google.android.apps.inputmethod.libs.trainingcache.replaycache.sanitycheckeval.nwpp13n.examplestoreservice.NWPSanityCheckEvalExampleStoreService;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.inputmethod.trainingcache.localcomputation.LocalComputationResultHandlingService;
import com.google.android.libraries.stickers.megamode.MegamodeView;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cvt  reason: default package */
/* loaded from: classes.dex */
public final class cvt implements mka {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public cvt(NotificationManager notificationManager, uh uhVar, String str, int i) {
        this.d = i;
        this.c = notificationManager;
        this.b = uhVar;
        this.a = str;
    }

    public cvt(KeyboardPreviewItemView keyboardPreviewItemView, Context context, ImageView imageView, int i) {
        this.d = i;
        this.a = keyboardPreviewItemView;
        this.c = context;
        this.b = imageView;
    }

    public cvt(GboardSharingSetupDonePage gboardSharingSetupDonePage, els elsVar, String str, int i) {
        this.d = i;
        this.c = gboardSharingSetupDonePage;
        this.b = elsVar;
        this.a = str;
    }

    public cvt(NWPSanityCheckEvalExampleStoreService nWPSanityCheckEvalExampleStoreService, String str, fwi fwiVar, int i) {
        this.d = i;
        this.c = nWPSanityCheckEvalExampleStoreService;
        this.a = str;
        this.b = fwiVar;
    }

    public cvt(LocalComputationResultHandlingService localComputationResultHandlingService, ivu ivuVar, fxa fxaVar, int i, byte[] bArr) {
        this.d = i;
        this.b = localComputationResultHandlingService;
        this.a = ivuVar;
        this.c = fxaVar;
    }

    public cvt(MegamodeView megamodeView, String str, View view, int i) {
        this.d = i;
        this.b = megamodeView;
        this.a = str;
        this.c = view;
    }

    public cvt(cvx cvxVar, AtomicBoolean atomicBoolean, Locale locale, int i) {
        this.d = i;
        this.c = cvxVar;
        this.a = atomicBoolean;
        this.b = locale;
    }

    public cvt(dxm dxmVar, hqy hqyVar, jav javVar, int i) {
        this.d = i;
        this.c = dxmVar;
        this.b = hqyVar;
        this.a = javVar;
    }

    public cvt(els elsVar, gzl gzlVar, String str, int i) {
        this.d = i;
        this.c = elsVar;
        this.b = gzlVar;
        this.a = str;
    }

    public cvt(etg etgVar, ete eteVar, String str, int i) {
        this.d = i;
        this.b = etgVar;
        this.c = eteVar;
        this.a = str;
    }

    public cvt(etw etwVar, mko mkoVar, Intent intent, int i) {
        this.d = i;
        this.b = etwVar;
        this.a = mkoVar;
        this.c = intent;
    }

    public cvt(hrc hrcVar, jav javVar, mko mkoVar, int i) {
        this.d = i;
        this.c = hrcVar;
        this.b = javVar;
        this.a = mkoVar;
    }

    public cvt(jjb jjbVar, jhw jhwVar, String str, int i) {
        this.d = i;
        this.b = jjbVar;
        this.c = jhwVar;
        this.a = str;
    }

    public cvt(kog kogVar, String str, String str2, int i) {
        this.d = i;
        this.c = kogVar;
        this.b = str;
        this.a = str2;
    }

    private final void c() {
        Object obj = this.a;
        etw etwVar = (etw) this.b;
        if (obj == etwVar.o) {
            etwVar.p(false);
            etw etwVar2 = (etw) this.b;
            etwVar2.o = null;
            etwVar2.p = null;
        }
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [fwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [ete, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [ivu, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        switch (this.d) {
            case 0:
                ((cvx) this.c).c.e(ctf.BITMOJI_FETCHER_GET_PACKS, cvx.a(th));
                return;
            case 1:
                ((ltd) ((ltd) ((ltd) byt.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/ForegroundDownloadTrackerImpl$1", "onFailure", 390, "ForegroundDownloadTrackerImpl.java")).w("updateNotificationWaitForWifi() : Failed to update notification for %s", this.a);
                return;
            case 2:
                ((ltd) ((ltd) ((ltd) dxm.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/onboardingflow/JapaneseLayoutSetupOverlay$3", "onFailure", (char) 260, "JapaneseLayoutSetupOverlay.java")).t("failed to fetch entry");
                return;
            case 3:
                ((luc) ((luc) ((luc) KeyboardPreviewItemView.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/onboardingflow/KeyboardPreviewItemView$1", "onFailure", (char) 152, "KeyboardPreviewItemView.java")).t("failed to fetch entry");
                return;
            case 4:
                ((ltd) ((ltd) ((ltd) GboardSharingSetupDonePage.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/sharing/GboardSharingSetupDonePage$1", "onFailure", '^', "GboardSharingSetupDonePage.java")).t("Failed to get createShortDynamicLink future callback.");
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) els.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/sharing/GboardSharingUtil$2", "onFailure", (char) 320, "GboardSharingUtil.java")).t("Failed to get method getInputMethodEntry future callback.");
                return;
            case 6:
                ((ltd) ((ltd) ((ltd) etg.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/theme/listing/PackagedThemesMegapacksManager$1", "onFailure", (char) 141, "PackagedThemesMegapacksManager.java")).t("requestThemePackage()");
                etg.f(this.c, (String) this.a, null);
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) etw.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer$1", "onFailure", (char) 285, "ThemeListingFragmentPeer.java")).t("fail to fetch theme file cross profile");
                c();
                return;
            case 8:
                ((ltd) ((ltd) ((ltd) NWPSanityCheckEvalExampleStoreService.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService$1", "onFailure", 171, "NWPSanityCheckEvalExampleStoreService.java")).w("startQuery() : Unable to get sanity check eval data for %s", this.a);
                ?? r12 = this.b;
                Object obj = this.a;
                r12.a(13, "Unable to get sanity check eval data for " + ((String) obj) + " locale.");
                return;
            case 9:
                ((ltd) ((ltd) ((ltd) hrc.a.c()).i(th)).k("com/google/android/libraries/inputmethod/inputmethodentry/ImeDefCache$1", "onFailure", 176, "ImeDefCache.java")).w("Failed to load ImeDefs for language %s", this.b);
                ((hrc) this.c).e.l(5);
                synchronized (this.c) {
                    if (((hrc) this.c).c.get(this.b) == this.a) {
                        ((hrc) this.c).c.remove(this.b);
                    }
                }
                return;
            case 10:
                ((ltd) ((ltd) ((ltd) LocalComputationResultHandlingService.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationResultHandlingService$1", "onFailure", 'c', "LocalComputationResultHandlingService.java")).t("Failed to handle result in background thread.");
                ((LocalComputationResultHandlingService) this.b).b.e(iwc.LC_HANDLER_IMPL_RESULT, this.a.a(), Status.c);
                ((fxa) this.c).b(Status.c);
                return;
            case 11:
                if (!((jjb) this.b).e.e()) {
                    return;
                }
                ((jmz) ((jjb) this.b).e.a()).h((String) this.a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                MegamodeView megamodeView = (MegamodeView) this.b;
                megamodeView.m = !megamodeView.m;
                megamodeView.h.setClickable(true);
                return;
            default:
                Object obj2 = this.c;
                Object obj3 = this.a;
                if (th instanceof CancellationException) {
                    Log.w("MetadataManager", "Cancelled predownload metadata for cache key of ".concat(String.valueOf(obj3)), th);
                } else {
                    Log.e("MetadataManager", "Failed to predownload metadata for cache key of ".concat(String.valueOf(obj3)), th);
                }
                synchronized (((kog) obj2).c) {
                    if (kfl.h(((kog) obj2).e, (String) obj3)) {
                        ((kog) obj2).e.c();
                        ((kog) obj2).e = null;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ee, code lost:
        if (r3 == 0) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [hqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [gzl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [dlm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v78, types: [fwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v80, types: [fwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [ete, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [ivu, java.lang.Object] */
    @Override // defpackage.mka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvt.b(java.lang.Object):void");
    }
}
