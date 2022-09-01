package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: eso  reason: default package */
/* loaded from: classes.dex */
public final class eso implements eqr {
    private final Typeface a;
    private final int b;

    public eso(Typeface typeface, int i) {
        this.a = typeface;
        this.b = i;
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
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(this.a, this.b);
        }
    }
}
