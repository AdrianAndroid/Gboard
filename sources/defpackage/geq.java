package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: geq  reason: default package */
/* loaded from: classes.dex */
public final class geq extends LifecycleCallback {
    private final List a = new ArrayList();

    private geq(fpq fpqVar) {
        super(fpqVar);
        this.f.c("TaskOnStopCallback", this);
    }

    public static geq a(Activity activity) {
        fpq l = l(activity);
        geq geqVar = (geq) l.b("TaskOnStopCallback", geq.class);
        return geqVar == null ? new geq(l) : geqVar;
    }

    public final void b(geo geoVar) {
        synchronized (this.a) {
            this.a.add(new WeakReference(geoVar));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        synchronized (this.a) {
            for (WeakReference weakReference : this.a) {
                geo geoVar = (geo) weakReference.get();
                if (geoVar != null) {
                    geoVar.a();
                }
            }
            this.a.clear();
        }
    }
}
