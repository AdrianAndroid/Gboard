package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.inputmethod.libs.voiceime.VoiceCircleView;

/* compiled from: PG */
/* renamed from: fap  reason: default package */
/* loaded from: classes.dex */
final class fap extends AnimatorListenerAdapter {
    final /* synthetic */ VoiceCircleView a;

    public fap(VoiceCircleView voiceCircleView) {
        this.a = voiceCircleView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b();
    }
}
