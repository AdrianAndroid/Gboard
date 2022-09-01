package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bpq  reason: default package */
/* loaded from: classes.dex */
public final class bpq extends AnimatorListenerAdapter {
    final /* synthetic */ bpr a;

    public bpq(bpr bprVar) {
        this.a = bprVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g = null;
        bpr bprVar = this.a;
        bprVar.f.setVisibility(4);
        bprVar.e.setVisibility(0);
        bprVar.e.setAlpha(0.0f);
        bpr bprVar2 = this.a;
        if (TextUtils.isEmpty(bprVar2.e.getText())) {
            return;
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(bprVar2.e.getContext(), R.animator.f940_resource_name_obfuscated_res_0x7f020048);
        loadAnimator.setTarget(bprVar2.e);
        loadAnimator.start();
        bprVar2.g = loadAnimator;
    }
}
