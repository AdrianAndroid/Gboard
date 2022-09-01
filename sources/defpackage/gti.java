package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gti  reason: default package */
/* loaded from: classes.dex */
public final class gti {
    public final View a;
    public final gte b;
    public final Animator c;
    public boolean d = true;

    public gti(gqy gqyVar, View view, Animator animator) {
        this.a = view;
        this.b = new gte(gqyVar, view.getContext().getResources().getInteger(R.integer.f131030_resource_name_obfuscated_res_0x7f0c0006));
        this.c = animator;
    }

    public final void a() {
        Animator animator = this.c;
        if (animator != null && animator.isRunning()) {
            this.c.cancel();
        }
        this.b.a();
    }
}
