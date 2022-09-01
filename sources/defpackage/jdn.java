package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: jdn  reason: default package */
/* loaded from: classes.dex */
final class jdn extends GestureDetector.SimpleOnGestureListener {
    public boolean a;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f2) > Math.abs(f)) {
            this.a = true;
            return true;
        }
        return false;
    }
}
