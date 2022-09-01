package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: akd  reason: default package */
/* loaded from: classes.dex */
final class akd extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public akd(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        akf akfVar = new akf();
        akfVar.e = this.a.newDrawable();
        akfVar.e.setCallback(akfVar.d);
        return akfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        akf akfVar = new akf();
        akfVar.e = this.a.newDrawable(resources);
        akfVar.e.setCallback(akfVar.d);
        return akfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        akf akfVar = new akf();
        akfVar.e = this.a.newDrawable(resources, theme);
        akfVar.e.setCallback(akfVar.d);
        return akfVar;
    }
}
