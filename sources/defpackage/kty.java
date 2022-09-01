package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: kty  reason: default package */
/* loaded from: classes.dex */
final class kty extends Drawable.ConstantState {
    final /* synthetic */ ktz a;

    public kty(ktz ktzVar) {
        this.a = ktzVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.a;
    }
}
