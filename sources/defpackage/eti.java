package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: eti  reason: default package */
/* loaded from: classes.dex */
public final class eti {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/RecentThemeUtil");

    public static List a(Context context) {
        List list;
        String Q = ino.M(context).Q("recent_theme_spec_json_array");
        try {
            if (!TextUtils.isEmpty(Q)) {
                try {
                    ArrayList arrayList = new ArrayList();
                    StringReader stringReader = new StringReader(Q);
                    JsonReader jsonReader = new JsonReader(stringReader);
                    try {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            String str = "";
                            while (jsonReader.hasNext()) {
                                if ("additional_keyboard_theme".equals(jsonReader.nextName())) {
                                    str = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            if (!TextUtils.isEmpty(str) && !"DEFAULT_THEME_NAME".equals(str)) {
                                arrayList.add(eul.g(context, new eqg(str)));
                            }
                            jsonReader.endObject();
                        }
                        jsonReader.endArray();
                        list = arrayList;
                    } finally {
                        gvt.a(stringReader);
                    }
                } catch (RuntimeException e) {
                    throw new IOException(e);
                }
            } else {
                list = Collections.emptyList();
            }
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return list;
                }
                if (!d(context, (eul) list.get(size))) {
                    list.remove(size);
                }
            }
        } catch (IOException e2) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/theme/listing/RecentThemeUtil", "readRecentThemes", 'O', "RecentThemeUtil.java")).t("Failed to decode recent theme data");
            return Collections.emptyList();
        }
    }

    public static void b(Context context, eul eulVar) {
        ArrayList arrayList = new ArrayList(a(context));
        if (arrayList.remove(eulVar)) {
            c(context, arrayList);
        }
    }

    public static void c(Context context, List list) {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String k = ((eul) it.next()).k();
                if (k != null) {
                    jsonWriter.beginObject();
                    jsonWriter.name("additional_keyboard_theme");
                    jsonWriter.value(k);
                    jsonWriter.endObject();
                }
            }
            jsonWriter.endArray();
            jsonWriter.close();
            ino.M(context).j("recent_theme_spec_json_array", stringWriter.toString());
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/listing/RecentThemeUtil", "writeRecentThemes", 'g', "RecentThemeUtil.java")).t("Failed to encode recent theme data");
        }
    }

    public static boolean d(Context context, eul eulVar) {
        eui euiVar = eulVar.b;
        if (euiVar.f()) {
            String str = euiVar.b().a;
            String str2 = eulVar.b.a().a;
            return str.equals(str2) ? erj.l(context, str) : erj.l(context, str) && erj.l(context, str2);
        }
        return false;
    }
}
