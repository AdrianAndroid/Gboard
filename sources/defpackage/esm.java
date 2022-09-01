package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* renamed from: esm  reason: default package */
/* loaded from: classes.dex */
public final class esm implements eqr {
    private final int a;
    private final int b;

    public esm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ ColorStateList a() {
        return null;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ ColorStateList b() {
        return null;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ Drawable c(Context context) {
        return null;
    }

    @Override // defpackage.eqr
    public final void d(View view) {
        view.setPadding(this.a + view.getPaddingLeft(), view.getPaddingTop(), this.b + view.getPaddingRight(), view.getPaddingBottom());
    }
}
