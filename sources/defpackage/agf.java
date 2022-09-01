package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* renamed from: agf  reason: default package */
/* loaded from: classes.dex */
final class agf extends afm {
    final /* synthetic */ agg a;

    public agf(agg aggVar) {
        this.a = aggVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.a.a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        this.a.a.b();
    }
}
