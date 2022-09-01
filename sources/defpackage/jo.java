package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.support.v7.widget.AppCompatEditText;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jo  reason: default package */
/* loaded from: classes.dex */
public final class jo {
    private static final RectF j = new RectF();
    private static final ConcurrentHashMap k = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final TextView h;
    public final Context i;
    private TextPaint l;
    private final jn m;

    static {
        new ConcurrentHashMap();
    }

    public jo(TextView textView) {
        this.h = textView;
        this.i = textView.getContext();
        this.m = Build.VERSION.SDK_INT >= 29 ? new jm() : new jl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object d(Object obj, String str, Object obj2) {
        try {
            obj2 = m(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public static final int[] l(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0) {
                Integer valueOf = Integer.valueOf(i);
                if (Collections.binarySearch(arrayList, valueOf) < 0) {
                    arrayList.add(valueOf);
                }
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private static Method m(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = k;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return Math.round(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return Math.round(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return Math.round(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        CharSequence transformation;
        if (!h()) {
            return;
        }
        if (this.b) {
            if (this.h.getMeasuredHeight() <= 0 || this.h.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.m.b(this.h) ? 1048576 : (this.h.getMeasuredWidth() - this.h.getTotalPaddingLeft()) - this.h.getTotalPaddingRight();
            int height = (this.h.getHeight() - this.h.getCompoundPaddingBottom()) - this.h.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = j;
            synchronized (rectF) {
                rectF.setEmpty();
                rectF.right = measuredWidth;
                rectF.bottom = height;
                int length = this.f.length;
                if (length == 0) {
                    throw new IllegalStateException("No available text sizes to choose from.");
                }
                int i = length - 1;
                int i2 = 1;
                int i3 = 0;
                while (i2 <= i) {
                    int i4 = (i2 + i) / 2;
                    int i5 = this.f[i4];
                    CharSequence text = this.h.getText();
                    TransformationMethod transformationMethod = this.h.getTransformationMethod();
                    if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.h)) != null) {
                        text = transformation;
                    }
                    int a = ji.a(this.h);
                    TextPaint textPaint = this.l;
                    if (textPaint != null) {
                        textPaint.reset();
                    } else {
                        this.l = new TextPaint();
                    }
                    this.l.set(this.h.getPaint());
                    this.l.setTextSize(i5);
                    StaticLayout a2 = jk.a(text, (Layout.Alignment) d(this.h, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), a, this.h, this.l, this.m);
                    if ((a == -1 || (a2.getLineCount() <= a && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && a2.getHeight() <= rectF.bottom) {
                        int i6 = i4 + 1;
                        i3 = i2;
                        i2 = i6;
                    }
                    i3 = i4 - 1;
                    i = i3;
                }
                float f = this.f[i3];
                if (f != this.h.getTextSize()) {
                    f(0, f);
                }
            }
        }
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, float f) {
        Context context = this.i;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.h.getPaint().getTextSize()) {
            this.h.getPaint().setTextSize(applyDimension);
            boolean a = jj.a(this.h);
            if (this.h.getLayout() == null) {
                return;
            }
            this.b = false;
            try {
                Method m = m("nullLayouts");
                if (m != null) {
                    m.invoke(this.h, new Object[0]);
                }
            } catch (Exception e) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
            }
            if (!a) {
                this.h.requestLayout();
            } else {
                this.h.forceLayout();
            }
            this.h.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return k() && this.a != 0;
    }

    public final boolean i() {
        if (!k() || this.a != 1) {
            this.b = false;
            return false;
        }
        if (!this.g || this.f.length == 0) {
            int floor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
            int[] iArr = new int[floor];
            for (int i = 0; i < floor; i++) {
                iArr[i] = Math.round(this.d + (i * this.c));
            }
            this.f = l(iArr);
        }
        this.b = true;
        return true;
    }

    public final boolean j() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean k() {
        return !(this.h instanceof AppCompatEditText);
    }

    public final void g(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.a = 1;
            this.d = f;
            this.e = f2;
            this.c = f3;
            this.g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }
}
