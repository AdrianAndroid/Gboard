package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChordTrackOverlayView extends View implements jcz {
    public int e;
    public int f;
    private int g;
    private int i;
    private final Paint h = new Paint();
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    private final Rect j = new Rect();

    public ChordTrackOverlayView(Context context) {
        super(context);
        d(context, null);
    }

    private final void d(Context context, AttributeSet attributeSet) {
        this.g = (int) (jgd.d(context, attributeSet, null, "track_width_dp", 10) * context.getResources().getDisplayMetrics().density);
        int d = jgd.d(context, attributeSet, null, "track_alpha", 250);
        int v = jgd.v(context, attributeSet, "track_color", -1118482);
        setWillNotDraw(false);
        this.h.setAntiAlias(true);
        this.h.setAlpha(d);
        this.h.setStyle(Paint.Style.STROKE);
        this.h.setStrokeCap(Paint.Cap.ROUND);
        this.h.setStrokeJoin(Paint.Join.ROUND);
        this.h.setColor(v);
        this.h.setStrokeWidth(this.g);
        this.h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
    }

    @Override // defpackage.jcz
    public final void a(int i) {
        this.h.setColor(i);
    }

    public final void b(MotionEvent motionEvent, int i) {
        this.i = i;
        int findPointerIndex = motionEvent.findPointerIndex(i);
        this.a = (int) motionEvent.getX(findPointerIndex);
        this.b = (int) motionEvent.getY(findPointerIndex);
    }

    public final void c(MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.a < 0 || this.b < 0 || (findPointerIndex = motionEvent.findPointerIndex(this.i)) < 0) {
            return;
        }
        this.e = Math.max(0, (int) motionEvent.getX(findPointerIndex));
        int max = Math.max(0, (int) motionEvent.getY(findPointerIndex));
        this.f = max;
        if (this.e == this.c && max == this.d) {
            return;
        }
        if (this.j.isEmpty()) {
            Rect rect = this.j;
            int i = this.a;
            int i2 = this.b;
            rect.set(i, i2, i, i2);
        } else {
            this.j.union(this.a, this.b);
        }
        this.j.union(this.e, this.f);
        int i3 = -((this.g / 2) + 1);
        this.j.inset(i3, i3);
        invalidate(this.j.left, this.j.top, this.j.right, this.j.bottom);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int i4 = this.a;
        if (i4 < 0 || (i = this.b) < 0 || (i2 = this.e) < 0 || (i3 = this.f) < 0) {
            return;
        }
        canvas.drawLine(i4, i, i2, i3, this.h);
        this.c = this.e;
        this.d = this.f;
        Rect rect = this.j;
        int i5 = this.a;
        int i6 = this.b;
        rect.set(i5, i6, i5, i6);
        this.j.union(this.c, this.d);
    }

    public ChordTrackOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public ChordTrackOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet);
    }
}
