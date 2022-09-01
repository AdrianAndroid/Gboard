package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ffv  reason: default package */
/* loaded from: classes.dex */
public final class ffv {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/s3/S3ConnectionConfig");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(ffd ffdVar) {
        Collection collection = ffdVar.b;
        return (collection == null || collection.isEmpty()) ? "recognizer" : "multi-recognizer";
    }

    public static void b(String str) {
        if (str.contains("sky=")) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3ConnectionConfig", "checkProductionUri", 64, "S3ConnectionConfig.java")).w("Using a test server: [%s]. If you experience problems with voice input, please contact the last person to touch \"unified_ime.gcl\".", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c() {
        return ((Boolean) ffa.c.c()).booleanValue() ? 11 : 10;
    }
}
