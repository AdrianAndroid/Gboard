package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* renamed from: hut  reason: default package */
/* loaded from: classes.dex */
final class hut extends ViewOutlineProvider {
    final /* synthetic */ int a;

    public hut(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
