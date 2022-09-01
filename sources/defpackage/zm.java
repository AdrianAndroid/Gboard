package defpackage;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* compiled from: PG */
/* renamed from: zm  reason: default package */
/* loaded from: classes2.dex */
final class zm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        return View.generateViewId();
    }

    static int b(View view) {
        return view.getLabelFor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Display f(View view) {
        return view.getDisplay();
    }

    static void g(View view, int i) {
        view.setLabelFor(i);
    }

    static void h(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    static void i(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(View view) {
        return view.isPaddingRelative();
    }
}
