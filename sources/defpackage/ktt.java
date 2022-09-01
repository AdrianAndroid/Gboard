package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* renamed from: ktt  reason: default package */
/* loaded from: classes.dex */
public final class ktt implements View.OnTouchListener {
    private final Dialog a;
    private final int b;
    private final int c;
    private final int d;

    public ktt(Dialog dialog, Rect rect) {
        this.a = dialog;
        this.b = rect.left;
        this.c = rect.top;
        this.d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int top;
        View findViewById = view.findViewById(16908290);
        int left = this.b + findViewById.getLeft();
        int width = findViewById.getWidth();
        if (new RectF(left, this.c + findViewById.getTop(), left + width, top + findViewById.getHeight()).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (-this.d) - 1;
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.a.onTouchEvent(obtain);
    }
}
