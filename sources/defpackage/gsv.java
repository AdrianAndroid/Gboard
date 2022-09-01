package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: gsv  reason: default package */
/* loaded from: classes.dex */
public final class gsv {
    public final imn a;
    public View d;
    public SoftKeyView e;
    public AnimatorSet f;
    public ObjectAnimator g;
    public ObjectAnimator h;
    public View i;
    public final Point b = new Point();
    public final Rect c = new Rect();
    public boolean j = true;

    public gsv(imn imnVar) {
        this.a = imnVar;
    }

    public final void a() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet == null || !animatorSet.isStarted()) {
            return;
        }
        this.f.cancel();
    }

    public final void b(Point point, Point point2) {
        jdy.i(this.d, null, this.c);
        int i = this.c.left;
        int i2 = this.c.top;
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        this.e.measure(layoutParams.width > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824) : 0, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : 0);
        if (this.e.getWidth() == 0) {
            SoftKeyView softKeyView = this.e;
            softKeyView.layout(0, 0, softKeyView.getMeasuredWidth(), this.e.getMeasuredHeight());
        }
        View findViewById = this.e.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265);
        jdy.i(findViewById, this.e, this.c);
        Point point3 = new Point((point.x - (findViewById.getMeasuredWidth() / 2)) - this.c.left, (point.y - (findViewById.getMeasuredHeight() / 2)) - this.c.top);
        Point point4 = new Point((point2.x - i) - (this.e.getMeasuredWidth() / 2), (point2.y - i2) - (this.e.getMeasuredHeight() / 2));
        this.g.setFloatValues(point3.x, point4.x);
        this.h.setFloatValues(point3.y, point4.y);
        this.e.setTranslationX(point3.x);
        this.e.setTranslationY(point3.y);
        this.f.setTarget(this.e);
        this.f.start();
    }
}
