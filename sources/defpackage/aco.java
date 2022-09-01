package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: aco  reason: default package */
/* loaded from: classes.dex */
public final class aco {
    static int a(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void b(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void c(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    static boolean d(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }
}
