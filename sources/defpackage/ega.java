package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ega  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ega implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ega(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ ega(UniversalMediaKeyboardM2 universalMediaKeyboardM2, int i) {
        this.b = i;
        this.a = universalMediaKeyboardM2;
    }

    public /* synthetic */ ega(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, int i) {
        this.b = i;
        this.a = universalMediaKeyboardTablet;
    }

    public /* synthetic */ ega(egf egfVar, int i) {
        this.b = i;
        this.a = egfVar;
    }

    public /* synthetic */ ega(egj egjVar, int i) {
        this.b = i;
        this.a = egjVar;
    }

    public /* synthetic */ ega(ehc ehcVar, int i) {
        this.b = i;
        this.a = ehcVar;
    }

    public /* synthetic */ ega(ehp ehpVar, int i) {
        this.b = i;
        this.a = ehpVar;
    }

    public /* synthetic */ ega(eie eieVar, int i) {
        this.b = i;
        this.a = eieVar;
    }

    public /* synthetic */ ega(eis eisVar, int i) {
        this.b = i;
        this.a = eisVar;
    }

    public /* synthetic */ ega(emp empVar, int i) {
        this.b = i;
        this.a = empVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        egc egcVar;
        egc egcVar2;
        egc egcVar3;
        egc egcVar4;
        egg eggVar;
        egg eggVar2;
        egg eggVar3;
        egg eggVar4;
        IBinder F;
        els elsVar;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ltg ltgVar = egf.a;
                boolean b = efz.b((Context) obj);
                ieh j = ieh.j();
                ctd ctdVar = ctd.CLICK;
                Object[] objArr = new Object[1];
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 4;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t.b;
                mbcVar2.f = 10;
                mbcVar2.a |= 32;
                objArr[0] = t.cz();
                j.e(ctdVar, objArr);
                ieh j2 = ieh.j();
                ctf ctfVar = ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION;
                Object[] objArr2 = new Object[1];
                if (b) {
                    egcVar = egc.NOT_INSTALLED_FIRE_BITMOJI_PLAYSTORE_INTENT_SUCCESS;
                } else {
                    egcVar = egc.NOT_INSTALLED_FIRE_BITMOJI_PLAYSTORE_INTENT_FAILURE;
                }
                objArr2[0] = egcVar;
                j2.e(ctfVar, objArr2);
                return;
            case 1:
                Object obj2 = this.a;
                ltg ltgVar2 = egf.a;
                boolean c = efz.c((Context) obj2);
                ieh.j().e(ctd.BITMOJI_SET_UP_ERROR_CLICKED, new Object[0]);
                ieh j3 = ieh.j();
                ctf ctfVar2 = ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION;
                Object[] objArr3 = new Object[1];
                if (c) {
                    egcVar2 = egc.FIRE_LAUNCH_BITMOJI_SUCCESS;
                } else {
                    egcVar2 = egc.FIRE_LAUNCH_BITMOJI_FAILURE;
                }
                objArr3[0] = egcVar2;
                j3.e(ctfVar2, objArr3);
                return;
            case 2:
                Object obj3 = this.a;
                ltg ltgVar3 = egf.a;
                boolean b2 = efz.b((Context) obj3);
                ieh.j().e(ctd.BITMOJI_UPDATE_ERROR_CLICKED, new Object[0]);
                ieh j4 = ieh.j();
                ctf ctfVar3 = ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION;
                Object[] objArr4 = new Object[1];
                if (b2) {
                    egcVar3 = egc.UPDATE_REQUIRED_FIRE_BITMOJI_PLAYSTORE_INTENT_SUCCESS;
                } else {
                    egcVar3 = egc.UPDATE_REQUIRED_FIRE_BITMOJI_PLAYSTORE_INTENT_FAILURE;
                }
                objArr4[0] = egcVar3;
                j4.e(ctfVar3, objArr4);
                return;
            case 3:
                Object obj4 = this.a;
                ltg ltgVar4 = egf.a;
                boolean a = efz.a((Context) obj4);
                ieh.j().e(ctd.BITMOJI_SET_UP_ERROR_CLICKED, new Object[0]);
                ieh j5 = ieh.j();
                ctf ctfVar4 = ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION;
                Object[] objArr5 = new Object[1];
                if (a) {
                    egcVar4 = egc.FIRE_ACCESS_REQUEST_SUCCESS;
                } else {
                    egcVar4 = egc.FIRE_ACCESS_REQUEST_FAILURE;
                }
                objArr5[0] = egcVar4;
                j5.e(ctfVar4, objArr5);
                return;
            case 4:
                egf egfVar = (egf) this.a;
                egfVar.k(2);
                egfVar.j();
                return;
            case 5:
                egj egjVar = (egj) this.a;
                egjVar.j(2);
                egjVar.g();
                return;
            case 6:
                boolean c2 = efz.c((Context) this.a);
                ieh.j().e(ctd.BITMOJI_SET_UP_ERROR_CLICKED, new Object[0]);
                ieh j6 = ieh.j();
                ctf ctfVar5 = ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION;
                Object[] objArr6 = new Object[1];
                if (c2) {
                    eggVar = egg.FIRE_LAUNCH_BITMOJI_SUCCESS;
                } else {
                    eggVar = egg.FIRE_LAUNCH_BITMOJI_FAILURE;
                }
                objArr6[0] = eggVar;
                j6.e(ctfVar5, objArr6);
                return;
            case 7:
                boolean b3 = efz.b((Context) this.a);
                ieh j7 = ieh.j();
                ctd ctdVar2 = ctd.CLICK;
                Object[] objArr7 = new Object[1];
                nfh t2 = mbc.p.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbc mbcVar3 = (mbc) t2.b;
                mbcVar3.b = 4;
                mbcVar3.a |= 1;
                mbc mbcVar4 = (mbc) t2.b;
                mbcVar4.f = 10;
                mbcVar4.a |= 32;
                objArr7[0] = t2.cz();
                j7.e(ctdVar2, objArr7);
                ieh j8 = ieh.j();
                ctf ctfVar6 = ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION;
                Object[] objArr8 = new Object[1];
                if (b3) {
                    eggVar2 = egg.NOT_INSTALLED_FIRE_BITMOJI_PLAYSTORE_INTENT_SUCCESS;
                } else {
                    eggVar2 = egg.NOT_INSTALLED_FIRE_BITMOJI_PLAYSTORE_INTENT_FAILURE;
                }
                objArr8[0] = eggVar2;
                j8.e(ctfVar6, objArr8);
                return;
            case 8:
                boolean b4 = efz.b((Context) this.a);
                ieh.j().e(ctd.BITMOJI_UPDATE_ERROR_CLICKED, new Object[0]);
                ieh j9 = ieh.j();
                ctf ctfVar7 = ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION;
                Object[] objArr9 = new Object[1];
                if (b4) {
                    eggVar3 = egg.UPDATE_REQUIRED_FIRE_BITMOJI_PLAYSTORE_INTENT_SUCCESS;
                } else {
                    eggVar3 = egg.UPDATE_REQUIRED_FIRE_BITMOJI_PLAYSTORE_INTENT_FAILURE;
                }
                objArr9[0] = eggVar3;
                j9.e(ctfVar7, objArr9);
                return;
            case 9:
                boolean a2 = efz.a((Context) this.a);
                ieh.j().e(ctd.BITMOJI_SET_UP_ERROR_CLICKED, new Object[0]);
                ieh j10 = ieh.j();
                ctf ctfVar8 = ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION;
                Object[] objArr10 = new Object[1];
                if (a2) {
                    eggVar4 = egg.FIRE_ACCESS_REQUEST_SUCCESS;
                } else {
                    eggVar4 = egg.FIRE_ACCESS_REQUEST_FAILURE;
                }
                objArr10[0] = eggVar4;
                j10.e(ctfVar8, objArr10);
                return;
            case 10:
                ehc ehcVar = (ehc) this.a;
                ehcVar.a.G(ehcVar.b);
                ehcVar.c = true;
                return;
            case 11:
                ehp ehpVar = (ehp) this.a;
                cxd e = ehpVar.o.e();
                e.h(ehpVar.o.b, ehpVar.u);
                ehpVar.n(e.a(), 1, true);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                eie eieVar = (eie) this.a;
                eieVar.d("");
                eieVar.f("");
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((eie) this.a).b();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                eis eisVar = (eis) this.a;
                cxd e2 = eisVar.n.e();
                e2.h(eisVar.n.b, eisVar.x);
                eisVar.r(e2.a(), 1, true, false);
                return;
            case 15:
                UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) this.a;
                if (universalMediaKeyboardM2.c.contains(eka.LOADING)) {
                    ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "retryFetchData", 1073, "UniversalMediaKeyboardM2.java")).t("retryFetchData(): Data is already loading");
                    return;
                }
                ((ltd) ((ltd) UniversalMediaKeyboardM2.a.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "retryFetchData", 1076, "UniversalMediaKeyboardM2.java")).t("retryFetchData()");
                universalMediaKeyboardM2.N();
                universalMediaKeyboardM2.e.e(ctd.UNIVERSAL_MEDIA_NO_CONNECTION_RETRY_BUTTON_CLICKED, new Object[0]);
                return;
            case 16:
                UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) this.a;
                if (universalMediaKeyboardTablet.c.contains(ekg.LOADING)) {
                    ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "retryFetchData", 1074, "UniversalMediaKeyboardTablet.java")).t("retryFetchData(): Data is already loading");
                    return;
                }
                ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "retryFetchData", 1077, "UniversalMediaKeyboardTablet.java")).t("retryFetchData()");
                universalMediaKeyboardTablet.N();
                universalMediaKeyboardTablet.e.e(ctd.UNIVERSAL_MEDIA_NO_CONNECTION_RETRY_BUTTON_CLICKED, new Object[0]);
                return;
            case 17:
                elt eltVar = (elt) igr.d((Context) this.a).b(elt.class);
                if (eltVar == null) {
                    return;
                }
                eltVar.c();
                return;
            case 18:
                emp empVar = (emp) this.a;
                empVar.b.i("sharing_notice_latest_display_time", System.currentTimeMillis());
                if (!empVar.e) {
                    empVar.e = true;
                    int c3 = empVar.c() + 1;
                    ((ltd) ((ltd) emp.a.b()).k("com/google/android/apps/inputmethod/libs/sharing/SharingNoticeModule", "onNoticeDisplayed", 240, "SharingNoticeModule.java")).u("Sharing notice displayed; new display count %d", c3);
                    empVar.b.h("sharing_notice_display_count", c3);
                    ieh.j().e(emm.SHARING_USAGE_COUNT, mdx.SUGGESTION_BAR, mdy.ENTRYPOINT_SHOWN, Integer.valueOf(c3));
                }
                ((ltd) ((ltd) emp.a.b()).k("com/google/android/apps/inputmethod/libs/sharing/SharingNoticeModule", "onNoticeDisplayed", 249, "SharingNoticeModule.java")).t("Sharing notice displayed.");
                return;
            case 19:
                Object obj5 = this.a;
                hsk b5 = hsx.b();
                if (b5 == null || (F = b5.F()) == null || (elsVar = ((emp) obj5).c) == null) {
                    return;
                }
                elsVar.h(b5.getWindow().getWindow().getDecorView(), F, "suggestion_bar");
                ((ltd) ((ltd) emp.a.b()).k("com/google/android/apps/inputmethod/libs/sharing/SharingNoticeModule", "showDialog", 288, "SharingNoticeModule.java")).w("Sharing link send dialog shown from %s", "suggestion_bar");
                return;
            default:
                ((emp) this.a).g = true;
                return;
        }
    }
}
