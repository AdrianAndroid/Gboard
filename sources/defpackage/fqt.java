package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fqt  reason: default package */
/* loaded from: classes.dex */
public final class fqt {
    private static final qv a = new qv();
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            fpp b2 = fsj.b(context);
            return ((Context) b2.a).getPackageManager().getApplicationLabel(((Context) b2.a).getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.f149600_resource_name_obfuscated_res_0x7f140128);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i == 2) {
                return resources.getString(R.string.f149640_resource_name_obfuscated_res_0x7f14012c);
            }
            if (i == 3) {
                return resources.getString(R.string.f149540_resource_name_obfuscated_res_0x7f140122);
            }
            return resources.getString(17039370);
        }
        return resources.getString(R.string.f149570_resource_name_obfuscated_res_0x7f140125);
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i != 1) {
            if (i == 2) {
                if (fyb.x(context)) {
                    return resources.getString(R.string.f149680_resource_name_obfuscated_res_0x7f140130);
                }
                return resources.getString(R.string.f149650_resource_name_obfuscated_res_0x7f14012d, a2);
            } else if (i == 3) {
                return resources.getString(R.string.f149550_resource_name_obfuscated_res_0x7f140123, a2);
            } else {
                if (i == 5) {
                    return h(context, "common_google_play_services_invalid_account_text", a2);
                }
                if (i == 7) {
                    return h(context, "common_google_play_services_network_error_text", a2);
                }
                if (i == 9) {
                    return resources.getString(R.string.f149630_resource_name_obfuscated_res_0x7f14012b, a2);
                }
                if (i == 20) {
                    return h(context, "common_google_play_services_restricted_profile_text", a2);
                }
                switch (i) {
                    case 16:
                        return h(context, "common_google_play_services_api_unavailable_text", a2);
                    case 17:
                        return h(context, "common_google_play_services_sign_in_failed_text", a2);
                    case 18:
                        return resources.getString(R.string.f149670_resource_name_obfuscated_res_0x7f14012f, a2);
                    default:
                        return resources.getString(R.string.f149620_resource_name_obfuscated_res_0x7f14012a, a2);
                }
            }
        }
        return resources.getString(R.string.f149580_resource_name_obfuscated_res_0x7f140126, a2);
    }

    public static String f(Context context, int i) {
        String g;
        if (i == 6) {
            g = i(context, "common_google_play_services_resolution_required_title");
        } else {
            g = g(context, i);
        }
        return g == null ? context.getResources().getString(R.string.f149610_resource_name_obfuscated_res_0x7f140129) : g;
    }

    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.f149590_resource_name_obfuscated_res_0x7f140127);
            case 2:
                return resources.getString(R.string.f149660_resource_name_obfuscated_res_0x7f14012e);
            case 3:
                return resources.getString(R.string.f149560_resource_name_obfuscated_res_0x7f140124);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = i(context, str);
        if (i == null) {
            i = resources.getString(R.string.f149620_resource_name_obfuscated_res_0x7f14012a);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    private static String i(Context context, String str) {
        Resources resources;
        qv qvVar = a;
        synchronized (qvVar) {
            Configuration configuration = context.getResources().getConfiguration();
            Locale f = (Build.VERSION.SDK_INT >= 24 ? wu.d(wr.a(configuration)) : wu.b(configuration.locale)).f(0);
            if (!f.equals(b)) {
                qvVar.clear();
                b = f;
            }
            String str2 = (String) qvVar.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = fnn.c;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            }
            a.put(str, string);
            return string;
        }
    }

    public static String e(Context context, int i) {
        if (i == 6 || i == 19) {
            return h(context, "common_google_play_services_resolution_required_text", a(context));
        }
        return d(context, i);
    }
}
