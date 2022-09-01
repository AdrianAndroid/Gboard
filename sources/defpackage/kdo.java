package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.io.File;
import java.util.Random;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kdo  reason: default package */
/* loaded from: classes.dex */
public final class kdo implements npe {
    private final /* synthetic */ int a;
    private final Object b;

    public kdo(lbi lbiVar, int i, byte[] bArr) {
        this.a = i;
        this.b = lbiVar;
    }

    public kdo(oiy oiyVar, int i) {
        this.a = i;
        this.b = oiyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, oiy] */
    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        Object obj;
        Looper looper;
        String string;
        switch (this.a) {
            case 0:
                return new kdn(npd.b(this.b));
            case 1:
                return new kdg((kcm) this.b.a());
            case 2:
                Context b = ((lba) this.b).b();
                PackageManager packageManager = b.getPackageManager();
                String packageName = b.getPackageName();
                try {
                    return packageManager.getPackageInfo(packageName, 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    ((ltd) ((ltd) ((ltd) kdv.a.d()).i(e)).k("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionName", 91, "PrimesCoreMetricDaggerModule.java")).w("Failed to get PackageInfo for: %s", packageName);
                    return null;
                }
            case 3:
                return new kdx((lgh) this.b.a());
            case 4:
                return new NativeCrashHandlerImpl((lfb) ((npf) this.b).b);
            case 5:
                ?? r0 = this.b;
                if (Build.VERSION.SDK_INT < 30) {
                    obj = lrr.a;
                } else {
                    obj = lmz.r((kdt) r0.a());
                }
                nxp.X(obj);
                return obj;
            case 6:
                lfb lfbVar = (lfb) ((npf) this.b).b;
                if (lfbVar.e()) {
                    looper = (Looper) lfbVar.a();
                } else {
                    HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                    handlerThread.start();
                    looper = handlerThread.getLooper();
                }
                return new Handler(looper);
            case 7:
                return new kgg(this.b);
            case 8:
                ldu lduVar = ldu.a;
                return (kgj) ((lfb) ((npf) this.b).b).c(new kgj(lduVar, lduVar));
            case 9:
                return new kgl((kcl) this.b.a());
            case 10:
                return new khl((Random) this.b.a());
            case 11:
                return new lav(((lba) this.b).b());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                File file = (File) this.b.a();
                if (file != null) {
                    return lbw.a(file);
                }
                return null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Context b2 = ((lba) this.b).b();
                try {
                    Bundle bundle = b2.getPackageManager().getApplicationInfo(b2.getPackageName(), 128).metaData;
                    if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                        return new File(b2.getExternalFilesDir(null), string);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                lax f = lax.f((Context) ((lbi) this.b).a);
                nxp.X(f);
                return f;
            case 15:
                lap lapVar = (lap) this.b.a();
                nxp.X(lapVar);
                return lapVar;
            case 16:
                return new lbg(((lba) this.b).b());
            default:
                return new lbi(((lba) this.b).b());
        }
    }
}
