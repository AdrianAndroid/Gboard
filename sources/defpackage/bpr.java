package defpackage;

import android.animation.Animator;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

/* compiled from: PG */
/* renamed from: bpr  reason: default package */
/* loaded from: classes.dex */
public final class bpr {
    static final hhl a = hhq.a("show_branding_on_space", false);
    public static final hhl b = hhq.f("show_branding_interval_seconds", 86400);
    public static final hhl c = hhq.f("branding_fadeout_delay_ms", 900);
    public final Runnable d = new att(this, 20);
    public final AppCompatTextView e;
    public final View f;
    public Animator g;

    public bpr(AppCompatTextView appCompatTextView, View view) {
        this.e = appCompatTextView;
        this.f = view;
    }

    public final void a() {
        this.f.removeCallbacks(this.d);
        Animator animator = this.g;
        if (animator != null) {
            animator.removeAllListeners();
            this.g.cancel();
            this.g = null;
        }
        this.e.setVisibility(0);
        this.f.setVisibility(4);
        this.e.setAlpha(1.0f);
        this.f.setAlpha(1.0f);
    }
}
