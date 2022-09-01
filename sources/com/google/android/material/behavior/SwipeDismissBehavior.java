package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeDismissBehavior extends tp {
    public ada a;
    public opu f;
    private boolean g;
    public int b = 2;
    public float c = 0.5f;
    public float d = 0.0f;
    public float e = 0.5f;
    private final acz h = new kso(this);

    public static float u(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.tp
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = ada.b(coordinatorLayout, this.h);
            }
            return this.a.j(motionEvent);
        }
        return false;
    }

    @Override // defpackage.tp
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (aad.d(view) == 0) {
            aad.U(view, 1);
            aad.J(view, 1048576);
            if (!t(view)) {
                return false;
            }
            aad.am(view, abi.f, new amb(this, 2));
            return false;
        }
        return false;
    }

    @Override // defpackage.tp
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ada adaVar = this.a;
        if (adaVar != null) {
            adaVar.e(motionEvent);
            return true;
        }
        return false;
    }

    public boolean t(View view) {
        return true;
    }
}
