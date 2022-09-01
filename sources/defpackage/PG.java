package defpackage;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: do  reason: invalid class name and default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class PG extends ContentFrameLayout {
    final /* synthetic */ dr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PG(dr drVar, Context context) {
        super(context);
        this.a = drVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.M(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                dr drVar = this.a;
                drVar.G(drVar.T(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(ej.a(getContext(), i));
    }
}
