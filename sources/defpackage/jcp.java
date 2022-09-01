package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.libraries.inputmethod.widgets.TransformationTextView;
import j$.util.Collection$EL;
import j$.util.DesugarArrays;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jcp  reason: default package */
/* loaded from: classes.dex */
public class jcp extends TransformationTextView {
    private static final Pattern a = Pattern.compile("^\\p{Ll}\\p{M}*+$");
    public static final /* synthetic */ int q = 0;
    private final Paint.FontMetrics b;
    private boolean c;
    private CharSequence e;
    private String f;
    private float g;
    private boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public float n;
    boolean o;
    public int p;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final Rect x;

    public jcp(Context context) {
        this(context, null);
    }

    private static int c(int i, int i2, int i3) {
        return i == 1073741824 ? i2 : i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    public final Rect f() {
        if (this.c) {
            TextPaint paint = getPaint();
            paint.getFontMetrics(this.b);
            CharSequence charSequence = this.e;
            Rect rect = this.x;
            int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
            double measureText = paint.measureText(charSequence.toString());
            double measureText2 = paint.measureText(String.valueOf(String.valueOf(charSequence)).concat("\u200b"));
            paint.getTextBounds(charSequence.toString(), 0, charSequence.length(), rect);
            if (codePointCount == 1) {
                if (measureText2 != 0.0d) {
                    Double.isNaN(measureText);
                    if (measureText2 >= measureText * 1.5d) {
                        rect.set(0, rect.top, (int) Math.ceil(measureText2), rect.bottom);
                    }
                }
            } else if (codePointCount != 1 && measureText > rect.width()) {
                rect.set(0, rect.top, (int) Math.ceil(measureText), rect.bottom);
            }
            this.c = false;
        }
        return this.x;
    }

    public final void g(int i, int i2) {
        int paddingTop;
        float f;
        float f2;
        float f3;
        String obj;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = (i - paddingLeft) - paddingRight;
        int paddingTop2 = (i2 - getPaddingTop()) - getPaddingBottom();
        int width = f().width();
        int height = f().height();
        boolean z = true;
        boolean z2 = width > i5 && this.p != 1;
        float f4 = 1.0f;
        float max = z2 ? Math.max(i5 / width, this.g) : 1.0f;
        this.k = max;
        int i6 = this.p;
        if (i6 != 3) {
            max = 1.0f;
        }
        float f5 = height;
        float f6 = paddingTop2;
        if (f5 * max > f6 && i6 == 3) {
            max = f6 / f5;
        }
        this.l = max;
        float f7 = this.w ? -this.b.top : -f().top;
        float f8 = this.w ? this.b.bottom : f().bottom;
        if (!this.w) {
            f4 = this.l;
        }
        this.j = paddingTop + (((int) (f6 + ((f7 - f8) * f4))) / 2);
        if (this.p == 3) {
            float f9 = this.k;
            float f10 = this.l;
            if (f9 > f10) {
                this.k = f10;
            }
        }
        if (z2 || (getGravity() & 7) == 3) {
            int i7 = f().left;
            f = this.k;
            f2 = paddingLeft;
            f3 = i7;
        } else {
            int width2 = f().width();
            float f11 = this.k;
            int i8 = f().left;
            f = this.k;
            f2 = paddingLeft + ((i5 - (width2 * f11)) / 2.0f);
            f3 = i8;
        }
        this.i = f2 - (f3 * f);
        float f12 = i5;
        float f13 = width;
        CharSequence charSequence = this.e;
        if (getEllipsize() == null || f13 * f <= f12) {
            obj = charSequence.toString();
        } else if (!(charSequence instanceof Spanned) || !DesugarArrays.stream((jco[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), jco.class)).findAny().isPresent() || !charSequence.toString().contains(" ")) {
            int[] iArr = new int[2];
            float f14 = f12 / f;
            String obj2 = TextUtils.ellipsize(charSequence, getPaint(), f14, getEllipsize(), false, new jcn(iArr)).toString();
            if (TextUtils.isEmpty(obj2)) {
                obj2 = charSequence.toString();
            }
            float measureText = getPaint().measureText(obj2);
            for (int i9 = 0; f12 > 0.0f && measureText > f14 && i9 < 5; i9++) {
                int i10 = iArr[0] + 1;
                int length = obj2.length();
                if (length != 0 && i10 >= 0 && i10 <= length) {
                    StringBuilder sb = new StringBuilder(length - 1);
                    if (i10 > 0) {
                        sb.append(obj2.substring(0, i10));
                    }
                    int i11 = i10 + 1;
                    if (i11 < length) {
                        sb.append(obj2.substring(i11));
                    }
                    obj2 = sb.toString();
                }
                measureText = getPaint().measureText(obj2);
            }
            obj = obj2;
        } else {
            obj = charSequence.toString();
            float f15 = f12 / f;
            String str = "…";
            float measureText2 = getPaint().measureText(str);
            float[] fArr = new float[obj.length()];
            getPaint().getTextWidths(obj, fArr);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            while (i12 < obj.length()) {
                int codePointAt = obj.codePointAt(i12);
                int charCount = Character.charCount(codePointAt);
                float f16 = 0.0f;
                for (int i13 = 0; i13 < charCount; i13++) {
                    f16 += fArr[i12];
                    i12++;
                }
                arrayList.add(Integer.valueOf(codePointAt));
                arrayList2.add(Float.valueOf(f16));
            }
            int indexOf = arrayList.indexOf(32);
            int i14 = indexOf - 1;
            int i15 = indexOf + 1;
            float floatValue = ((Float) arrayList2.get(indexOf)).floatValue();
            boolean z3 = false;
            while (true) {
                if (i14 >= 0 && i15 < arrayList.size()) {
                    z3 ^= z;
                } else if (i14 < 0) {
                    if (i15 >= arrayList.size()) {
                        break;
                    }
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    floatValue += ((Float) arrayList2.get(i14)).floatValue();
                    i4 = i14 - 1;
                    i3 = i15;
                } else {
                    floatValue += ((Float) arrayList2.get(i15)).floatValue();
                    i3 = i15 + 1;
                    i4 = i14;
                }
                float f17 = i4 >= 0 ? f15 - measureText2 : f15;
                if (i3 < arrayList.size()) {
                    f17 -= measureText2;
                }
                if (floatValue >= f17) {
                    int[] array = Collection$EL.stream(arrayList.subList(i14 + 1, i15)).mapToInt(drv.c).toArray();
                    String str2 = i14 >= 0 ? str : "";
                    String str3 = new String(array, 0, array.length);
                    if (i15 >= arrayList.size()) {
                        str = "";
                    }
                    obj = str2 + str3 + str;
                } else {
                    i14 = i4;
                    i15 = i3;
                    z = true;
                }
            }
        }
        this.f = obj;
        getEllipsize();
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return this.o ? super.getText() : this.e;
    }

    @Override // android.widget.TextView
    public final float getTextScaleX() {
        return this.o ? super.getTextScaleX() : this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(float f) {
        this.g = Math.max(f, 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.o) {
            super.onDraw(canvas);
            return;
        }
        if (this.m) {
            g(getWidth(), getHeight());
            this.m = false;
        }
        float f = this.v ? (-getHeight()) * 0.05f : 0.0f;
        canvas.save();
        canvas.translate(getScrollX() + this.i, getScrollY() + this.j + f);
        canvas.scale(this.k, this.l, 0.0f, 0.0f);
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        canvas.drawText(this.f, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.h = true;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.h = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.o) {
            super.onLayout(z, i, i2, i3, i4);
        } else if (!this.m && !z) {
        } else {
            g(i3 - i, i4 - i2);
            this.m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.o) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        double width = f().width() + getPaddingLeft() + getPaddingRight();
        double ceil = Math.ceil(((getPaddingTop() + getPaddingBottom()) - this.b.top) + this.b.bottom);
        int i3 = Integer.MAX_VALUE;
        int maxWidth = getMaxWidth() >= 0 ? getMaxWidth() : Integer.MAX_VALUE;
        if (getMaxHeight() >= 0) {
            i3 = getMaxHeight();
        }
        setMeasuredDimension(c(mode, size, (int) Math.min(Math.max(width, getMinimumWidth()), maxWidth)), c(mode2, size2, (int) Math.min(Math.max(ceil, getMinimumHeight()), i3)));
    }

    @Override // android.view.View
    public final void onProvideAutofillStructure(ViewStructure viewStructure, int i) {
    }

    @Override // android.view.View
    public final void onProvideStructure(ViewStructure viewStructure) {
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.h && !this.s) {
            if (TextUtils.isEmpty(charSequence) || !hdn.instance.h.b() || !hdq.b().a().contains(charSequence.toString())) {
                boolean z = false;
                this.o = false;
                CharSequence charSequence2 = this.e;
                if (charSequence2 != null && charSequence != null && charSequence2.toString().contentEquals(charSequence)) {
                    return;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                this.e = charSequence;
                this.f = charSequence.toString();
                if (this.u) {
                    if (a.matcher(this.e).matches()) {
                        z = true;
                    }
                }
                this.v = z;
                this.c = true;
                this.m = true;
                if (this.t) {
                    requestLayout();
                }
                invalidate();
                return;
            }
            this.o = true;
            super.setText(charSequence, bufferType);
            this.e = charSequence;
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        invalidate();
        this.c = true;
        this.m = true;
    }

    public jcp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Paint.FontMetrics();
        this.p = 1;
        this.g = 0.0f;
        this.n = 0.0f;
        this.t = true;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = new Rect();
        this.o = false;
        TypedArray typedArray = null;
        setCompoundDrawables(null, null, null, null);
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, jdl.a, 0, 0);
            this.g = typedArray.getFloat(3, 0.0f);
            this.t = typedArray.getBoolean(2, true);
            this.u = typedArray.getBoolean(1, false);
            this.w = typedArray.getBoolean(0, true);
            String string = typedArray.getString(4);
            if (!TextUtils.isEmpty(string)) {
                setTextLocale(Locale.forLanguageTag(string));
            }
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            setImportantForAutofill(2);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }
}
