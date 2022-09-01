package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: epz  reason: default package */
/* loaded from: classes.dex */
final class epz extends Drawable.ConstantState {
    final /* synthetic */ eqa a;

    public epz(eqa eqaVar) {
        this.a = eqaVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        Drawable.ConstantState constantState = this.a.b.getConstantState();
        if (constantState != null) {
            return new eqa(constantState.newDrawable(), this.a.a);
        }
        throw new IllegalStateException("constant state is null");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        Drawable.ConstantState constantState = this.a.b.getConstantState();
        if (constantState != null) {
            return new eqa(constantState.newDrawable(resources), this.a.a);
        }
        throw new IllegalStateException("constant state is null");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        Drawable.ConstantState constantState = this.a.b.getConstantState();
        if (constantState != null) {
            return new eqa(constantState.newDrawable(resources, theme), this.a.a);
        }
        throw new IllegalStateException("constant state is null");
    }
}
