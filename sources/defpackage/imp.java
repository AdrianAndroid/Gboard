package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: imp  reason: default package */
/* loaded from: classes.dex */
public final class imp extends iml {
    private final FrameLayout g;
    public final Set f = new HashSet();
    private final int[] h = new int[2];
    private final int[] i = new int[2];
    private final xx j = new xy(8);

    public imp(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        frameLayout.setLayoutDirection(0);
    }

    @Override // defpackage.iml
    protected final List h() {
        return llp.o(this.f);
    }

    @Override // defpackage.iml
    public final void j() {
        this.g.removeAllViews();
        this.f.clear();
        m(this.g);
        super.j();
    }

    @Override // defpackage.iml
    protected final void k(View view) {
        if (this.f.remove(view)) {
            FrameLayout frameLayout = (FrameLayout) view.getParent();
            this.g.removeView(frameLayout);
            frameLayout.removeAllViews();
            this.j.b(frameLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iml
    public final void l(Context context, Rect rect) {
        ViewParent parent = this.g.getParent();
        if (parent instanceof View) {
            jdy.j((View) parent, rect);
        } else {
            super.l(context, rect);
        }
    }

    @Override // defpackage.iml, android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationCancel(Animator animator) {
    }

    @Override // defpackage.iml, android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationRepeat(Animator animator) {
    }

    @Override // defpackage.iml, android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationStart(Animator animator) {
    }

    @Override // defpackage.iml
    protected final void p(View view, int[] iArr, boolean z) {
        FrameLayout frameLayout;
        if (this.f.add(view)) {
            frameLayout = (FrameLayout) this.j.a();
            if (frameLayout == null) {
                frameLayout = new FrameLayout(this.b);
            }
            m(view);
            frameLayout.addView(view);
            frameLayout.setEnabled(view.isEnabled());
            if (z) {
                this.g.addView(frameLayout, 0);
            } else {
                this.g.addView(frameLayout);
            }
        } else {
            frameLayout = (FrameLayout) view.getParent();
        }
        this.g.getLocationOnScreen(this.h);
        frameLayout.setX(iArr[0] - this.h[0]);
        frameLayout.setY(iArr[1] - this.h[1]);
    }

    @Override // defpackage.iml
    public final boolean q() {
        this.g.getLocationOnScreen(this.i);
        int[] iArr = this.h;
        int i = iArr[0];
        int[] iArr2 = this.i;
        return (i == iArr2[0] && iArr[1] == iArr2[1]) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iml
    public final boolean r(View view, View view2) {
        View view3;
        if (!super.r(view, view2) || (view3 = this.d) == null || view3.getWindowToken() == null) {
            return false;
        }
        if (this.g.getWindowToken() != view3.getWindowToken()) {
            View findViewById = view3.getRootView().findViewById(16908290);
            if (!(findViewById instanceof FrameLayout)) {
                return false;
            }
            m(this.g);
            ((FrameLayout) findViewById).addView(this.g, -1, -1);
        }
        return view2.getWindowToken() == this.g.getWindowToken();
    }
}
