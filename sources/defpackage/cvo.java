package defpackage;

import android.net.Uri;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cvo  reason: default package */
/* loaded from: classes.dex */
public final class cvo {
    static final hhl a = hhq.h("bitmoji_experiment_tag", "");

    public static Uri.Builder a() {
        Uri.Builder authority = new Uri.Builder().scheme("content").authority("com.bitstrips.imoji.provider");
        String str = (String) a.c();
        if (!str.isEmpty()) {
            authority.appendQueryParameter("meta_group_id", str);
        }
        return authority;
    }

    public static Uri b(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (((Boolean) cwz.b.c()).booleanValue()) {
            buildUpon.appendQueryParameter("image_format", "webp").appendQueryParameter("size", "normal");
        } else if (((Boolean) cwz.c.c()).booleanValue()) {
            buildUpon.appendQueryParameter("image_format", "png").appendQueryParameter("size", "normal");
        }
        String str2 = (String) a.c();
        if (!str2.isEmpty()) {
            buildUpon.appendQueryParameter("meta_group_id", str2);
        }
        return buildUpon.build();
    }

    public static Uri c(Locale locale) {
        Uri.Builder appendPath = a().appendPath("packs");
        if (locale != null) {
            appendPath.appendQueryParameter("locale", e(locale));
        }
        return appendPath.build();
    }

    public static Object d(Uri uri) {
        if (uri.getQueryParameter("meta_group_id") == null) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("meta_group_id")) {
                for (String str2 : uri.getQueryParameters(str)) {
                    clearQuery.appendQueryParameter(str, str2);
                }
            }
        }
        return clearQuery.build();
    }

    public static String e(Locale locale) {
        return new Locale(locale.getLanguage(), locale.getCountry()).toLanguageTag();
    }
}
