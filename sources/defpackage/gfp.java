package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: gfp  reason: default package */
/* loaded from: classes.dex */
public final class gfp {
    static HashMap f;
    private static Object l;
    private static boolean m;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    static final HashMap g = new HashMap();
    static final HashMap h = new HashMap();
    public static final HashMap i = new HashMap();
    static final HashMap j = new HashMap();
    static final String[] k = new String[0];

    public static Object a(HashMap hashMap, String str, Object obj) {
        synchronized (gfp.class) {
            if (hashMap.containsKey(str)) {
                Object obj2 = hashMap.get(str);
                if (obj2 != null) {
                    obj = obj2;
                }
                return obj;
            }
            return null;
        }
    }

    public static Object b(ContentResolver contentResolver) {
        Object obj;
        synchronized (gfp.class) {
            e(contentResolver);
            obj = l;
        }
        return obj;
    }

    public static void c(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (gfp.class) {
            if (obj == l) {
                hashMap.put(str, obj2);
                f.remove(str);
            }
        }
    }

    public static String d(ContentResolver contentResolver, String str) {
        synchronized (gfp.class) {
            e(contentResolver);
            Object obj = l;
            String str2 = null;
            if (f.containsKey(str)) {
                String str3 = (String) f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            int length = k.length;
            Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    f(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                f(obj, str, string);
                if (string != null) {
                    str2 = string;
                }
                return str2;
            } finally {
                query.close();
            }
        }
    }

    private static void e(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap();
            l = new Object();
            m = false;
            contentResolver.registerContentObserver(a, true, new gfo());
        } else if (!e.getAndSet(false)) {
        } else {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            l = new Object();
            m = false;
        }
    }

    private static void f(Object obj, String str, String str2) {
        synchronized (gfp.class) {
            if (obj == l) {
                f.put(str, str2);
            }
        }
    }
}
