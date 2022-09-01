package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jbc  reason: default package */
/* loaded from: classes.dex */
public final class jbc {
    private static final llw b = llw.m("image/webp.wasticker", "wasticker_webp", "video/x.looping_mp4", "looping_mp4");
    private static final llw c = llw.m("wasticker_webp", "image/webp.wasticker", "looping_mp4", "video/x.looping_mp4");
    public static final Pattern a = Pattern.compile("([^;\\s]+)/([^;\\s]+)");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Bitmap.CompressFormat a(Iterable iterable) {
        Bitmap.CompressFormat compressFormat;
        char c2;
        Iterator it = iterable.iterator();
        do {
            compressFormat = null;
            if (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    String lowerCase = str.toLowerCase(Locale.US);
                    switch (lowerCase.hashCode()) {
                        case -1487394660:
                            if (lowerCase.equals("image/jpeg")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1487018032:
                            if (lowerCase.equals("image/webp")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -879258763:
                            if (lowerCase.equals("image/png")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -354198891:
                            if (lowerCase.equals("image/webp.wasticker")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1911932022:
                            if (lowerCase.equals("image/*")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0 || c2 == 1) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                        continue;
                    } else if (c2 == 2) {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                        continue;
                    } else if (c2 == 3 || c2 == 4) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                        continue;
                    }
                }
            }
            return compressFormat;
        } while (compressFormat == null);
        return compressFormat;
    }

    public static String b(Uri uri) {
        return (uri == null || Uri.EMPTY.equals(uri)) ? "" : MimeTypeMap.getFileExtensionFromUrl(uri.toString().toLowerCase(Locale.US)).toLowerCase(Locale.US);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.toLowerCase(Locale.US);
        String str2 = (String) b.get(lowerCase);
        return !TextUtils.isEmpty(str2) ? str2 : lfd.d(MimeTypeMap.getSingleton().getExtensionFromMimeType(lowerCase));
    }

    public static String d(Bitmap.CompressFormat compressFormat) {
        if (compressFormat == null) {
            return "";
        }
        int i = jba.a[compressFormat.ordinal()];
        if (i == 1) {
            return "image/png";
        }
        if (i == 2) {
            return "image/jpeg";
        }
        if (i == 3) {
            return "image/webp";
        }
        if (Build.VERSION.SDK_INT >= 30 && (compressFormat == Bitmap.CompressFormat.WEBP_LOSSLESS || compressFormat == Bitmap.CompressFormat.WEBP_LOSSY)) {
            return "image/webp";
        }
        throw new AssertionError();
    }

    public static String e(Uri uri) {
        return h(b(uri));
    }

    public static String f(File file) {
        return file == null ? "" : h(lwm.g(file.getName()).toLowerCase(Locale.US));
    }

    public static boolean g(String str, Iterable iterable) {
        jbb a2 = jbb.a(str);
        if (a2 == null) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jbb a3 = jbb.a((String) it.next());
            if (a3 != null && (a3.a.equals("*") || a3.a.equals(a2.a))) {
                if (a3.b.equals("*") || a3.b.equals(a2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = (String) c.get(str);
        return !TextUtils.isEmpty(str2) ? str2 : lfd.d(MimeTypeMap.getSingleton().getMimeTypeFromExtension(str));
    }
}
