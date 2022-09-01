package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.inputmethod.accesspoint.widget.AccessPointBackgroundView;

/* compiled from: PG */
/* renamed from: gsq  reason: default package */
/* loaded from: classes.dex */
public final class gsq extends AnimatorListenerAdapter {
    final /* synthetic */ AccessPointBackgroundView a;

    public gsq(AccessPointBackgroundView accessPointBackgroundView) {
        this.a = accessPointBackgroundView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AccessPointBackgroundView accessPointBackgroundView = this.a;
        if (accessPointBackgroundView.a) {
            accessPointBackgroundView.a();
        }
    }
}
