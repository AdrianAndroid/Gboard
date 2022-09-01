package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: cjs  reason: default package */
/* loaded from: classes.dex */
final class cjs implements ViewTreeObserver.OnGlobalLayoutListener, AutoCloseable {
    private final cjt a;
    private final SoftKeyView b;
    private final ict c;

    public cjs(cjt cjtVar, SoftKeyView softKeyView) {
        this.a = cjtVar;
        this.b = softKeyView;
        this.c = softKeyView.b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.b.getVisibility() != 0 || !this.b.isAttachedToWindow() || !Objects.equals(this.c, this.b.b)) {
            this.a.d();
            this.a.f();
        }
    }
}
