package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* renamed from: imr  reason: default package */
/* loaded from: classes.dex */
public final class imr implements imn {
    public final imp a;
    public final ims b;
    public final qv c = new qv();
    private View d;

    public imr(Context context) {
        ims imsVar = new ims(context);
        imp impVar = new imp(context);
        this.b = imsVar;
        this.a = impVar;
    }

    private final void i(View view) {
        imq imqVar = (imq) this.c.get(view);
        if (imqVar != null) {
            this.c.remove(view);
            imqVar.b.removeOnAttachStateChangeListener(imqVar);
        }
    }

    @Override // defpackage.imn
    public final View a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.imn
    public final View b(Context context, int i) {
        return this.a.b(context, i);
    }

    @Override // defpackage.imn
    public final void c(View view, Animator animator, boolean z) {
        if (view == null) {
            return;
        }
        i(view);
        if (this.d == null) {
            return;
        }
        if (view.getWindowToken() == this.d.getWindowToken()) {
            this.a.c(view, animator, z);
        } else {
            this.b.c(view, animator, z);
        }
    }

    @Override // defpackage.imn
    public final void d(View view, Animator animator, boolean z) {
        i(view);
        View view2 = this.d;
        if (view2 == null) {
            return;
        }
        if (view2.getWindowToken() == view.getWindowToken()) {
            this.a.d(view, animator, z);
        } else {
            this.b.d(view, animator, z);
        }
    }

    @Override // defpackage.imn
    public final void e(View view, View view2, int i, int i2, int i3, Animator animator) {
        imq imqVar;
        imq imqVar2 = (imq) this.c.get(view);
        if (view2.getWindowToken() == null) {
            imqVar = new imq(this, view, view2, i, i2, i3, animator);
        } else {
            View view3 = this.d;
            if (view3 == null || view3.getWindowToken() == null) {
                return;
            }
            imqVar = null;
        }
        if (imqVar2 != null) {
            imqVar2.b.removeOnAttachStateChangeListener(imqVar2);
            this.c.remove(view);
        }
        if (imqVar != null) {
            view2.addOnAttachStateChangeListener(imqVar);
            this.c.put(view, imqVar);
            return;
        }
        g(view, view2, i, i2, i3, animator);
    }

    @Override // defpackage.imn
    public final boolean f(View view) {
        return this.b.f(view) || this.a.f(view);
    }

    public final void g(View view, View view2, int i, int i2, int i3, Animator animator) {
        if (this.d == null) {
            return;
        }
        if (view2.getWindowToken() == this.d.getWindowToken()) {
            this.a.e(view, view2, i, i2, i3, animator);
        } else {
            this.b.e(view, view2, i, i2, i3, animator);
        }
    }

    public final void h(View view) {
        this.d = view;
        this.b.o(view);
        this.a.o(view);
    }
}
