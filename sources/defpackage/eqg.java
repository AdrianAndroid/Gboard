package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;

/* compiled from: PG */
/* renamed from: eqg  reason: default package */
/* loaded from: classes.dex */
public final class eqg {
    public final String a;

    public eqg(String str) {
        this.a = str;
    }

    public static eqg a(Context context) {
        eqg d;
        String str;
        ino M = ino.M(context);
        String y = M.y(R.string.f162180_resource_name_obfuscated_res_0x7f1406fb);
        if (!TextUtils.isEmpty(y)) {
            if (TextUtils.isEmpty(M.y(R.string.f161570_resource_name_obfuscated_res_0x7f1406be))) {
                String string = context.getString(R.string.f159880_resource_name_obfuscated_res_0x7f140611);
                String string2 = context.getString(R.string.f159890_resource_name_obfuscated_res_0x7f140612);
                if (y.equals(string) || y.equals(string2)) {
                    str = d(context).a;
                } else {
                    str = f(context).a;
                }
                M.u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, str);
                M.v(R.string.f162180_resource_name_obfuscated_res_0x7f1406fb);
            } else {
                M.v(R.string.f162180_resource_name_obfuscated_res_0x7f1406fb);
            }
        }
        ino M2 = ino.M(context);
        String y2 = M2.y(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
        if ("assets:theme_package_metadata_android_light.binarypb".equals(y2)) {
            M2.u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, context.getString(R.string.f160040_resource_name_obfuscated_res_0x7f140621));
        } else if ("assets:theme_package_metadata_android_dark.binarypb".equals(y2)) {
            M2.u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, context.getString(R.string.f160030_resource_name_obfuscated_res_0x7f140620));
        }
        String y3 = ino.M(context).y(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
        if (TextUtils.isEmpty(y3)) {
            d = null;
        } else if (y3.equals(context.getString(R.string.f160110_resource_name_obfuscated_res_0x7f140628))) {
            d = e(context);
        } else if (y3.equals(context.getString(R.string.f160130_resource_name_obfuscated_res_0x7f14062a))) {
            d = f(context);
        } else {
            d = y3.equals(context.getString(R.string.f160120_resource_name_obfuscated_res_0x7f140629)) ? d(context) : new eqg(y3);
        }
        return d != null ? d : b(context);
    }

    public static eqg b(Context context) {
        eqg k;
        if (g(context)) {
            k = j(context);
        } else {
            k = k(context);
        }
        if (k != null) {
            return k;
        }
        if (!itb.j() || !((Boolean) itb.h.a).booleanValue()) {
            return e(context);
        }
        return c(context);
    }

    public static eqg c(Context context) {
        return new eqg(context.getString(R.string.f160020_resource_name_obfuscated_res_0x7f14061f));
    }

    public static eqg d(Context context) {
        eqg j = j(context);
        if (j != null) {
            return j;
        }
        if (itb.l()) {
            return new eqg(context.getString(R.string.f160070_resource_name_obfuscated_res_0x7f140624));
        }
        return new eqg(context.getString(R.string.f160030_resource_name_obfuscated_res_0x7f140620));
    }

    public static eqg e(Context context) {
        if (g(context)) {
            return d(context);
        }
        return f(context);
    }

    public static eqg f(Context context) {
        eqg k = k(context);
        if (k != null) {
            return k;
        }
        if (itb.l()) {
            return new eqg(context.getString(R.string.f160080_resource_name_obfuscated_res_0x7f140625));
        }
        return new eqg(context.getString(R.string.f160040_resource_name_obfuscated_res_0x7f140621));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(Context context) {
        boolean f = isr.f(context);
        hsk b = hsx.b();
        return f || (b != null && b.by());
    }

    public static int i(Context context) {
        if (!g(context)) {
            return jdg.h() ? 2 : 3;
        }
        return 1;
    }

    private static eqg j(Context context) {
        File a = isw.a(isw.b(context), jbt.x(context, R.string.f175050_resource_name_obfuscated_res_0x7f140c47));
        eqg a2 = a == null ? null : erj.a(a.getName());
        if (a2 != null) {
            return a2;
        }
        int b = itb.b(context);
        if (b == 0) {
            return new eqg(context.getString(R.string.f160050_resource_name_obfuscated_res_0x7f140622));
        }
        if (b == 2) {
            return new eqg(context.getString(R.string.f160060_resource_name_obfuscated_res_0x7f140623));
        }
        if (b != 3 && b != 4) {
            return null;
        }
        return new eqg(context.getString(R.string.f160090_resource_name_obfuscated_res_0x7f140626));
    }

    private static eqg k(Context context) {
        File a = isw.a(isw.b(context), jbt.x(context, R.string.f175110_resource_name_obfuscated_res_0x7f140c4d));
        eqg a2 = a == null ? null : erj.a(a.getName());
        if (a2 == null) {
            if (jdg.h()) {
                switch (jdg.g(context)) {
                    case -15957849:
                    case -14107177:
                        return new eqg(context.getString(R.string.f159910_resource_name_obfuscated_res_0x7f140614));
                    case -15007797:
                    case -14449539:
                        return new eqg(context.getString(R.string.f160010_resource_name_obfuscated_res_0x7f14061e));
                    case -14973125:
                    case -8076920:
                        return new eqg(context.getString(R.string.f159960_resource_name_obfuscated_res_0x7f140619));
                    case -14671840:
                    case -2629914:
                        return new eqg(context.getString(R.string.f159900_resource_name_obfuscated_res_0x7f140613));
                    case -12722945:
                    case -12366248:
                        return new eqg(context.getString(R.string.f159920_resource_name_obfuscated_res_0x7f140615));
                    case -12099190:
                    case -6705972:
                        return new eqg(context.getString(R.string.f159920_resource_name_obfuscated_res_0x7f140615));
                    case -9282817:
                    case -4871684:
                        return new eqg(context.getString(R.string.f159950_resource_name_obfuscated_res_0x7f140618));
                    case -8825528:
                    case -3625836:
                        return new eqg(context.getString(R.string.f160000_resource_name_obfuscated_res_0x7f14061d));
                    case -6275329:
                    case -4359937:
                        return new eqg(context.getString(R.string.f159950_resource_name_obfuscated_res_0x7f140618));
                    case -5283760:
                    case -3955038:
                        return new eqg(context.getString(R.string.f159930_resource_name_obfuscated_res_0x7f140616));
                    case -4188568:
                    case -18727:
                        return new eqg(context.getString(R.string.f159980_resource_name_obfuscated_res_0x7f14061b));
                    case -3920695:
                    case -1668371:
                        return new eqg(context.getString(R.string.f159980_resource_name_obfuscated_res_0x7f14061b));
                    case -3649243:
                    case -942723:
                        return new eqg(context.getString(R.string.f160000_resource_name_obfuscated_res_0x7f14061d));
                    default:
                        return null;
                }
            }
            int b = itb.b(context);
            if (b == 0) {
                return new eqg(context.getString(R.string.f160050_resource_name_obfuscated_res_0x7f140622));
            }
            if (b == 2) {
                return new eqg(context.getString(R.string.f160060_resource_name_obfuscated_res_0x7f140623));
            }
            if (b == 3) {
                return new eqg(context.getString(R.string.f160100_resource_name_obfuscated_res_0x7f140627));
            }
            if (b == 4) {
                return new eqg(context.getString(R.string.f160090_resource_name_obfuscated_res_0x7f140626));
            }
            return null;
        }
        return a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((eqg) obj).a);
        }
        return false;
    }

    public final boolean h(Context context) {
        return this.a.equals(context.getString(R.string.f160020_resource_name_obfuscated_res_0x7f14061f));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "KeyboardThemeSpec{themeName='" + str + "'}";
    }
}
