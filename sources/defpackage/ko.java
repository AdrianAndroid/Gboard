package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* renamed from: ko  reason: default package */
/* loaded from: classes.dex */
public abstract class ko implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private final float a;
    private final int b;
    public final View c;
    public boolean d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i = new int[2];

    public ko(View view) {
        this.c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract hd a();

    public boolean b() {
        throw null;
    }

    protected boolean c() {
        hd a = a();
        if (a == null || !a.u()) {
            return true;
        }
        a.k();
        return true;
    }

    public final void d() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.c.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r13 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
        if (r4 != 3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d = false;
        this.h = -1;
        Runnable runnable = this.f;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }
}
