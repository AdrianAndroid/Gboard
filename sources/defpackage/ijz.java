package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.provider.UserDictionary;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ijz  reason: default package */
/* loaded from: classes.dex */
public final class ijz {
    public static final lug a = hin.a;
    private static final String[] b = {"word", "shortcut", "locale"};

    public static ijy a(Context context, jav javVar) {
        Cursor query;
        if (javVar.equals(jav.d)) {
            query = context.getContentResolver().query(UserDictionary.Words.CONTENT_URI, b, "locale IS NULL OR locale = ''", null, "word");
        } else {
            Locale c = ikb.c(javVar);
            String locale = c == null ? null : c.toString();
            if (locale == null) {
                return null;
            }
            query = context.getContentResolver().query(UserDictionary.Words.CONTENT_URI, b, "locale = ?", new String[]{locale}, "word");
        }
        if (query == null) {
            return null;
        }
        return new ijy(query);
    }

    public static Set b(Context context) {
        HashSet hashSet = new HashSet();
        Cursor query = context.getContentResolver().query(UserDictionary.Words.CONTENT_URI, new String[]{"locale"}, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    jav a2 = ikb.a(query.getString(0));
                    if (a2 != null) {
                        hashSet.add(a2);
                    }
                } catch (Throwable th) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            query.close();
            return hashSet;
        }
        return hashSet;
    }

    public static void c(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            context.getContentResolver().delete(UserDictionary.Words.CONTENT_URI, "word=? AND (shortcut is null OR shortcut='')", new String[]{str});
        } else {
            context.getContentResolver().delete(UserDictionary.Words.CONTENT_URI, "word=? AND shortcut=?", new String[]{str, str2});
        }
    }

    public static void d(Context context, ika ikaVar, String str, String str2) {
        c(context, ikaVar.b, ikaVar.c);
        c(context, str, "");
        if (!TextUtils.isEmpty(str2)) {
            c(context, str, str2);
        }
        Locale c = ikb.c(ikaVar.d);
        if (true == Locale.ROOT.equals(c)) {
            c = null;
        }
        UserDictionary.Words.addWord(context, str, 250, str2, c);
    }
}
