package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

/* compiled from: PG */
/* renamed from: kfd  reason: default package */
/* loaded from: classes.dex */
final class kfd implements kfa, kca, kcb {
    private final Window.OnFrameMetricsAvailableListener a;
    private final nox b;

    public kfd(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, nox noxVar) {
        this.a = onFrameMetricsAvailableListener;
        this.b = noxVar;
    }

    @Override // defpackage.kca
    public void a(Activity activity, Bundle bundle) {
        activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.a());
    }

    @Override // defpackage.kcb
    public void b(Activity activity) {
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
    }

    @Override // defpackage.kfa
    public void c() {
    }

    @Override // defpackage.kfa
    public void d() {
    }
}
