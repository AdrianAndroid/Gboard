package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: ii  reason: default package */
/* loaded from: classes.dex */
final class ii extends PopupWindow {
    public ii(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        gkn w = gkn.w(context, attributeSet, ei.s, i, 0);
        if (w.t(2)) {
            aco.b(this, w.s(2, false));
        }
        setBackgroundDrawable(w.n(0));
        w.r();
    }
}
