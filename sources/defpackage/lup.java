package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: lup  reason: default package */
/* loaded from: classes.dex */
public final class lup {
    public static final Locale a = Locale.ROOT;

    public static String a(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        return d(obj, simpleName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    public static String b(Object obj) {
        if (obj == 0) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String obj2 = obj.toString();
                obj = obj2 == null ? d(obj, "toString() returned null") : obj2;
            } else if (obj instanceof int[]) {
                obj = Arrays.toString((int[]) obj);
            } else if (obj instanceof long[]) {
                obj = Arrays.toString((long[]) obj);
            } else if (obj instanceof byte[]) {
                obj = Arrays.toString((byte[]) obj);
            } else if (obj instanceof char[]) {
                obj = Arrays.toString((char[]) obj);
            } else if (obj instanceof short[]) {
                obj = Arrays.toString((short[]) obj);
            } else if (obj instanceof float[]) {
                obj = Arrays.toString((float[]) obj);
            } else if (obj instanceof double[]) {
                obj = Arrays.toString((double[]) obj);
            } else if (obj instanceof boolean[]) {
                obj = Arrays.toString((boolean[]) obj);
            } else {
                obj = Arrays.toString((Object[]) obj);
            }
            return obj;
        } catch (RuntimeException e) {
            return a(obj, e);
        }
    }

    public static void c(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    private static String d(Object obj, String str) {
        return "{" + obj.getClass().getName() + "@" + System.identityHashCode(obj) + ": " + str + "}";
    }
}
