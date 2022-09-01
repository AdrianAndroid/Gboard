package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: iv  reason: default package */
/* loaded from: classes.dex */
final class iv implements PopupWindow.OnDismissListener {
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    final /* synthetic */ iw b;

    public iv(iw iwVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = iwVar;
        this.a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
