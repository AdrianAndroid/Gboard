package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: akp  reason: default package */
/* loaded from: classes.dex */
public final class akp extends akh {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public akn b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public akp() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new akn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    public static akp b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        akp akpVar = new akp();
        akpVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return akpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static akp c(Resources resources, int i, Resources.Theme theme) {
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                int next = xml.next();
                if (next == 2) {
                    return b(resources, xml, asAttributeSet, theme);
                }
                if (next == 1) {
                    throw new XmlPullParserException("No start tag found");
                }
            }
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.i(drawable);
            return false;
        }
        return false;
    }

    final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float abs = Math.abs(this.h[0]);
        float abs2 = Math.abs(this.h[4]);
        float abs3 = Math.abs(this.h[1]);
        float abs4 = Math.abs(this.h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = this.j.width();
        int height = this.j.height();
        int min = Math.min(2048, (int) (width * abs));
        int min2 = Math.min(2048, (int) (height * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.j.left, this.j.top);
        if (isAutoMirrored() && wg.a(this) == 1) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        akn aknVar = this.b;
        Bitmap bitmap = aknVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != aknVar.f.getHeight()) {
            aknVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            aknVar.k = true;
        }
        if (!this.c) {
            this.b.a(min, min2);
        } else {
            akn aknVar2 = this.b;
            if (aknVar2.k || aknVar2.g != aknVar2.c || aknVar2.h != aknVar2.d || aknVar2.j != aknVar2.e || aknVar2.i != aknVar2.b.getRootAlpha()) {
                this.b.a(min, min2);
                akn aknVar3 = this.b;
                aknVar3.g = aknVar3.c;
                aknVar3.h = aknVar3.d;
                aknVar3.i = aknVar3.b.getRootAlpha();
                aknVar3.j = aknVar3.e;
                aknVar3.k = false;
            }
        }
        akn aknVar4 = this.b;
        Rect rect = this.j;
        if (aknVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (aknVar4.l == null) {
                aknVar4.l = new Paint();
                aknVar4.l.setFilterBitmap(true);
            }
            aknVar4.l.setAlpha(aknVar4.b.getRootAlpha());
            aknVar4.l.setColorFilter(colorFilter);
            paint = aknVar4.l;
        }
        canvas.drawBitmap(aknVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? we.a(drawable) : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? wf.a(drawable) : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? we.e(drawable) : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        akn aknVar = this.b;
        if (aknVar != null) {
            if (aknVar.b()) {
                return true;
            }
            ColorStateList colorStateList = this.b.c;
            return colorStateList != null && colorStateList.isStateful();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new akn(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.akh, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        akn aknVar = this.b;
        ColorStateList colorStateList = aknVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = aknVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (aknVar.b()) {
            boolean d = aknVar.b.d.d(iArr);
            aknVar.k |= d;
            if (d) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() == i) {
        } else {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            we.d(drawable, z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.f(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.g(drawable, colorStateList);
            return;
        }
        akn aknVar = this.b;
        if (aknVar.c == colorStateList) {
            return;
        }
        aknVar.c = colorStateList;
        this.d = d(colorStateList, aknVar.d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.h(drawable, mode);
            return;
        }
        akn aknVar = this.b;
        if (aknVar.d == mode) {
            return;
        }
        aknVar.d = mode;
        this.d = d(aknVar.c, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.e == null || Build.VERSION.SDK_INT < 24) {
            this.b.a = getChangingConfigurations();
            return this.b;
        }
        return new ako(this.e.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.c(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        akn aknVar = this.b;
        aknVar.b = new akm();
        TypedArray g = jn.g(resources, theme, attributeSet, ajx.a);
        akn aknVar2 = this.b;
        akm akmVar = aknVar2.b;
        int e = jn.e(g, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (e == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (e == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (e != 9) {
            switch (e) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        aknVar2.d = mode;
        int i2 = 1;
        if (jn.l(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            g.getValue(1, typedValue);
            if (typedValue.type == 2) {
                new StringBuilder("Failed to resolve attribute at index 1: ").append(typedValue);
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
            } else if (typedValue.type < 28 || typedValue.type > 31) {
                colorStateList = uz.c(g.getResources(), g.getResourceId(1, 0), theme);
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            aknVar2.c = colorStateList;
        }
        boolean z = aknVar2.e;
        if (jn.l(xmlPullParser, "autoMirrored")) {
            z = g.getBoolean(5, z);
        }
        aknVar2.e = z;
        akmVar.g = jn.c(g, xmlPullParser, "viewportWidth", 7, akmVar.g);
        float c = jn.c(g, xmlPullParser, "viewportHeight", 8, akmVar.h);
        akmVar.h = c;
        if (akmVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(g.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (c <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(g.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
        }
        akmVar.e = g.getDimension(3, akmVar.e);
        float dimension = g.getDimension(2, akmVar.f);
        akmVar.f = dimension;
        if (akmVar.e <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(g.getPositionDescription()).concat("<vector> tag requires width > 0"));
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(g.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        akmVar.setAlpha(jn.c(g, xmlPullParser, "alpha", 4, akmVar.getAlpha()));
        String string = g.getString(0);
        if (string != null) {
            akmVar.j = string;
            akmVar.l.put(string, akmVar);
        }
        g.recycle();
        aknVar.a = getChangingConfigurations();
        aknVar.k = true;
        akn aknVar3 = this.b;
        akm akmVar2 = aknVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(akmVar2.d);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        for (int i3 = 3; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != i3); i3 = 3) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                akk akkVar = (akk) arrayDeque.peek();
                if (akkVar == null) {
                    i = depth;
                } else if ("path".equals(name)) {
                    akj akjVar = new akj();
                    TypedArray g2 = jn.g(resources, theme, attributeSet, ajx.c);
                    akjVar.a = null;
                    if (!jn.l(xmlPullParser, "pathData")) {
                        i = depth;
                    } else {
                        String string2 = g2.getString(0);
                        if (string2 != null) {
                            akjVar.n = string2;
                        }
                        String string3 = g2.getString(2);
                        if (string3 != null) {
                            akjVar.m = kd.d(string3);
                        }
                        akjVar.l = jn.r(g2, xmlPullParser, theme, "fillColor", 1);
                        i = depth;
                        akjVar.d = jn.c(g2, xmlPullParser, "fillAlpha", 12, akjVar.d);
                        int e2 = jn.e(g2, xmlPullParser, "strokeLineCap", 8, -1);
                        Paint.Cap cap = akjVar.h;
                        if (e2 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (e2 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (e2 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        akjVar.h = cap;
                        int e3 = jn.e(g2, xmlPullParser, "strokeLineJoin", 9, -1);
                        Paint.Join join = akjVar.i;
                        if (e3 == 0) {
                            join = Paint.Join.MITER;
                        } else if (e3 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (e3 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        akjVar.i = join;
                        akjVar.j = jn.c(g2, xmlPullParser, "strokeMiterLimit", 10, akjVar.j);
                        akjVar.k = jn.r(g2, xmlPullParser, theme, "strokeColor", 3);
                        akjVar.c = jn.c(g2, xmlPullParser, "strokeAlpha", 11, akjVar.c);
                        akjVar.b = jn.c(g2, xmlPullParser, "strokeWidth", 4, akjVar.b);
                        akjVar.f = jn.c(g2, xmlPullParser, "trimPathEnd", 6, akjVar.f);
                        akjVar.g = jn.c(g2, xmlPullParser, "trimPathOffset", 7, akjVar.g);
                        akjVar.e = jn.c(g2, xmlPullParser, "trimPathStart", 5, akjVar.e);
                        akjVar.o = jn.e(g2, xmlPullParser, "fillType", 13, akjVar.o);
                    }
                    g2.recycle();
                    akkVar.b.add(akjVar);
                    if (akjVar.getPathName() != null) {
                        akmVar2.l.put(akjVar.getPathName(), akjVar);
                    }
                    int i4 = aknVar3.a;
                    z2 = false;
                } else {
                    i = depth;
                    if ("clip-path".equals(name)) {
                        aki akiVar = new aki();
                        if (jn.l(xmlPullParser, "pathData")) {
                            TypedArray g3 = jn.g(resources, theme, attributeSet, ajx.d);
                            String string4 = g3.getString(0);
                            if (string4 != null) {
                                akiVar.n = string4;
                            }
                            String string5 = g3.getString(1);
                            if (string5 != null) {
                                akiVar.m = kd.d(string5);
                            }
                            akiVar.o = jn.e(g3, xmlPullParser, "fillType", 2, 0);
                            g3.recycle();
                        }
                        akkVar.b.add(akiVar);
                        if (akiVar.getPathName() != null) {
                            akmVar2.l.put(akiVar.getPathName(), akiVar);
                        }
                        int i5 = aknVar3.a;
                    } else if ("group".equals(name)) {
                        akk akkVar2 = new akk();
                        TypedArray g4 = jn.g(resources, theme, attributeSet, ajx.b);
                        akkVar2.l = null;
                        akkVar2.c = jn.c(g4, xmlPullParser, "rotation", 5, akkVar2.c);
                        akkVar2.d = g4.getFloat(1, akkVar2.d);
                        akkVar2.e = g4.getFloat(2, akkVar2.e);
                        akkVar2.f = jn.c(g4, xmlPullParser, "scaleX", 3, akkVar2.f);
                        akkVar2.g = jn.c(g4, xmlPullParser, "scaleY", 4, akkVar2.g);
                        akkVar2.h = jn.c(g4, xmlPullParser, "translateX", 6, akkVar2.h);
                        akkVar2.i = jn.c(g4, xmlPullParser, "translateY", 7, akkVar2.i);
                        String string6 = g4.getString(0);
                        if (string6 != null) {
                            akkVar2.m = string6;
                        }
                        akkVar2.e();
                        g4.recycle();
                        akkVar.b.add(akkVar2);
                        arrayDeque.push(akkVar2);
                        if (akkVar2.getGroupName() != null) {
                            akmVar2.l.put(akkVar2.getGroupName(), akkVar2);
                        }
                        int i6 = aknVar3.a;
                    }
                }
            } else {
                i = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            depth = i;
            i2 = 1;
        }
        if (!z2) {
            this.d = d(aknVar.c, aknVar.d);
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    public akp(akn aknVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = aknVar;
        this.d = d(aknVar.c, aknVar.d);
    }
}
