package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jgd  reason: default package */
/* loaded from: classes.dex */
public final class jgd {
    public static final /* synthetic */ int a = 0;
    private static final lug b = hin.a;

    private static int A(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!F(context.getTheme(), i, typedValue, true) || typedValue.type < 28 || typedValue.type > 31) {
            try {
                return context.getResources().getColor(i);
            } catch (Resources.NotFoundException e) {
                m(e, context, i);
                return i2;
            }
        }
        return typedValue.data;
    }

    private static int B(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!F(context.getTheme(), i, typedValue, true) || (typedValue.type != 16 && typedValue.type != 17)) {
            try {
                return context.getResources().getInteger(i);
            } catch (Resources.NotFoundException e) {
                m(e, context, i);
                return i2;
            }
        }
        return typedValue.data;
    }

    private static int C(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str, 16);
        } catch (NumberFormatException unused) {
        }
        if (Character.isValidCodePoint(parseInt)) {
            return parseInt;
        }
        return -1;
    }

    private static String D(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!F(context.getTheme(), i, typedValue, true) || typedValue.type != 3) {
            try {
                return context.getString(i);
            } catch (Resources.NotFoundException e) {
                m(e, context, i);
                return null;
            }
        }
        return (String) typedValue.string;
    }

    private static boolean E(Context context, int i, boolean z) {
        TypedValue typedValue = new TypedValue();
        if (F(context.getTheme(), i, typedValue, true) && typedValue.type == 18) {
            return typedValue.data != 0;
        }
        try {
            return context.getResources().getBoolean(i);
        } catch (Resources.NotFoundException e) {
            m(e, context, i);
            return z;
        }
    }

    private static boolean F(Resources.Theme theme, int i, TypedValue typedValue, boolean z) {
        try {
            return theme.resolveAttribute(i, typedValue, z);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static float a(Context context, AttributeSet attributeSet, int i, float f) {
        if (attributeSet == null) {
            return f;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeFloatValue(i, f);
        }
        return z(context, attributeResourceValue, f);
    }

    public static float b(Context context, AttributeSet attributeSet, String str, String str2, float f) {
        if (attributeSet == null) {
            return f;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeFloatValue(str, str2, f);
        }
        return z(context, attributeResourceValue, f);
    }

    public static int c(Context context, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet == null) {
            return i2;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeIntValue(i, i2);
        }
        return B(context, attributeResourceValue, i2);
    }

    public static int d(Context context, AttributeSet attributeSet, String str, String str2, int i) {
        if (attributeSet == null) {
            return i;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeIntValue(str, str2, i);
        }
        return B(context, attributeResourceValue, i);
    }

    public static int e(Context context, AttributeSet attributeSet, int i, int i2) {
        int attributeResourceValue;
        return (attributeSet == null || (attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0)) == 0) ? i2 : g(context, attributeResourceValue);
    }

    public static int f(Context context, AttributeSet attributeSet, String str, String str2, int i) {
        int attributeResourceValue;
        return (attributeSet == null || (attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0)) == 0) ? i : g(context, attributeResourceValue);
    }

    public static int g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        return (!F(context.getTheme(), i, typedValue, false) || typedValue.type != 1) ? i : typedValue.data;
    }

    public static int h(String str) {
        if (str == null || str.length() < 3 || !str.startsWith("U+")) {
            return -1;
        }
        return C(str.substring(2));
    }

    public static String i(String str) {
        if (str == null || str.length() < 3 || !str.startsWith("U+")) {
            return str;
        }
        if (str.length() < 8) {
            int C = C(str.substring(2));
            return C == -1 ? str : new String(Character.toChars(C));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 2;
            int indexOf = str.indexOf("U+", i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int C2 = C(str.substring(i2, indexOf));
            if (C2 == -1) {
                return str;
            }
            sb.appendCodePoint(C2);
            i = indexOf;
        }
        return sb.toString();
    }

    public static String j(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            return null;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0);
        if (attributeResourceValue == 0 || context.getResources().getResourceTypeName(attributeResourceValue).equals("attr")) {
            return attributeSet.getAttributeValue(i);
        }
        return D(context, attributeResourceValue);
    }

    public static String k(Context context, AttributeSet attributeSet, String str, String str2) {
        if (attributeSet == null) {
            return null;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeValue(str, str2);
        }
        return D(context, attributeResourceValue);
    }

    public static void l(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = i(strArr[i]);
        }
    }

    public static void m(Exception exc, Context context, int i) {
        ((luc) ((luc) ((luc) b.c()).i(exc)).k("com/google/android/libraries/inputmethod/xml/XmlUtil", "logResourceNotFound", 739, "XmlUtil.java")).G("Resource not found: @%s, context: %s", jbi.j(i), context);
    }

    public static boolean n(Context context, AttributeSet attributeSet, int i, boolean z) {
        if (attributeSet == null) {
            return z;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeBooleanValue(i, z);
        }
        return E(context, attributeResourceValue, z);
    }

    public static boolean o(Context context, AttributeSet attributeSet, String str, String str2, boolean z) {
        if (attributeSet == null) {
            return z;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeBooleanValue(str, str2, z);
        }
        return E(context, attributeResourceValue, z);
    }

    public static int[] p(Context context, AttributeSet attributeSet, int i, lfy lfyVar) {
        if (attributeSet == null) {
            return gvw.b;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0);
        return attributeResourceValue == 0 ? r(context, j(context, attributeSet, i), lfyVar) : new int[]{g(context, attributeResourceValue)};
    }

    public static int[] q(String str, lfy lfyVar) {
        if (TextUtils.isEmpty(str)) {
            return gvw.b;
        }
        if (lfyVar == null) {
            int h = h(str);
            return h > 0 ? new int[]{h} : gvw.b;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : lfyVar.i(str)) {
            int h2 = h(str2);
            if (h2 > 0) {
                arrayList.add(Integer.valueOf(h2));
            }
        }
        return arrayList.isEmpty() ? gvw.b : mhq.p(arrayList);
    }

    public static int[] r(Context context, String str, lfy lfyVar) {
        if (TextUtils.isEmpty(str)) {
            return gvw.b;
        }
        if (lfyVar == null) {
            int[] iArr = new int[1];
            iArr[0] = TextUtils.isEmpty(str) ? 0 : jbi.a(context, str, null);
            return iArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : lfyVar.i(str)) {
            arrayList.add(Integer.valueOf(TextUtils.isEmpty(str) ? 0 : jbi.a(context, str2, null)));
        }
        hgw.e(arrayList, 0);
        return arrayList.isEmpty() ? gvw.b : mhq.p(arrayList);
    }

    public static Enum[] s(String str, lfy lfyVar, Class cls) {
        if (TextUtils.isEmpty(str)) {
            return (Enum[]) Array.newInstance(cls, 0);
        }
        if (lfyVar == null) {
            Enum[] enumArr = (Enum[]) Array.newInstance(cls, 1);
            enumArr[0] = Enum.valueOf(cls, str);
            return enumArr;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = lfyVar.i(str).iterator();
        while (true) {
            Enum r1 = null;
            if (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2)) {
                    r1 = Enum.valueOf(cls, str2);
                }
                arrayList.add(r1);
            } else {
                hgw.e(arrayList, null);
                return (Enum[]) arrayList.toArray((Enum[]) Array.newInstance(cls, arrayList.size()));
            }
        }
    }

    public static String[] t(Context context, AttributeSet attributeSet, int i, lfy lfyVar) {
        if (attributeSet == null) {
            return gvw.g;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0);
        if (attributeResourceValue == 0 || !context.getResources().getResourceTypeName(attributeResourceValue).equals("array")) {
            return u(j(context, attributeSet, i), lfyVar);
        }
        return context.getResources().getStringArray(attributeResourceValue);
    }

    public static String[] u(String str, lfy lfyVar) {
        if (TextUtils.isEmpty(str)) {
            return gvw.g;
        }
        if (lfyVar == null) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = lfyVar.i(str).iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            if (true != TextUtils.isEmpty(str3)) {
                str2 = str3;
            }
            arrayList.add(str2);
        }
        hgw.e(arrayList, null);
        return arrayList.isEmpty() ? gvw.g : (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int v(Context context, AttributeSet attributeSet, String str, int i) {
        if (attributeSet == null) {
            return i;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, str, 0);
        if (attributeResourceValue == 0) {
            return attributeSet.getAttributeIntValue(null, str, i);
        }
        return A(context, attributeResourceValue, i);
    }

    public static float w(Context context, AttributeSet attributeSet, String str, float f) {
        int attributeResourceValue;
        return (attributeSet == null || (attributeResourceValue = attributeSet.getAttributeResourceValue(null, str, 0)) == 0) ? f : y(context, attributeResourceValue, f);
    }

    public static Enum x(Context context, AttributeSet attributeSet, Class cls, Enum r5) {
        String k;
        if (attributeSet == null || (k = k(context, attributeSet, null, "animation_mode")) == null) {
            return r5;
        }
        try {
            return Enum.valueOf(cls, k);
        } catch (IllegalArgumentException unused) {
            return r5;
        }
    }

    private static float y(Context context, int i, float f) {
        TypedValue typedValue = new TypedValue();
        if (!F(context.getTheme(), i, typedValue, true) || typedValue.type != 5) {
            try {
                return context.getResources().getDimension(i);
            } catch (Resources.NotFoundException e) {
                m(e, context, i);
                return f;
            }
        }
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    private static float z(Context context, int i, float f) {
        TypedValue typedValue = new TypedValue();
        if (!F(context.getTheme(), i, typedValue, true) || typedValue.type != 4) {
            try {
                context.getResources().getValue(i, typedValue, true);
                return typedValue.getFloat();
            } catch (Resources.NotFoundException e) {
                m(e, context, i);
                return f;
            }
        }
        return typedValue.getFloat();
    }
}
