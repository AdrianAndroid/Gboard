package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: gr  reason: default package */
/* loaded from: classes.dex */
final class gr extends FrameLayout implements fn {
    final CollapsibleActionView a;

    public gr(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.fn
    public final void a() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.fn
    public final void b() {
        this.a.onActionViewExpanded();
    }
}
