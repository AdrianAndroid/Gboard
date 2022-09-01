package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: PG */
/* renamed from: kww  reason: default package */
/* loaded from: classes.dex */
public final class kww {
    public static final /* synthetic */ int b = 0;
    private static final int[] c = {16842919};
    private static final int[] d = {16842908};
    private static final int[] e = {16842913, 16842919};
    private static final int[] f = {16842913};
    private static final int[] g = {16842910, 16842919};
    static final String a = "kww";

    private kww() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = d;
        return new ColorStateList(new int[][]{f, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, e), c(colorStateList, iArr), c(colorStateList, c)});
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(g, 0)) != 0) {
                Log.w(a, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int alpha = Color.alpha(colorForState);
        return vo.d(colorForState, Math.min(alpha + alpha, 255));
    }
}
