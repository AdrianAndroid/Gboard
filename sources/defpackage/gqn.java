package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gqn  reason: default package */
/* loaded from: classes.dex */
public final class gqn {
    public static gqe a(String str, boolean z) {
        gqe a = gqh.a();
        a.i(str);
        a.f(R.drawable.f50010_resource_name_obfuscated_res_0x7f080323);
        a.d(R.string.f149440_resource_name_obfuscated_res_0x7f140116);
        a.b("layout", Integer.valueOf(true != z ? R.layout.f145220_resource_name_obfuscated_res_0x7f0e0534 : R.layout.f145390_resource_name_obfuscated_res_0x7f0e0545));
        a.b("closeAction", true);
        return a;
    }

    public static gqh b(String str, iay iayVar, boolean z) {
        gqe a = a(str, z);
        a.h(iayVar);
        return a.a();
    }

    public static String c(String str) {
        return "close_" + str + "_menu";
    }

    public static String d(Context context, String str) {
        return context.getFileStreamPath(str).toString();
    }

    public static String e(Context context, String str) {
        if (str == null) {
            return null;
        }
        Log.i("HWRUtil", "maybeMakeFilename: ".concat(str));
        if (str.startsWith("assets://")) {
            String substring = str.substring(9);
            if (substring.endsWith(".zip")) {
                substring = substring.substring(0, substring.length() - 4);
            }
            return d(context, substring);
        } else if (!str.startsWith("http:") && !str.startsWith("https:")) {
            return str.contains("/") ? str : d(context, str);
        } else {
            Uri parse = Uri.parse(str);
            Log.i("HWRUtil", "uri: ".concat(String.valueOf(String.valueOf(parse))));
            String lastPathSegment = parse.getLastPathSegment();
            if (lastPathSegment.endsWith(".zip")) {
                lastPathSegment = lastPathSegment.substring(0, lastPathSegment.length() - 4);
            }
            return d(context, lastPathSegment);
        }
    }

    public static mix f(Class cls, gnk gnkVar) {
        return new dus(cls, gnkVar, 3);
    }

    public static Runnable g(Class cls, gnm gnmVar) {
        return new fso(cls, gnmVar, 17);
    }

    public static int h(int i) {
        if (i != 16) {
            if (i == 17) {
                return 18;
            }
            if (i == 22) {
                return 23;
            }
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    return 13;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    return 14;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    return 15;
                default:
                    switch (i) {
                        case 26:
                            return 27;
                        case 27:
                            return 28;
                        case 28:
                            return 29;
                        case 29:
                            return 30;
                        case 30:
                            return 31;
                        default:
                            return 0;
                    }
            }
        }
        return 17;
    }

    public static int i(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? "PERSONALIZED_TRAINING_OPTIONS" : "FEDERATED_TRAINING_OPTIONS";
    }
}
