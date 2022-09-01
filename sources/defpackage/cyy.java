package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: cyy  reason: default package */
/* loaded from: classes.dex */
public final class cyy {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/tenor/TenorRequestUtil");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cyx a(boolean z) {
        if (z) {
            cyx cyxVar = new cyx();
            cyxVar.d("key", (String) cyj.d.c());
            cyxVar.d("client_key", "gboard");
            return cyxVar;
        }
        cyx cyxVar2 = new cyx();
        cyxVar2.d("key", (String) cyj.g.c());
        return cyxVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
        if (d(r3) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.llw b() {
        /*
            java.util.Locale r0 = defpackage.hqp.e()
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r2 = r0.getCountry()
            java.lang.String r2 = c(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L38
            ltg r1 = defpackage.cyy.a
            hip r2 = defpackage.hip.a
            ltd r1 = r1.a(r2)
            r2 = 54
            java.lang.String r3 = "TenorRequestUtil.java"
            java.lang.String r4 = "com/google/android/apps/inputmethod/libs/expression/tenor/TenorRequestUtil"
            java.lang.String r5 = "getLocaleString"
            ltv r1 = r1.k(r4, r5, r2, r3)
            ltd r1 = (defpackage.ltd) r1
            java.lang.String r2 = "Locale %s is missing language"
            java.lang.String r0 = r0.toLanguageTag()
            r1.w(r2, r0)
            java.lang.String r1 = "en_US"
            goto L52
        L38:
            boolean r0 = d(r2)
            if (r0 == 0) goto L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
        L52:
            java.util.Locale r0 = defpackage.hqp.e()
            java.lang.String r0 = r0.getCountry()
            irp r2 = defpackage.irp.b()
            if (r2 == 0) goto L7a
            java.lang.String r3 = r2.a
            java.lang.String r3 = c(r3)
            boolean r4 = d(r3)
            if (r4 == 0) goto L6d
            goto L86
        L6d:
            java.lang.String r2 = r2.b
            java.lang.String r3 = c(r2)
            boolean r2 = d(r3)
            if (r2 == 0) goto L7a
            goto L86
        L7a:
            java.lang.String r3 = c(r0)
            boolean r0 = d(r3)
            if (r0 != 0) goto L86
            java.lang.String r3 = "ZZ"
        L86:
            java.lang.String r0 = "locale"
            java.lang.String r2 = "country"
            llw r0 = defpackage.llw.m(r0, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyy.b():llw");
    }

    private static String c(String str) {
        return str == null ? "" : str.trim().toUpperCase(Locale.US);
    }

    private static boolean d(String str) {
        return str.length() == 2 && leb.a.j(str);
    }
}
