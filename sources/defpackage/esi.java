package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: esi  reason: default package */
/* loaded from: classes.dex */
public final class esi implements eqr {
    private final ColorStateList a;
    private final /* synthetic */ int b;

    public esi(ColorStateList colorStateList, int i) {
        this.b = i;
        this.a = colorStateList;
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
        int i = this.b;
        if (i == 0) {
            if (!(view instanceof TextView)) {
                return;
            }
            ((TextView) view).setHintTextColor(this.a);
        } else if (i == 1) {
            view.setBackgroundTintList(this.a);
        } else if (!(view instanceof TextView)) {
        } else {
            ((TextView) view).setLinkTextColor(this.a);
        }
    }
}
