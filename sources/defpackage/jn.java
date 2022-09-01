package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: jn  reason: default package */
/* loaded from: classes.dex */
public class jn {
    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !l(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int d(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !l(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int f(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence h(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!l(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static String j(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean k(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] m(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int n(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int o(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!l(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    public static int p(TypedArray typedArray, XmlPullParser xmlPullParser, int i) {
        if (!l(xmlPullParser, "interpolator")) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    public static TypedValue q(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (!l(xmlPullParser, "value")) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023e, code lost:
        r2 = new defpackage.knf(null, r0, r0.getDefaultColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0240, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0079, code lost:
        r10 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0075, code lost:
        if (r7.equals("gradient") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0077, code lost:
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        r7 = r0.getName();
        r10 = r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r10 == 89650992) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r10 == 1191572447) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r7.equals("selector") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r10 == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r10 != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        r7 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r7.equals("gradient") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        r7 = g(r4, r28, r6, defpackage.tu.d);
        r14 = c(r7, r0, "startX", 8, 0.0f);
        r15 = c(r7, r0, "startY", 9, 0.0f);
        r16 = c(r7, r0, "endX", 10, 0.0f);
        r17 = c(r7, r0, "endY", 11, 0.0f);
        r10 = c(r7, r0, "centerX", 3, 0.0f);
        r2 = c(r7, r0, "centerY", 4, 0.0f);
        r13 = e(r7, r0, "type", 2, 0);
        r8 = o(r7, r0, "startColor", 0);
        r18 = l(r0, "centerColor");
        r3 = o(r7, r0, "centerColor", 7);
        r11 = o(r7, r0, "endColor", 1);
        r9 = e(r7, r0, "tileMode", 6, 0);
        r21 = c(r7, r0, "gradientRadius", 5, 0.0f);
        r7.recycle();
        r2 = r0.getDepth() + 1;
        r5 = new java.util.ArrayList(20);
        r12 = new java.util.ArrayList(20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
        r7 = r0.next();
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
        if (r7 == 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
        r10 = r0.getDepth();
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
        if (r10 >= r2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
        if (r7 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0172, code lost:
        if (r12.size() <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0174, code lost:
        r0 = new defpackage.azp(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017b, code lost:
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018c, code lost:
        if (r13 == 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018f, code lost:
        if (r13 == 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
        r15 = r23;
        r1 = new android.graphics.LinearGradient(r14, r15, r16, r17, (int[]) r0.b, (float[]) r0.a, defpackage.jj.b(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e7, code lost:
        r2 = new defpackage.knf(r1, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x024c, code lost:
        if (r2 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x024e, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ea, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0244, code lost:
        android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", r0);
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01aa, code lost:
        r1 = new android.graphics.SweepGradient(r22, r2, (int[]) r0.b, (float[]) r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c3, code lost:
        if (r21 <= 0.0f) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c5, code lost:
        r1 = new android.graphics.RadialGradient(r22, r2, r21, (int[]) r0.b, (float[]) r0.a, defpackage.jj.b(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f3, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
        if (r18 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0180, code lost:
        r0 = new defpackage.azp(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
        r0 = new defpackage.azp(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017a, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
        if (r7 != 2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0115, code lost:
        if (r10 > r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0121, code lost:
        if (r0.getName().equals("item") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0123, code lost:
        r7 = g(r4, r28, r6, defpackage.tu.e);
        r15 = r7.hasValue(0);
        r24 = r7.hasValue(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0133, code lost:
        if (r15 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
        if (r24 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0137, code lost:
        r24 = r7.getColor(0, 0);
        r25 = r7.getFloat(1, 0.0f);
        r7.recycle();
        r12.add(java.lang.Integer.valueOf(r24));
        r5.add(java.lang.Float.valueOf(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0167, code lost:
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0166, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(r0.getPositionDescription()).concat(": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016c, code lost:
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0211, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": invalid gradient color tag " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022f, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": unsupported complex color tag " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0230, code lost:
        r0 = defpackage.uz.b(r4, r0, r6, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023a, code lost:
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.knf r(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn.r(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):knf");
    }

    public void a(StaticLayout.Builder builder, TextView textView) {
    }

    public boolean b(TextView textView) {
        return ((Boolean) jo.d(textView, "getHorizontallyScrolling", false)).booleanValue();
    }
}
