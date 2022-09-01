package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: bpy  reason: default package */
/* loaded from: classes.dex */
final class bpy extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ bqa a;
    private float b;
    private float c;
    private float d = -1.0f;
    private float e;

    public bpy(bqa bqaVar) {
        this.a = bqaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.b = this.a.e.getY() - motionEvent.getRawY();
        this.c = motionEvent.getRawY();
        this.d = -1.0f;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float rawY = motionEvent2.getRawY();
        this.e = rawY;
        bqa bqaVar = this.a;
        if (bqaVar.i) {
            if (rawY > this.d) {
                bqaVar.e.animate().y(this.a.l).setDuration(200L).start();
            } else {
                bqaVar.e.animate().y(this.a.m).setDuration(200L).start();
            }
            this.d = -1.0f;
            return true;
        }
        if (rawY <= this.d || rawY - this.c < 100.0f) {
            bqaVar.e.animate().y(0.0f).setDuration(bqa.a(this.a.e.getY(), Math.abs(f2))).start();
        } else {
            bqaVar.c(bqa.a(bqaVar.g - bqaVar.e.getY(), Math.abs(f2)));
        }
        this.d = -1.0f;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.d = this.e;
        float rawY = motionEvent2.getRawY();
        this.e = rawY;
        float f3 = rawY + this.b;
        bqa bqaVar = this.a;
        float f4 = bqaVar.m;
        if (f3 < f4) {
            bqaVar.e.setY(f4);
            return true;
        }
        bqaVar.e.setY(f3);
        float y = this.a.e.getY();
        bqa bqaVar2 = this.a;
        int i = bqaVar2.j;
        View view = bqaVar2.f;
        view.setVisibility(y - ((float) i) >= ((float) view.getTop()) ? 4 : 0);
        return true;
    }
}
