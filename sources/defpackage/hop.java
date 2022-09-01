package defpackage;

/* compiled from: PG */
/* renamed from: hop  reason: default package */
/* loaded from: classes.dex */
public final class hop {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionUtils");

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r1.contains("com.android.server.accessibility.MagnificationController") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (android.provider.Settings.Secure.getInt(r10.getContentResolver(), "accessibility_display_magnification_enabled", -1) != 1) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: RuntimeException -> 0x0061, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0061, blocks: (B:14:0x004e, B:16:0x005a), top: B:13:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r10) {
        /*
            java.lang.String r0 = "com.android.server.accessibility.MagnificationController"
            android.content.ContentResolver r1 = r10.getContentResolver()
            r2 = 1
            java.lang.String r3 = "accessibility_display_magnification_enabled"
            r4 = -1
            int r1 = android.provider.Settings.Secure.getInt(r1, r3, r4)     // Catch: java.lang.RuntimeException -> L11
            if (r1 == r2) goto L60
            goto L26
        L11:
            r1 = move-exception
            r9 = r1
            ltg r1 = defpackage.hop.a
            ltv r3 = r1.d()
            java.lang.String r4 = "Failed to get a11y display magnification enabled"
            java.lang.String r5 = "com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionUtils"
            java.lang.String r6 = "isTripleTapToMagnifyEnabled"
            r7 = 89
            java.lang.String r8 = "InlineSuggestionUtils.java"
            defpackage.f.h(r3, r4, r5, r6, r7, r8, r9)
        L26:
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.lang.RuntimeException -> L39
            java.lang.String r3 = "accessibility_button_targets"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r3)     // Catch: java.lang.RuntimeException -> L39
            if (r1 == 0) goto L4e
            boolean r1 = r1.contains(r0)     // Catch: java.lang.RuntimeException -> L39
            if (r1 != 0) goto L60
            goto L4e
        L39:
            r1 = move-exception
            r9 = r1
            ltg r1 = defpackage.hop.a
            ltv r3 = r1.d()
            java.lang.String r4 = "Failed to get a11y button magnification enabled"
            java.lang.String r5 = "com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionUtils"
            java.lang.String r6 = "isA11yButtonToMagnifyEnabled"
            r7 = 103(0x67, float:1.44E-43)
            java.lang.String r8 = "InlineSuggestionUtils.java"
            defpackage.f.h(r3, r4, r5, r6, r7, r8, r9)
        L4e:
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r1 = "accessibility_shortcut_target_service"
            java.lang.String r10 = android.provider.Settings.Secure.getString(r10, r1)     // Catch: java.lang.RuntimeException -> L61
            if (r10 == 0) goto L76
            boolean r10 = r10.contains(r0)     // Catch: java.lang.RuntimeException -> L61
            if (r10 == 0) goto L76
        L60:
            return r2
        L61:
            r10 = move-exception
            r6 = r10
            ltg r10 = defpackage.hop.a
            ltv r0 = r10.d()
            java.lang.String r1 = "Failed to get a11y shortcut magnification enabled"
            java.lang.String r2 = "com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionUtils"
            java.lang.String r3 = "isA11yShortcutToMagnifyEnabled"
            r4 = 118(0x76, float:1.65E-43)
            java.lang.String r5 = "InlineSuggestionUtils.java"
            defpackage.f.h(r0, r1, r2, r3, r4, r5, r6)
        L76:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hop.a(android.content.Context):boolean");
    }
}
