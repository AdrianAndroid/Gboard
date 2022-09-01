package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: jdy  reason: default package */
/* loaded from: classes.dex */
public final class jdy {
    private static final lug a = hin.a;
    private static final float[] b = new float[2];
    private static final RectF c = new RectF();
    private static final Matrix d = new Matrix();
    private static final Matrix e = new Matrix();
    private static final Matrix f = new Matrix();
    private static final float[] g = new float[2];
    private static final int[] h = new int[2];
    private static final int[] i = new int[2];
    private static final int[] j = new int[2];
    private static final int[] k = new int[2];

    public static float a(View view) {
        float scaleX = view.getScaleX();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            scaleX *= view2.getScaleX();
            parent = view2.getParent();
        }
        return scaleX;
    }

    public static float b(View view) {
        float scaleY = view.getScaleY();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            scaleY *= view2.getScaleY();
            parent = view2.getParent();
        }
        return scaleY;
    }

    public static View c(Matrix matrix, View view, View view2) {
        matrix.reset();
        if (view == view2) {
            return view;
        }
        View n = n(matrix, view, view2);
        if (view2 != n) {
            if (view2 != null) {
                Matrix matrix2 = e;
                matrix2.reset();
                matrix2.postTranslate(-view2.getScrollX(), -view2.getScrollY());
                View n2 = n(matrix2, view2, null);
                if (n.getWindowToken() != n2.getWindowToken()) {
                    if (!aad.ag(n) || !aad.ag(n2)) {
                        if (aad.ag(n)) {
                            ((luc) a.a(hip.a).k("com/google/android/libraries/inputmethod/widgets/ViewUtil", "getTransformMatrix", 321, "ViewUtil.java")).t("toView is not attached to window.");
                        } else if (aad.ag(n2)) {
                            ((luc) a.a(hip.a).k("com/google/android/libraries/inputmethod/widgets/ViewUtil", "getTransformMatrix", 323, "ViewUtil.java")).t("fromView is not attached to window.");
                        } else {
                            ((luc) a.a(hip.a).k("com/google/android/libraries/inputmethod/widgets/ViewUtil", "getTransformMatrix", 325, "ViewUtil.java")).t("Both views are not attached to window");
                        }
                        ieh.j().e(idd.VIEW_NOT_ATTACHED_TO_WINDOW_CRASH, new Object[0]);
                    }
                    q(matrix, n);
                    int[] iArr = h;
                    g(n, iArr);
                    int[] iArr2 = i;
                    g(view2, iArr2);
                    matrix.postTranslate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                    q(matrix2, n2);
                }
                Matrix matrix3 = f;
                if (!matrix2.invert(matrix3)) {
                    return view2;
                }
                matrix.postConcat(matrix3);
                return view2;
            } else if (aad.ag(n)) {
                q(matrix, n);
                return n;
            }
        }
        return n;
    }

    public static View d(float[] fArr, View view, View view2) {
        int length = fArr.length;
        if (view == view2) {
            return view;
        }
        Matrix matrix = d;
        View c2 = c(matrix, view, view2);
        matrix.mapPoints(fArr);
        return c2;
    }

    public static View e(Rect rect, View view, View view2) {
        if (view == view2) {
            return view;
        }
        Matrix matrix = d;
        View c2 = c(matrix, view, view2);
        RectF rectF = c;
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        return c2;
    }

    public static void f(leq leqVar, View view) {
        Void r0 = (Void) leqVar.a(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                f(leqVar, viewGroup.getChildAt(i2));
            }
        }
    }

    public static void g(View view, int[] iArr) {
        if (aad.ag(view)) {
            int[] iArr2 = j;
            view.getLocationOnScreen(iArr2);
            int[] iArr3 = k;
            view.getLocationInWindow(iArr3);
            iArr[0] = iArr2[0] - iArr3[0];
            iArr[1] = iArr2[1] - iArr3[1];
            return;
        }
        iArr[1] = 0;
        iArr[0] = 0;
    }

    public static void h(float[] fArr, View view) {
        View d2 = d(fArr, view, null);
        if (aad.ag(d2)) {
            int[] iArr = h;
            d2.getLocationInWindow(iArr);
            int[] iArr2 = i;
            d2.getLocationOnScreen(iArr2);
            o(fArr, iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
        }
    }

    public static void i(View view, View view2, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        e(rect, view, view2);
    }

    public static void j(View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        View e2 = e(rect, view, null);
        if (aad.ag(e2)) {
            int[] iArr = h;
            e2.getLocationInWindow(iArr);
            int[] iArr2 = i;
            e2.getLocationOnScreen(iArr2);
            rect.offset(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Deprecated
    public static void k(TextView textView, boolean z) {
        Typeface typeface = textView.getTypeface();
        int style = typeface == null ? 0 : typeface.getStyle();
        if (style != 0 && style != 1) {
            if (style != 2) {
                if (style == 3) {
                    style = 3;
                } else {
                    z = 0;
                }
            }
            z = 1 != z ? 2 : 3;
        }
        if (style != z) {
            textView.setTypeface(Typeface.create(typeface, (int) z));
        }
    }

    public static void l(TextView textView, boolean z) {
        int paintFlags = textView.getPaintFlags();
        textView.setPaintFlags(z ? paintFlags | 8 : paintFlags & (-9));
    }

    public static void m(int[] iArr, View view, View view2) {
        float[] fArr = b;
        for (int i2 = 0; i2 < 2; i2++) {
            fArr[i2] = iArr[i2];
        }
        d(fArr, view, view2);
        for (int i3 = 0; i3 < 2; i3++) {
            iArr[i3] = Math.round(fArr[i3]);
        }
    }

    private static View n(Matrix matrix, View view, View view2) {
        if (view == view2) {
            return view;
        }
        p(matrix, view);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            matrix.postTranslate(-view.getScrollX(), -view.getScrollY());
            if (view == view2) {
                break;
            }
            p(matrix, view);
            parent = view.getParent();
        }
        return view;
    }

    private static void o(float[] fArr, float f2, float f3) {
        int length = fArr.length;
        fArr[0] = fArr[0] + f2;
        fArr[1] = fArr[1] + f3;
    }

    private static void p(Matrix matrix, View view) {
        Matrix matrix2 = view.getMatrix();
        if (matrix2 != null && !matrix2.isIdentity()) {
            matrix.postConcat(matrix2);
        }
        matrix.postTranslate(view.getLeft(), view.getTop());
    }

    private static void q(Matrix matrix, View view) {
        float[] fArr = g;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        Matrix matrix2 = view.getMatrix();
        if (matrix2 != null && !matrix2.isIdentity()) {
            matrix2.mapPoints(fArr);
        }
        o(fArr, view.getLeft(), view.getTop());
        int[] iArr = h;
        view.getLocationInWindow(iArr);
        float f2 = fArr[0] - iArr[0];
        fArr[0] = f2;
        float f3 = fArr[1] - iArr[1];
        fArr[1] = f3;
        if (f2 == 0.0f && f3 == 0.0f) {
            return;
        }
        matrix.postTranslate(-f2, -f3);
    }
}
