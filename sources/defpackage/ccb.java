package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* renamed from: ccb  reason: default package */
/* loaded from: classes.dex */
public final class ccb extends irm {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/OrientationListener");
    private final caj b;

    public ccb(caj cajVar) {
        this.b = cajVar;
    }

    @Override // defpackage.irm
    public final void b(Configuration configuration, Configuration configuration2) {
        if (configuration.orientation == 1) {
            this.b.e.a.declarePortrait();
        } else if (configuration.orientation == 2) {
            this.b.e.a.declareLandscape();
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/OrientationListener", "onConfigurationChanged", 26, "OrientationListener.java")).u("[ORIENTATION] unknown: %d", configuration.orientation);
        }
    }
}
