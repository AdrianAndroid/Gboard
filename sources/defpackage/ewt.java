package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ewt  reason: default package */
/* loaded from: classes.dex */
public final class ewt {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager");
    private static volatile ewt f;
    public final Context b;
    public final feo c;
    public final mkr d;
    public final ino e;
    private final idk g;

    public ewt(Context context, feo feoVar, idk idkVar, mkr mkrVar, ino inoVar) {
        this.b = context.getApplicationContext();
        this.g = idkVar;
        this.c = feoVar;
        this.d = mkrVar;
        this.e = inoVar;
    }

    public static ewt a(Context context) {
        ewt ewtVar = f;
        if (ewtVar == null) {
            synchronized (ewt.class) {
                ewtVar = f;
                if (ewtVar == null) {
                    ewtVar = new ewt(context, feo.c(context, "speech-packs"), ieh.j(), gxo.a(10), ino.M(context));
                    f = ewtVar;
                }
            }
        }
        return ewtVar;
    }

    private final gen g(fwm fwmVar) {
        gen c = gbh.c(this.b, this.d, fwmVar);
        c.l(this.d, ewr.a);
        c.h(this.d, new doq(this, 6));
        return c;
    }

    public final mko b(String str, String str2, String str3, String str4) {
        File e = this.c.e(ewo.a);
        fwm fwmVar = null;
        if (e == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "getTrainerOptionsForCancelPrecompute", 196, "SpeechFederationTrainerManager.java")).t("Speech pack does not exist, exiting cancel.");
        } else {
            String str5 = "SpeechFederation-" + str2 + e.getName() + "-FeaturePrecomputation";
            File file = new File(e, str3);
            if (!file.exists()) {
                ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "getTrainerOptionsForCancelPrecompute", 208, "SpeechFederationTrainerManager.java")).w("Local computation plan %s is not available, exiting cancel.", str3);
            } else {
                File file2 = new File(this.b.getFilesDir(), str4 + File.separator + "brella_outputs");
                haz a2 = evg.a();
                a2.e(false);
                fwmVar = ewn.b(this.b, str5, file, e, file2, a2.d(), null);
            }
        }
        haz a3 = evg.a();
        a3.e(false);
        fwm c = ewn.c(str, "SpeechFederation-" + str2 + "-FederatedTraining", a3.d());
        ArrayList arrayList = new ArrayList();
        if (fwmVar != null) {
            arrayList.add(g(fwmVar).a(this.d, ext.b));
        }
        arrayList.add(g(c).a(this.d, ext.b));
        return gni.c(gni.f(arrayList));
    }

    public final mko c(final evg evgVar, final String str, final String str2, final String str3, final String str4) {
        return kcu.N(new Runnable() { // from class: ews
            @Override // java.lang.Runnable
            public final void run() {
                ewt ewtVar = ewt.this;
                String str5 = str;
                evg evgVar2 = evgVar;
                String str6 = str2;
                String str7 = str3;
                String str8 = str4;
                if (!((Boolean) evs.d.c()).booleanValue()) {
                    ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$scheduleTraining$0", 117, "SpeechFederationTrainerManager.java")).t("Federated speech is disabled by flag.");
                } else if (str5.isEmpty()) {
                    ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$scheduleTraining$0", 122, "SpeechFederationTrainerManager.java")).t("Empty population. Disabling task scheduling...");
                } else if (fdz.b()) {
                    llp b = hqr.b();
                    int size = b.size();
                    int i = 0;
                    while (i < size) {
                        jav h = ((hqt) b.get(i)).h();
                        i++;
                        if (ewo.a.equals(h)) {
                            if (!ewtVar.e.ak("user_enable_federated_training")) {
                                ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$scheduleTraining$0", 141, "SpeechFederationTrainerManager.java")).t("Federation setting is disabled by user.");
                                ewtVar.d(ewv.FEDERATION_DISABLED_BY_USER);
                                return;
                            } else if (!ewtVar.e.aj(R.string.f160930_resource_name_obfuscated_res_0x7f14067d)) {
                                ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$scheduleTraining$0", 146, "SpeechFederationTrainerManager.java")).t("Faster voice typing setting is disabled by user.");
                                ewtVar.d(ewv.FASTER_VOICE_TYPING_DISABLED_BY_USER);
                                return;
                            } else {
                                File e = ewtVar.c.e(ewo.a);
                                if (e == null) {
                                    ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "scheduleFeaturePrecomputationTask", 300, "SpeechFederationTrainerManager.java")).t("Speech pack is not available, skip local feature precomputation plan.");
                                    ewtVar.d(ewv.SPEECH_PACK_NOT_AVAILABLE);
                                } else {
                                    String str9 = "SpeechFederation-" + str6 + e.getName() + "-FeaturePrecomputation";
                                    File file = new File(e, str7);
                                    if (!file.exists()) {
                                        ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "scheduleFeaturePrecomputationTask", 312, "SpeechFederationTrainerManager.java")).w("Local computation plan %s is not available, skip speech federation.", str7);
                                        ewtVar.d(ewv.SPEECH_PACK_LACKS_LOCAL_PLAN);
                                    } else {
                                        File file2 = new File(ewtVar.b.getFilesDir(), str8 + File.separator + "brella_outputs");
                                        nfh t = nnl.e.t();
                                        boolean z = evgVar2.a;
                                        if (t.c) {
                                            t.cD();
                                            t.c = false;
                                        }
                                        nnl nnlVar = (nnl) t.b;
                                        int i2 = nnlVar.a | 1;
                                        nnlVar.a = i2;
                                        nnlVar.b = z;
                                        str5.getClass();
                                        int i3 = i2 | 2;
                                        nnlVar.a = i3;
                                        nnlVar.c = str5;
                                        nnlVar.a = i3 | 4;
                                        nnlVar.d = str6;
                                        fwm b2 = ewn.b(ewtVar.b, str9, file, e, file2, evgVar2, (nnl) t.cz());
                                        ewn.e(file2);
                                        ewtVar.e(b2, "feature precomputation task", ewv.FEATURE_PRECOMPUTATION_SCHEDULED, ewv.CANNOT_SCHEDULE_FEATURE_PRECOMPUTATION);
                                        ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "registerTasks", 265, "SpeechFederationTrainerManager.java")).t("Successfully scheduled multi-stage job.");
                                        return;
                                    }
                                }
                                ewtVar.f(evgVar2, str5, str6);
                                ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "registerTasks", 269, "SpeechFederationTrainerManager.java")).t("Successfully scheduled single-stage job.");
                                return;
                            }
                        }
                    }
                    ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$scheduleTraining$0", 132, "SpeechFederationTrainerManager.java")).w("Locale supported by Speech federation (%s) is not enabled.", ewo.a);
                    ewtVar.d(ewv.SUPPORTED_LOCALE_NOT_ENABLED);
                } else {
                    ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$scheduleTraining$0", 127, "SpeechFederationTrainerManager.java")).t("On-device dictation is not supported on this device.");
                    ewtVar.d(ewv.FASTER_VOICE_TYPING_NOT_SUPPORTED);
                }
            }
        }, this.d);
    }

    public final void d(ewv ewvVar) {
        this.g.e(ewu.a, ewvVar);
    }

    public final void e(fwm fwmVar, final String str, final ewv ewvVar, final ewv ewvVar2) {
        g(fwmVar).l(this.d, new gel() { // from class: ewp
            @Override // defpackage.gel
            public final void e(Object obj) {
                final ewt ewtVar = ewt.this;
                final String str2 = str;
                ewv ewvVar3 = ewvVar;
                final ewv ewvVar4 = ewvVar2;
                gen b = ((fwk) obj).b();
                b.l(ewtVar.d, new gka(ewtVar, str2, ewvVar3, 1));
                b.h(ewtVar.d, new gek() { // from class: ewq
                    @Override // defpackage.gek
                    public final void d(Exception exc) {
                        ewt ewtVar2 = ewt.this;
                        String str3 = str2;
                        ewv ewvVar5 = ewvVar4;
                        ((ltd) ((ltd) ((ltd) ewt.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$scheduleBrellaTask$3", 423, "SpeechFederationTrainerManager.java")).w("Failed to schedule %s.", str3);
                        ewtVar2.d(ewvVar5);
                    }
                });
            }
        });
    }

    public final void f(evg evgVar, String str, String str2) {
        e(ewn.c(str, "SpeechFederation-" + str2 + "-FederatedTraining", evgVar), "speech federation training task", ewv.TRAINING_SCHEDULED, ewv.CANNOT_SCHEDULE_TRAINING);
    }
}
