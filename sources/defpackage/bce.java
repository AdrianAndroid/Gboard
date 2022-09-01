package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: bce  reason: default package */
/* loaded from: classes.dex */
public abstract class bce implements axh, axe {
    protected final Drawable a;

    public bce(Drawable drawable) {
        ce.m(drawable);
        this.a = drawable;
    }

    @Override // defpackage.axe
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (!(drawable instanceof bck)) {
        } else {
            ((bck) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.axh
    /* renamed from: f */
    public final Drawable c() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }
}
