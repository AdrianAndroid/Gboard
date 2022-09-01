package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: dds  reason: default package */
/* loaded from: classes.dex */
public final class dds {
    public static final ice[] a = {ice.HEADER, ice.BODY};
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/framework/keyboard/KeyboardViewUtil");

    public static float a(Context context) {
        Context applicationContext = context.getApplicationContext();
        float a2 = jbt.a(applicationContext, R.string.f175220_resource_name_obfuscated_res_0x7f140c58, 1.0f);
        float B = ino.M(applicationContext).B(applicationContext.getString(R.string.f161550_resource_name_obfuscated_res_0x7f1406bc), 1.0f);
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/framework/keyboard/KeyboardViewUtil", "getKeyboardHeightRatio", 159, "KeyboardViewUtil.java")).x("systemKeyboardHeightRatio:%f; userKeyboardHeightRatio:%f.", a2, B);
        return Math.max(0.5f, Math.min(2.0f, a2 * B));
    }

    public static int b(Context context, ice[] iceVarArr, int i) {
        return h(context, iceVarArr, 1, false, i);
    }

    public static int c(Context context, int i, boolean z) {
        return d(context, i, e(context), z);
    }

    public static int d(Context context, int i, int i2, boolean z) {
        int dimensionPixelSize;
        if (z) {
            dimensionPixelSize = jbt.e(context, R.attr.f2240_resource_name_obfuscated_res_0x7f04000f);
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f32290_resource_name_obfuscated_res_0x7f070071);
        }
        int i3 = (i - dimensionPixelSize) - i2;
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/framework/keyboard/KeyboardViewUtil", "calculateMaxKeyboardBodyHeight", 43, "KeyboardViewUtil.java")).L("leave %d height for app when screen height:%d, header height:%d and isFullscreenMode:%b, so the max keyboard body height is:%d", Integer.valueOf(dimensionPixelSize), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3));
        return i3;
    }

    public static int e(Context context) {
        return jbt.e(context, R.attr.f4910_resource_name_obfuscated_res_0x7f04011d) * context.getResources().getInteger(R.integer.f131600_resource_name_obfuscated_res_0x7f0c005b);
    }

    public static int f(Context context, ice[] iceVarArr) {
        return h(context, iceVarArr, context.getResources().getInteger(R.integer.f131600_resource_name_obfuscated_res_0x7f0c005b), false, 1);
    }

    public static int g(Context context, ice[] iceVarArr) {
        return h(context, iceVarArr, 1, true, 1);
    }

    private static int h(Context context, ice[] iceVarArr, int i, boolean z, int i2) {
        List asList = Arrays.asList(iceVarArr);
        int i3 = 0;
        int f = asList.contains(ice.HEADER) ? jbt.f(context, R.attr.f4910_resource_name_obfuscated_res_0x7f04011d, context.getResources().getDimensionPixelSize(R.dimen.f37200_resource_name_obfuscated_res_0x7f07032c)) : 0;
        if (asList.contains(ice.BODY)) {
            if (i2 == 3) {
                i3 = jbt.e(context, true != z ? R.attr.f3740_resource_name_obfuscated_res_0x7f0400a6 : R.attr.f3720_resource_name_obfuscated_res_0x7f0400a4);
            } else {
                i3 = jbt.e(context, true != z ? R.attr.f2300_resource_name_obfuscated_res_0x7f040015 : R.attr.f2290_resource_name_obfuscated_res_0x7f040014);
            }
        }
        return (int) Math.ceil((f * i) + (i3 * a(context)));
    }
}
