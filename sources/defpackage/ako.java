package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* renamed from: ako  reason: default package */
/* loaded from: classes.dex */
final class ako extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public ako(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        akp akpVar = new akp();
        akpVar.e = (VectorDrawable) this.a.newDrawable();
        return akpVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        akp akpVar = new akp();
        akpVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return akpVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        akp akpVar = new akp();
        akpVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return akpVar;
    }
}
