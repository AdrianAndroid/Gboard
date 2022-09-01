package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* renamed from: ekn  reason: default package */
/* loaded from: classes.dex */
public final class ekn {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/search/utils/RecentQueries");
    public final String a;
    public final krm b;
    private final ino d;

    public ekn(Context context, String str, Locale locale, int i) {
        String str2 = null;
        ino K = ino.K(context, null);
        this.d = K;
        String format = TextUtils.isEmpty(str) ? null : String.format(str, locale);
        this.a = format;
        ArrayList arrayList = new ArrayList();
        str2 = !TextUtils.isEmpty(format) ? K.d(format, "") : str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add((String) jSONArray.get(i2));
                }
            } catch (JSONException e) {
                ((ltd) ((ltd) c.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/search/utils/RecentQueries", "<init>", 71, "RecentQueries.java")).G("Preference %s is not a valid JSON array:\n%s", this.a, str2);
            }
        }
        this.b = new krm(i, arrayList);
    }

    public final synchronized void a(String str) {
        if (!irs.d()) {
            return;
        }
        ((daw) this.b.b).put(str, true);
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        this.d.j(this.a, new JSONArray((Collection) this.b.a()).toString());
    }

    public final synchronized void b(String str) {
        if (((daw) this.b.b).remove(str) == null || TextUtils.isEmpty(this.a)) {
            return;
        }
        this.d.j(this.a, new JSONArray((Collection) this.b.a()).toString());
    }
}
