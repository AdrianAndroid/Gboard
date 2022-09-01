package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: grk  reason: default package */
/* loaded from: classes.dex */
final class grk extends AnimatorListenerAdapter {
    final /* synthetic */ grn a;

    public grk(grn grnVar) {
        this.a = grnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a.b;
        View findViewById = viewGroup != null ? viewGroup.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265) : null;
        if (findViewById != null) {
            findViewById.setRotation(0.0f);
        }
    }
}
