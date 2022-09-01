package defpackage;

/* compiled from: PG */
/* renamed from: gvt  reason: default package */
/* loaded from: classes.dex */
public final class gvt {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/base/CloseableUtil");

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        try {
            autoCloseable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/inputmethod/base/CloseableUtil", "closeQuietly", (char) 23, "CloseableUtil.java")).t("Failed to close Closeable");
        }
    }
}
