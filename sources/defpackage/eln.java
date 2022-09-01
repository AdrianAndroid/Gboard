package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.inputmethod.libs.search.widget.VariableHeightSoftKeyboardView;

/* compiled from: PG */
/* renamed from: eln  reason: default package */
/* loaded from: classes.dex */
public final class eln extends AnimatorListenerAdapter {
    final /* synthetic */ VariableHeightSoftKeyboardView a;

    public eln(VariableHeightSoftKeyboardView variableHeightSoftKeyboardView) {
        this.a = variableHeightSoftKeyboardView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c = null;
    }
}
