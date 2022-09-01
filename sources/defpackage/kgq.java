package defpackage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import com.google.android.libraries.performance.primes.metrics.storage.PackageStatsCapture$PackageStatsCallback;
import java.lang.reflect.Modifier;

/* compiled from: PG */
/* renamed from: kgq  reason: default package */
/* loaded from: classes.dex */
public final class kgq {
    public static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture");
    static final jma[] b = {new jma("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new jma("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new jma("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};

    public static boolean a() {
        return !Modifier.isAbstract(PackageStatsCapture$PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers());
    }
}
