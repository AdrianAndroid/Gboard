package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kym  reason: default package */
/* loaded from: classes.dex */
public final class kym extends laq {
    @Override // defpackage.laq
    public final void a(kyv kyvVar, View view, View view2, float f, Drawable drawable) {
        float b;
        if (f >= 0.5f) {
            view = view2;
        }
        RectF f2 = f(kyvVar, view);
        if (f < 0.5f) {
            b = krt.b(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            b = krt.b(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) f2.left, drawable.getBounds().top, (int) f2.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b * 255.0f));
    }
}
