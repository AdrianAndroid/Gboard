package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* renamed from: ksi  reason: default package */
/* loaded from: classes.dex */
public abstract class ksi extends ksk {
    public final Rect a = new Rect();
    final Rect b = new Rect();
    public int c = 0;
    public int d;

    public ksi() {
    }

    @Override // defpackage.ksk
    protected final void S(CoordinatorLayout coordinatorLayout, View view, int i) {
        View v = v(coordinatorLayout.b(view));
        if (v == null) {
            coordinatorLayout.l(view, i);
            this.c = 0;
            return;
        }
        tr trVar = (tr) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + trVar.leftMargin, v.getBottom() + trVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - trVar.rightMargin, ((coordinatorLayout.getHeight() + v.getBottom()) - coordinatorLayout.getPaddingBottom()) - trVar.bottomMargin);
        abc abcVar = coordinatorLayout.e;
        if (abcVar != null && aad.ad(coordinatorLayout) && !aad.ad(view)) {
            rect.left += abcVar.b();
            rect.right -= abcVar.c();
        }
        Rect rect2 = this.b;
        int i2 = trVar.c;
        yo.a(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int x = x(v);
        view.layout(rect2.left, rect2.top - x, rect2.right, rect2.bottom - x);
        this.c = rect2.top - v.getBottom();
    }

    public float t(View view) {
        throw null;
    }

    public int u(View view) {
        throw null;
    }

    public abstract View v(List list);

    public final int x(View view) {
        if (this.d == 0) {
            return 0;
        }
        float t = t(view);
        int i = this.d;
        return ld.c((int) (t * i), 0, i);
    }

    public ksi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
