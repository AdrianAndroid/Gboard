package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import com.google.android.apps.inputmethod.libs.translate.SystemTranslateProvider;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: elr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class elr implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ elr(eay eayVar, lym lymVar, int i, byte[] bArr) {
        this.c = i;
        this.a = eayVar;
        this.b = lymVar;
    }

    public /* synthetic */ elr(eov eovVar, ewj ewjVar, int i, byte[] bArr) {
        this.c = i;
        this.b = eovVar;
        this.a = ewjVar;
    }

    public /* synthetic */ elr(esw eswVar, eva evaVar, int i) {
        this.c = i;
        this.a = eswVar;
        this.b = evaVar;
    }

    public /* synthetic */ elr(ett ettVar, eva evaVar, int i) {
        this.c = i;
        this.a = ettVar;
        this.b = evaVar;
    }

    public /* synthetic */ elr(exg exgVar, evg evgVar, int i) {
        this.c = i;
        this.b = exgVar;
        this.a = evgVar;
    }

    public /* synthetic */ elr(exv exvVar, evg evgVar, int i) {
        this.c = i;
        this.b = exvVar;
        this.a = evgVar;
    }

    public /* synthetic */ elr(eym eymVar, ezr ezrVar, int i) {
        this.c = i;
        this.a = eymVar;
        this.b = ezrVar;
    }

    public /* synthetic */ elr(eyr eyrVar, String str, int i) {
        this.c = i;
        this.a = eyrVar;
        this.b = str;
    }

    public /* synthetic */ elr(faf fafVar, jbw jbwVar, int i) {
        this.c = i;
        this.a = fafVar;
        this.b = jbwVar;
    }

    public /* synthetic */ elr(fan fanVar, fff fffVar, int i) {
        this.c = i;
        this.a = fanVar;
        this.b = fffVar;
    }

    public /* synthetic */ elr(fbf fbfVar, Context context, int i) {
        this.c = i;
        this.b = fbfVar;
        this.a = context;
    }

    public /* synthetic */ elr(fbx fbxVar, bnq bnqVar, int i) {
        this.c = i;
        this.b = fbxVar;
        this.a = bnqVar;
    }

    public /* synthetic */ elr(fby fbyVar, ffd ffdVar, int i) {
        this.c = i;
        this.a = fbyVar;
        this.b = ffdVar;
    }

    public /* synthetic */ elr(fjk fjkVar, IBinder iBinder, int i) {
        this.c = i;
        this.b = fjkVar;
        this.a = iBinder;
    }

    public /* synthetic */ elr(fjn fjnVar, Object obj, int i) {
        this.c = i;
        this.a = fjnVar;
        this.b = obj;
    }

    public elr(fpi fpiVar, fmt fmtVar, int i) {
        this.c = i;
        this.b = fpiVar;
        this.a = fmtVar;
    }

    public /* synthetic */ elr(String str, Map map, int i) {
        this.c = i;
        this.a = str;
        this.b = map;
    }

    public /* synthetic */ elr(mka mkaVar, Exception exc, int i) {
        this.c = i;
        this.a = mkaVar;
        this.b = exc;
    }

    public /* synthetic */ elr(mka mkaVar, String str, int i) {
        this.c = i;
        this.a = mkaVar;
        this.b = str;
    }

    public /* synthetic */ elr(mko mkoVar, mka mkaVar, int i) {
        this.c = i;
        this.b = mkoVar;
        this.a = mkaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [mka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [mka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [eym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, eyr] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, jbw] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r2v8, types: [mka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, imn] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, imn] */
    @Override // java.lang.Runnable
    public final void run() {
        eul f;
        fju fjuVar = null;
        switch (this.c) {
            case 0:
                this.a.b(this.b);
                return;
            case 1:
                Object obj = this.a;
                ?? r2 = this.b;
                hsk b = hsx.b();
                if (b == null) {
                    ((ltd) ((ltd) ekm.a.d()).k("com/google/android/apps/inputmethod/libs/search/utils/FireOnceOnStartInputViewListener", "lambda$createSwitchToKeyboardAction$0", 118, "FireOnceOnStartInputViewListener.java")).t("onStartInputView(): service is null");
                    return;
                } else {
                    b.at(hfd.d(new iay(-10104, null, new icz((String) obj, r2))));
                    return;
                }
            case 2:
                this.a.a((Throwable) this.b);
                return;
            case 3:
                els.f(this.b, this.a);
                return;
            case 4:
                Object obj2 = this.b;
                Object obj3 = this.a;
                eov eovVar = (eov) obj2;
                ino M = ino.M(eovVar.b);
                long currentTimeMillis = System.currentTimeMillis();
                int b2 = M.b("total_split_banner_display_time", 0);
                M.i("last_split_banner_display_timestamp", currentTimeMillis);
                M.h("total_split_banner_display_time", b2 + 1);
                llp o = llp.o(eovVar.c.a);
                int size = o.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) o.get(i);
                    ewj ewjVar = (ewj) obj3;
                    View a = ewjVar.a.a(R.layout.f134000_resource_name_obfuscated_res_0x7f0e0071);
                    Drawable background = view.getBackground();
                    if (background instanceof InsetDrawable) {
                        Rect rect = new Rect();
                        ((InsetDrawable) background).getPadding(rect);
                        a.setBackground(new InsetDrawable(a.getBackground(), rect.left, rect.top, rect.right, rect.bottom));
                    }
                    ewjVar.b.add(a);
                    ewjVar.a.e(a, view, 614, 0, 0, null);
                }
                eovVar.e = System.currentTimeMillis();
                eovVar.d.e(eoq.TOOLTIP_SHOW, new Object[0]);
                return;
            case 5:
                ((epl) ((eay) this.a).a).a.y((lym) this.b);
                return;
            case 6:
                Object obj4 = this.a;
                Object obj5 = this.b;
                HashMap hashMap = new HashMap();
                for (euy euyVar : ((eva) obj5).a) {
                    for (euz euzVar : euyVar.c) {
                        String str = euzVar.c;
                        esw eswVar = (esw) obj4;
                        if (eswVar.d instanceof etg) {
                            f = eul.f(eswVar.b, etg.e(str));
                        } else {
                            f = eul.f(eswVar.b, erj.f(str));
                        }
                        hashMap.put(f, new esv(euzVar.c, euzVar.a));
                    }
                }
                esw eswVar2 = (esw) obj4;
                String y = ino.M(eswVar2.b).y(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
                for (eul eulVar : eswVar2.e) {
                    esv esvVar = (esv) hashMap.get(eulVar);
                    if (esvVar != null) {
                        File b3 = eswVar2.d.b(esvVar.a);
                        if (b3 == null || !b3.exists()) {
                            eswVar2.d.a(esvVar.a, b3, true, Objects.equals(y, eulVar.k()) ? eswVar2.g : eswVar2.f, esvVar.b);
                        } else if (y.equals(eulVar.k())) {
                            isz.b();
                        }
                    }
                }
                return;
            case 7:
                Object obj6 = this.a;
                Object obj7 = this.b;
                for (etc etcVar : ((ett) obj6).i) {
                    etcVar.a((eva) obj7);
                }
                return;
            case 8:
                Object obj8 = this.b;
                Object obj9 = this.a;
                if (!((Boolean) exd.a.c()).booleanValue()) {
                    ((ltd) ((ltd) exg.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationTrainerManager", "lambda$scheduleTraining$0", 93, "LanguageModelPersonalizationTrainerManager.java")).t("Language model personalization is disabled by flag.");
                    return;
                }
                exg exgVar = (exg) obj8;
                if (!exgVar.f.ak("pref_key_use_personalized_dicts")) {
                    ((ltd) ((ltd) exg.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationTrainerManager", "lambda$scheduleTraining$0", 99, "LanguageModelPersonalizationTrainerManager.java")).t("Personalization setting is disabled by user.");
                    return;
                }
                exe exeVar = exgVar.d;
                String str2 = (String) exd.b.c();
                kcu.U(mio.g(mio.h(mio.h(mkh.q(exeVar.c.e("lm_personalization", Objects.hashCode(str2) & Integer.MAX_VALUE, jsv.k(str2))), new eoi(exeVar, 11), exeVar.d), new eoi(exeVar, 12), exeVar.d), eki.h, exeVar.d), new bvo(exgVar, (evg) obj9, 17), exgVar.e);
                return;
            case 9:
                Object obj10 = this.b;
                Object obj11 = this.a;
                nfh t = nji.n.t();
                exv exvVar = (exv) obj10;
                exu e = exvVar.e(t, llp.s("p13n_precompute_plan.pb", "local_computation_plan.pb"));
                if (e != null) {
                    exvVar.f(e.a, exr.a, (evg) obj11, e.c, e.b, t);
                    return;
                }
                ((ltd) ((ltd) exv.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "lambda$scheduleTraining$0", 185, "SpeechPersonalizationTrainerManager.java")).t("Device ineligible for speech personalization.");
                exvVar.d.a((nji) t.cz());
                return;
            case 10:
                ?? r0 = this.a;
                Object obj12 = this.b;
                ltg ltgVar = SystemTranslateProvider.a;
                r0.a((ezr) obj12);
                return;
            case 11:
                ?? r02 = this.a;
                Object obj13 = this.b;
                ltg ltgVar2 = ezx.i;
                r02.a((String) obj13);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((faf) this.a).a(this.b);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj14 = this.a;
                Object obj15 = this.b;
                fex fexVar = ((fan) obj14).f;
                if (fexVar == null) {
                    return;
                }
                fexVar.c((fff) obj15);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj16 = this.b;
                Object obj17 = this.a;
                ((ltd) ((ltd) fbf.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager", "lambda$setPromoBannerAttributes$7", 329, "VoiceDonationPromoManager.java")).t("voice donation promo banner displayed");
                Context context = (Context) obj17;
                if (!fay.h(context)) {
                    fay.c(context, true);
                }
                ieh j = ieh.j();
                fbm fbmVar = fbm.VOICE_DONATION_PROMO_BANNER_SHOWN;
                int a2 = fay.a(context) + 1;
                fay.d(context, a2);
                j.e(fbmVar, 4, Integer.valueOf(a2));
                fbf fbfVar = (fbf) obj16;
                fbfVar.h = ieh.j().a(fbp.PROMO_BANNER_DISPLAY);
                fbfVar.i = true;
                return;
            case 15:
                Object obj18 = this.b;
                Object obj19 = this.a;
                ((ltd) ((ltd) fbf.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager", "lambda$setRenewalBannerAttributes$9", 355, "VoiceDonationPromoManager.java")).t("voice donation renewal banner displayed");
                fay.e((Context) obj19, true);
                ieh.j().e(fbm.VOICE_DONATION_RENEWAL_BANNER_SHOWN, 4);
                fbf fbfVar2 = (fbf) obj18;
                fbfVar2.h = ieh.j().a(fbp.RENEWAL_BANNER_DISPLAY);
                fbfVar2.i = true;
                return;
            case 16:
                ((fby) this.a).g((ffd) this.b);
                return;
            case 17:
                Object obj20 = this.b;
                Object obj21 = this.a;
                fby fbyVar = ((fbx) obj20).a;
                ((bnq) obj21).a.size();
                synchronized (fbyVar.j) {
                    if (fbyVar.i.g()) {
                        faf fafVar = fbyVar.h;
                        if (fafVar.a.get() != 2) {
                            if (fafVar.a.get() == 1) {
                                fafVar.b.e(fbm.VOICE_ELLIPSIS_HIDDEN_REASON, 1);
                                fafVar.c();
                            }
                            fafVar.a.set(2);
                        }
                        fbyVar.k.u((bnq) obj21);
                    }
                }
                return;
            case 18:
                fjn fjnVar = (fjn) this.a;
                fjnVar.j(this.b);
                fjnVar.e();
                return;
            case 19:
                Object obj22 = this.b;
                ?? r22 = this.a;
                fjk fjkVar = (fjk) obj22;
                if (fjkVar.a.j.isEmpty()) {
                    Log.i("CrossProfileSender", "Connected but no holders. Disconnecting.");
                    fjkVar.a.m();
                    return;
                }
                AtomicReference atomicReference = fjkVar.a.g;
                if (r22 != 0) {
                    IInterface queryLocalInterface = r22.queryLocalInterface("com.google.android.enterprise.connectedapps.ICrossProfileService");
                    fjuVar = queryLocalInterface instanceof fju ? (fju) queryLocalInterface : new fjs(r22);
                }
                atomicReference.set(fjuVar);
                fjkVar.a.l();
                fjkVar.a.d();
                fjkVar.a.h();
                return;
            default:
                fpi fpiVar = (fpi) this.b;
                fpg fpgVar = (fpg) fpiVar.e.j.get(fpiVar.b);
                if (fpgVar == null) {
                    return;
                }
                fmt fmtVar = (fmt) this.a;
                if (fmtVar.b()) {
                    fpi fpiVar2 = (fpi) this.b;
                    fpiVar2.d = true;
                    if (fpiVar2.a.o()) {
                        ((fpi) this.b).c();
                        return;
                    }
                    try {
                        fnw fnwVar = ((fpi) this.b).a;
                        fnwVar.s(null, fnwVar.j());
                        return;
                    } catch (SecurityException e2) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                        ((fpi) this.b).a.f("Failed to get service from broker.");
                        fpgVar.i(new fmt(10));
                        return;
                    }
                }
                fpgVar.i(fmtVar);
                return;
        }
    }
}
