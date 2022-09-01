package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* renamed from: bdl  reason: default package */
/* loaded from: classes.dex */
public final class bdl extends Fragment {
    public final bcx a;
    public atw c;
    public Fragment d;
    private bdl f;
    public final bdp b = new bea(this, 1);
    private final Set e = new HashSet();

    public bdl() {
        bcx bcxVar = new bcx();
        this.a = bcxVar;
    }

    private final void b() {
        bdl bdlVar = this.f;
        if (bdlVar != null) {
            bdlVar.e.remove(this);
            this.f = null;
        }
    }

    public final void a(Activity activity) {
        b();
        bdl g = atb.b(activity).d.g(activity.getFragmentManager(), null);
        this.f = g;
        if (!equals(g)) {
            this.f.e.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e) {
            if (!Log.isLoggable("RMFragment", 5)) {
                return;
            }
            Log.w("RMFragment", "Unable to register fragment with root", e);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.b();
        b();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        b();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.d();
    }

    @Override // android.app.Fragment
    public final String toString() {
        String fragment = super.toString();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.d;
        }
        String valueOf = String.valueOf(parentFragment);
        return fragment + "{parent=" + valueOf + "}";
    }
}
