package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ktm  reason: default package */
/* loaded from: classes.dex */
final class ktm extends ajz {
    final /* synthetic */ ktn b;

    public ktm(ktn ktnVar) {
        this.b = ktnVar;
    }

    @Override // defpackage.ajz
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            wf.g(drawable, colorStateList);
        }
    }

    @Override // defpackage.ajz
    public final void c(Drawable drawable) {
        ktn ktnVar = this.b;
        ColorStateList colorStateList = ktnVar.b;
        if (colorStateList != null) {
            wf.f(drawable, colorStateList.getColorForState(ktnVar.d, colorStateList.getDefaultColor()));
        }
    }
}
