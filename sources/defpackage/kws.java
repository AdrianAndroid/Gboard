package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.TypedValue;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: kws  reason: default package */
/* loaded from: classes.dex */
public final class kws {
    public static int a(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = uv.c(context, resourceId)) == null) ? typedArray.getColorStateList(i) : c;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = ej.a(context, resourceId)) == null) ? typedArray.getDrawable(i) : a;
    }

    public static TypedValue d(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue e(Context context, int i, String str) {
        TypedValue d = d(context, i);
        if (d != null) {
            return d;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean f(Context context, int i, boolean z) {
        TypedValue d = d(context, i);
        return (d == null || d.type != 18) ? z : d.data != 0;
    }

    public static final float g(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static float h(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    public static String i(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static boolean j(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final void k(String str, llk llkVar) {
        llkVar.h(new krn(str));
    }

    public static final jma m(StringBuilder sb, ArrayList arrayList) {
        return new jma(sb.toString(), arrayList.toArray(new Object[arrayList.size()]));
    }
}
