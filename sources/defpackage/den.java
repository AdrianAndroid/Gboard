package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PG */
/* renamed from: den  reason: default package */
/* loaded from: classes.dex */
public final class den extends LayerDrawable {
    private final ColorDrawable a;

    private den(ColorDrawable colorDrawable) {
        super(new Drawable[]{colorDrawable, colorDrawable});
        setId(1, 1);
        this.a = colorDrawable;
    }

    public static den a() {
        return new den(new ColorDrawable(0));
    }

    public final void b(int i) {
        this.a.setColor(i);
        invalidateSelf();
    }
}
