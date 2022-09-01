package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: aka  reason: default package */
/* loaded from: classes.dex */
final class aka implements Drawable.Callback {
    final /* synthetic */ akf a;

    public aka(akf akfVar) {
        this.a = akfVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
