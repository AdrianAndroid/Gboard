package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gkn  reason: default package */
/* loaded from: classes.dex */
public final class gkn {
    static Integer d;
    public final Object a;
    public final Object b;
    public Object c;

    public gkn() {
        this.b = new otj(null, null);
        this.a = new otj(null, null);
        this.c = new ru[32];
    }

    public gkn(afv afvVar) {
        this.a = new afq(afvVar);
        this.b = new Handler();
    }

    private gkn(Context context, TypedArray typedArray) {
        this.b = context;
        this.a = typedArray;
    }

    public gkn(byte[] bArr) {
        this.b = new ohq((char[]) null);
        this.a = new ohq((char[]) null);
        this.c = new j[32];
    }

    public static final boolean e(int i, int i2) {
        return y(i) && y(i2);
    }

    public static gkn u(Context context, int i, int[] iArr) {
        return new gkn(context, context.obtainStyledAttributes(i, iArr));
    }

    public static gkn v(Context context, AttributeSet attributeSet, int[] iArr) {
        return new gkn(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static gkn w(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new gkn(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    private final int x(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (((View) this.b).isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = ((View) this.b).getContext();
        if (d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            ce.m(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return d.intValue();
    }

    private static final boolean y(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public final File a() {
        Object obj;
        synchronized (this.a) {
            if (this.c == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    this.c = ((Context) this.b).getDataDir();
                } else {
                    this.c = ((Context) this.b).getDatabasePath("dps-dummy").getParentFile().getParentFile();
                }
            }
            obj = this.c;
        }
        return (File) obj;
    }

    public final int b() {
        int paddingTop = ((View) this.b).getPaddingTop() + ((View) this.b).getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = ((View) this.b).getLayoutParams();
        return x(((View) this.b).getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int c() {
        int paddingLeft = ((View) this.b).getPaddingLeft() + ((View) this.b).getPaddingRight();
        ViewGroup.LayoutParams layoutParams = ((View) this.b).getLayoutParams();
        return x(((View) this.b).getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    public final void d() {
        ViewTreeObserver viewTreeObserver = ((View) this.b).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.a.clear();
    }

    public final void f(afo afoVar) {
        Object obj = this.c;
        if (obj != null) {
            ((agl) obj).run();
        }
        agl aglVar = new agl((afq) this.a, afoVar);
        this.c = aglVar;
        ((Handler) this.b).postAtFrontOfQueue(aglVar);
    }

    public final int g(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelOffset(i, i2);
    }

    public final int h(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelSize(i, i2);
    }

    public final int i(int i, int i2) {
        return ((TypedArray) this.a).getInt(i, i2);
    }

    public final int j(int i, int i2) {
        return ((TypedArray) this.a).getInteger(i, i2);
    }

    public final int k(int i, int i2) {
        return ((TypedArray) this.a).getLayoutDimension(i, i2);
    }

    public final int l(int i, int i2) {
        return ((TypedArray) this.a).getResourceId(i, i2);
    }

    public final ColorStateList m(int i) {
        int resourceId;
        ColorStateList c;
        return (!((TypedArray) this.a).hasValue(i) || (resourceId = ((TypedArray) this.a).getResourceId(i, 0)) == 0 || (c = uv.c((Context) this.b, resourceId)) == null) ? ((TypedArray) this.a).getColorStateList(i) : c;
    }

    public final Drawable n(int i) {
        int resourceId;
        if (!((TypedArray) this.a).hasValue(i) || (resourceId = ((TypedArray) this.a).getResourceId(i, 0)) == 0) {
            return ((TypedArray) this.a).getDrawable(i);
        }
        return ej.a((Context) this.b, resourceId);
    }

    public final Drawable o(int i) {
        int resourceId;
        if (!((TypedArray) this.a).hasValue(i) || (resourceId = ((TypedArray) this.a).getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0000if.d().g((Context) this.b, resourceId);
    }

    public final CharSequence p(int i) {
        return ((TypedArray) this.a).getText(i);
    }

    public final String q(int i) {
        return ((TypedArray) this.a).getString(i);
    }

    public final void r() {
        ((TypedArray) this.a).recycle();
    }

    public final boolean s(int i, boolean z) {
        return ((TypedArray) this.a).getBoolean(i, z);
    }

    public final boolean t(int i) {
        return ((TypedArray) this.a).hasValue(i);
    }

    public gkn(View view) {
        this.a = new ArrayList();
        this.b = view;
    }

    public gkn(Context context) {
        this.a = new Object();
        this.b = context.getApplicationContext();
    }
}
