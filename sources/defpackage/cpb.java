package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* renamed from: cpb  reason: default package */
/* loaded from: classes.dex */
public final class cpb extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setAlpha(view.getAlpha());
        outline.setRect(-520, -520, view.getWidth() + 520, view.getHeight());
    }
}
