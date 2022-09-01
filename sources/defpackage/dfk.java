package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* renamed from: dfk  reason: default package */
/* loaded from: classes.dex */
public final class dfk {
    public int a = 1;
    private float b;
    private float c;
    private boolean d;
    private final int e;

    public dfk(Context context) {
        this.e = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    private final boolean b(MotionEvent motionEvent) {
        return this.a == 1 ? Math.abs(this.b - motionEvent.getX()) > ((float) this.e) : Math.abs(this.c - motionEvent.getY()) > ((float) this.e);
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b = motionEvent.getX();
            this.c = motionEvent.getY();
            this.d = false;
        } else if (actionMasked == 1) {
            if (b(motionEvent)) {
                this.d = true;
            }
            if (!this.d) {
                return;
            }
            motionEvent.setAction(3);
        } else if (actionMasked != 2) {
        } else {
            if (b(motionEvent)) {
                this.d = true;
            }
            if (!this.d) {
                return;
            }
            motionEvent.setAction(3);
        }
    }
}
