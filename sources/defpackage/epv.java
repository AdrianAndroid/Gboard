package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationCapability;
import android.view.translation.TranslationManager;
import androidx.preference.Preference;
import com.google.android.apps.inputmethod.libs.theme.builder.ThemeBuilderActivity;
import com.google.android.apps.inputmethod.libs.theme.builder.ThemeEditorActivity;
import com.google.android.apps.inputmethod.libs.translate.SystemTranslateProvider;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: epv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class epv implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ epv(InputConnection inputConnection, String str, Bundle bundle, int i) {
        this.d = i;
        this.b = inputConnection;
        this.c = str;
        this.a = bundle;
    }

    public /* synthetic */ epv(ThemeBuilderActivity themeBuilderActivity, epw epwVar, File file, int i) {
        this.d = i;
        this.a = themeBuilderActivity;
        this.b = epwVar;
        this.c = file;
    }

    public /* synthetic */ epv(ThemeEditorActivity themeEditorActivity, epw epwVar, File file, int i) {
        this.d = i;
        this.a = themeEditorActivity;
        this.b = epwVar;
        this.c = file;
    }

    public /* synthetic */ epv(SystemTranslateProvider systemTranslateProvider, eyl eylVar, Locale locale, int i) {
        this.d = i;
        this.b = systemTranslateProvider;
        this.a = eylVar;
        this.c = locale;
    }

    public /* synthetic */ epv(eyl eylVar, lls llsVar, lls llsVar2, int i) {
        this.d = i;
        this.a = eylVar;
        this.b = llsVar;
        this.c = llsVar2;
    }

    public /* synthetic */ epv(ezf ezfVar, ezq ezqVar, eym eymVar, int i) {
        this.d = i;
        this.b = ezfVar;
        this.c = ezqVar;
        this.a = eymVar;
    }

    public /* synthetic */ epv(fan fanVar, ffd ffdVar, fcp fcpVar, int i) {
        this.d = i;
        this.a = fanVar;
        this.c = ffdVar;
        this.b = fcpVar;
    }

    public /* synthetic */ epv(fjn fjnVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = fjnVar;
        this.b = obj;
        this.c = obj2;
    }

    public epv(fpr fprVar, LifecycleCallback lifecycleCallback, String str, int i) {
        this.d = i;
        this.b = fprVar;
        this.a = lifecycleCallback;
        this.c = str;
    }

    public epv(fqd fqdVar, LifecycleCallback lifecycleCallback, String str, int i) {
        this.d = i;
        this.b = fqdVar;
        this.a = lifecycleCallback;
        this.c = str;
    }

    public /* synthetic */ epv(fsr fsrVar, Map map, ftf ftfVar, int i) {
        this.d = i;
        this.a = fsrVar;
        this.c = map;
        this.b = ftfVar;
    }

    public /* synthetic */ epv(iny inyVar, guu guuVar, Preference preference, int i) {
        this.d = i;
        this.c = inyVar;
        this.b = guuVar;
        this.a = preference;
    }

    public /* synthetic */ epv(irq irqVar, Context context, Intent intent, int i) {
        this.d = i;
        this.c = irqVar;
        this.a = context;
        this.b = intent;
    }

    public /* synthetic */ epv(its itsVar, rj rjVar, String str, int i) {
        this.d = i;
        this.b = itsVar;
        this.a = rjVar;
        this.c = str;
    }

    public /* synthetic */ epv(File file, ete eteVar, String str, int i) {
        this.d = i;
        this.b = file;
        this.a = eteVar;
        this.c = str;
    }

    public /* synthetic */ epv(AtomicBoolean atomicBoolean, Context context, BroadcastReceiver broadcastReceiver, int i) {
        this.d = i;
        this.c = atomicBoolean;
        this.b = context;
        this.a = broadcastReceiver;
    }

    public /* synthetic */ epv(jjo jjoVar, File file, String str, int i) {
        this.d = i;
        this.a = jjoVar;
        this.b = file;
        this.c = str;
    }

    public /* synthetic */ epv(jwr jwrVar, juc jucVar, jwu jwuVar, int i) {
        this.d = i;
        this.b = jwrVar;
        this.a = jucVar;
        this.c = jwuVar;
    }

    public /* synthetic */ epv(jyh jyhVar, jsz jszVar, Object obj, int i) {
        this.d = i;
        this.b = jyhVar;
        this.a = jszVar;
        this.c = obj;
    }

    public /* synthetic */ epv(khu khuVar, nox noxVar, Executor executor, int i) {
        this.d = i;
        this.a = khuVar;
        this.b = noxVar;
        this.c = executor;
    }

    public /* synthetic */ epv(mkh mkhVar, String str, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.d = i;
        this.b = mkhVar;
        this.c = str;
        this.a = pendingResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [eyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [ete, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [eyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [guu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v63, types: [nox, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [eym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [jwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = null;
        byte[] bArr = null;
        Bundle bundle2 = null;
        switch (this.d) {
            case 0:
                Object obj = this.a;
                Object obj2 = this.b;
                File file = (File) this.c;
                if (!((epw) obj2).j(file)) {
                    ((ltd) ((ltd) ThemeEditorActivity.m.d()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeEditorActivity", "lambda$finishAndBuildTheme$0", 94, "ThemeEditorActivity.java")).t("Failed to save user theme");
                    ((ThemeEditorActivity) obj).t();
                    return;
                }
                ThemeEditorActivity themeEditorActivity = (ThemeEditorActivity) obj;
                themeEditorActivity.n.delete();
                Intent intent = new Intent();
                intent.putExtra("intent_extra_key_new_theme_file_name", file.getName());
                intent.putExtra("intent_extra_key_deleted_theme_file_name", themeEditorActivity.n.getName());
                themeEditorActivity.setResult(-1, intent);
                themeEditorActivity.finish();
                return;
            case 1:
                Object obj3 = this.a;
                Object obj4 = this.b;
                File file2 = (File) this.c;
                if (!((epw) obj4).j(file2)) {
                    ((ltd) ((ltd) ThemeBuilderActivity.m.d()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderActivity", "lambda$finishAndBuildTheme$0", 259, "ThemeBuilderActivity.java")).t("Failed to save user theme");
                    ((ThemeBuilderActivity) obj3).w();
                    return;
                }
                Intent intent2 = new Intent();
                intent2.putExtra("intent_extra_key_new_theme_file_name", file2.getName());
                ThemeBuilderActivity themeBuilderActivity = (ThemeBuilderActivity) obj3;
                themeBuilderActivity.setResult(-1, intent2);
                themeBuilderActivity.v();
                themeBuilderActivity.finish();
                return;
            case 2:
                Object obj5 = this.b;
                ?? r1 = this.a;
                Object obj6 = this.c;
                if (obj5 == null) {
                    r1.s((String) obj6);
                    return;
                } else {
                    r1.b((String) obj6, (File) obj5);
                    return;
                }
            case 3:
                Object obj7 = this.b;
                ?? r12 = this.a;
                Object obj8 = this.c;
                TranslationManager translationManager = ((SystemTranslateProvider) obj7).e;
                if (translationManager != null) {
                    try {
                        Set<TranslationCapability> onDeviceTranslationCapabilities = translationManager.getOnDeviceTranslationCapabilities(1, 1);
                        HashSet hashSet = new HashSet();
                        for (TranslationCapability translationCapability : onDeviceTranslationCapabilities) {
                            if (translationCapability.getState() == 3) {
                                String languageTag = translationCapability.getSourceSpec().getLocale().toLanguageTag();
                                String languageTag2 = translationCapability.getTargetSpec().getLocale().toLanguageTag();
                                if (languageTag.equals("en")) {
                                    hashSet.add(languageTag2);
                                } else {
                                    hashSet.add(languageTag);
                                }
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            hashSet.add("en");
                            ArrayList<String> arrayList = new ArrayList(hashSet);
                            lls h = llw.h();
                            lls h2 = llw.h();
                            for (String str : arrayList) {
                                Object o = jav.e(str).o(((SystemTranslateProvider) obj7).d, (Locale) obj8);
                                h.a(str, o);
                                if (str.equals("zh")) {
                                    h2.a("zh-CN", jav.e("zh-hans").o(((SystemTranslateProvider) obj7).d, (Locale) obj8));
                                } else {
                                    h2.a(str, o);
                                }
                            }
                            gyc.b.execute(new epv((eyl) r12, h, h2, 4));
                            return;
                        }
                    } catch (RuntimeException e) {
                        ((ltd) ((ltd) ((ltd) SystemTranslateProvider.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/translate/SystemTranslateProvider", "getLanguagesUsingApi", (char) 252, "SystemTranslateProvider.java")).s();
                    }
                    gyc.b.execute(new emq((eyl) r12, 14));
                    return;
                }
                llw llwVar = lrq.b;
                r12.a(llwVar, llwVar);
                return;
            case 4:
                ?? r0 = this.a;
                Object obj9 = this.b;
                Object obj10 = this.c;
                ltg ltgVar = SystemTranslateProvider.a;
                r0.a(((lls) obj9).l(), ((lls) obj10).l());
                return;
            case 5:
                Object obj11 = this.b;
                ezf ezfVar = (ezf) obj11;
                ezfVar.b((ezq) this.c, this.a);
                return;
            case 6:
                Object obj12 = this.a;
                fan fanVar = (fan) obj12;
                fanVar.d((ffd) this.c, (fcp) this.b);
                return;
            case 7:
                Object obj13 = this.a;
                Object obj14 = this.b;
                Object obj15 = this.c;
                fjn fjnVar = (fjn) obj13;
                Set set = (Set) fjnVar.k.get(obj14);
                if (set == null) {
                    set = Collections.newSetFromMap(new WeakHashMap());
                }
                set.add(obj15);
                fjnVar.k.put(obj14, set);
                return;
            case 8:
                fpr fprVar = (fpr) this.b;
                if (fprVar.b > 0) {
                    Object obj16 = this.a;
                    Bundle bundle3 = fprVar.c;
                    if (bundle3 != null) {
                        bundle = bundle3.getBundle((String) this.c);
                    }
                    ((LifecycleCallback) obj16).d(bundle);
                }
                if (((fpr) this.b).b >= 2) {
                    ((LifecycleCallback) this.a).i();
                }
                if (((fpr) this.b).b >= 3) {
                    ((LifecycleCallback) this.a).h();
                }
                if (((fpr) this.b).b < 4) {
                    return;
                }
                ((LifecycleCallback) this.a).j();
                return;
            case 9:
                fqd fqdVar = (fqd) this.b;
                if (fqdVar.b > 0) {
                    Object obj17 = this.a;
                    Bundle bundle4 = fqdVar.c;
                    if (bundle4 != null) {
                        bundle2 = bundle4.getBundle((String) this.c);
                    }
                    ((LifecycleCallback) obj17).d(bundle2);
                }
                if (((fqd) this.b).b >= 2) {
                    ((LifecycleCallback) this.a).i();
                }
                if (((fqd) this.b).b >= 3) {
                    ((LifecycleCallback) this.a).h();
                }
                if (((fqd) this.b).b < 4) {
                    return;
                }
                ((LifecycleCallback) this.a).j();
                return;
            case 10:
                Object obj18 = this.a;
                ?? r13 = this.c;
                Object obj19 = this.b;
                try {
                    if (((fsr) obj18).c != null) {
                        fsv fsvVar = ((fsr) obj18).c;
                        Parcel a = fsvVar.a();
                        a.writeMap(r13);
                        Parcel hG = fsvVar.hG(2, a);
                        bArr = hG.createByteArray();
                        hG.recycle();
                    }
                    if (bArr == null) {
                        ((fsr) obj18).b = fyb.h("Received null");
                        bArr = ((fsr) obj18).b;
                    }
                } catch (Exception e2) {
                    fsr fsrVar = (fsr) obj18;
                    fsrVar.b = fyb.i("Snapshot failed: ".concat(e2.toString()), e2);
                    bArr = fsrVar.b;
                    fsrVar.b();
                }
                ftf ftfVar = (ftf) obj19;
                if (!ftfVar.b) {
                    ftfVar.b = true;
                    ftfVar.a.offer(bArr);
                    return;
                }
                throw new RuntimeException("BlockingChannel can be written only once.");
            case 11:
                Object obj20 = this.c;
                Object obj21 = this.b;
                Object obj22 = this.a;
                int i = gkm.a;
                if (!((AtomicBoolean) obj20).compareAndSet(false, true)) {
                    return;
                }
                ((Context) obj21).unregisterReceiver((BroadcastReceiver) obj22);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ?? r02 = this.b;
                Object obj23 = this.c;
                Object obj24 = this.a;
                ltg ltgVar2 = hpr.a;
                hpw.a.a("performPrivateCommand(<action>, <data>)");
                r02.performPrivateCommand((String) obj23, (Bundle) obj24);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj25 = this.c;
                ?? r14 = this.b;
                Object obj26 = this.a;
                ((an) obj25).C().hB().V();
                Preference preference = (Preference) obj26;
                r14.x(preference.v, preference.w, 0, preference.q, null);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj27 = this.c;
                Object obj28 = this.a;
                Object obj29 = this.b;
                irr irrVar = ((irq) obj27).a;
                Intent intent3 = (Intent) obj29;
                String action = intent3.getAction();
                ((ltd) ((ltd) irr.a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "handleBroadcast", 123, "DeviceStatusMonitor.java")).w("onReceive() : Action = %s", action);
                if ("android.intent.action.SCREEN_ON".equals(action)) {
                    ijl.b().g(new irx(true));
                    irrVar.c(false);
                    return;
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    ijl.b().g(new irx(false));
                    irrVar.c(false);
                    return;
                } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action) && !"android.intent.action.AIRPLANE_MODE".equals(action)) {
                    return;
                } else {
                    irrVar.b(irrVar.a(intent3), irr.d((Context) obj28), false);
                    return;
                }
            case 15:
                Object obj30 = this.b;
                Object obj31 = this.a;
                Object obj32 = this.c;
                ((rj) obj31).c(null);
                ((its) obj30).d.remove(obj32);
                return;
            case 16:
                Object obj33 = this.a;
                Object obj34 = this.b;
                File file3 = (File) obj34;
                ((jjo) obj33).a.e(file3, (String) this.c);
                return;
            case 17:
                Object obj35 = this.b;
                Object obj36 = this.a;
                ((jwr) obj35).i.e.a(new jpi((juc) obj36, (jwu) this.c, 6));
                return;
            case 18:
                Object obj37 = this.b;
                jyh jyhVar = (jyh) obj37;
                jyhVar.b((jsz) this.a, this.c);
                return;
            case 19:
                Object obj38 = this.a;
                ?? r15 = this.b;
                kcu.N(new kht((khu) obj38, (nox) r15, 0), this.c);
                return;
            default:
                ?? r3 = this.b;
                Object obj39 = this.c;
                Object obj40 = this.a;
                try {
                    kcu.S(r3);
                    Log.i("PhenotypeBackgroundRecv", "Successfully updated snapshot for " + ((String) obj39));
                    return;
                } catch (ExecutionException e3) {
                    Log.w("PhenotypeBackgroundRecv", "Failed to update local snapshot for " + ((String) obj39), e3);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj40).finish();
                }
        }
    }
}
