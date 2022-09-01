package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* renamed from: ksh  reason: default package */
/* loaded from: classes.dex */
public class ksh extends ksk {
    private Runnable a;
    private boolean b;
    private int d;
    OverScroller e;
    private VelocityTracker g;
    private int c = -1;
    private int f = -1;

    public ksh() {
    }

    public boolean B(View view) {
        throw null;
    }

    public final int D(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return x(coordinatorLayout, view, w() - i, i2, i3);
    }

    public final void E(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // defpackage.tp
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i = this.c;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.d) > this.f) {
                this.d = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.c = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = B(view) && coordinatorLayout.m(view, x, y2);
            this.b = z;
            if (z) {
                this.d = y2;
                this.c = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    @Override // defpackage.tp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksh.j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int u(View view) {
        throw null;
    }

    public int v(View view) {
        throw null;
    }

    public int w() {
        throw null;
    }

    public int x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void z(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public ksh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
