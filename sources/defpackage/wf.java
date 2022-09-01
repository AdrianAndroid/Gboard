package defpackage;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: wf  reason: default package */
/* loaded from: classes2.dex */
public final class wf {
    public static ColorFilter a(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void b(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static void c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void d(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void e(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void f(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void g(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void h(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static boolean i(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = resources.getAnimation(i);
                return n(context, resources, theme, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0);
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static Keyframe k(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static PropertyValuesHolder l(TypedArray typedArray, int i, int i2, int i3, String str) {
        ghu ghuVar;
        int i4;
        PropertyValuesHolder ofInt;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        int i7 = peekValue != null ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        int i8 = peekValue2 != null ? peekValue2.type : 0;
        int i9 = 3;
        if (i == 4) {
            i = ((peekValue == null || !m(i7)) && (peekValue2 == null || !m(i8))) ? 0 : 3;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            vt[] d = kd.d(string);
            vt[] d2 = kd.d(string2);
            if (d == null && d2 == null) {
                return null;
            }
            if (d == null) {
                return PropertyValuesHolder.ofObject(str, new akg(), d2);
            }
            akg akgVar = new akg();
            if (d2 != null) {
                if (!kd.c(d, d2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return PropertyValuesHolder.ofObject(str, akgVar, d, d2);
            }
            return PropertyValuesHolder.ofObject(str, akgVar, d);
        }
        if (i == 3) {
            ghuVar = ghu.b;
        } else {
            i9 = i;
            ghuVar = null;
        }
        if (i9 == 0) {
            if (peekValue != null) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (peekValue2 != null) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f);
            }
        } else if (peekValue == null) {
            if (peekValue2 != null) {
                if (i8 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m(i8)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i4);
            }
            if (propertyValuesHolder == null && ghuVar != null) {
                propertyValuesHolder.setEvaluator(ghuVar);
                return propertyValuesHolder;
            }
        } else {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (m(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (peekValue2 != null) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i5);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    private static boolean m(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0313, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0315, code lost:
        r2 = new android.animation.Animator[r13.size()];
        r3 = r13.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0320, code lost:
        if (r14 >= r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0322, code lost:
        r2[r1] = (android.animation.Animator) r13.get(r14);
        r14 = r14 + 1;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0330, code lost:
        if (r34 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0332, code lost:
        r33.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0336, code lost:
        r33.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0339, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0310, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0311, code lost:
        if (r33 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator n(android.content.Context r28, android.content.res.Resources r29, android.content.res.Resources.Theme r30, org.xmlpull.v1.XmlPullParser r31, android.util.AttributeSet r32, android.animation.AnimatorSet r33, int r34) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.n(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    private static ValueAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        ValueAnimator valueAnimator3;
        TypedArray typedArray2;
        PropertyValuesHolder propertyValuesHolder;
        TypedArray g = jn.g(resources, theme, attributeSet, ajx.g);
        TypedArray g2 = jn.g(resources, theme, attributeSet, ajx.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long e = jn.e(g, xmlPullParser, "duration", 1, 300);
        int i = 0;
        long e2 = jn.e(g, xmlPullParser, "startOffset", 2, 0);
        int e3 = jn.e(g, xmlPullParser, "valueType", 7, 4);
        if (jn.l(xmlPullParser, "valueFrom") && jn.l(xmlPullParser, "valueTo")) {
            if (e3 == 4) {
                TypedValue peekValue = g.peekValue(5);
                int i2 = peekValue != null ? peekValue.type : 0;
                TypedValue peekValue2 = g.peekValue(6);
                e3 = ((peekValue == null || !m(i2)) && (peekValue2 == null || !m(peekValue2 != null ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder l = l(g, e3, 5, 6, "");
            if (l != null) {
                valueAnimator4.setValues(l);
            }
        }
        valueAnimator4.setDuration(e);
        valueAnimator4.setStartDelay(e2);
        valueAnimator4.setRepeatCount(jn.e(g, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(jn.e(g, xmlPullParser, "repeatMode", 4, 1));
        if (g2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String i3 = jn.i(g2, xmlPullParser, "pathData", 1);
            if (i3 != null) {
                String i4 = jn.i(g2, xmlPullParser, "propertyXName", 2);
                String i5 = jn.i(g2, xmlPullParser, "propertyYName", 3);
                if (i4 != null || i5 != null) {
                    Path b = kd.b(i3);
                    PathMeasure pathMeasure = new PathMeasure(b, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f = 0.0f;
                    do {
                        f += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(b, false);
                    int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f2 = f / (min - 1);
                    valueAnimator2 = valueAnimator4;
                    typedArray2 = g;
                    int i6 = 0;
                    float f3 = 0.0f;
                    while (true) {
                        propertyValuesHolder = null;
                        if (i >= min) {
                            break;
                        }
                        int i7 = min;
                        pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
                        fArr[i] = fArr3[0];
                        fArr2[i] = fArr3[1];
                        f3 += f2;
                        int i8 = i6 + 1;
                        if (i8 < arrayList.size() && f3 > ((Float) arrayList.get(i8)).floatValue()) {
                            pathMeasure2.nextContour();
                            i6 = i8;
                        }
                        i++;
                        min = i7;
                    }
                    PropertyValuesHolder ofFloat = i4 != null ? PropertyValuesHolder.ofFloat(i4, fArr) : null;
                    if (i5 != null) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(i5, fArr2);
                    }
                    if (ofFloat == null) {
                        i = 0;
                        objectAnimator.setValues(propertyValuesHolder);
                    } else {
                        i = 0;
                        if (propertyValuesHolder == null) {
                            objectAnimator.setValues(ofFloat);
                        } else {
                            objectAnimator.setValues(ofFloat, propertyValuesHolder);
                        }
                    }
                } else {
                    throw new InflateException(String.valueOf(g2.getPositionDescription()).concat(" propertyXName or propertyYName is needed for PathData"));
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray2 = g;
                objectAnimator.setPropertyName(jn.i(g2, xmlPullParser, "propertyName", 0));
            }
            typedArray = typedArray2;
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = g;
        }
        int p = jn.p(typedArray, xmlPullParser, i);
        if (p > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(we.f(context, p));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray.recycle();
        if (g2 != null) {
            g2.recycle();
        }
        return valueAnimator3;
    }
}
