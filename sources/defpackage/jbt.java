package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Menu;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: jbt  reason: default package */
/* loaded from: classes.dex */
public final class jbt {
    private static final qv h;
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/utils/Utils");
    private static final String[] c = {"com.google.android.libraries.inputmethod", "com.google.android.apps.inputmethod.libs.framework", "com.google.android.apps.inputmethod.libs", "com.google.android.apps.inputmethod"};
    private static final Class[] d = new Class[0];
    private static long e = 0;
    public static String b = null;
    private static final SparseArray f = new SparseArray();
    private static final ConcurrentHashMap g = new ConcurrentHashMap();

    static {
        qv qvVar = new qv();
        h = qvVar;
        qvVar.put(Byte.class, Byte.TYPE);
        qvVar.put(Short.class, Short.TYPE);
        qvVar.put(Integer.class, Integer.TYPE);
        qvVar.put(Long.class, Long.TYPE);
        qvVar.put(Float.class, Float.TYPE);
        qvVar.put(Double.class, Double.TYPE);
        qvVar.put(Character.class, Character.TYPE);
        qvVar.put(Boolean.class, Boolean.TYPE);
    }

    public static void A(Context context, ComponentName componentName, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        int i = true != z ? 2 : 1;
        if (i != packageManager.getComponentEnabledSetting(componentName)) {
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        }
    }

    public static boolean B(Context context, int i, boolean z) {
        return C(context.getResources(), i, z);
    }

    public static boolean C(Resources resources, int i, boolean z) {
        String y = y(resources, i);
        resources.getString(i);
        return !TextUtils.isEmpty(y) ? Boolean.parseBoolean(y) : z;
    }

    public static boolean D(EditorInfo editorInfo) {
        return "com.google.android.googlequicksearchbox".equals(editorInfo.packageName);
    }

    public static boolean E(String str) {
        return BidiFormatter.getInstance().isRtl(str);
    }

    public static boolean F(boolean z, boolean z2) {
        return z && !z2;
    }

    public static boolean G(boolean z, boolean z2) {
        return !z && z2;
    }

    public static boolean H(Context context, Uri uri, boolean z, ContentObserver contentObserver) {
        try {
            context.getContentResolver().registerContentObserver(uri, z, contentObserver);
            return true;
        } catch (IllegalArgumentException | NullPointerException | SecurityException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "registerContentObserver", (char) 856, "Utils.java")).t("Failed to register content observer.");
            return false;
        }
    }

    public static boolean I(Context context, ContentObserver contentObserver) {
        try {
            context.getContentResolver().unregisterContentObserver(contentObserver);
            return true;
        } catch (IllegalArgumentException | NullPointerException | SecurityException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "unregisterContentObserver", (char) 874, "Utils.java")).t("Failed to unregister content observer.");
            return false;
        }
    }

    public static Method J(Class cls, Class... clsArr) {
        try {
            if (TextUtils.isEmpty("shouldShowInInputMethodPicker")) {
                return null;
            }
            return cls.getMethod("shouldShowInInputMethodPicker", clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static boolean K(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.f4500_resource_name_obfuscated_res_0x7f0400f2, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }

    public static String L(CharSequence charSequence, Iterable iterable, leq leqVar) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : iterable) {
            if (leqVar != null) {
                obj = leqVar.a(obj);
            }
            String obj2 = obj != null ? obj.toString() : null;
            if (!TextUtils.isEmpty(obj2)) {
                sb.append(i > 0 ? charSequence : "");
                sb.append(obj2);
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static String M(Object[] objArr, leq leqVar) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : objArr) {
            Object a2 = leqVar.a(obj);
            ?? r4 = a2;
            if (a2 == null) {
                r4 = 0;
            }
            if (!TextUtils.isEmpty(r4)) {
                sb.append((CharSequence) (i > 0 ? ";" : ""));
                sb.append((String) r4);
                i++;
            }
        }
        return sb.toString();
    }

    public static int N(Resources.Theme theme, int i, int i2) {
        TypedArray typedArray;
        try {
            typedArray = theme.obtainStyledAttributes(new int[]{i});
            try {
                int i3 = typedArray.getInt(0, i2);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                return i3;
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    private static int O(Context context, int i, DisplayMetrics displayMetrics, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            float dimension = typedValue.getDimension(displayMetrics);
            return (int) (dimension + (dimension >= 0.0f ? 0.5f : -0.5f));
        }
        return i2;
    }

    private static CharSequence P(CharSequence... charSequenceArr) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                sb.append(charSequenceArr[i]);
            }
            return sb.toString();
        } catch (RuntimeException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "concatNonSpannedString", (char) 1108, "Utils.java")).t("Failed to build a valid string.");
            return "";
        }
    }

    private static Class Q(ClassLoader classLoader, String str) {
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static String R(String str, String str2) {
        return str + "(" + str2 + ")";
    }

    private static String S(String str) {
        if (str.length() > 31) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            try {
                try {
                    String str2 = (String) cls.getMethod("get", String.class).invoke(cls, str);
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                    return null;
                } catch (Exception e2) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "readSystemProperty", (char) 374, "Utils.java")).t("Failed to invoke SystemProperties.get()");
                    return null;
                }
            } catch (NoSuchMethodException e3) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e3)).k("com/google/android/libraries/inputmethod/utils/Utils", "readSystemProperty", (char) 365, "Utils.java")).t("Cannot find SystemProperties.get()");
                return null;
            }
        } catch (ClassNotFoundException e4) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e4)).k("com/google/android/libraries/inputmethod/utils/Utils", "readSystemProperty", (char) 357, "Utils.java")).t("Cannot find android.os.SystemProperties");
            return null;
        }
    }

    private static String[] T(String str) {
        if (str.startsWith(".")) {
            String[] strArr = new String[4];
            for (int i = 0; i < 4; i++) {
                strArr[i] = String.valueOf(c[i]).concat(String.valueOf(str));
            }
            return strArr;
        }
        return new String[]{str};
    }

    public static float a(Context context, int i, float f2) {
        return b(context.getResources(), i, f2);
    }

    public static float b(Resources resources, int i, float f2) {
        String y = y(resources, i);
        String string = resources.getString(i);
        if (!TextUtils.isEmpty(y)) {
            try {
                return Float.parseFloat(y);
            } catch (NumberFormatException e2) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "getFloatSystemProperty", 411, "Utils.java")).w("Failed to parse %s", string);
            }
        }
        return f2;
    }

    public static int c(Context context, int i, int i2) {
        return d(context.getResources(), i, i2);
    }

    public static int d(Resources resources, int i, int i2) {
        String y = y(resources, i);
        String string = resources.getString(i);
        if (!TextUtils.isEmpty(y)) {
            try {
                return Integer.parseInt(y);
            } catch (NumberFormatException e2) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "getIntSystemProperty", 391, "Utils.java")).w("Failed to parse %s", string);
            }
        }
        return i2;
    }

    public static int e(Context context, int i) {
        return f(context, i, 0);
    }

    public static int f(Context context, int i, int i2) {
        return O(context, i, gvv.i(context), i2);
    }

    public static int g(Context context, int i) {
        return O(context, i, gvv.i(context), 0);
    }

    public static int h(Context context, int i) {
        return N(context.getTheme(), i, 0);
    }

    public static int i(Context context, int i, int i2) {
        return N(context.getTheme(), i, i2);
    }

    public static int j(Context context, int i) {
        if (i == 0) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.resourceId : i;
    }

    public static int k(Resources.Theme theme, int i, int i2) {
        Throwable th;
        TypedArray typedArray;
        int[] iArr = {i2};
        try {
            if (i == 0) {
                typedArray = theme.obtainStyledAttributes(iArr);
            } else {
                typedArray = theme.obtainStyledAttributes(i, iArr);
            }
            try {
                int color = typedArray.getColor(0, 0);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                return color;
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    public static long l(Context context) {
        long j = e;
        if (j != 0) {
            return j;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                e = packageInfo.getLongVersionCode();
            } else {
                e = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "getPackageLongVersionCode", (char) 918, "Utils.java")).t("Failed to get version code.");
        }
        return e;
    }

    public static Context m(Context context) {
        Context b2 = uv.e(context) ? context : uv.b(context);
        return b2 != null ? b2 : context;
    }

    public static TypedValue n(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        return typedValue;
    }

    public static llp o(Context context) {
        llk e2 = llp.e();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 512)) {
            e2.h(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
        }
        return e2.g();
    }

    public static CharSequence p(CharSequence... charSequenceArr) {
        if (Build.VERSION.SDK_INT < 26) {
            for (int i = 0; i < 3; i++) {
                if (charSequenceArr[i] instanceof Spanned) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    for (int i2 = 0; i2 < 3; i2++) {
                        CharSequence charSequence = charSequenceArr[i2];
                        try {
                            spannableStringBuilder.append(charSequence);
                        } catch (RuntimeException e2) {
                            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "concat", 1086, "Utils.java")).G("Failed to append %s after: %s", charSequence, spannableStringBuilder);
                        }
                    }
                    try {
                        return new SpannedString(spannableStringBuilder);
                    } catch (RuntimeException e3) {
                        ((ltd) ((ltd) ((ltd) a.c()).i(e3)).k("com/google/android/libraries/inputmethod/utils/Utils", "concat", (char) 1093, "Utils.java")).t("Failed to build a valid SpannedString");
                        return P(charSequenceArr);
                    }
                }
            }
            return P(charSequenceArr);
        }
        return TextUtils.concat(charSequenceArr);
    }

    public static CharSequence q(CharSequence charSequence) {
        Parcel parcel;
        try {
            parcel = Parcel.obtain();
            try {
                TextUtils.writeToParcel(charSequence, parcel, 0);
                parcel.setDataPosition(0);
                CharSequence charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                if (parcel != null) {
                    parcel.recycle();
                }
                return charSequence2;
            } catch (Throwable th) {
                th = th;
                if (parcel != null) {
                    parcel.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            parcel = null;
        }
    }

    public static Class r(ClassLoader classLoader, String str) {
        for (String str2 : T(str)) {
            Class Q = Q(classLoader, str2);
            if (Q != null) {
                return Q;
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/utils/Utils", "getClassForName", 754, "Utils.java")).w("Class %s cannot be instantiated", str);
        return null;
    }

    public static Object s(Method method, Object obj, Object obj2, Object... objArr) {
        if (method == null) {
            return obj2;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "invoke", 709, "Utils.java")).w("Failed to invoke method: %s", method);
            return obj2;
        }
    }

    public static Object t(Class cls, String str, boolean z, Object obj, Object[] objArr, Class... clsArr) {
        try {
            try {
                return cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Utils", "invoke", 660, "Utils.java")).w("Failed to invoke method: %s", str);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            if (z) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e3)).k("com/google/android/libraries/inputmethod/utils/Utils", "invoke", 652, "Utils.java")).G("No method named %s found in %s", str, cls);
            }
            return null;
        }
    }

    public static Object u(ClassLoader classLoader, Class cls, String str, Object... objArr) {
        return v(classLoader, cls, str, d, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
        r12 = r12.getConstructor(r16.getParameterTypes());
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object v(java.lang.ClassLoader r20, java.lang.Class r21, java.lang.String r22, java.lang.Class[] r23, java.lang.Object... r24) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbt.v(java.lang.ClassLoader, java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }

    public static String w(Context context, String str) {
        return String.valueOf(context.getPackageName()).concat(str);
    }

    public static String x(Context context, int i) {
        return y(context.getResources(), i);
    }

    public static String y(Resources resources, int i) {
        String string = resources.getString(i);
        if (!string.startsWith("ro.")) {
            return S(string);
        }
        SparseArray sparseArray = f;
        synchronized (sparseArray) {
            if (sparseArray.indexOfKey(i) >= 0) {
                return (String) sparseArray.get(i);
            }
            String S = S(string);
            sparseArray.put(i, S);
            return S;
        }
    }

    public static void z(Context context, Menu menu) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        int k = theme.resolveAttribute(16843825, typedValue, true) ? k(theme, typedValue.resourceId, 16842806) : 0;
        if (k != 0) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                Drawable icon = menu.getItem(i).getIcon();
                if (icon != null) {
                    icon.mutate().setColorFilter(k, PorterDuff.Mode.SRC_IN);
                }
            }
        }
    }
}
