package defpackage;

import android.util.Log;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* renamed from: fel  reason: default package */
/* loaded from: classes.dex */
public final class fel implements mka {
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public fel(feo feoVar, Pair pair, int i) {
        this.c = i;
        this.b = feoVar;
        this.a = pair;
    }

    public fel(ffq ffqVar, jav javVar, int i) {
        this.c = i;
        this.a = ffqVar;
        this.b = javVar;
    }

    public fel(gll gllVar, opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = i;
        this.a = gllVar;
        this.b = opuVar;
    }

    public fel(hhu hhuVar, lmx lmxVar, int i) {
        this.c = i;
        this.a = hhuVar;
        this.b = lmxVar;
    }

    public fel(hul hulVar, mko mkoVar, int i) {
        this.c = i;
        this.a = hulVar;
        this.b = mkoVar;
    }

    public fel(hyy hyyVar, hyx hyxVar, int i) {
        this.c = i;
        this.b = hyyVar;
        this.a = hyxVar;
    }

    public fel(hze hzeVar, hzd hzdVar, int i) {
        this.c = i;
        this.b = hzeVar;
        this.a = hzdVar;
    }

    public fel(ixs ixsVar, ixn ixnVar, int i) {
        this.c = i;
        this.b = ixsVar;
        this.a = ixnVar;
    }

    public fel(jkk jkkVar, jig jigVar, int i) {
        this.c = i;
        this.b = jkkVar;
        this.a = jigVar;
    }

    public fel(knn knnVar, String str, int i) {
        this.c = i;
        this.a = knnVar;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, ixn] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, ixn] */
    /* JADX WARN: Type inference failed for: r10v56, types: [java.lang.Object, ixn] */
    /* JADX WARN: Type inference failed for: r10v61, types: [java.lang.Object, ixn] */
    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        switch (this.c) {
            case 0:
                byy byyVar = (byy) obj;
                if (byyVar == null) {
                    ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$3", "onSuccess", 435, "SpeechPackManager.java")).t("updatePackSetCacheAsync() : Ignoring null PackSet");
                    return;
                }
                ((feo) this.b).f = byyVar;
                ((feo) this.b).g = (String) ((Pair) this.a).first;
                ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$3", "onSuccess", 440, "SpeechPackManager.java")).t("updatePackSetCacheAsync() : Updated the PackSet cache");
                return;
            case 1:
                jqm jqmVar = (jqm) obj;
                ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$2", "onSuccess", 362, "SpeechPackManager.java")).w("refreshManifest() : Refreshed URL = %s", ((Pair) this.a).first);
                ((feo) this.b).g = (String) ((Pair) this.a).first;
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                ((ltd) ((ltd) ffq.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider$1", "onSuccess", 205, "FallbackOnDeviceRecognitionProvider.java")).t("auto download packs.");
                ((ffq) this.a).c.i((jav) this.b);
                return;
            case 3:
                ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) obj;
                if (!((gll) this.a).d) {
                    return;
                }
                glh glhVar = new glh(this, 3, null);
                experimentalCronetEngine.addRttListener(new gli(glhVar, (opu) this.b, null, null, null, null));
                experimentalCronetEngine.addThroughputListener(new glj(glhVar, (opu) this.b, null, null, null, null));
                return;
            case 4:
                idn idnVar = (idn) obj;
                if (idnVar != null) {
                    idnVar.a();
                }
                ((hhu) this.a).o(((lmx) this.b).g(), hhw.NOTIFY_FLAGS_CHANGED);
                ijf.j(hhq.a);
                return;
            case 5:
                ibi ibiVar = (ibi) obj;
                Object obj2 = this.b;
                hul hulVar = (hul) this.a;
                if (obj2 != hulVar.h || ibiVar == null) {
                    return;
                }
                hulVar.h = null;
                hulVar.g = ibiVar;
                hulVar.f();
                return;
            case 6:
                jho jhoVar = (jho) obj;
                synchronized (this.b) {
                    rj rjVar = ((hyx) this.a).f;
                    if (rjVar != null) {
                        rjVar.c(jhoVar);
                    }
                    ((hyy) this.b).g.remove(((hyx) this.a).a);
                }
                idk idkVar = ((hyy) this.b).e;
                hzn hznVar = hzn.MDD_DOWNLOAD_FINISHED;
                hyx hyxVar = (hyx) this.a;
                idkVar.e(hznVar, hyxVar.a, Integer.valueOf(hyxVar.b));
                return;
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    ((hze) this.b).d((hzd) this.a);
                    return;
                } else {
                    ((hze) this.b).c(((hzd) this.a).a);
                    return;
                }
            case 8:
                Void r10 = (Void) obj;
                ((ixs) this.b).k.put(this.a.c(), ixr.SCHEDULED);
                this.a.c();
                return;
            case 9:
                Void r102 = (Void) obj;
                ((ixs) this.b).k.put(this.a.c(), ixr.CANCELED);
                this.a.c();
                return;
            case 10:
                Void r103 = (Void) obj;
                return;
            case 11:
                ncv ncvVar = (ncv) obj;
                kns knsVar = ((knn) this.a).e;
                knsVar.b = this.b;
                knsVar.d(22);
                return;
            default:
                ncs ncsVar = (ncs) obj;
                Log.i("ExpressiveStickerClient", "ListStickerPacks succeeded.");
                kns knsVar2 = ((knn) this.a).e;
                knsVar2.b = this.b;
                knsVar2.d(4);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, ixn] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, ixn] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, ixn] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, ixn] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        switch (this.c) {
            case 0:
                ((ltd) ((ltd) ((ltd) feo.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$3", "onFailure", (char) 445, "SpeechPackManager.java")).t("updatePackSetCacheAsync() : Update failed");
                return;
            case 1:
                ((ltd) ((ltd) ((ltd) feo.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$2", "onFailure", 369, "SpeechPackManager.java")).w("refreshManifest() : Failed to refresh URL = %s", ((Pair) this.a).first);
                return;
            case 2:
                ((ltd) ((ltd) ((ltd) ffq.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider$1", "onFailure", (char) 212, "FallbackOnDeviceRecognitionProvider.java")).t("speechPackManager#isPackAvailableToDownload()");
                return;
            case 3:
                ((ltd) ((ltd) ((ltd) gll.b.d().h(luh.a, "CronetEngineProvidrImpl")).i(th)).k("com/google/android/libraries/gsa/io/impl/CronetEngineProviderImpl$3", "onFailure", (char) 619, "CronetEngineProviderImpl.java")).t("Cronet engine failed to instantiate.");
                bnh.b(th);
                return;
            case 4:
                ((ltd) ((ltd) ((ltd) hhu.a.c()).i(th)).k("com/google/android/libraries/inputmethod/flag/FlagManager$2", "onFailure", (char) 728, "FlagManager.java")).t("Failed to read flags from disk.");
                ijf.j(hhq.a);
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) hul.a.c()).i(th)).k("com/google/android/libraries/inputmethod/keyboard/impl/SoftKeyViewsMapper$1", "onFailure", (char) 224, "SoftKeyViewsMapper.java")).t("Failed to merge multilingual key mapping");
                ((hul) this.a).f();
                return;
            case 6:
                if (th instanceof CancellationException) {
                    ((ltd) ((ltd) hyy.a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager$4", "onFailure", 553, "DownloadManager.java")).w("download for %s is cancelled", ((hyx) this.a).a);
                    return;
                }
                ((ltd) ((ltd) ((ltd) hyy.a.c()).i(th)).k("com/google/android/libraries/inputmethod/mdd/DownloadManager$4", "onFailure", 556, "DownloadManager.java")).w("error downloading %s", ((hyx) this.a).a);
                idk idkVar = ((hyy) this.b).e;
                hzn hznVar = hzn.MDD_DOWNLOAD_FAILED;
                hyx hyxVar = (hyx) this.a;
                idkVar.e(hznVar, hyxVar.a, Integer.valueOf(hyxVar.b), th);
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) hze.a.c()).i(th)).k("com/google/android/libraries/inputmethod/mdd/FlaggedDownloadManager$2", "onFailure", (char) 237, "FlaggedDownloadManager.java")).s();
                return;
            case 8:
                ConcurrentHashMap concurrentHashMap = ((ixs) this.b).k;
                String c = this.a.c();
                boolean z = ((ixs) this.b).j;
                concurrentHashMap.put(c, ixr.UNKNOWN);
                ((ltd) ((ltd) ((ltd) ixs.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/trainer/trainermanagerv2/TrainerLifecycleManager$2", "onFailure", 324, "TrainerLifecycleManager.java")).w("Failed to schedule trainer %s", this.a.c());
                return;
            case 9:
                ConcurrentHashMap concurrentHashMap2 = ((ixs) this.b).k;
                String c2 = this.a.c();
                boolean z2 = ((ixs) this.b).j;
                concurrentHashMap2.put(c2, ixr.UNKNOWN);
                ((ltd) ((ltd) ((ltd) ixs.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/trainer/trainermanagerv2/TrainerLifecycleManager$3", "onFailure", 351, "TrainerLifecycleManager.java")).w("Failed to cancel trainer %s", this.a.c());
                return;
            case 10:
                int i = jmk.a;
                try {
                    Object obj = this.b;
                    lre.aN(((jkk) obj).a, ((jkk) obj).f, (jig) this.a, ((jkk) obj).j);
                    return;
                } catch (IOException unused) {
                    return;
                }
            case 11:
                if (th instanceof CancellationException) {
                    return;
                }
                Log.w("ExpressiveStickerClient", "Sticker search failed.", th);
                kns knsVar = ((knn) this.a).e;
                knsVar.b = this.b;
                knsVar.d(23);
                return;
            default:
                if (th instanceof CancellationException) {
                    return;
                }
                Log.w("ExpressiveStickerClient", "ListStickerPacks failed.", th);
                kns knsVar2 = ((knn) this.a).e;
                knsVar2.b = this.b;
                knsVar2.d(5);
                return;
        }
    }
}
