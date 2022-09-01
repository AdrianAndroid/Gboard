package defpackage;

import com.google.android.apps.inputmethod.libs.trainingcache.maintenance.MaintenanceTaskRunner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: eoi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eoi implements miy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eoi(MaintenanceTaskRunner maintenanceTaskRunner, int i) {
        this.b = i;
        this.a = maintenanceTaskRunner;
    }

    public /* synthetic */ eoi(eol eolVar, int i) {
        this.b = i;
        this.a = eolVar;
    }

    public /* synthetic */ eoi(ett ettVar, int i) {
        this.b = i;
        this.a = ettVar;
    }

    public /* synthetic */ eoi(exe exeVar, int i) {
        this.b = i;
        this.a = exeVar;
    }

    public /* synthetic */ eoi(feo feoVar, int i) {
        this.b = i;
        this.a = feoVar;
    }

    public /* synthetic */ eoi(gbx gbxVar, int i) {
        this.b = i;
        this.a = gbxVar;
    }

    public /* synthetic */ eoi(gkz gkzVar, int i) {
        this.b = i;
        this.a = gkzVar;
    }

    public /* synthetic */ eoi(gls glsVar, int i) {
        this.b = i;
        this.a = glsVar;
    }

    public /* synthetic */ eoi(hiv hivVar, int i) {
        this.b = i;
        this.a = hivVar;
    }

    public /* synthetic */ eoi(hrx hrxVar, int i) {
        this.b = i;
        this.a = hrxVar;
    }

    public /* synthetic */ eoi(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ eoi(StackTraceElement[] stackTraceElementArr, int i) {
        this.b = i;
        this.a = stackTraceElementArr;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [hiv, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        mko c;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                ltg ltgVar = eol.a;
                return kcu.K(((byy) obj).c((String) obj2));
            case 1:
                jre jreVar = (jre) obj;
                eol eolVar = (eol) this.a;
                return eolVar.d.b(eolVar.c);
            case 2:
                jqm jqmVar = (jqm) obj;
                return ((ett) this.a).e();
            case 3:
                jre jreVar2 = (jre) obj;
                return ((ett) this.a).d();
            case 4:
                jre jreVar3 = (jre) obj;
                return ((ett) this.a).d();
            case 5:
                MaintenanceTaskRunner maintenanceTaskRunner = (MaintenanceTaskRunner) this.a;
                return maintenanceTaskRunner.c(maintenanceTaskRunner.c.c(), "Ekho record stats", 508, ((Boolean) obj).booleanValue());
            case 6:
                Boolean bool = (Boolean) obj;
                MaintenanceTaskRunner maintenanceTaskRunner2 = (MaintenanceTaskRunner) this.a;
                exv exvVar = maintenanceTaskRunner2.d;
                File e = exvVar.b.e(exr.a);
                if (e == null) {
                    ((ltd) ((ltd) exv.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "cancelAllTasks", 443, "SpeechPersonalizationTrainerManager.java")).t("Exiting cancel as speech pack is not available.");
                    c = mkk.a;
                } else {
                    fwm[] fwmVarArr = {exvVar.b(e, "-precompute", "p13n_precompute_plan.pb", exr.a), exvVar.b(e, "-train", "p13n_training_plan.pb", exr.a), exvVar.b(e, "", "local_computation_plan.pb", exr.a)};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 3; i++) {
                        fwm fwmVar = fwmVarArr[i];
                        if (fwmVar != null) {
                            arrayList.add(exvVar.c(fwmVar).a(exvVar.c, ext.a));
                        }
                    }
                    c = gni.c(gni.f(arrayList));
                }
                return maintenanceTaskRunner2.c(c, "Cancelling all speech personalization jobs before cleanup.", 506, bool.booleanValue());
            case 7:
                MaintenanceTaskRunner maintenanceTaskRunner3 = (MaintenanceTaskRunner) this.a;
                return maintenanceTaskRunner3.c(maintenanceTaskRunner3.g.b((String) evs.e.c(), "SpeechASRFederation", "fed_asr_plan.pb", "resources/fed_asr/"), "Cancelling all speech ASR federation jobs before cleanup.", 510, ((Boolean) obj).booleanValue());
            case 8:
                MaintenanceTaskRunner maintenanceTaskRunner4 = (MaintenanceTaskRunner) this.a;
                return maintenanceTaskRunner4.c(maintenanceTaskRunner4.g.b((String) evs.f.c(), "SpeechR12NFederation", "fed_r12n_plan.pb", "resources/r12n/"), "Cancelling all speech R12N federation jobs before cleanup.", 511, ((Boolean) obj).booleanValue());
            case 9:
                MaintenanceTaskRunner maintenanceTaskRunner5 = (MaintenanceTaskRunner) this.a;
                return maintenanceTaskRunner5.c(maintenanceTaskRunner5.c.b(), "Ekho cleanup", 507, ((Boolean) obj).booleanValue());
            case 10:
                MaintenanceTaskRunner maintenanceTaskRunner6 = (MaintenanceTaskRunner) this.a;
                return maintenanceTaskRunner6.c(maintenanceTaskRunner6.h.b(), "Precomputed feature file cleanup.", 509, ((Boolean) obj).booleanValue());
            case 11:
                jqm jqmVar2 = (jqm) obj;
                return ((exe) this.a).c.g("lm_personalization", jsq.a);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jre jreVar4 = (jre) obj;
                return ((exe) this.a).c.b("lm_personalization");
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                feo feoVar = (feo) this.a;
                return feoVar.c.b(feoVar.e);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj3 = this.a;
                IOException iOException = (IOException) obj;
                gbx.d.j(iOException, "Failed to read from or write to disk");
                ((gbx) obj3).g.e(job.IN_APP_TRAINING_SCHEDULER_IO_EXCEPTION_DURING_UPDATE);
                throw iOException;
            case 15:
                blp blpVar = (blp) obj;
                gkz gkzVar = (gkz) this.a;
                if (gkzVar.a.q && blpVar.d == lzs.OFFLINE) {
                    blpVar = blp.c;
                }
                return gkzVar.b(blpVar);
            case 16:
                Object obj4 = this.a;
                String str = (String) obj;
                synchronized (obj4) {
                    ((gls) obj4).a = str;
                }
                return ((gls) obj4).c();
            case 17:
                Object obj5 = this.a;
                Throwable c2 = lgf.c((Throwable) obj);
                StackTraceElement[] stackTrace = c2.getStackTrace();
                int length = stackTrace.length;
                int i2 = length + 1;
                int length2 = ((StackTraceElement[]) obj5).length;
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2 + length2];
                System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
                stackTraceElementArr[length] = new StackTraceElement("the.stack.trace.below.was.manually", "injected", "NetworkingExecutors.java", 1);
                System.arraycopy(obj5, 0, stackTraceElementArr, i2, length2);
                c2.setStackTrace(stackTraceElementArr);
                return kcu.J(c2);
            case 18:
                ?? r0 = this.a;
                ltg ltgVar2 = hiz.a;
                return kcu.K(r0.a(obj));
            case 19:
                return ((hrx) this.a).F((List) obj);
            default:
                TimeoutException timeoutException = (TimeoutException) obj;
                return ((hrx) this.a).F(null);
        }
    }
}
