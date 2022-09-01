package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: eqj  reason: default package */
/* loaded from: classes.dex */
final class eqj extends Drawable.ConstantState {
    final /* synthetic */ eqk a;

    public eqj(eqk eqkVar) {
        this.a = eqkVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        Drawable.ConstantState constantState = this.a.b.getConstantState();
        if (constantState == null) {
            throw new IllegalStateException("constant state is null");
        }
        Drawable newDrawable = constantState.newDrawable();
        eqk eqkVar = this.a;
        return new eqk(newDrawable, eqkVar.a, eqkVar.c);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        Drawable.ConstantState constantState = this.a.b.getConstantState();
        if (constantState == null) {
            throw new IllegalStateException("constant state is null");
        }
        Drawable newDrawable = constantState.newDrawable(resources);
        eqk eqkVar = this.a;
        return new eqk(newDrawable, eqkVar.a, eqkVar.c);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        Drawable.ConstantState constantState = this.a.b.getConstantState();
        if (constantState == null) {
            throw new IllegalStateException("constant state is null");
        }
        Drawable newDrawable = constantState.newDrawable(resources, theme);
        eqk eqkVar = this.a;
        return new eqk(newDrawable, eqkVar.a, eqkVar.c);
    }
}
