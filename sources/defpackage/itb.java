package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: itb  reason: default package */
/* loaded from: classes.dex */
public final class itb {
    public static final ita a;
    public static final ita h;
    public static final ita m;
    private static final llp q;
    private static final ltg p = ltg.j("com/google/android/libraries/inputmethod/theme/ThemeUtil");
    public static final hhl b = hhq.f("enable_key_border_by_default_new_user_timestamp", 1574150340000L);
    public static final hhl c = hhq.a("non_primary_carriage_return", false);
    public static final hhl d = hhq.a("keyboard_redesign_google_sans", r());
    public static final hhl e = hhq.a("keyboard_redesign_forbid_key_shadows", r());
    public static final hhl f = hhq.f("keyboard_redesign_subset_features_new_user_timestamp", 0);
    public static final hhl g = hhq.a("silk_theme", r());
    public static final hhl i = hhq.a("pill_shaped_key", r());
    public static final hhl j = hhq.f("pill_shaped_key_new_user_timestamp", 0);
    public static final hhl k = hhq.a("silk_popup", r());
    public static final hhl l = hhq.a("silk_key_press", r());
    public static final hhl n = hhq.a("ac_indicator_low_contrast", false);
    static final hhl o = hhq.a("themed_nav_bar_all_devices", false);

    static {
        ita itaVar = new ita(hhq.a("silk_on_all_devices", true));
        a = itaVar;
        ita itaVar2 = new ita(hhq.a("use_silk_theme_by_default", r()));
        h = itaVar2;
        ita itaVar3 = new ita(hhq.a("material3_theme", r()));
        m = itaVar3;
        q = llp.t(itaVar2, itaVar, itaVar3);
    }

    public static int a() {
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return 1;
        }
        String lowerCase = Build.MANUFACTURER != null ? Build.MANUFACTURER.toLowerCase(Locale.US) : "";
        return (!lowerCase.contains("google") && !"oneplus".equals(lowerCase) && !((Boolean) o.c()).booleanValue()) ? 1 : 2;
    }

    public static int b(Context context) {
        return jbt.c(context, R.string.f175120_resource_name_obfuscated_res_0x7f140c4e, -1);
    }

    public static int c(Context context, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i2});
        try {
            return obtainStyledAttributes.getColor(0, i3);
        } catch (RuntimeException unused) {
            return i3;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void d(StringBuilder sb, List list, boolean z) {
        list.add(Integer.valueOf((int) R.array.f1960_resource_name_obfuscated_res_0x7f030064));
        if (z) {
            sb.append("_border");
            list.add(Integer.valueOf((int) R.array.f1950_resource_name_obfuscated_res_0x7f030063));
        }
    }

    public static void e(Resources resources, int i2, Resources.Theme theme) {
        if (!"style".equals(resources.getResourceTypeName(i2))) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
            for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                try {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    resources.getResourceName(resourceId);
                    String resourceTypeName = resources.getResourceTypeName(resourceId);
                    if (!"style".equals(resourceTypeName)) {
                        ((ltd) ((ltd) p.c()).k("com/google/android/libraries/inputmethod/theme/ThemeUtil", "applyThemesFromThemeStyleArray", 345, "ThemeUtil.java")).E("Invalid theme value type: %s, at:%d", resourceTypeName, i3);
                    } else {
                        theme.applyStyle(resourceId, true);
                        resources.getResourceName(resourceId);
                    }
                } finally {
                    obtainTypedArray.recycle();
                }
            }
            return;
        }
        theme.applyStyle(i2, true);
        resources.getResourceName(i2);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, hhl] */
    public static void f() {
        llp llpVar = q;
        int i2 = ((lrl) llpVar).c;
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            ita itaVar = (ita) llpVar.get(i3);
            Object obj = itaVar.a;
            itaVar.a = itaVar.b.c();
            z |= !Objects.equals(itaVar.a, obj);
        }
        if (z) {
            ((ltd) ((ltd) p.b()).k("com/google/android/libraries/inputmethod/theme/ThemeUtil", "refreshCachedPhenotypeFlags", 229, "ThemeUtil.java")).t("Default theme may be changed.");
            isz.b();
        }
    }

    public static boolean g() {
        hhl hhlVar = b;
        long longValue = ((Long) hhlVar.c()).longValue();
        if (longValue < 0) {
            hhlVar.i();
            longValue = ((Long) hhlVar.c()).longValue();
            ieh.j().e(hhv.READ_TIMESTAMP_ERROR, 0);
        }
        return m(longValue);
    }

    public static boolean h(Context context) {
        ino M = ino.M(context);
        int b2 = b(context);
        boolean z = true;
        if (b2 != 0 && b2 != 2 && !g()) {
            z = false;
        }
        return M.x(R.string.f160900_resource_name_obfuscated_res_0x7f14067a, jbt.B(context, R.string.f175090_resource_name_obfuscated_res_0x7f140c4b, z));
    }

    public static boolean i(Context context) {
        String y = ino.M(context).y(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
        return TextUtils.isEmpty(y) || "system_auto:".equals(y) || "silk:".equals(y);
    }

    public static boolean j() {
        return r() && ((Boolean) g.c()).booleanValue();
    }

    public static boolean k() {
        return !m(((Long) f.c()).longValue()) || !((Boolean) e.c()).booleanValue();
    }

    public static boolean l() {
        return r() && ((Boolean) m.a).booleanValue();
    }

    public static boolean m(long j2) {
        return j2 <= 0 || gva.c() >= j2;
    }

    public static boolean n() {
        return ((Boolean) i.c()).booleanValue() && m(((Long) j.c()).longValue());
    }

    public static boolean o() {
        return jam.u() && j();
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 26 && ((Boolean) k.c()).booleanValue();
    }

    public static boolean q(Context context) {
        return !jam.r(context) && !gzq.e(context) && jam.b(context) >= 5.2f;
    }

    private static boolean r() {
        if (Build.VERSION.SDK_INT >= 31) {
            return jam.u() || ((Boolean) a.a).booleanValue();
        }
        return false;
    }
}
