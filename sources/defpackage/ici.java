package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: ici  reason: default package */
/* loaded from: classes.dex */
public final class ici {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public ici(MotionEvent motionEvent, int i, long j) {
        this.a = motionEvent.getX(i);
        this.b = motionEvent.getY(i);
        this.c = motionEvent.getSize(i);
        this.d = motionEvent.getPressure(i);
        this.e = (int) (motionEvent.getEventTime() - j);
    }
}
