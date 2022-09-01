package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gtc  reason: default package */
/* loaded from: classes.dex */
final class gtc {
    public final gqy a;
    public final gte b;
    public boolean c = true;
    private Animator d;

    public gtc(Context context, gqy gqyVar) {
        gte gteVar = new gte(gqyVar, context.getResources().getInteger(R.integer.f131030_resource_name_obfuscated_res_0x7f0c0006));
        this.a = gqyVar;
        this.b = gteVar;
    }

    public final void a(int i) {
        this.a.u(-1);
        if (this.c) {
            View m = this.a.m(i);
            if (m != null) {
                if (this.d == null) {
                    ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(m.getContext(), R.animator.f380_resource_name_obfuscated_res_0x7f020004);
                    objectAnimator.setProperty(new gta(Float.class));
                    objectAnimator.addListener(new gtb());
                    this.d = objectAnimator;
                }
                if (this.d.isStarted()) {
                    this.d.cancel();
                }
                this.d.setTarget(m);
                this.d.start();
            }
            this.b.b(new ein(m, 7));
        }
    }

    public final void b() {
        this.a.u(-1);
        if (this.c) {
            this.b.b(lfl.ALWAYS_TRUE);
        }
    }
}
