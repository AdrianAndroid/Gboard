package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: kvh  reason: default package */
/* loaded from: classes.dex */
public final class kvh implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        aad.K(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
