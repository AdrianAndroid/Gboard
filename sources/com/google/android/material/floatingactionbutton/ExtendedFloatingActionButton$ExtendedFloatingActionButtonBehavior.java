package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends tp {
    private Rect a;
    private boolean b;
    private boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kut.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    private static boolean v(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof tr) {
            return ((tr) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean w(View view, kue kueVar) {
        return (this.b || this.c) && ((tr) kueVar.getLayoutParams()).f == view.getId();
    }

    private final boolean x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, kue kueVar) {
        if (!w(appBarLayout, kueVar)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        kuy.a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.d()) {
            u(kueVar);
            return true;
        }
        t(kueVar);
        return true;
    }

    private final boolean y(View view, kue kueVar) {
        if (!w(view, kueVar)) {
            return false;
        }
        if (view.getTop() < (kueVar.getHeight() / 2) + ((tr) kueVar.getLayoutParams()).topMargin) {
            u(kueVar);
            return true;
        }
        t(kueVar);
        return true;
    }

    @Override // defpackage.tp
    public final void a(tr trVar) {
        if (trVar.h == 0) {
            trVar.h = 80;
        }
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        kue kueVar = (kue) view;
        if (view2 instanceof AppBarLayout) {
            x(coordinatorLayout, (AppBarLayout) view2, kueVar);
            return false;
        } else if (!v(view2)) {
            return false;
        } else {
            y(view2, kueVar);
            return false;
        }
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        kue kueVar = (kue) view;
        List b = coordinatorLayout.b(kueVar);
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) b.get(i2);
            if (view2 instanceof AppBarLayout) {
                if (x(coordinatorLayout, (AppBarLayout) view2, kueVar)) {
                    break;
                }
            } else {
                if (v(view2) && y(view2, kueVar)) {
                    break;
                }
            }
        }
        coordinatorLayout.l(kueVar, i);
        return true;
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean r(View view, Rect rect) {
        kue kueVar = (kue) view;
        return false;
    }

    protected final void t(kue kueVar) {
        if (this.c) {
            int i = kue.i;
            kus kusVar = kueVar.f;
        } else {
            int i2 = kue.i;
            kus kusVar2 = kueVar.g;
        }
        throw null;
    }

    protected final void u(kue kueVar) {
        if (this.c) {
            int i = kue.i;
            kus kusVar = kueVar.e;
        } else {
            int i2 = kue.i;
            kus kusVar2 = kueVar.h;
        }
        throw null;
    }
}
