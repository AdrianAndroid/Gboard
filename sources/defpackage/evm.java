package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.inputmethod.userfeaturecache.UserFeatureCache;

/* compiled from: PG */
/* renamed from: evm  reason: default package */
/* loaded from: classes.dex */
public final class evm implements mka {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public evm(UserFeatureCache userFeatureCache, long j, int i) {
        this.c = i;
        this.b = userFeatureCache;
        this.a = j;
    }

    public evm(evn evnVar, long j, int i) {
        this.c = i;
        this.b = evnVar;
        this.a = j;
    }

    public evm(evq evqVar, long j, int i) {
        this.c = i;
        this.b = evqVar;
        this.a = j;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        int i = this.c;
        if (i == 0) {
            ((ltd) ((ltd) ((ltd) evn.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/BackgroundEkhoMaintenance$2", "onFailure", (char) 136, "BackgroundEkhoMaintenance.java")).t("Ekho record stats failed.");
            ((evn) this.b).c.e(evu.RECORD_STATS_DONE, false);
        } else if (i == 1) {
            ((ltd) ((ltd) ((ltd) evn.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/BackgroundEkhoMaintenance$1", "onFailure", 'Q', "BackgroundEkhoMaintenance.java")).t("Ekho cleanup failed.");
            ((evn) this.b).c.e(evu.CLEANUP_DONE, false);
        } else if (i == 2) {
            ((ltd) ((ltd) ((ltd) evq.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/BackgroundEkhoWriter$1", "onFailure", (char) 169, "BackgroundEkhoWriter.java")).t("Ekho clear failed.");
            ((evq) this.b).c.e(evu.CLEAR_DONE, false);
        } else if (i != 3) {
            ((ltd) ((ltd) ((ltd) UserFeatureCache.a.c()).i(th)).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache$4", "onFailure", (char) 544, "UserFeatureCache.java")).t("putSerializedDataAsync() failed");
        } else {
            ((ltd) ((ltd) ((ltd) UserFeatureCache.a.c()).i(th)).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache$3", "onFailure", (char) 508, "UserFeatureCache.java")).t("updateSerializedDataAsync() failed");
        }
    }

    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        int i = this.c;
        if (i == 0) {
            Void r7 = (Void) obj;
            ((ltd) ((ltd) evn.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/BackgroundEkhoMaintenance$2", "onSuccess", 129, "BackgroundEkhoMaintenance.java")).t("Ekho record stats succeeded.");
            ((evn) this.b).c.e(evu.RECORD_STATS_DONE, true);
            ((evn) this.b).c.g(evx.RECORD_STATS, SystemClock.elapsedRealtime() - this.a);
        } else if (i == 1) {
            Void r72 = (Void) obj;
            ((ltd) ((ltd) evn.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/BackgroundEkhoMaintenance$1", "onSuccess", 74, "BackgroundEkhoMaintenance.java")).t("Ekho cleanup succeeded.");
            ((evn) this.b).c.e(evu.CLEANUP_DONE, true);
            ((evn) this.b).c.g(evx.CLEANUP, SystemClock.elapsedRealtime() - this.a);
        } else if (i != 2) {
            if (i == 3) {
                UserFeatureCache.h(((UserFeatureCache) this.b).b.get(), this.a, (byte[]) obj);
            } else {
                UserFeatureCache.h(((UserFeatureCache) this.b).b.get(), this.a, (byte[]) obj);
            }
        } else {
            Void r73 = (Void) obj;
            ((ltd) ((ltd) evq.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/BackgroundEkhoWriter$1", "onSuccess", 162, "BackgroundEkhoWriter.java")).t("Ekho clear succeeded.");
            ((evq) this.b).c.e(evu.CLEAR_DONE, true);
            ((evq) this.b).c.g(evx.CLEAR, SystemClock.elapsedRealtime() - this.a);
        }
    }
}
