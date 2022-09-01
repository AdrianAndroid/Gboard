package defpackage;

import com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler;

/* compiled from: PG */
/* renamed from: dfm  reason: default package */
/* loaded from: classes.dex */
public final class dfm extends hzr {
    final /* synthetic */ AbstractGestureMotionEventHandler a;

    public dfm(AbstractGestureMotionEventHandler abstractGestureMotionEventHandler) {
        this.a = abstractGestureMotionEventHandler;
    }

    @Override // defpackage.hzr
    public final void a(int i) {
        AbstractGestureMotionEventHandler abstractGestureMotionEventHandler = this.a;
        if (abstractGestureMotionEventHandler.i || abstractGestureMotionEventHandler.h == null) {
            return;
        }
        abstractGestureMotionEventHandler.i();
        this.a.h = null;
        e();
    }
}
