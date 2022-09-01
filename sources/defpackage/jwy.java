package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: jwy  reason: default package */
/* loaded from: classes.dex */
public final class jwy {
    static Integer d;
    public final Object a;
    public Object b;
    public final Object c;

    public jwy(View view) {
        this.c = new ArrayList();
        this.a = view;
    }

    public jwy(jwv jwvVar) {
        this.c = new jrr();
        this.a = jwvVar;
    }

    public static final boolean d(int i, int i2) {
        return f(i) && f(i2);
    }

    private final int e(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (((View) this.a).isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = ((View) this.a).getContext();
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

    private static final boolean f(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public final int a() {
        int paddingTop = ((View) this.a).getPaddingTop() + ((View) this.a).getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = ((View) this.a).getLayoutParams();
        return e(((View) this.a).getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int b() {
        int paddingLeft = ((View) this.a).getPaddingLeft() + ((View) this.a).getPaddingRight();
        ViewGroup.LayoutParams layoutParams = ((View) this.a).getLayoutParams();
        return e(((View) this.a).getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    public final void c() {
        ViewTreeObserver viewTreeObserver = ((View) this.a).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.b);
        }
        this.b = null;
        this.c.clear();
    }

    public jwy(gjz gjzVar, byte[] bArr) {
        this.a = new dgq();
        this.b = new dgq();
        this.c = gjzVar;
    }
}
