package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: esk  reason: default package */
/* loaded from: classes.dex */
public final class esk implements eqr {
    private final esq a;

    public esk(esq esqVar) {
        this.a = esqVar;
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
    public final Drawable c(Context context) {
        return this.a.a(context, false);
    }

    @Override // defpackage.eqr
    public final void d(View view) {
        if (!(view instanceof ImageView)) {
            return;
        }
        ImageView imageView = (ImageView) view;
        Drawable a = this.a.a(view.getContext(), false);
        if (a == null) {
            return;
        }
        imageView.setImageDrawable(a);
    }
}
