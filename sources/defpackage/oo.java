package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oo  reason: default package */
/* loaded from: classes2.dex */
public final class oo extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ ot b;

    public oo(ot otVar) {
        this.b = otVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View h;
        mo gB;
        if (!this.a || (h = this.b.h(motionEvent)) == null || (gB = this.b.m.gB(h)) == null) {
            return;
        }
        ot otVar = this.b;
        if (!otVar.j.j(otVar.m, gB)) {
            return;
        }
        int pointerId = motionEvent.getPointerId(0);
        int i = this.b.i;
        if (pointerId != i) {
            return;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        ot otVar2 = this.b;
        otVar2.c = x;
        otVar2.d = y;
        otVar2.f = 0.0f;
        otVar2.e = 0.0f;
        if (!otVar2.j.l()) {
            return;
        }
        this.b.o(gB, 2);
    }
}
