package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;
import com.google.android.apps.inputmethod.libs.expression.navbar.FixedHeightNavigationRow;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.PageableCandidatesHolderView;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.PageableRecentSubCategorySoftKeyListHolderView;
import com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme;
import com.google.android.apps.inputmethod.libs.hmmhandwriting.HmmHandwritingIme;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bwt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bwt implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bwt(bvp bvpVar, String str, int i) {
        this.c = i;
        this.b = bvpVar;
        this.a = str;
    }

    public /* synthetic */ bwt(caj cajVar, mqa mqaVar, int i) {
        this.c = i;
        this.b = cajVar;
        this.a = mqaVar;
    }

    public /* synthetic */ bwt(caj cajVar, mqg mqgVar, int i) {
        this.c = i;
        this.b = cajVar;
        this.a = mqgVar;
    }

    public /* synthetic */ bwt(caj cajVar, mrm mrmVar, int i) {
        this.c = i;
        this.b = cajVar;
        this.a = mrmVar;
    }

    public /* synthetic */ bwt(caj cajVar, mwj mwjVar, int i) {
        this.c = i;
        this.b = cajVar;
        this.a = mwjVar;
    }

    public /* synthetic */ bwt(cdv cdvVar, hqt hqtVar, int i) {
        this.c = i;
        this.b = cdvVar;
        this.a = hqtVar;
    }

    public /* synthetic */ bwt(cdv cdvVar, jav javVar, int i) {
        this.c = i;
        this.b = cdvVar;
        this.a = javVar;
    }

    public /* synthetic */ bwt(cfz cfzVar, ino inoVar, int i) {
        this.c = i;
        this.b = cfzVar;
        this.a = inoVar;
    }

    public /* synthetic */ bwt(cgl cglVar, SurfaceView surfaceView, int i) {
        this.c = i;
        this.a = cglVar;
        this.b = surfaceView;
    }

    public /* synthetic */ bwt(ckq ckqVar, File file, int i) {
        this.c = i;
        this.b = ckqVar;
        this.a = file;
    }

    public /* synthetic */ bwt(ckq ckqVar, lfb lfbVar, int i) {
        this.c = i;
        this.b = ckqVar;
        this.a = lfbVar;
    }

    public /* synthetic */ bwt(cmn cmnVar, may mayVar, int i) {
        this.c = i;
        this.b = cmnVar;
        this.a = mayVar;
    }

    public /* synthetic */ bwt(ConstraintHeaderViewImpl constraintHeaderViewImpl, View view, int i) {
        this.c = i;
        this.a = constraintHeaderViewImpl;
        this.b = view;
    }

    public bwt(PageableCandidatesHolderView pageableCandidatesHolderView, dee deeVar, int i) {
        this.c = i;
        this.a = pageableCandidatesHolderView;
        this.b = deeVar;
    }

    public /* synthetic */ bwt(PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView, der derVar, int i) {
        this.c = i;
        this.a = pageableRecentSubCategorySoftKeyListHolderView;
        this.b = derVar;
    }

    public /* synthetic */ bwt(HmmHandwritingIme hmmHandwritingIme, CharSequence charSequence, int i) {
        this.c = i;
        this.b = hmmHandwritingIme;
        this.a = charSequence;
    }

    public /* synthetic */ bwt(HmmHandwritingIme hmmHandwritingIme, List list, int i) {
        this.c = i;
        this.b = hmmHandwritingIme;
        this.a = list;
    }

    public /* synthetic */ bwt(ctr ctrVar, FixedHeightNavigationRow fixedHeightNavigationRow, int i) {
        this.c = i;
        this.a = ctrVar;
        this.b = fixedHeightNavigationRow;
    }

    public /* synthetic */ bwt(dnm dnmVar, Context context, int i) {
        this.c = i;
        this.a = dnmVar;
        this.b = context;
    }

    public /* synthetic */ bwt(ovg ovgVar, View view, int i, byte[] bArr) {
        this.c = i;
        this.a = ovgVar;
        this.b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v59, types: [der, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, hqt] */
    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog alertDialog;
        int i;
        ArrayList arrayList = null;
        switch (this.c) {
            case 0:
                ovg ovgVar = (ovg) this.a;
                hky f = jdg.f((View) this.b, "undo_delete_toast", ((SparseArray) ovgVar.d).size() == 1 ? ((Context) ovgVar.c).getString(R.string.f177020_resource_name_obfuscated_res_0x7f140d17) : ((Context) ovgVar.c).getString(R.string.f177010_resource_name_obfuscated_res_0x7f140d16, Integer.valueOf(((SparseArray) ovgVar.d).size())), ((Context) ovgVar.c).getString(R.string.f166310_resource_name_obfuscated_res_0x7f1408cd), ((Context) ovgVar.c).getString(R.string.f177040_resource_name_obfuscated_res_0x7f140d19), new hk(ovgVar, 18, null));
                f.j = new bqj(ovgVar, 13, null);
                f.i = new bxj(ovgVar, 1, null);
                hkq.b(f.a());
                return;
            case 1:
                bvu.h(((bvp) this.b).c, (String) this.a);
                return;
            case 2:
                Object obj = this.b;
                Object obj2 = this.a;
                cbz cbzVar = ((caj) obj).e;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                cbzVar.a.setRanker((mqg) obj2);
                cbzVar.b.g(cac.CRANK_SET_RANKER, SystemClock.elapsedRealtime() - elapsedRealtime);
                return;
            case 3:
                Object obj3 = this.b;
                Object obj4 = this.a;
                cbz cbzVar2 = ((caj) obj3).e;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                cbzVar2.a.addEngine((mqa) obj4);
                cbzVar2.b.g(cac.CRANK_ADD_ENGINE, SystemClock.elapsedRealtime() - elapsedRealtime2);
                return;
            case 4:
                Object obj5 = this.b;
                Object obj6 = this.a;
                cbz cbzVar3 = ((caj) obj5).e;
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                cbzVar3.a.removeEngine((mqa) obj6);
                cbzVar3.b.g(cac.CRANK_REMOVE_ENGINE, SystemClock.elapsedRealtime() - elapsedRealtime3);
                return;
            case 5:
                Object obj7 = this.b;
                Object obj8 = this.a;
                ((luc) ((luc) caj.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "setKeyboardLayout", 442, "Delight5DecoderWrapper.java")).t("setKeyboardLayout()");
                cbz cbzVar4 = ((caj) obj7).e;
                nfh t = mrn.d.t();
                long o = cbzVar4.d.o();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mrn mrnVar = (mrn) t.b;
                int i2 = 2 | mrnVar.a;
                mrnVar.a = i2;
                mrnVar.c = o;
                obj8.getClass();
                mrnVar.b = (mrm) obj8;
                mrnVar.a = i2 | 1;
                mrn mrnVar2 = (mrn) t.cz();
                cbzVar4.a.setKeyboardLayout(mrnVar2);
                cbzVar4.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(mrnVar2.c));
                return;
            case 6:
                Object obj9 = this.b;
                Object obj10 = this.a;
                caj cajVar = (caj) obj9;
                idu b = cajVar.f.b();
                synchronized (cajVar.j) {
                    ((caj) obj9).m = null;
                }
                nfh t2 = mtb.i.t();
                nfh t3 = mwi.d.t();
                t3.dW((mwj) obj10);
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mtb mtbVar = (mtb) t2.b;
                mwi mwiVar = (mwi) t3.cz();
                mwiVar.getClass();
                mtbVar.c = mwiVar;
                mtbVar.a = 2 | mtbVar.a;
                cbz cbzVar5 = cajVar.e;
                long o2 = cbzVar5.d.o();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mtb mtbVar2 = (mtb) t2.b;
                mtbVar2.a |= 32;
                mtbVar2.f = o2;
                long elapsedRealtime4 = SystemClock.elapsedRealtime();
                cbzVar5.a.preemptiveDecode((mtb) t2.cz());
                cbzVar5.b.g(caq.DELIGHT_PREEMPTIVE_DECODE, SystemClock.elapsedRealtime() - elapsedRealtime4);
                cbzVar5.b.f(cap.LOG_NATIVE_METRICS, b, Long.valueOf(((mtb) t2.b).f));
                return;
            case 7:
                Object obj11 = this.b;
                ?? r2 = this.a;
                cdv cdvVar = (cdv) obj11;
                cdvVar.l.e(cap.LANG_ID_NOTICE_CLICKED, r2.i());
                WeakReference weakReference = cdvVar.q;
                if (weakReference == null) {
                    ((ltd) ((ltd) cdv.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper", "onEnableLanguageNoticeClicked", 470, "LanguageIdentifierWrapper.java")).w("onEnableLanguageNoticeClicked: Can't show langid dialog for %s. Input view is null.", r2.o(0));
                    return;
                }
                View view = (View) weakReference.get();
                if (view == null) {
                    ((ltd) ((ltd) cdv.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper", "onEnableLanguageNoticeClicked", 477, "LanguageIdentifierWrapper.java")).w("onEnableLanguageNoticeClicked: Can't show langid dialog for %s. Input view has not yet been initialized.", r2.o(0));
                    return;
                }
                cdm cdmVar = cdvVar.p;
                cdmVar.e.set(false);
                WeakReference weakReference2 = cdmVar.f;
                if (weakReference2 != null && (alertDialog = (AlertDialog) weakReference2.get()) != null && alertDialog.isShowing()) {
                    alertDialog.dismiss();
                }
                String o3 = r2.o(1);
                jav i3 = r2.i();
                AlertDialog.Builder builder = new AlertDialog.Builder(cdmVar.c.getApplicationContext());
                builder.setIcon(cdmVar.c.getApplicationInfo().icon);
                builder.setCancelable(true);
                builder.setTitle(String.format(cdmVar.c.getString(R.string.f151580_resource_name_obfuscated_res_0x7f140216), o3));
                builder.setMessage(String.format(cdmVar.c.getString(R.string.f151570_resource_name_obfuscated_res_0x7f140215), o3));
                builder.setPositiveButton(R.string.f156470_resource_name_obfuscated_res_0x7f14043b, new cdl(cdmVar, (hqt) r2, 1));
                builder.setNegativeButton(R.string.f156460_resource_name_obfuscated_res_0x7f14043a, new cdl(cdmVar, i3, 0));
                builder.setNeutralButton(R.string.f156480_resource_name_obfuscated_res_0x7f14043c, new cdl(cdmVar, i3, 2));
                builder.setOnDismissListener(new faz(cdmVar, i3, 1));
                AlertDialog create = builder.create();
                Window window = create.getWindow();
                if (window == null) {
                    return;
                }
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.token = view.getWindowToken();
                attributes.type = 1003;
                window.setAttributes(attributes);
                window.addFlags(131072);
                create.show();
                cdmVar.f = new WeakReference(create);
                return;
            case 8:
                Object obj12 = this.b;
                ieh.j().e(cap.LANG_ID_NOTICE_IGNORED, this.a);
                long currentTimeMillis = System.currentTimeMillis();
                cdv cdvVar2 = (cdv) obj12;
                if (!cdvVar2.f.get()) {
                    ((ltd) cdv.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper", "setLanguageSuggestionNoticeExpireTimestamp", 386, "LanguageIdentifierWrapper.java")).t("setLanguageSuggestionNoticeExpireTimestamp(): Failed because state was not loaded.");
                    return;
                } else {
                    ((AtomicLong) cdvVar2.r.a).set(currentTimeMillis);
                    return;
                }
            case 9:
                Object obj13 = this.b;
                ((aia) this.a).f("pref_device_intelligence_onboarding_displayed", true);
                ((cfz) obj13).h = true;
                ((ltd) ((ltd) cfz.a.b()).k("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceExtension", "lambda$maybeShowAutofillOnboarding$10", 866, "DeviceIntelligenceExtension.java")).t("device intelligence onboarding displayed");
                return;
            case 10:
                Object obj14 = this.a;
                Object obj15 = this.b;
                cgl cglVar = (cgl) obj14;
                if (!cglVar.g || obj15 == null) {
                    return;
                }
                ((SurfaceView) obj15).setVisibility(8);
                cglVar.g = false;
                return;
            case 11:
                ((ckq) this.b).j.n(clm.a((cla) ((lfb) this.a).a()).b);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj16 = this.b;
                cll a = cll.a((File) this.a);
                ((ckq) obj16).e.set(a);
                ((ltd) ((ltd) ckq.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheModule", "lambda$loadKeywordMappingsAsync$3", 267, "ContentCacheModule.java")).y("Loaded %d keyword --> image mappings and %d keyword --> timestamp mappings", a.c.size, a.b.size());
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((cmn) this.b).b.e(cta.EMOJIFY_ICON_SHOWN, this.a);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ConstraintHeaderViewImpl) this.a).s((View) this.b);
                return;
            case 15:
                ((ctr) this.a).t((FixedHeightNavigationRow) this.b, 225L);
                return;
            case 16:
                ((alc) this.a).fG(((dee) this.b).a, false);
                return;
            case 17:
                Object obj17 = this.a;
                ?? r1 = this.b;
                PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = (PageableRecentSubCategorySoftKeyListHolderView) obj17;
                pageableRecentSubCategorySoftKeyListHolderView.i.clear();
                pageableRecentSubCategorySoftKeyListHolderView.j.clear();
                pageableRecentSubCategorySoftKeyListHolderView.m.clear();
                dfh dfhVar = (dfh) obj17;
                ict[] E = dfhVar.E();
                for (int i4 = 0; i4 < E.length; i4++) {
                    ict ictVar = E[i4];
                    int i5 = ictVar.c;
                    if (i5 == R.id.f118870_resource_name_obfuscated_res_0x7f0b1d1c || i5 == R.id.f118880_resource_name_obfuscated_res_0x7f0b1d1d) {
                        arrayList = new ArrayList();
                        pageableRecentSubCategorySoftKeyListHolderView.i.add(arrayList);
                        pageableRecentSubCategorySoftKeyListHolderView.j.add(Long.valueOf(iby.a((String) ictVar.b(iah.PRESS).d().e)));
                        pageableRecentSubCategorySoftKeyListHolderView.k.add(ictVar.t);
                        if (ictVar.c == R.id.f118880_resource_name_obfuscated_res_0x7f0b1d1d) {
                            pageableRecentSubCategorySoftKeyListHolderView.m.put(i4, true);
                        }
                    } else if (arrayList != null) {
                        arrayList.add(ictVar);
                    }
                }
                pageableRecentSubCategorySoftKeyListHolderView.l.clear();
                if (dfhVar.E() != null && !pageableRecentSubCategorySoftKeyListHolderView.i.isEmpty() && pageableRecentSubCategorySoftKeyListHolderView.u == 0) {
                    pageableRecentSubCategorySoftKeyListHolderView.J.append(0, 0);
                }
                pageableRecentSubCategorySoftKeyListHolderView.p = 0;
                pageableRecentSubCategorySoftKeyListHolderView.B = 0;
                for (int i6 = 0; i6 < pageableRecentSubCategorySoftKeyListHolderView.i.size(); i6++) {
                    if (pageableRecentSubCategorySoftKeyListHolderView.D(i6)) {
                        ArrayList arrayList2 = (ArrayList) pageableRecentSubCategorySoftKeyListHolderView.i.get(i6);
                        int size = arrayList2.size();
                        ict[] ictVarArr = new ict[size];
                        i = r1.a((ict[]) arrayList2.toArray(ictVarArr));
                        if (i == 0) {
                            pageableRecentSubCategorySoftKeyListHolderView.J.append(pageableRecentSubCategorySoftKeyListHolderView.B, 0);
                            i = 1;
                        } else {
                            int i7 = pageableRecentSubCategorySoftKeyListHolderView.B;
                            int i8 = 0;
                            while (i8 < size) {
                                int b2 = r1.b(ictVarArr, i8);
                                pageableRecentSubCategorySoftKeyListHolderView.J.append(i7, i8);
                                i8 += b2;
                                i7++;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    pageableRecentSubCategorySoftKeyListHolderView.l.add(Integer.valueOf(i));
                    pageableRecentSubCategorySoftKeyListHolderView.B += i;
                }
                dfhVar.x();
                ((alc) obj17).fG(pageableRecentSubCategorySoftKeyListHolderView.u(pageableRecentSubCategorySoftKeyListHolderView.p), false);
                return;
            case 18:
                ((HandwritingIme) this.b).A(this.a);
                return;
            case 19:
                Object obj18 = this.b;
                ?? r12 = this.a;
                HmmHandwritingIme hmmHandwritingIme = (HmmHandwritingIme) obj18;
                hmmHandwritingIme.r.c();
                if (TextUtils.isEmpty(r12)) {
                    return;
                }
                hmmHandwritingIme.r.b(r12.toString());
                return;
            default:
                Object obj19 = this.a;
                String m = ((dnm) obj19).e.m((Context) this.b);
                an anVar = (an) obj19;
                ap B = anVar.B();
                if (!(B instanceof inx)) {
                    return;
                }
                Bundle bundle = anVar.m;
                if (bundle == null) {
                    bundle = new Bundle(1);
                    anVar.Z(bundle);
                }
                bundle.putString("fragment_title", m);
                ((inx) B).A();
                return;
        }
    }
}
