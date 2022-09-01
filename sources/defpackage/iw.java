package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: iw */
/* loaded from: classes.dex */
public final class iw extends lg implements iy {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c = new Rect();
    public final /* synthetic */ iz d;
    private int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(iz izVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = izVar;
        this.l = izVar;
        y();
        this.m = new kna(this, 1);
    }

    @Override // defpackage.iy
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.lg, defpackage.iy
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.iy
    public final void h(int i) {
        this.s = i;
    }

    @Override // defpackage.iy
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.iy
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean u = u();
        n();
        x();
        super.s();
        kk kkVar = this.e;
        kkVar.setChoiceMode(1);
        ir.d(kkVar, i);
        ir.c(kkVar, i2);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        kk kkVar2 = this.e;
        if (u() && kkVar2 != null) {
            kkVar2.a = false;
            kkVar2.setSelection(selectedItemPosition);
            if (kkVar2.getChoiceMode() != 0) {
                kkVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!u && (viewTreeObserver = this.d.getViewTreeObserver()) != null) {
            he heVar = new he(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(heVar);
            v(new iv(this, heVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.SpinnerAdapter, android.widget.ListAdapter] */
    public final void n() {
        int i;
        Drawable c = c();
        if (c != null) {
            c.getPadding(this.d.d);
            i = oi.b(this.d) ? this.d.d.right : -this.d.d.left;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        iz izVar = this.d;
        int i2 = izVar.c;
        if (i2 == -2) {
            int a = izVar.a(this.b, c());
            int i3 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = oi.b(this.d) ? i + (((width - paddingRight) - this.f) - this.s) : i + paddingLeft + this.s;
    }
}
