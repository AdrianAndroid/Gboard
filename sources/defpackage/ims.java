package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ims  reason: default package */
/* loaded from: classes.dex */
public final class ims extends iml {
    private final Map f = new qo();
    private final int[] g = new int[2];

    public ims(Context context) {
        super(context);
    }

    @Override // defpackage.iml, defpackage.imn
    public final boolean f(View view) {
        PopupWindow popupWindow = (PopupWindow) this.f.get(view);
        return popupWindow != null && popupWindow.isShowing() && super.f(view);
    }

    @Override // defpackage.iml
    protected final List h() {
        return llp.o(this.f.keySet());
    }

    @Override // defpackage.iml
    public final void j() {
        for (Map.Entry entry : this.f.entrySet()) {
            ((PopupWindow) entry.getValue()).dismiss();
            m((View) entry.getKey());
        }
        this.f.clear();
        super.j();
    }

    @Override // defpackage.iml
    protected final void k(View view) {
        PopupWindow popupWindow = (PopupWindow) this.f.get(view);
        if (popupWindow != null) {
            popupWindow.dismiss();
            m(view);
            this.f.remove(view);
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
        View view2 = this.d;
        if (view2 == null) {
            return;
        }
        PopupWindow popupWindow = (PopupWindow) this.f.get(view);
        if (popupWindow == null) {
            FrameLayout frameLayout = new FrameLayout(this.b);
            frameLayout.addView(view);
            frameLayout.setLayoutDirection(0);
            PopupWindow popupWindow2 = new PopupWindow((View) frameLayout, -2, -2, false);
            popupWindow2.setTouchable(view.isEnabled());
            this.f.put(view, popupWindow2);
            popupWindow = popupWindow2;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = 8388659;
        if (layoutParams.width == -1) {
            popupWindow.setWidth(-1);
        }
        if (layoutParams.height == -1) {
            popupWindow.setHeight(-1);
        }
        jdy.g(view2, this.g);
        int i = iArr[0];
        int[] iArr2 = this.g;
        iArr[0] = i - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        if (!popupWindow.isShowing()) {
            popupWindow.showAtLocation(view2, 0, iArr[0], iArr[1]);
        } else {
            popupWindow.update(iArr[0], iArr[1], popupWindow.getWidth(), popupWindow.getHeight());
        }
    }

    @Override // defpackage.iml
    public final boolean q() {
        return false;
    }
}
