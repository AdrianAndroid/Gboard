package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.Random;

/* compiled from: PG */
/* renamed from: jmk  reason: default package */
/* loaded from: classes.dex */
public final class jmk {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();

    public static void a(String str) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", str);
        }
    }

    public static void b(String str, Object obj) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", k(str, obj));
        }
    }

    public static void c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", k(str, obj, obj2));
        }
    }

    public static void d(String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", k(str, objArr));
        }
    }

    public static void e(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            h(th, k(str, objArr));
        }
    }

    public static void f(String str, Object obj) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", k(str, obj));
        }
    }

    public static void g(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 5)) {
            String k = k(str, objArr);
            String valueOf = String.valueOf(th);
            Log.w("MDD", k + ": " + valueOf);
        }
    }

    public static void h(Throwable th, String str) {
        if (Log.isLoggable("MDD", 6)) {
            String valueOf = String.valueOf(th);
            Log.e("MDD", str + ": " + valueOf);
        }
    }

    public static boolean i() {
        return b.nextLong() % 10000 == 0;
    }

    public static void j(Object obj) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", k("%s %s", "MDDManager", obj));
        }
    }

    private static String k(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
