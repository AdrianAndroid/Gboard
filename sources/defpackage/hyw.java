package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.libraries.inputmethod.mdd.ForegroundDownloadService;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hyw  reason: default package */
/* loaded from: classes.dex */
public final class hyw implements mka {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hyw(ForegroundDownloadService foregroundDownloadService, int i) {
        this.b = i;
        this.a = foregroundDownloadService;
    }

    public hyw(fwm fwmVar, int i) {
        this.b = i;
        this.a = fwmVar;
    }

    public hyw(hyx hyxVar, int i) {
        this.b = i;
        this.a = hyxVar;
    }

    public hyw(hzd hzdVar, int i) {
        this.b = i;
        this.a = hzdVar;
    }

    public hyw(ieh iehVar, int i) {
        this.b = i;
        this.a = iehVar;
    }

    public hyw(ifm ifmVar, int i) {
        this.b = i;
        this.a = ifmVar;
    }

    public hyw(igk igkVar, int i) {
        this.b = i;
        this.a = igkVar;
    }

    public hyw(itp itpVar, int i) {
        this.b = i;
        this.a = itpVar;
    }

    public hyw(itx itxVar, int i) {
        this.b = i;
        this.a = itxVar;
    }

    public hyw(iyu iyuVar, int i) {
        this.b = i;
        this.a = iyuVar;
    }

    public hyw(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public hyw(jnb jnbVar, int i) {
        this.b = i;
        this.a = jnbVar;
    }

    public hyw(kof kofVar, int i) {
        this.b = i;
        this.a = kofVar;
    }

    public hyw(krj krjVar, int i) {
        this.b = i;
        this.a = krjVar;
    }

    public hyw(mka mkaVar, int i) {
        this.b = i;
        this.a = mkaVar;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [mka, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        mko mkoVar;
        switch (this.b) {
            case 0:
                if (!(th instanceof CancellationException) || (mkoVar = ((hyx) this.a).e) == null) {
                    return;
                }
                mkoVar.cancel(true);
                return;
            case 1:
                ((ltd) ((ltd) ((ltd) hyy.a.b()).i(th)).k("com/google/android/libraries/inputmethod/mdd/DownloadManager$5", "onFailure", (char) 604, "DownloadManager.java")).s();
                return;
            case 2:
                ((ltd) ((ltd) ((ltd) hze.a.d()).i(th)).k("com/google/android/libraries/inputmethod/mdd/FlaggedDownloadManager$3", "onFailure", (char) 275, "FlaggedDownloadManager.java")).s();
                return;
            case 3:
                ((ltd) ((ltd) ((ltd) ForegroundDownloadService.a.d()).i(th)).k("com/google/android/libraries/inputmethod/mdd/ForegroundDownloadService$1", "onFailure", ';', "ForegroundDownloadService.java")).s();
                ((ForegroundDownloadService) this.a).b();
                return;
            case 4:
                ((ieh) this.a).k().execute(new hvg(th, 13));
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) ifm.a.c()).i(th)).k("com/google/android/libraries/inputmethod/metricstracker/SlownessReporterUtil$1", "onFailure", 'z', "SlownessReporterUtil.java")).t("Failed to link to Better Bug in work profile.");
                hjg.i(((ifm) this.a).d);
                hkp.b("SLOWNESS_REPORTER_BANNER", false);
                return;
            case 6:
                ((ltd) ((ltd) igr.a.a(hip.a).i(th)).k("com/google/android/libraries/inputmethod/module/ModuleManager$ModuleInfo$1", "onFailure", 653, "ModuleManager.java")).w("failed to load module %s.", ((igk) this.a).a.b.getSimpleName());
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) itp.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/consumer/materializermanager/MaterializerIterator$3", "onFailure", 126, "MaterializerIterator.java")).w("Failed to close materializer for collection %s.", ((itp) this.a).b);
                return;
            case 8:
                ((ltd) ((ltd) ((ltd) itx.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/guarder/DeviceIntegrityMonitor$1", "onFailure", 'z', "DeviceIntegrityMonitor.java")).t("Failed to check root status.");
                return;
            case 9:
                ((ltd) ((ltd) ((ltd) ivn.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/BrellaInAppTrainerWrapper$1", "onFailure", 41, "BrellaInAppTrainerWrapper.java")).w("Failed to schedule trainer for %s", ((fwm) this.a).b);
                return;
            case 10:
                ((ltd) ((ltd) ((ltd) ivn.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/BrellaInAppTrainerWrapper$2", "onFailure", 61, "BrellaInAppTrainerWrapper.java")).w("Failed to cancel trainer %s", ((fwm) this.a).b);
                return;
            case 11:
                ((ltd) ((ltd) ((ltd) iyu.a.c()).i(th)).k("com/google/android/libraries/inputmethod/userfeaturecache/ProtoStoreWrapper$1", "onFailure", 50, "ProtoStoreWrapper.java")).w("Read value failed because : %s", th.getMessage());
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.a.a(th);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object[] objArr = new Object[2];
                objArr[0] = "NetworkUsageMonitor";
                jiq jiqVar = ((jnb) this.a).a.b;
                if (jiqVar == null) {
                    jiqVar = jiq.f;
                }
                objArr[1] = jiqVar.b;
                jmk.e(th, "%s: Unable to increment LoggingStateStore network usage for %s", objArr);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj = this.a;
                if (!(th instanceof CancellationException)) {
                    Log.w("MetadataFetcher", "load() failed for cache key ".concat(String.valueOf(((kof) obj).e)), th);
                }
                synchronized (((kof) obj).b) {
                    ((kof) obj).g = null;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [mka, java.lang.Object] */
    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                jho jhoVar = (jho) obj;
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                ((ltd) ((ltd) hyy.a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager$5", "onSuccess", 599, "DownloadManager.java")).w("Data %s removed!", this.a);
                return;
            case 2:
                jho jhoVar2 = (jho) obj;
                if (jhoVar2 == null) {
                    return;
                }
                ((hzd) this.a).e.a(jhoVar2);
                return;
            case 3:
                Void r7 = (Void) obj;
                ((ForegroundDownloadService) this.a).stopSelf();
                return;
            case 4:
                Void r72 = (Void) obj;
                return;
            case 5:
                if (!((Boolean) obj).booleanValue()) {
                    ((ltd) ((ltd) ifm.a.c()).k("com/google/android/libraries/inputmethod/metricstracker/SlownessReporterUtil$1", "onSuccess", 113, "SlownessReporterUtil.java")).t("Better Bug is not available in work profile.");
                    hjg.i(((ifm) this.a).d);
                }
                hkp.b("SLOWNESS_REPORTER_BANNER", false);
                return;
            case 6:
                ifw ifwVar = (ifw) obj;
                igg iggVar = ((igk) this.a).a;
                Class cls = iggVar.a;
                Class cls2 = iggVar.b;
                if (ifwVar != null) {
                    ijl.b().g(new igd(cls, cls2, ifwVar));
                }
                ((igk) this.a).a.b.getSimpleName();
                return;
            case 7:
                Void r73 = (Void) obj;
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                ltg ltgVar = itx.a;
                if (bool2 == null) {
                    return;
                }
                idk idkVar = ((itx) this.a).e;
                iwc iwcVar = iwc.DEVICE_INTEGRITY_CHECK;
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(true != bool2.booleanValue() ? 2 : 3);
                idkVar.e(iwcVar, objArr);
                if (!bool2.booleanValue() || !((Boolean) itx.c.c()).booleanValue()) {
                    ijf.j(itl.b);
                    return;
                }
                ijf.k(itl.b);
                hiz.k(iwy.a.b()).F(new cbx(20), ((itx) this.a).d);
                return;
            case 9:
                Void r74 = (Void) obj;
                return;
            case 10:
                Void r75 = (Void) obj;
                return;
            case 11:
                ngz ngzVar = (ngz) obj;
                if (ngzVar == null) {
                    return;
                }
                ((iyu) this.a).b = ngzVar;
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.a.b(((ngz) obj).q());
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Void r76 = (Void) obj;
                jiq jiqVar = ((jnb) this.a).a.b;
                if (jiqVar == null) {
                    jiqVar = jiq.f;
                }
                String str = jiqVar.b;
                int i = jmk.a;
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                return;
            case 15:
                new File(((krj) this.a).b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
                return;
            default:
                if (new File(((SQLiteDatabase) obj).getPath()).exists()) {
                    return;
                }
                synchronized (((krj) this.a).i) {
                    ((krj) this.a).e();
                }
                return;
        }
    }
}
