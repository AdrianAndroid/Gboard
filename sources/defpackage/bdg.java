package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: bdg  reason: default package */
/* loaded from: classes.dex */
public final class bdg implements bdh {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // defpackage.bdh
    public final void a(Activity activity) {
        if (!this.b && this.a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new bdf(this, decorView, 0));
        }
    }
}
