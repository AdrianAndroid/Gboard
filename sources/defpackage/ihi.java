package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.preference.PreferenceScreen;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer.MaintenanceTaskRunner;
import com.google.android.libraries.inputmethod.userfeaturecache.UserFeatureCache;
import com.google.android.libraries.inputmethod.userfeaturecache.metrics.InputActionsUserFeatureProcessor;
import com.google.android.libraries.inputmethod.widgets.AlternatingTextView;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ihi  reason: default package */
/* loaded from: classes.dex */
public final class ihi implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ihi(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ ihi(UserFeatureCache userFeatureCache, int i) {
        this.b = i;
        this.a = userFeatureCache;
    }

    public /* synthetic */ ihi(AlternatingTextView alternatingTextView, int i) {
        this.b = i;
        this.a = alternatingTextView;
    }

    public ihi(ihj ihjVar, int i) {
        this.b = i;
        this.a = ihjVar;
    }

    public /* synthetic */ ihi(inf infVar, int i) {
        this.b = i;
        this.a = infVar;
    }

    public /* synthetic */ ihi(iod iodVar, int i) {
        this.b = i;
        this.a = iodVar;
    }

    public /* synthetic */ ihi(itp itpVar, int i) {
        this.b = i;
        this.a = itpVar;
    }

    public /* synthetic */ ihi(iwk iwkVar, int i) {
        this.b = i;
        this.a = iwkVar;
    }

    public /* synthetic */ ihi(iwt iwtVar, int i) {
        this.b = i;
        this.a = iwtVar;
    }

    public /* synthetic */ ihi(ixk ixkVar, int i) {
        this.b = i;
        this.a = ixkVar;
    }

    public /* synthetic */ ihi(ixs ixsVar, int i) {
        this.b = i;
        this.a = ixsVar;
    }

    public /* synthetic */ ihi(jhe jheVar, int i) {
        this.b = i;
        this.a = jheVar;
    }

    public /* synthetic */ ihi(jmy jmyVar, int i) {
        this.b = i;
        this.a = jmyVar;
    }

    public /* synthetic */ ihi(jol jolVar, int i) {
        this.b = i;
        this.a = jolVar;
    }

    public /* synthetic */ ihi(opf opfVar, int i) {
        this.b = i;
        this.a = opfVar;
    }

    public /* synthetic */ ihi(UrlRequest urlRequest, int i) {
        this.b = i;
        this.a = urlRequest;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [opf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [inf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [inf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int c;
        String[] databaseList;
        switch (this.b) {
            case 0:
                ihj ihjVar = (ihj) this.a;
                ial ialVar = ihjVar.n;
                if (ialVar == null) {
                    return;
                }
                ihjVar.q.l(ialVar.d());
                return;
            case 1:
                ihj ihjVar2 = (ihj) this.a;
                ial j = ihjVar2.j(iah.LONG_PRESS);
                if (j == null) {
                    return;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                ((ihh) ihjVar2.q).e.m();
                ihjVar2.m(j, false, true, j.e, uptimeMillis);
                if (ihjVar2.i == iah.LONG_PRESS) {
                    ((ihh) ihjVar2.q).r.e();
                    return;
                } else {
                    ihjVar2.C(0L);
                    return;
                }
            case 2:
                ((ihj) this.a).w();
                if (((ihj) this.a).f().q()) {
                    return;
                }
                ((ihj) this.a).f().j(((ihj) this.a).m);
                return;
            case 3:
                Object obj = this.a;
                Context context = NativeLibHelper.a;
                Context context2 = (Context) obj;
                File[] listFiles = context2.getFilesDir().listFiles(new jvp("temp_lib_" + jam.e(context2), 1, null));
                if (listFiles == null) {
                    return;
                }
                for (File file : listFiles) {
                    File[] listFiles2 = file.listFiles();
                    if (listFiles2 != null) {
                        for (File file2 : listFiles2) {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
                return;
            case 4:
                ((UrlRequest) this.a).cancel();
                return;
            case 5:
                this.a.b();
                return;
            case 6:
                iod iodVar = (iod) this.a;
                aih aihVar = iodVar.a;
                RecyclerView recyclerView = aihVar.b;
                if (recyclerView == null) {
                    return;
                }
                PreferenceScreen fL = aihVar.fL();
                if (iodVar.d || fL == null || (c = iodVar.c(fL, new AtomicInteger())) == -1) {
                    return;
                }
                iodVar.d = true;
                recyclerView.ae(c);
                iodVar.e = c;
                mo gA = recyclerView.gA(c);
                if (gA != null) {
                    iodVar.a(gA.a);
                } else {
                    ls lsVar = recyclerView.l;
                    if (lsVar != null) {
                        lsVar.hg(c);
                    }
                }
                Intent d = iod.d(iodVar.a);
                if (d == null) {
                    return;
                }
                d.removeExtra(":settings:fragment_args_key");
                return;
            case 7:
                this.a.aC(new ins(4));
                return;
            case 8:
                this.a.aE();
                return;
            case 9:
                gvt.a(((itp) this.a).c);
                return;
            case 10:
                Object obj2 = this.a;
                String[] strArr = MaintenanceTaskRunner.b;
                int length = strArr.length;
                for (int i = 0; i < 2; i++) {
                    ((Context) obj2).deleteDatabase(strArr[i]);
                }
                if (!((Boolean) MaintenanceTaskRunner.c.c()).booleanValue()) {
                    return;
                }
                Context context3 = (Context) obj2;
                MaintenanceTaskRunner.d(context3, "com.google.android.libraries.micore.training.cache.service.cache_config_store");
                for (Map.Entry<String, ?> entry : context3.getSharedPreferences("com.google.android.libraries.micore.training.cache.service.cache_registry", 0).getAll().entrySet()) {
                    if (entry.getKey().startsWith("registry_") && (entry.getValue() instanceof String)) {
                        MaintenanceTaskRunner.d(context3, (String) entry.getValue());
                    }
                }
                MaintenanceTaskRunner.d(context3, "com.google.android.libraries.micore.training.cache.service.cache_registry");
                MaintenanceTaskRunner.d(context3, "com.google.android.libraries.micore.training.cache.service.cache_erasure_job_ids");
                JobScheduler jobScheduler = (JobScheduler) context3.getSystemService("jobscheduler");
                if (jobScheduler != null) {
                    for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                        jobInfo.getService().getClassName();
                        if ("com.google.android.libraries.micore.training.cache.service.TrainingCacheErasureJobService".equals(jobInfo.getService().getClassName())) {
                            ((ltd) ((ltd) MaintenanceTaskRunner.a.b()).k("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintenanceTaskRunner", "cleanupMicoreLegacy", 189, "MaintenanceTaskRunner.java")).w("Cancel job: %s", jobInfo.getService());
                            jobScheduler.cancel(jobInfo.getId());
                        } else if ("com.google.android.apps.inputmethod.libs.dvrnn.trainingservice.DvrnnTrainingJobService".equals(jobInfo.getService().getClassName())) {
                            ((ltd) ((ltd) MaintenanceTaskRunner.a.b()).k("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintenanceTaskRunner", "cleanupMicoreLegacy", 192, "MaintenanceTaskRunner.java")).w("Cancel job: %s", jobInfo.getService());
                            jobScheduler.cancel(jobInfo.getId());
                        }
                    }
                }
                for (String str : context3.databaseList()) {
                    if (str.matches("trainingcache[0-9]+\\.db")) {
                        ((ltd) ((ltd) MaintenanceTaskRunner.a.b()).k("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintenanceTaskRunner", "cleanupMicoreLegacy", 202, "MaintenanceTaskRunner.java")).H("Delete obsolete micore database %s: %b", str, context3.deleteDatabase(str));
                    }
                }
                return;
            case 11:
                iwk iwkVar = (iwk) this.a;
                iwkVar.f = true;
                for (Map.Entry entry2 : iwkVar.b.entrySet()) {
                    iwk.c((idm) entry2.getValue());
                }
                iwkVar.b.clear();
                iwkVar.g.d();
                ixe ixeVar = iwkVar.e;
                if (ixeVar == null) {
                    return;
                }
                try {
                    ixeVar.close();
                } catch (RuntimeException e) {
                    ((ltd) ((ltd) ((ltd) iwk.a.c()).i(e)).k("com/google/android/libraries/inputmethod/trainingcache/producer/processormanager/TrainingCacheMetricsProcessorManager", "lambda$onDestroy$1", (char) 167, "TrainingCacheMetricsProcessorManager.java")).t("Failed to close storage adapter.");
                }
                iwkVar.e = null;
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj3 = this.a;
                ((ltd) ((ltd) iwt.a.b()).k("com/google/android/libraries/inputmethod/trainingcache/storage/ProtoXDBBufferWrapper", "lambda$addDataItems$0", 51, "ProtoXDBBufferWrapper.java")).t("The pending queue size hits the cache size limit, flushing the cached data to storage now.");
                ((iwt) obj3).c();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ixk) this.a).d();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ixs) this.a).e();
                return;
            case 15:
                Object obj4 = this.a;
                ((ltd) ((ltd) UserFeatureCache.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "lambda$flagsUpdated$5", 731, "UserFeatureCache.java")).t("UserFeatureCacheFlags updated: recreate user feature cache.");
                UserFeatureCache userFeatureCache = (UserFeatureCache) obj4;
                userFeatureCache.g();
                userFeatureCache.f();
                return;
            case 16:
                Object obj5 = this.a;
                ((ltd) ((ltd) UserFeatureCache.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "lambda$flagsUpdated$6", 759, "UserFeatureCache.java")).t("InputActionsUserFeatureProcessor flag updated.");
                if (!((Boolean) jad.d.c()).booleanValue()) {
                    InputActionsUserFeatureProcessor.b(ieh.j());
                    InputActionsUserFeatureProcessor.a(ieh.j(), ((njc) jad.a.j()).a, ((UserFeatureCache) obj5).j());
                    return;
                }
                InputActionsUserFeatureProcessor.b(ieh.j());
                InputActionsUserFeatureProcessor.c(ieh.j(), (iym) jad.c.j(), ((UserFeatureCache) obj5).d);
                return;
            case 17:
                Object obj6 = this.a;
                AlternatingTextView alternatingTextView = (AlternatingTextView) obj6;
                if (alternatingTextView.a == 0) {
                    alternatingTextView.d();
                    return;
                }
                if (alternatingTextView.f == null) {
                    alternatingTextView.e = AnimatorInflater.loadAnimator(alternatingTextView.getContext(), R.animator.f880_resource_name_obfuscated_res_0x7f020041);
                    alternatingTextView.c = AnimatorInflater.loadAnimator(alternatingTextView.getContext(), R.animator.f870_resource_name_obfuscated_res_0x7f020040);
                    alternatingTextView.f = new AnimatorSet();
                    alternatingTextView.f.playSequentially(alternatingTextView.e, alternatingTextView.c);
                }
                Animator animator = alternatingTextView.e;
                if (animator != null) {
                    animator.addListener(alternatingTextView.g);
                }
                alternatingTextView.f.addListener(alternatingTextView.h);
                alternatingTextView.f.setTarget(obj6);
                alternatingTextView.b.a((View) obj6);
                alternatingTextView.f.start();
                return;
            case 18:
                jhe jheVar = (jhe) this.a;
                jheVar.d();
                jheVar.d = 0.0f;
                jheVar.c = (jheVar.c + 216.0f) % 360.0f;
                int b = jheVar.b();
                jheVar.e = b;
                int[] iArr = jheVar.g;
                int i2 = iArr[b];
                jheVar.f = i2;
                jheVar.b.setIntValues(i2, iArr[jheVar.b()]);
                return;
            case 19:
                jmy jmyVar = (jmy) this.a;
                ((ltd) ((ltd) hyy.a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager$3", "onProgress", 495, "DownloadManager.java")).F("Downloading %s with size %d", ((hyx) jmyVar.c.a).a, jmyVar.a.get());
                return;
            default:
                Object obj7 = this.a;
                synchronized (((jol) obj7).b) {
                    for (jog jogVar : ((jol) obj7).c) {
                        jogVar.close();
                    }
                }
                return;
        }
    }
}
