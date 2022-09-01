package defpackage;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* compiled from: PG */
/* renamed from: ym  reason: default package */
/* loaded from: classes2.dex */
public final class ym {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    static DisplayCutout e(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    static List f(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }
}
