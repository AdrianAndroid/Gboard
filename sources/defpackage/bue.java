package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.inputmethod.libs.autotranslate.AutoTranslatePreferenceFragment;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;
import com.google.android.apps.inputmethod.libs.hmmhandwriting.HmmHandwritingIme;
import com.google.android.inputmethod.latin.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bue  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bue implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bue(Context context, hsz hszVar, String str, int i) {
        this.d = i;
        this.a = context;
        this.b = hszVar;
        this.c = str;
    }

    public /* synthetic */ bue(Context context, String str, View view, int i) {
        this.d = i;
        this.a = context;
        this.c = str;
        this.b = view;
    }

    public /* synthetic */ bue(bui buiVar, llp llpVar, llp llpVar2, int i) {
        this.d = i;
        this.a = buiVar;
        this.b = llpVar;
        this.c = llpVar2;
    }

    public /* synthetic */ bue(caj cajVar, mvm mvmVar, idu iduVar, int i) {
        this.d = i;
        this.a = cajVar;
        this.c = mvmVar;
        this.b = iduVar;
    }

    public /* synthetic */ bue(caj cajVar, mwf mwfVar, idu iduVar, int i) {
        this.d = i;
        this.a = cajVar;
        this.c = mwfVar;
        this.b = iduVar;
    }

    public /* synthetic */ bue(caj cajVar, mwg mwgVar, idu iduVar, int i) {
        this.d = i;
        this.a = cajVar;
        this.c = mwgVar;
        this.b = iduVar;
    }

    public /* synthetic */ bue(ckq ckqVar, String str, llp llpVar, int i) {
        this.d = i;
        this.a = ckqVar;
        this.c = str;
        this.b = llpVar;
    }

    public /* synthetic */ bue(AutoTranslatePreferenceFragment autoTranslatePreferenceFragment, Map map, Context context, int i) {
        this.d = i;
        this.b = autoTranslatePreferenceFragment;
        this.c = map;
        this.a = context;
    }

    public /* synthetic */ bue(ConstraintHeaderViewImpl constraintHeaderViewImpl, ViewGroup viewGroup, leq leqVar, int i) {
        this.d = i;
        this.b = constraintHeaderViewImpl;
        this.a = viewGroup;
        this.c = leqVar;
    }

    public /* synthetic */ bue(HmmHandwritingIme hmmHandwritingIme, String str, djh djhVar, int i) {
        this.d = i;
        this.b = hmmHandwritingIme;
        this.c = str;
        this.a = djhVar;
    }

    public /* synthetic */ bue(dmz dmzVar, dmy dmyVar, hqt hqtVar, int i) {
        this.d = i;
        this.b = dmzVar;
        this.a = dmyVar;
        this.c = hqtVar;
    }

    public /* synthetic */ bue(duk dukVar, fhd fhdVar, oin oinVar, int i) {
        this.d = i;
        this.a = dukVar;
        this.b = fhdVar;
        this.c = oinVar;
    }

    public /* synthetic */ bue(duk dukVar, fhf fhfVar, oin oinVar, int i) {
        this.d = i;
        this.a = dukVar;
        this.b = fhfVar;
        this.c = oinVar;
    }

    public /* synthetic */ bue(duk dukVar, fhg fhgVar, oin oinVar, int i) {
        this.d = i;
        this.a = dukVar;
        this.b = fhgVar;
        this.c = oinVar;
    }

    public /* synthetic */ bue(duk dukVar, fik fikVar, oin oinVar, int i) {
        this.d = i;
        this.a = dukVar;
        this.b = fikVar;
        this.c = oinVar;
    }

    public /* synthetic */ bue(duk dukVar, fio fioVar, oin oinVar, int i) {
        this.d = i;
        this.a = dukVar;
        this.b = fioVar;
        this.c = oinVar;
    }

    public /* synthetic */ bue(dvf dvfVar, fhz fhzVar, nvu nvuVar, int i) {
        this.d = i;
        this.a = dvfVar;
        this.b = fhzVar;
        this.c = nvuVar;
    }

    public /* synthetic */ bue(dwv dwvVar, fgt fgtVar, hqt hqtVar, int i) {
        this.d = i;
        this.a = dwvVar;
        this.b = fgtVar;
        this.c = hqtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v102, types: [java.lang.Object, hsz] */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Object, hsz] */
    /* JADX WARN: Type inference failed for: r2v104, types: [java.lang.Object, hsz] */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.Object, hsz] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object, hqt] */
    /* JADX WARN: Type inference failed for: r3v44, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, hqt] */
    /* JADX WARN: Type inference failed for: r4v46, types: [djh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v55, types: [oin, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        caq caqVar;
        dtm dtmVar;
        switch (this.d) {
            case 0:
                Object obj = this.a;
                ?? r2 = this.b;
                Object obj2 = this.c;
                for (View view : r2) {
                    view.clearAnimation();
                }
                bui buiVar = (bui) obj;
                if (!jdg.W(obj2, buiVar.g)) {
                    return;
                }
                buiVar.m = false;
                if (!buiVar.l) {
                    return;
                }
                buiVar.a(7);
                return;
            case 1:
                Object obj3 = this.b;
                ?? r22 = this.c;
                Object obj4 = this.a;
                for (Map.Entry entry : r22.entrySet()) {
                    final String str = (String) entry.getKey();
                    final Context context = (Context) obj4;
                    final SwitchPreference switchPreference = new SwitchPreference(context);
                    switchPreference.o = new ahw() { // from class: bsz
                        @Override // defpackage.ahw
                        public final void a() {
                            SwitchPreference switchPreference2 = SwitchPreference.this;
                            String str2 = str;
                            Context context2 = context;
                            if (((TwoStatePreference) switchPreference2).a) {
                                ino.K(context2, "_autoshowtranslate").h("showcount_".concat(String.valueOf(str2)), -1);
                            } else {
                                ino.K(context2, "_autoshowtranslate").h("showcount_".concat(String.valueOf(str2)), 4);
                            }
                        }
                    };
                    switchPreference.Q((CharSequence) entry.getValue());
                    boolean z = !(ino.K(context, "_autoshowtranslate").D("showcount_".concat(String.valueOf(str))) >= 3);
                    switchPreference.z = Boolean.valueOf(z);
                    switchPreference.k(z);
                    ((aih) obj3).fL().ah(switchPreference);
                    switchPreference.I(context.getString(R.string.f160660_resource_name_obfuscated_res_0x7f140662));
                }
                return;
            case 2:
                Context context2 = (Context) this.a;
                hkq.b(jdg.f((View) this.b, "image_paste_failed_toast", context2.getString(R.string.f159140_resource_name_obfuscated_res_0x7f1405a5, this.c), context2.getString(R.string.f149220_resource_name_obfuscated_res_0x7f140100), context2.getString(R.string.f159120_resource_name_obfuscated_res_0x7f1405a3), bwk.b).a());
                return;
            case 3:
                Object obj5 = this.a;
                Object obj6 = this.c;
                Object obj7 = this.b;
                luc lucVar = (luc) ((luc) caj.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "unloadLanguageModel", 834, "Delight5DecoderWrapper.java");
                mvm mvmVar = (mvm) obj6;
                mvl b = mvl.b(mvmVar.b);
                if (b == null) {
                    b = mvl.UNKNOWN;
                }
                mvl b2 = mvl.b(mvmVar.b);
                if (b2 == null) {
                    b2 = mvl.UNKNOWN;
                }
                lucVar.G("unloadLanguageModel() : %s, version [%s]", b, b2 == mvl.MAIN ? String.valueOf(mvmVar.j) : "n/a");
                mvl b3 = mvl.b(mvmVar.b);
                if (b3 == null) {
                    b3 = mvl.UNKNOWN;
                }
                int ordinal = b3.ordinal();
                if (ordinal == 1) {
                    caqVar = caq.DELIGHT_UNLOAD_LANGUAGE_MODEL_MAIN;
                } else if (ordinal == 2) {
                    caqVar = caq.DELIGHT_UNLOAD_LANGUAGE_MODEL_CONTACTS;
                } else if (ordinal == 3) {
                    caqVar = caq.DELIGHT_UNLOAD_LANGUAGE_MODEL_USER_HISTORY;
                } else if (ordinal == 4) {
                    caqVar = caq.DELIGHT_UNLOAD_LANGUAGE_MODEL_PERSONAL;
                } else if (ordinal == 8) {
                    caqVar = caq.DELIGHT_UNLOAD_LANGUAGE_MODEL_BLOCKLIST;
                } else if (ordinal == 11) {
                    caqVar = caq.DELIGHT_UNLOAD_LANGUAGE_MODEL_EMOJI_ANNOTATION;
                } else if (ordinal == 14) {
                    caqVar = caq.DELIGHT_UNLOAD_LANGUAGE_MODEL_EMAIL;
                } else {
                    ((luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "getTimerTypeForUnloadLanguageModule", 866, "Delight5DecoderWrapper.java")).u("Cannot find timer type for unloading language model %d", b3.A);
                    caqVar = caq.DELIGHT_UNLOAD_LANGUAGE_MODEL_UNKNOWN;
                }
                cbz cbzVar = ((caj) obj5).e;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                mvn b4 = cbzVar.b(mvmVar);
                cbzVar.a.unloadLanguageModel(b4);
                cbzVar.b.g(caqVar, SystemClock.elapsedRealtime() - elapsedRealtime);
                cbzVar.b.f(cap.LOG_NATIVE_METRICS, (idu) obj7, Long.valueOf(b4.c));
                return;
            case 4:
                Object obj8 = this.a;
                Object obj9 = this.c;
                Object obj10 = this.b;
                mwf mwfVar = (mwf) obj9;
                mwfVar.a.size();
                cbz cbzVar2 = ((caj) obj8).e;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                nfh t = mtx.d.t();
                long o = cbzVar2.d.o();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mtx mtxVar = (mtx) t.b;
                int i = 2 | mtxVar.a;
                mtxVar.a = i;
                mtxVar.c = o;
                obj9.getClass();
                mtxVar.b = mwfVar;
                mtxVar.a = i | 1;
                mtx mtxVar2 = (mtx) t.cz();
                cbzVar2.a.loadShortcutMap(mtxVar2);
                cbzVar2.b.g(caq.DELIGHT_LOAD_SHORTCUT_MAP, SystemClock.elapsedRealtime() - elapsedRealtime2);
                cbzVar2.b.f(cap.LOG_NATIVE_METRICS, (idu) obj10, Long.valueOf(mtxVar2.c));
                return;
            case 5:
                Object obj11 = this.a;
                Object obj12 = this.c;
                Object obj13 = this.b;
                mwg mwgVar = (mwg) obj12;
                mwgVar.a.size();
                cbz cbzVar3 = ((caj) obj11).e;
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                nfh t2 = mtw.d.t();
                long o2 = cbzVar3.d.o();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mtw mtwVar = (mtw) t2.b;
                int i2 = 2 | mtwVar.a;
                mtwVar.a = i2;
                mtwVar.c = o2;
                obj12.getClass();
                mtwVar.b = mwgVar;
                mtwVar.a = i2 | 1;
                mtw mtwVar2 = (mtw) t2.cz();
                cbzVar3.a.loadEmojiShortcutMap(mtwVar2);
                cbzVar3.b.g(caq.DELIGHT_LOAD_EMOJI_SHORTCUT_MAP, SystemClock.elapsedRealtime() - elapsedRealtime3);
                cbzVar3.b.f(cap.LOG_NATIVE_METRICS, (idu) obj13, Long.valueOf(mtwVar2.c));
                return;
            case 6:
                Object obj14 = this.a;
                Object obj15 = this.c;
                Object obj16 = this.b;
                ckq ckqVar = (ckq) obj14;
                lmz lmzVar = (lmz) ((AtomicReference) ckqVar.j.a).get();
                if (lmzVar == null || !lmzVar.contains(obj15)) {
                    return;
                }
                if (((llp) obj16).isEmpty()) {
                    cln.d(ckqVar.c, lmz.r(obj15));
                    ckqVar.d.e(csv.CONTENT_CACHE_DOWNLOAD_SCHEDULED_ON_CACHE_MISS, new Object[0]);
                    return;
                }
                long longValue = ((Long) ckq.b.c()).longValue();
                if (longValue == -1) {
                    return;
                }
                Long l = (Long) ((cll) ckqVar.e.get()).b.get(obj15);
                if (l != null && System.currentTimeMillis() - l.longValue() <= TimeUnit.HOURS.toMillis(longValue)) {
                    return;
                }
                cln.d(ckqVar.c, lmz.r(obj15));
                ckqVar.d.e(csv.CONTENT_CACHE_REFRESH_SCHEDULED_ON_TTL_EXPIRY, new Object[0]);
                return;
            case 7:
                ConstraintHeaderViewImpl constraintHeaderViewImpl = (ConstraintHeaderViewImpl) this.b;
                constraintHeaderViewImpl.q((View) this.a, ((Integer) this.c.a(Integer.valueOf(constraintHeaderViewImpl.getWidth()))).intValue());
                return;
            case 8:
                Object obj17 = this.b;
                Object obj18 = this.c;
                ?? r4 = this.a;
                HmmHandwritingIme hmmHandwritingIme = (HmmHandwritingIme) obj17;
                hmmHandwritingIme.r.b((String) obj18);
                String a = hmmHandwritingIme.r.a();
                if (!TextUtils.isEmpty(a)) {
                    r4.t();
                    r4.x(a, false);
                    hmmHandwritingIme.c.execute(new bwt(hmmHandwritingIme, r4.g(), 18));
                    return;
                }
                hmmHandwritingIme.c.execute(new dgd(hmmHandwritingIme, 4));
                return;
            case 9:
                Object obj19 = this.b;
                Object obj20 = this.a;
                ?? r3 = this.c;
                dmz dmzVar = (dmz) obj19;
                dmx dmxVar = dmzVar.d;
                if (dmxVar == 0 || !dmxVar.b(r3)) {
                    return;
                }
                if (dmzVar.e.contains(r3)) {
                    ((dmy) obj20).F(false);
                    dmzVar.e.remove((Object) r3);
                    dmzVar.f.g(R.string.f164940_resource_name_obfuscated_res_0x7f140835, new Object[0]);
                    return;
                }
                ((dmy) obj20).F(true);
                dmzVar.e.add(r3);
                dmzVar.f.g(R.string.f164930_resource_name_obfuscated_res_0x7f140834, new Object[0]);
                return;
            case 10:
                duk dukVar = (duk) this.a;
                kcu.U(mio.g(dukVar.a(), new cus((fhf) this.b, 11), dukVar.e), new buo((oin) this.c, 20), dukVar.e);
                return;
            case 11:
                Object obj21 = this.a;
                Object obj22 = this.b;
                ?? r32 = this.c;
                dum dumVar = ((duk) obj21).d;
                dve dveVar = new dve((oin) r32, 1);
                hox a2 = dum.a();
                if (a2 == null) {
                    dveVar.a(false);
                    return;
                }
                dumVar.a.e(dua.NGA_VISIBILITY_ACTION_RECEIVED, obj22);
                int b5 = ffb.b(((fhd) obj22).a);
                int i3 = b5 - 1;
                if (b5 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    dum.b(a2, dveVar, 50).run();
                    return;
                } else if (i3 == 1) {
                    boolean c = dum.c();
                    if (c) {
                        dum.d();
                    }
                    dveVar.a(Boolean.valueOf(c));
                    return;
                } else if (i3 == 2) {
                    hsk b6 = hsx.b();
                    if (b6 != null) {
                        b6.az();
                    }
                    dveVar.a(true);
                    return;
                } else {
                    dveVar.a(false);
                    return;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                duk dukVar2 = (duk) this.a;
                kcu.U(mio.g(mkh.q(dukVar2.a()), new cus((fik) this.b, 13), dukVar2.e), new bvo(dukVar2, (oin) this.c, 14), dukVar2.e);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                duk dukVar3 = (duk) this.a;
                kcu.U(mio.g(mkh.q(dukVar3.a()), new cus((fhg) this.b, 9), dukVar3.e), new bvo(dukVar3, (oin) this.c, 15), dukVar3.e);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                duk dukVar4 = (duk) this.a;
                kcu.U(mio.g(mkh.q(dukVar4.a()), new cus((fio) this.b, 12), dukVar4.e), new bvo(dukVar4, (oin) this.c, 16), dukVar4.e);
                return;
            case 15:
                Object obj23 = this.a;
                Object obj24 = this.b;
                Object obj25 = this.c;
                dvf dvfVar = (dvf) obj23;
                oin oinVar = dvfVar.e;
                nfh t3 = fij.c.t();
                nfh t4 = fif.b.t();
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                ((fif) t4.b).a = ((fhz) obj24).a();
                fif fifVar = (fif) t4.cz();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                fij fijVar = (fij) t3.b;
                fifVar.getClass();
                fijVar.b = fifVar;
                fijVar.a = 3;
                oinVar.c((fij) t3.cz());
                nvu nvuVar = (nvu) obj25;
                if (nvuVar.k()) {
                    dvfVar.e.a();
                    return;
                } else {
                    dvfVar.e.b(nvuVar.g());
                    return;
                }
            case 16:
                Object obj26 = this.a;
                Object obj27 = this.b;
                ?? r33 = this.c;
                dwv dwvVar = (dwv) obj26;
                if (dwvVar.c == null) {
                    ((ltd) ((ltd) dwv.a.d()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler", "lambda$restartNgaOrVoiceImeDictationAfterLanguageChanged$0", 136, "NgaLanguagePickerActionHandler.java")).t("restartNgaOrVoiceImeDictationAfterLanguageChanged: no ngaInteractionManager");
                    return;
                }
                ((ltd) ((ltd) dwv.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler", "lambda$restartNgaOrVoiceImeDictationAfterLanguageChanged$0", 140, "NgaLanguagePickerActionHandler.java")).t("Manually updating eligibility and restarting dictation.");
                dtc dtcVar = (dtc) dwvVar.c;
                dtl dtlVar = dtcVar.c;
                ((ltd) ((ltd) dtl.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager", "directlySetEligibility", 140, "NgaStateManager.java")).w("directlySetEligibility to %s", obj27);
                dtlVar.f = (fgt) obj27;
                if (dtlVar.b()) {
                    dtcVar.d();
                }
                if (dtcVar.i != null && fgt.ELIGIBLE.equals(obj27) && (dtmVar = dtcVar.i.c) != null) {
                    ((ltd) ((ltd) dth.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaInputHandlerFactory", "restorePrimary", 122, "NgaInputHandlerFactory.java")).t("restoring primary");
                    dtmVar.j();
                }
                if (dtcVar.c.k.c) {
                    duz duzVar = (duz) dtcVar.g;
                    duzVar.j("sending keyboard opened event", new dut(duzVar.c.b(r33), 2));
                }
                hsk b7 = hsx.b();
                if (b7 == null) {
                    ((ltd) ((ltd) dwv.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler", "sendStartVoiceEvent", 162, "NgaLanguagePickerActionHandler.java")).t("Service is null and could not be acquired.");
                    return;
                } else {
                    b7.at(hfd.d(dwv.b));
                    return;
                }
            case 17:
                Object obj28 = this.a;
                ?? r23 = this.b;
                Object obj29 = this.c;
                ltg ltgVar = egf.a;
                r23.z(hfd.d(new iay(-10104, null, new icz(((Context) obj28).getString(R.string.f155040_resource_name_obfuscated_res_0x7f1403ac), dip.j((String) obj29, hfl.EXTERNAL)))));
                return;
            case 18:
                this.b.z(hfd.d(new iay(-10104, null, new icz(((Context) this.a).getString(R.string.f155040_resource_name_obfuscated_res_0x7f1403ac), dip.j((String) this.c, hfl.EXTERNAL)))));
                return;
            case 19:
                Object obj30 = this.a;
                ?? r24 = this.b;
                Object obj31 = this.c;
                ltg ltgVar2 = eie.a;
                r24.z(hfd.d(new iay(-10104, null, new icz(((Context) obj30).getString(R.string.f155040_resource_name_obfuscated_res_0x7f1403ac), dip.j((String) obj31, hfl.EXTERNAL)))));
                return;
            default:
                Object obj32 = this.a;
                ?? r25 = this.b;
                Object obj33 = this.c;
                ltg ltgVar3 = eij.a;
                r25.z(hfd.d(new iay(-10104, null, new icz(((Context) obj32).getString(R.string.f155040_resource_name_obfuscated_res_0x7f1403ac), dip.j((String) obj33, hfl.EXTERNAL)))));
                return;
        }
    }
}
