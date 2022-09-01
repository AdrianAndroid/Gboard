package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* renamed from: esd  reason: default package */
/* loaded from: classes.dex */
public final class esd implements eqr {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/property/PropertyBackgroundImage");
    private final esq b;

    public esd(esq esqVar) {
        this.b = esqVar;
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
        Drawable a2 = this.b.a(view.getContext(), true);
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/theme/core/property/PropertyBackgroundImage", "apply", 38, "PropertyBackgroundImage.java")).J("Setting a background drawable. drawable:%s, tag:%s, visibility:%d", a2, view.getTag(), Integer.valueOf(view.getVisibility()));
        if (a2 != null) {
            view.setBackground(a2);
        }
    }
}
