package defpackage;

import com.google.android.apps.inputmethod.libs.dataservice.superpacks.SuperpacksGcRunner;

/* compiled from: PG */
/* renamed from: bzb  reason: default package */
/* loaded from: classes.dex */
public final class bzb implements mka {
    final /* synthetic */ SuperpacksGcRunner a;

    public bzb(SuperpacksGcRunner superpacksGcRunner) {
        this.a = superpacksGcRunner;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) SuperpacksGcRunner.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksGcRunner$3", "onFailure", 'n', "SuperpacksGcRunner.java")).t("triggerGarbageCollection()");
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Void r5 = (Void) obj;
        ((ltd) ((ltd) SuperpacksGcRunner.a.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksGcRunner$3", "onSuccess", 104, "SuperpacksGcRunner.java")).t("triggerGarbageCollection(): successful");
        SuperpacksGcRunner superpacksGcRunner = this.a;
        superpacksGcRunner.c.getSharedPreferences("superpacks_gc_prefs", 0).edit().putLong("last_gc_timestamp", System.currentTimeMillis()).apply();
    }
}
