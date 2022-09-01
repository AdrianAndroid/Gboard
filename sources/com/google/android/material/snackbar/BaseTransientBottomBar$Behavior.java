package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final oir g = new oir((SwipeDismissBehavior) this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.tp
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        oir oirVar = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                kyj.a().f((opu) oirVar.a);
            }
        } else if (coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            kyj.a().e((opu) oirVar.a);
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean t(View view) {
        return view instanceof kyd;
    }
}
