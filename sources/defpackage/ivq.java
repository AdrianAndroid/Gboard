package defpackage;

import android.util.Log;
import com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer.MaintenanceTaskRunner;
import com.google.android.libraries.inputmethod.trainingcache.storage.StorageAdapterFactory;
import com.google.android.libraries.inputmethod.userfeaturecache.UserFeatureCache;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ivq  reason: default package */
/* loaded from: classes.dex */
public final class ivq implements mka {
    private final /* synthetic */ int a;

    public ivq(int i) {
        this.a = i;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                ((ltd) ((ltd) ((ltd) ivr.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager$1", "onFailure", (char) 129, "LocalComputationTaskManager.java")).t("Failed to check config or initialize downloader.");
                return;
            case 1:
                ((ltd) ((ltd) ((ltd) iub.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/guarder/TrainingCacheGuarder$1$1", "onFailure", 'N', "TrainingCacheGuarder.java")).t("Failed to create storage adapter.");
                return;
            case 2:
                ((ltd) ((ltd) ((ltd) ivr.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager$2", "onFailure", (char) 155, "LocalComputationTaskManager.java")).t("Failed to check config on flag updated.");
                return;
            case 3:
                ((ltd) ((ltd) ((ltd) ivy.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintainerModule$1$1", "onFailure", 'n', "MaintainerModule.java")).t("Failed to perform maintenance for training cache storage in fail safe state.");
                return;
            case 4:
                ((ltd) ((ltd) ((ltd) ivy.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintainerModule$2", "onFailure", (char) 165, "MaintainerModule.java")).t("Failed to perform maintenance for training cache storage.");
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) MaintenanceTaskRunner.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintenanceTaskRunner$1", "onFailure", (char) 161, "MaintenanceTaskRunner.java")).t("Failed to delete obsolete db file.");
                return;
            case 6:
                ((ltd) ((ltd) ((ltd) iwg.b.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessor$1", "onFailure", (char) 131, "TrainingCacheStatsMetricsProcessor.java")).t("Failed to log stats.");
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) iwk.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/producer/processormanager/TrainingCacheMetricsProcessorManager$2", "onFailure", (char) 145, "TrainingCacheMetricsProcessorManager.java")).t("Failed to create processor manager.");
                return;
            case 8:
                ((ltd) ((ltd) ((ltd) iwk.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/producer/processormanager/TrainingCacheMetricsProcessorManager$3", "onFailure", (char) 183, "TrainingCacheMetricsProcessorManager.java")).t("Failed to destroy processor manager.");
                return;
            case 9:
                if (th instanceof CancellationException) {
                    return;
                }
                ((ltd) ((ltd) ((ltd) iwq.a.d()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/storage/DeferredProtoXDBBufferFlushPolicy$1$1", "onFailure", 's', "DeferredProtoXDBBufferFlushPolicy.java")).t("Failed to run scheduled maybe flush task after input view finished.");
                return;
            case 10:
                ((ltd) ((ltd) ((ltd) iwt.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/storage/ProtoXDBBufferWrapper$1", "onFailure", '?', "ProtoXDBBufferWrapper.java")).t("Failed to flush to storage.");
                return;
            case 11:
                ((ltd) ((ltd) ((ltd) StorageAdapterFactory.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/storage/StorageAdapterFactory$2", "onFailure", (char) 213, "StorageAdapterFactory.java")).t("Failed to close ProtoXDB.");
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((ltd) ((ltd) ((ltd) ixk.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/trainer/dynamictrainer/DynamicTrainer$1", "onFailure", 'T', "DynamicTrainer.java")).t("Failed to configure all trainers.");
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ltd) ((ltd) ((ltd) iyu.a.c()).i(th)).k("com/google/android/libraries/inputmethod/userfeaturecache/ProtoStoreWrapper$2", "onFailure", 103, "ProtoStoreWrapper.java")).w("Read value failed because : %s", th.getMessage());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ltd) ((ltd) UserFeatureCache.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache$5", "onFailure", 746, "UserFeatureCache.java")).t("recreateUserFeatureCacheFuture fails.");
                return;
            case 15:
                ((ltd) ((ltd) ((ltd) UserFeatureCache.a.c()).i(th)).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache$6", "onFailure", (char) 790, "UserFeatureCache.java")).t("flagUpdated() failed");
                return;
            default:
                if (!Log.isLoggable("ClearcutMetricXmitter", 4)) {
                    return;
                }
                Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(String.valueOf(String.valueOf(th))));
                return;
        }
    }

    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        switch (this.a) {
            case 0:
                Void r6 = (Void) obj;
                ltg ltgVar = ivr.a;
                return;
            case 1:
                ixe ixeVar = (ixe) obj;
                if (ixeVar == null) {
                    return;
                }
                ((ltd) ((ltd) iub.a.b()).k("com/google/android/libraries/inputmethod/trainingcache/guarder/TrainingCacheGuarder$1$1", "onSuccess", 70, "TrainingCacheGuarder.java")).t("Clear training cache database on request.");
                ixeVar.k();
                gvt.a(ixeVar);
                return;
            case 2:
                Void r62 = (Void) obj;
                ltg ltgVar2 = ivr.a;
                return;
            case 3:
                Void r63 = (Void) obj;
                ((ltd) ((ltd) ivy.a.b()).k("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintainerModule$1$1", "onSuccess", 103, "MaintainerModule.java")).t("Successfully perform maintenance for training cache storage in fail safe state.");
                return;
            case 4:
                Void r64 = (Void) obj;
                ltg ltgVar3 = ivy.a;
                return;
            case 5:
                Void r65 = (Void) obj;
                ltg ltgVar4 = MaintenanceTaskRunner.a;
                return;
            case 6:
                Void r66 = (Void) obj;
                return;
            case 7:
                Void r67 = (Void) obj;
                return;
            case 8:
                Void r68 = (Void) obj;
                return;
            case 9:
                Void r69 = (Void) obj;
                return;
            case 10:
                Void r610 = (Void) obj;
                return;
            case 11:
                Void r611 = (Void) obj;
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Void r612 = (Void) obj;
                ltg ltgVar5 = ixk.a;
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ngz ngzVar = (ngz) obj;
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Void r613 = (Void) obj;
                ((ltd) ((ltd) UserFeatureCache.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache$5", "onSuccess", 741, "UserFeatureCache.java")).t("recreateUserFeatureCacheFuture finished successfully.");
                return;
            case 15:
                Void r614 = (Void) obj;
                ((ltd) ((ltd) UserFeatureCache.a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache$6", "onSuccess", 785, "UserFeatureCache.java")).t("flagUpdated() finished successfully.");
                return;
            default:
                Void r615 = (Void) obj;
                return;
        }
    }
}
