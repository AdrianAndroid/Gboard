package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kyl  reason: default package */
/* loaded from: classes.dex */
public final class kyl extends laq {
    private static float n(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    private static float o(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.laq
    public final void a(kyv kyvVar, View view, View view2, float f, Drawable drawable) {
        float o;
        float n;
        RectF f2 = f(kyvVar, view);
        RectF f3 = f(kyvVar, view2);
        if (f2.left < f3.left) {
            o = n(f);
            n = o(f);
        } else {
            o = o(f);
            n = n(f);
        }
        drawable.setBounds(krt.c((int) f2.left, (int) f3.left, o), drawable.getBounds().top, krt.c((int) f2.right, (int) f3.right, n), drawable.getBounds().bottom);
    }
}
