package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: agk  reason: default package */
/* loaded from: classes.dex */
public final class agk extends Fragment {
    public static final /* synthetic */ int b = 0;
    public opu a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity, afo afoVar) {
        if (activity instanceof afx) {
            ((afx) activity).a().c(afoVar);
        } else if (!(activity instanceof afv)) {
        } else {
            afq I = ((afv) activity).I();
            if (!(I instanceof afq)) {
                return;
            }
            I.c(afoVar);
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new agj());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new agk(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private final void c(afo afoVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), afoVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(afo.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c(afo.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        c(afo.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        opu opuVar = this.a;
        if (opuVar != null) {
            ((agi) opuVar.a).a();
        }
        c(afo.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        opu opuVar = this.a;
        if (opuVar != null) {
            ((agi) opuVar.a).b();
        }
        c(afo.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        c(afo.ON_STOP);
    }
}
