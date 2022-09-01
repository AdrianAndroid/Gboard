package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: zb  reason: default package */
/* loaded from: classes2.dex */
public final class zb implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private zb(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static void b(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        zb zbVar = new zb(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(zbVar);
        view.addOnAttachStateChangeListener(zbVar);
    }

    public final void a() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
