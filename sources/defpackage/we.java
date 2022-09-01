package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: we  reason: default package */
/* loaded from: classes2.dex */
public final class we {
    public static int a(Drawable drawable) {
        return drawable.getAlpha();
    }

    static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    static Drawable c(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static void d(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static boolean e(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Interpolator f(Context context, int i) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, i);
        nd.c(loadInterpolator, "Failed to parse interpolator, no start tag found");
        return loadInterpolator;
    }
}
