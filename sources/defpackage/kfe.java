package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.Window;

/* compiled from: PG */
/* renamed from: kfe  reason: default package */
/* loaded from: classes.dex */
final class kfe implements kcd, kcc, kfa {
    private final Window.OnFrameMetricsAvailableListener a;
    private final nox b;
    private Activity c;
    private boolean d;

    public kfe(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, nox noxVar) {
        this.a = onFrameMetricsAvailableListener;
        this.b = noxVar;
    }

    private final void e() {
        Activity activity = this.c;
        if (activity != null) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.a());
        }
    }

    private final void f() {
        Activity activity = this.c;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // defpackage.kcd
    public void a(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                e();
            }
        }
    }

    @Override // defpackage.kcc
    public void b(Activity activity) {
        synchronized (this) {
            if (this.d) {
                f();
            }
            this.c = null;
        }
    }

    @Override // defpackage.kfa
    public void c() {
        synchronized (this) {
            this.d = true;
            if (this.c != null) {
                e();
            }
        }
    }

    @Override // defpackage.kfa
    public void d() {
        synchronized (this) {
            this.d = false;
            f();
        }
    }
}
