package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    public final Semaphore a = new Semaphore(1);
    public volatile PackageStats b;

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            ltg ltgVar = kgq.a;
            this.b = packageStats;
        } else {
            ((ltd) ((ltd) kgq.a.d()).k("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 51, "PackageStatsCapture.java")).t("Failure getting PackageStats");
        }
        this.a.release();
    }
}
