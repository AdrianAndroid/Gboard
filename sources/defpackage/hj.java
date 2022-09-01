package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* compiled from: PG */
/* renamed from: hj  reason: default package */
/* loaded from: classes.dex */
public final class hj extends Drawable {
    final ActionBarContainer a;

    public hj(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.d) {
            Drawable drawable = actionBarContainer.c;
            if (drawable == null) {
                return;
            }
            drawable.draw(canvas);
            return;
        }
        Drawable drawable2 = actionBarContainer.a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.a;
        if (actionBarContainer2.b == null) {
            return;
        }
        boolean z = actionBarContainer2.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.d) {
            if (actionBarContainer.c == null) {
                return;
            }
            actionBarContainer.a.getOutline(outline);
            return;
        }
        Drawable drawable = actionBarContainer.a;
        if (drawable == null) {
            return;
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
