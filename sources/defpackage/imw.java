package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: imw  reason: default package */
/* loaded from: classes.dex */
public final class imw {
    private static final lug b = hin.a;
    public static final int[] a = {R.id.f67470_resource_name_obfuscated_res_0x7f0b0861, R.id.f67490_resource_name_obfuscated_res_0x7f0b0863, R.id.f67480_resource_name_obfuscated_res_0x7f0b0862, R.id.f67510_resource_name_obfuscated_res_0x7f0b0865, R.id.f67500_resource_name_obfuscated_res_0x7f0b0864};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1653751294:
                if (str.equals("fraction")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -891985903:
                if (str.equals("string")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3029738:
                if (str.equals("bool")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 93090393:
                if (str.equals("array")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1958052158:
                if (str.equals("integer")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return R.id.f67490_resource_name_obfuscated_res_0x7f0b0863;
            }
            if (c == 2) {
                return R.id.f67480_resource_name_obfuscated_res_0x7f0b0862;
            }
            if (c == 3) {
                return R.id.f67510_resource_name_obfuscated_res_0x7f0b0865;
            }
            if (c != 4) {
                throw new IllegalArgumentException("Illegal value type: ".concat(String.valueOf(str)));
            }
            return R.id.f67520_resource_name_obfuscated_res_0x7f0b0866;
        }
        return R.id.f67470_resource_name_obfuscated_res_0x7f0b0861;
    }

    public static final void b(imv imvVar, int i, int i2, int i3, int i4, Resources resources) {
        if (imvVar.f(i)) {
            resources.getString(i);
        } else if (i3 == R.id.f67500_resource_name_obfuscated_res_0x7f0b0864) {
            imvVar.c(i, jbt.d(resources, i2, i4));
        } else if (i3 == R.id.f67470_resource_name_obfuscated_res_0x7f0b0861) {
            imvVar.a(i, jbt.C(resources, i2, resources.getBoolean(i4)));
        } else if (i3 == R.id.f67490_resource_name_obfuscated_res_0x7f0b0863) {
            imvVar.c(i, jbt.d(resources, i2, resources.getInteger(i4)));
        } else if (i3 == R.id.f67480_resource_name_obfuscated_res_0x7f0b0862) {
            imvVar.b(i, jbt.b(resources, i2, resources.getFraction(i4, 1, 1)));
        } else if (i3 == R.id.f67510_resource_name_obfuscated_res_0x7f0b0865) {
            String y = jbt.y(resources, i2);
            if (y == null) {
                y = resources.getString(i4);
            }
            imvVar.d(i, y);
        } else {
            ((luc) ((luc) b.c()).k("com/google/android/libraries/inputmethod/preferences/DefaultPreferenceValueParser", "putValueFromSystemProperty", 210, "DefaultPreferenceValueParser.java")).w("Unsupported preference value type from system property: %s", resources.getResourceTypeName(i4));
        }
    }

    public static final void c(imv imvVar, int i, int i2, int i3, Resources resources) {
        if (imvVar.f(i)) {
            return;
        }
        if (i2 == R.id.f67500_resource_name_obfuscated_res_0x7f0b0864) {
            imvVar.c(i, i3);
            return;
        }
        String resourceTypeName = resources.getResourceTypeName(i3);
        if (!"array".equals(resourceTypeName) || i2 != R.id.f67520_resource_name_obfuscated_res_0x7f0b0866) {
            if (!"array".equals(resourceTypeName)) {
                if (i2 == R.id.f67470_resource_name_obfuscated_res_0x7f0b0861) {
                    imvVar.a(i, resources.getBoolean(i3));
                    return;
                } else if (i2 == R.id.f67490_resource_name_obfuscated_res_0x7f0b0863) {
                    imvVar.c(i, resources.getInteger(i3));
                    return;
                } else if (i2 == R.id.f67480_resource_name_obfuscated_res_0x7f0b0862) {
                    imvVar.b(i, resources.getFraction(i3, 1, 1));
                    return;
                } else if (i2 == R.id.f67510_resource_name_obfuscated_res_0x7f0b0865) {
                    imvVar.d(i, resources.getString(i3));
                    return;
                } else {
                    ((luc) ((luc) b.c()).k("com/google/android/libraries/inputmethod/preferences/DefaultPreferenceValueParser", "writeValue", 275, "DefaultPreferenceValueParser.java")).w("Unsupported preference value type: %s", resourceTypeName);
                    return;
                }
            }
            String g = jbi.g(resources, i3, null);
            if (TextUtils.isEmpty(g)) {
                return;
            }
            if (i2 == R.id.f67470_resource_name_obfuscated_res_0x7f0b0861) {
                imvVar.a(i, Boolean.parseBoolean(g));
                return;
            } else if (i2 == R.id.f67490_resource_name_obfuscated_res_0x7f0b0863) {
                imvVar.c(i, Integer.parseInt(g));
                return;
            } else if (i2 == R.id.f67480_resource_name_obfuscated_res_0x7f0b0862) {
                imvVar.b(i, Float.parseFloat(g));
                return;
            } else if (i2 == R.id.f67510_resource_name_obfuscated_res_0x7f0b0865) {
                imvVar.d(i, g);
                return;
            } else if (i2 == R.id.f67520_resource_name_obfuscated_res_0x7f0b0866) {
                imvVar.e(i, lmz.r(g));
                return;
            } else {
                throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(resources.getResourceName(i2))));
            }
        }
        imvVar.e(i, lmz.q(resources.getStringArray(i3)));
    }
}
