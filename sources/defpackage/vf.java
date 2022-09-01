package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: vf  reason: default package */
/* loaded from: classes2.dex */
public final class vf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }

    public static float c(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (200.0f * f), 199);
        float f2 = fArr[min];
        return f2 + (((f - (min * 0.005f)) / 0.005f) * (fArr[min + 1] - f2));
    }
}
