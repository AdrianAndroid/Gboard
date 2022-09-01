package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: ihl  reason: default package */
/* loaded from: classes.dex */
public final class ihl {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/nativelib/LibraryModuleRegistry");

    public static final void a(String[] strArr, qo qoVar) {
        for (String str : strArr) {
            String str2 = (String) qoVar.put(str, "integrated_shared_object");
            if ("integrated_shared_object".equals(str2)) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/nativelib/LibraryModuleRegistry", "register", 45, "LibraryModuleRegistry.java")).G("Module %s has already been registered to %s", str, "integrated_shared_object");
            } else if (str2 != null) {
                throw new IllegalArgumentException(String.format(Locale.US, "Module %s is registered to different libraries: %s, %s", str, str2, "integrated_shared_object"));
            }
        }
    }
}
