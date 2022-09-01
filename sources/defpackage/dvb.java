package defpackage;

import com.google.android.apps.inputmethod.libs.trainingcache.maintenance.MaintenanceTaskRunner;
import j$.time.Instant;
import java.io.File;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dvb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dvb implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dvb(bze bzeVar, String str, int i) {
        this.c = i;
        this.b = bzeVar;
        this.a = str;
    }

    public /* synthetic */ dvb(MaintenanceTaskRunner maintenanceTaskRunner, evg evgVar, int i) {
        this.c = i;
        this.a = maintenanceTaskRunner;
        this.b = evgVar;
    }

    public /* synthetic */ dvb(dvf dvfVar, bkp bkpVar, int i) {
        this.c = i;
        this.a = dvfVar;
        this.b = bkpVar;
    }

    public /* synthetic */ dvb(eie eieVar, cxe cxeVar, int i) {
        this.c = i;
        this.a = eieVar;
        this.b = cxeVar;
    }

    public /* synthetic */ dvb(eij eijVar, cxe cxeVar, int i) {
        this.c = i;
        this.a = eijVar;
        this.b = cxeVar;
    }

    public /* synthetic */ dvb(eol eolVar, jsq jsqVar, int i) {
        this.c = i;
        this.b = eolVar;
        this.a = jsqVar;
    }

    public /* synthetic */ dvb(etg etgVar, String str, int i) {
        this.c = i;
        this.b = etgVar;
        this.a = str;
    }

    public /* synthetic */ dvb(eyf eyfVar, jsq jsqVar, int i) {
        this.c = i;
        this.b = eyfVar;
        this.a = jsqVar;
    }

    public /* synthetic */ dvb(feo feoVar, String str, int i) {
        this.c = i;
        this.b = feoVar;
        this.a = str;
    }

    public /* synthetic */ dvb(gkz gkzVar, blo bloVar, int i) {
        this.c = i;
        this.a = gkzVar;
        this.b = bloVar;
    }

    public /* synthetic */ dvb(gmk gmkVar, blo bloVar, int i) {
        this.c = i;
        this.a = gmkVar;
        this.b = bloVar;
    }

    public /* synthetic */ dvb(hyy hyyVar, hyx hyxVar, int i) {
        this.c = i;
        this.a = hyyVar;
        this.b = hyxVar;
    }

    public /* synthetic */ dvb(hyy hyyVar, jhs jhsVar, int i) {
        this.c = i;
        this.b = hyyVar;
        this.a = jhsVar;
    }

    public /* synthetic */ dvb(hyy hyyVar, jia jiaVar, int i) {
        this.c = i;
        this.b = hyyVar;
        this.a = jiaVar;
    }

    public /* synthetic */ dvb(Class cls, opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = i;
        this.a = cls;
        this.b = opuVar;
    }

    public /* synthetic */ dvb(String str, jav javVar, int i) {
        this.c = i;
        this.a = str;
        this.b = javVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, bze] */
    /* JADX WARN: Type inference failed for: r1v47, types: [blo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v48, types: [blo, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        mko mkoVar;
        boolean z = false;
        switch (this.c) {
            case 0:
                Object obj2 = this.a;
                Object obj3 = this.b;
                bkq bkqVar = (bkq) obj;
                nfh t = fij.c.t();
                nfh t2 = fig.c.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                fig figVar = (fig) t2.b;
                bkqVar.getClass();
                figVar.a = bkqVar;
                obj3.getClass();
                figVar.b = (bkp) obj3;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                fij fijVar = (fij) t.b;
                fig figVar2 = (fig) t2.cz();
                figVar2.getClass();
                fijVar.b = figVar2;
                fijVar.a = 1;
                ((dvf) obj2).e.c((fij) t.cz());
                return mkk.a;
            case 1:
                ?? r0 = this.b;
                Object obj4 = this.a;
                jre jreVar = (jre) obj;
                lug lugVar = drp.a;
                return r0.b((String) obj4);
            case 2:
                Object obj5 = this.a;
                Void r10 = (Void) obj;
                eie eieVar = (eie) obj5;
                return eieVar.e.b(kcu.K(((cxe) this.b).b), eieVar.j);
            case 3:
                Object obj6 = this.a;
                Void r102 = (Void) obj;
                eij eijVar = (eij) obj6;
                return eijVar.d.b(kcu.K(((cxe) this.b).b), eijVar.i);
            case 4:
                Object obj7 = this.b;
                jqm jqmVar = (jqm) obj;
                eol eolVar = (eol) obj7;
                return eolVar.d.h(eolVar.c, new eoj(), (jsq) this.a);
            case 5:
                jre jreVar2 = (jre) obj;
                return ((etg) this.b).b.b((String) this.a);
            case 6:
                Object obj8 = this.a;
                Object obj9 = this.b;
                MaintenanceTaskRunner maintenanceTaskRunner = (MaintenanceTaskRunner) obj8;
                exv exvVar = maintenanceTaskRunner.d;
                return maintenanceTaskRunner.c(kcu.N(new elr(exvVar, (evg) obj9, 9), exvVar.c), "Register speech personalization trainer", 406, ((Boolean) obj).booleanValue());
            case 7:
                Object obj10 = this.a;
                Object obj11 = this.b;
                MaintenanceTaskRunner maintenanceTaskRunner2 = (MaintenanceTaskRunner) obj10;
                exg exgVar = maintenanceTaskRunner2.e;
                return maintenanceTaskRunner2.c(kcu.N(new elr(exgVar, (evg) obj11, 8), exgVar.e), "Register language model personalization trainer", 406, ((Boolean) obj).booleanValue());
            case 8:
                Object obj12 = this.a;
                Object obj13 = this.b;
                MaintenanceTaskRunner maintenanceTaskRunner3 = (MaintenanceTaskRunner) obj12;
                final exl exlVar = maintenanceTaskRunner3.f;
                final evg evgVar = (evg) obj13;
                return maintenanceTaskRunner3.c(kcu.N(new Runnable() { // from class: exh
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z2;
                        boolean z3;
                        exk exkVar;
                        exl exlVar2 = exl.this;
                        evg evgVar2 = evgVar;
                        nfh t3 = nji.n.t();
                        boolean booleanValue = ((Boolean) evs.a.c()).booleanValue();
                        if (!booleanValue) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "determineEligibility", 167, "LmForSpeechPersonalizationTrainerManager.java")).t("Data for lm for speech personalization is not available.");
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar = (nji) t3.b;
                        njiVar.a |= 256;
                        njiVar.j = booleanValue;
                        boolean b = fdz.b();
                        if (!b) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "determineEligibility", 175, "LmForSpeechPersonalizationTrainerManager.java")).t("On-device dictation is not supported on this device.");
                            z2 = false;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar2 = (nji) t3.b;
                        njiVar2.a |= 16;
                        njiVar2.f = b;
                        llp b2 = hqr.b();
                        int size = b2.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                z3 = false;
                                break;
                            }
                            jav h = ((hqt) b2.get(i)).h();
                            i++;
                            if (exr.a.equals(h)) {
                                z3 = true;
                                break;
                            }
                        }
                        if (!z3) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "determineEligibility", 183, "LmForSpeechPersonalizationTrainerManager.java")).w("Locale supported by Speech personalization (%s) is not enabled.", exr.a);
                            z2 = false;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar3 = (nji) t3.b;
                        njiVar3.a |= 32;
                        njiVar3.g = z3;
                        boolean booleanValue2 = ((Boolean) exd.a.c()).booleanValue();
                        if (!booleanValue2) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "determineEligibility", 193, "LmForSpeechPersonalizationTrainerManager.java")).t("Language model personalization is disabled by flag.");
                            z2 = false;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar4 = (nji) t3.b;
                        njiVar4.a |= 8;
                        njiVar4.e = booleanValue2;
                        boolean ak = exlVar2.f.ak("pref_key_use_personalized_dicts");
                        if (!ak) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "determineEligibility", 201, "LmForSpeechPersonalizationTrainerManager.java")).t("Personalization setting is disabled by user.");
                            z2 = false;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar5 = (nji) t3.b;
                        njiVar5.a |= 4;
                        njiVar5.d = ak;
                        File e = exlVar2.d.e(exr.a);
                        boolean z4 = e != null;
                        if (!z4) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "determineEligibility", 210, "LmForSpeechPersonalizationTrainerManager.java")).t("Failed to get speech pack, skip LM for speech personalization.");
                            z2 = false;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar6 = (nji) t3.b;
                        njiVar6.a |= 64;
                        njiVar6.h = z4;
                        File file = new File(e, "personalization");
                        File file2 = new File(file, "lm_p13n_local_computation_plan.pb");
                        if (!file.exists() || !file2.exists()) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "determineEligibility", 220, "LmForSpeechPersonalizationTrainerManager.java")).t("Local computation plan is not available, skip LM for speech personalization.");
                            z2 = false;
                        }
                        boolean exists = file2.exists();
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar7 = (nji) t3.b;
                        int i2 = njiVar7.a | 128;
                        njiVar7.a = i2;
                        njiVar7.i = exists;
                        njiVar7.a = i2 | 2;
                        njiVar7.c = z2;
                        nfh a = gim.a(3, 2, e, file2);
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar8 = (nji) t3.b;
                        njj njjVar = (njj) a.cz();
                        njjVar.getClass();
                        njiVar8.b = njjVar;
                        njiVar8.a |= 1;
                        if (z2) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "determineEligibility", 232, "LmForSpeechPersonalizationTrainerManager.java")).G("Found speech pack with name %s and local compute plan with name %s", e.getName(), file2.getName());
                            exkVar = new exk(e, file2, file);
                        } else {
                            exkVar = null;
                        }
                        if (exkVar == null) {
                            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "lambda$scheduleTraining$0", 145, "LmForSpeechPersonalizationTrainerManager.java")).t("Device ineligible for lm for speech personalization");
                            exlVar2.g.a((nji) t3.cz());
                            return;
                        }
                        File file3 = exkVar.a;
                        File file4 = exkVar.b;
                        File file5 = exkVar.c;
                        String name = file3.getName();
                        long epochMilli = Instant.now().toEpochMilli();
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nji njiVar9 = (nji) t3.b;
                        njiVar9.a |= 2048;
                        njiVar9.m = epochMilli;
                        String concat = "LmForSpeechPersonalization-".concat(String.valueOf(name));
                        File file6 = new File(new File(exlVar2.c.getFilesDir(), "personalization/lm" + File.separator + name), "brella_outputs_lm_for_speech_p13n");
                        njj njjVar2 = ((nji) t3.b).b;
                        if (njjVar2 == null) {
                            njjVar2 = njj.g;
                        }
                        int ah = ndb.ah(njjVar2.e);
                        if (ah == 0) {
                            ah = 1;
                        }
                        njj njjVar3 = ((nji) t3.b).b;
                        if (njjVar3 == null) {
                            njjVar3 = njj.g;
                        }
                        int ag = ndb.ag(njjVar3.f);
                        if (ag == 0) {
                            ag = 1;
                        }
                        nfh t4 = nnq.i.t();
                        String str = exr.a.n;
                        if (t4.c) {
                            t4.cD();
                            t4.c = false;
                        }
                        nnq nnqVar = (nnq) t4.b;
                        str.getClass();
                        int i3 = nnqVar.a | 1;
                        nnqVar.a = i3;
                        nnqVar.b = str;
                        boolean z5 = evgVar2.a;
                        int i4 = i3 | 2;
                        nnqVar.a = i4;
                        nnqVar.c = z5;
                        nnqVar.e = ah - 1;
                        int i5 = i4 | 8;
                        nnqVar.a = i5;
                        nnqVar.f = ag - 1;
                        nnqVar.a = i5 | 16;
                        String file7 = file3.toString();
                        if (t4.c) {
                            t4.cD();
                            t4.c = false;
                        }
                        nnq nnqVar2 = (nnq) t4.b;
                        file7.getClass();
                        nnqVar2.a |= 32;
                        nnqVar2.g = file7;
                        String file8 = file4.toString();
                        if (t4.c) {
                            t4.cD();
                            t4.c = false;
                        }
                        nnq nnqVar3 = (nnq) t4.b;
                        file8.getClass();
                        nnqVar3.a |= 64;
                        nnqVar3.h = file8;
                        String name2 = exm.FUSION.name();
                        if (t4.c) {
                            t4.cD();
                            t4.c = false;
                        }
                        nnq nnqVar4 = (nnq) t4.b;
                        name2.getClass();
                        nnqVar4.a |= 4;
                        nnqVar4.d = name2;
                        gen c = gbh.c(exlVar2.c, exlVar2.e, exc.b(exlVar2.c, concat, file4, file5, file6, evgVar2, (nnq) t4.cz()));
                        c.l(exlVar2.e, ewr.c);
                        c.h(exlVar2.e, exf.c);
                        c.l(exlVar2.e, new exi(exlVar2, t3, 0));
                        c.h(exlVar2.e, new exj(exlVar2, t3, 1));
                    }
                }, exlVar.e), "Register LM for speech personalization trainer", 406, ((Boolean) obj).booleanValue());
            case 9:
                Object obj14 = this.a;
                Object obj15 = this.b;
                MaintenanceTaskRunner maintenanceTaskRunner4 = (MaintenanceTaskRunner) obj14;
                return maintenanceTaskRunner4.c(maintenanceTaskRunner4.g.c((evg) obj15, (String) evs.e.c(), "SpeechASRFederation", "fed_asr_plan.pb", "resources/fed_asr/"), "Register speech ASR federation trainer", 406, ((Boolean) obj).booleanValue());
            case 10:
                Object obj16 = this.a;
                Object obj17 = this.b;
                MaintenanceTaskRunner maintenanceTaskRunner5 = (MaintenanceTaskRunner) obj16;
                return maintenanceTaskRunner5.c(maintenanceTaskRunner5.g.c((evg) obj17, (String) evs.f.c(), "SpeechR12NFederation", "fed_r12n_plan.pb", "resources/r12n/"), "Register speech representation learning federation trainer", 406, ((Boolean) obj).booleanValue());
            case 11:
                Object obj18 = this.b;
                Object obj19 = this.a;
                jqm jqmVar2 = (jqm) obj;
                if (jqmVar2 == null) {
                    ((ltd) ((ltd) eyf.a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSuperpacksManager", "lambda$sync$1", 250, "SanityCheckEvalSuperpacksManager.java")).t("sync() : Manifest = null");
                    ((eyf) obj18).e.set(null);
                    return kcu.K(jre.k(llp.q(), llp.q()));
                }
                ((ltd) ((ltd) eyf.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSuperpacksManager", "lambda$sync$1", 255, "SanityCheckEvalSuperpacksManager.java")).u("sync() : Manifest version %d", jqmVar2.a());
                eyf eyfVar = (eyf) obj18;
                eyfVar.e.set(jqmVar2);
                return eyfVar.c.h("sanitycheckevaluation", new eyd(), (jsq) obj19);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj20 = this.b;
                Object obj21 = this.a;
                Integer num = (Integer) obj;
                if (num.intValue() == -1) {
                    ((ltd) ((ltd) feo.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "lambda$getLanguageTagAssociatedWithPackName$6", 617, "SpeechPackManager.java")).w("Could not find registered version for superpack %s", ((feo) obj20).e);
                    return kcu.K(null);
                }
                feo feoVar = (feo) obj20;
                return mio.h(feoVar.c.d(feoVar.e, num.intValue()), new cvr(feoVar, num, (String) obj21, 2), feoVar.d);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj22 = this.a;
                Object obj23 = this.b;
                jqm jqmVar3 = (jqm) obj;
                ltg ltgVar = feo.a;
                if (jqmVar3 == null) {
                    ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "lambda$isPackAvailableToDownload$1", 224, "SpeechPackManager.java")).w("isPackAvailableToDownload() : No manifest for URL %s", obj22);
                    return kcu.K(false);
                }
                if (feq.b(jqmVar3.i(), (jav) obj23) != null) {
                    z = true;
                }
                if (!z) {
                    ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "lambda$isPackAvailableToDownload$1", 232, "SpeechPackManager.java")).w("isPackAvailableToDownload() : No pack for language tag %s", obj23);
                }
                return kcu.K(Boolean.valueOf(z));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj24 = this.a;
                ?? r1 = this.b;
                blp blpVar = (blp) obj;
                lty ltyVar = luh.a;
                if (gkz.f(blpVar)) {
                    return ((gkz) obj24).d(r1);
                }
                blb blbVar = blpVar.e;
                jdg.u(blbVar);
                return ((gkz) obj24).e(r1, blbVar);
            case 15:
                gmm gmmVar = (gmm) obj;
                return ((gmk) this.a).b(gmmVar, gmmVar, gmmVar, this.b);
            case 16:
                Object obj25 = this.a;
                Object obj26 = this.b;
                Class a = gno.a((Class) obj25);
                try {
                    Object obj27 = ((opu) obj26).a;
                    String str = (String) obj;
                    bmh bmhVar = new bmh(((gla) obj27).a);
                    if (str != null) {
                        bmhVar.c("Cookie", str);
                    }
                    bmhVar.g = false;
                    return ((gla) obj27).d(bmhVar.a());
                } finally {
                    gno.a(a);
                }
            case 17:
                Object obj28 = this.a;
                Object obj29 = this.b;
                Throwable th = (Throwable) obj;
                if (th instanceof CancellationException) {
                    ((ltd) ((ltd) hyy.a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "lambda$startDownload$9", 509, "DownloadManager.java")).t("download canceled, will reschedule later.");
                    ((hyx) obj29).e = null;
                    return kcu.I();
                }
                ((ltd) ((ltd) ((ltd) hyy.a.c()).i(th)).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "lambda$startDownload$9", 513, "DownloadManager.java")).w("error downloading %s", ((hyx) obj29).a);
                synchronized (obj28) {
                    int i = ((hyx) obj29).d + 1;
                    ((hyx) obj29).d = i;
                    if (i >= ((Long) hyy.c.c()).longValue()) {
                        ((ltd) ((ltd) hyy.a.c()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "lambda$startDownload$9", 517, "DownloadManager.java")).E("filegroup %s failed %d times, removed from task list", ((hyx) obj29).a, ((hyx) obj29).d);
                        ((hyx) obj29).f.d(th);
                        ((hyy) obj28).g.remove(((hyx) obj29).a);
                        mkoVar = kcu.J(th);
                    } else {
                        ((ltd) ((ltd) hyy.a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "lambda$startDownload$9", 524, "DownloadManager.java")).J("Retry download filegroup %s %d/%d", ((hyx) obj29).a, Integer.valueOf(((hyx) obj29).d), hyy.c.c());
                        ((hyx) obj29).e = null;
                        ((hyy) obj28).i((hyx) obj29);
                        mkoVar = ((hyx) obj29).e;
                    }
                }
                return mkoVar;
            case 18:
                Object obj30 = this.b;
                Object obj31 = this.a;
                Boolean bool = (Boolean) obj;
                hyt a2 = hyz.a();
                a2.b(true);
                a2.f(false);
                a2.d(true);
                return ((hyy) obj30).c((jhs) obj31, a2.a());
            case 19:
                Boolean bool2 = (Boolean) obj;
                return ((hyy) this.b).d.b((jia) this.a);
            default:
                Object obj32 = this.b;
                Object obj33 = this.a;
                jho jhoVar = (jho) obj;
                if (jhoVar == null || jhoVar.e != ((jhs) obj33).d) {
                    hyt a3 = hyz.a();
                    a3.d(true);
                    a3.b(true);
                    return ((hyy) obj32).c((jhs) obj33, a3.a());
                }
                return kcu.K(jhoVar);
        }
    }
}
