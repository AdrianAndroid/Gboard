package defpackage;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: ld  reason: default package */
/* loaded from: classes.dex */
public final class ld {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }

    public static int c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static float d(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f <= 1.0f) {
            return f;
        }
        return 1.0f;
    }
}
