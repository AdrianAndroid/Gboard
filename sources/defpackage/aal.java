package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: aal  reason: default package */
/* loaded from: classes.dex */
public final class aal {
    public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }
}
