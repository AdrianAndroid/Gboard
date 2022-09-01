package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: bde  reason: default package */
/* loaded from: classes.dex */
public final class bde implements ComponentCallbacks2, bdh {
    public boolean a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());
    private boolean c;

    @Override // defpackage.bdh
    public final void a(Activity activity) {
        if (this.b.add(activity)) {
            bgj.j();
            if (!this.c) {
                activity.getApplication().registerComponentCallbacks(this);
                this.c = true;
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(new bdf(this, bbk.a(), 1));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 20) {
            this.a = false;
            bbk a = bbk.a();
            bgj.j();
            a.d.set(false);
        }
    }
}
