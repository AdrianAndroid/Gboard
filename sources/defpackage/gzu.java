package defpackage;

import android.util.Printer;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: gzu  reason: default package */
/* loaded from: classes.dex */
public final class gzu {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/dumpable/DumpableUtil");

    public static void a(Printer printer, String str, Object... objArr) {
        printer.println(String.format(Locale.US, str, objArr));
    }

    public static boolean b(Printer printer, Printer printer2, gzv gzvVar, boolean z) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        a(printer, "[%s #%x]", gzvVar.getDumpableTag(), Integer.valueOf(System.identityHashCode(gzvVar)));
        try {
            gzvVar.dump(printer2, z);
            z2 = true;
        } catch (Throwable th) {
            ((ltd) ((ltd) ((ltd) a.c()).i(th)).k("com/google/android/libraries/inputmethod/dumpable/DumpableUtil", "printDumpable", 38, "DumpableUtil.java")).w("Failed to dump %s", gzvVar.getDumpableTag());
            z2 = false;
        }
        a(printer, "[/%s #%x] This dump took %dms.\n", gzvVar.getDumpableTag(), Integer.valueOf(System.identityHashCode(gzvVar)), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return z2;
    }
}
