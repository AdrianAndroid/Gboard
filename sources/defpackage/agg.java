package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: agg  reason: default package */
/* loaded from: classes.dex */
public final class agg extends afm {
    final /* synthetic */ agi a;

    public agg(agi agiVar) {
        this.a = agiVar;
    }

    @Override // defpackage.afm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = agk.b;
            ((agk) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.a.h;
        }
    }

    @Override // defpackage.afm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        agi agiVar = this.a;
        int i = agiVar.c - 1;
        agiVar.c = i;
        if (i == 0) {
            agiVar.e.postDelayed(agiVar.f, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        agh.a(activity, new agf(this));
    }

    @Override // defpackage.afm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        agi agiVar;
        agiVar.b--;
        this.a.c();
    }
}
