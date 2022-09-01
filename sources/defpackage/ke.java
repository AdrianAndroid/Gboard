package defpackage;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ke  reason: default package */
/* loaded from: classes.dex */
public final class ke {
    private static final int[] b = {16842912};
    private static final int[] c = new int[0];
    public static final Rect a = new Rect();

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static Rect b(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            if (drawable instanceof wl) {
                drawable = ((wl) drawable).a();
            }
            return kc.a(drawable);
        }
        Insets a2 = kd.a(drawable);
        return new Rect(a2.left, a2.top, a2.right, a2.bottom);
    }

    public static void c(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT < 29 || Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(b);
        } else {
            drawable.setState(c);
        }
        drawable.setState(state);
    }
}
