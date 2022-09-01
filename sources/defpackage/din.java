package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: din  reason: default package */
/* loaded from: classes.dex */
public final class din {
    private static final lug c = lug.i("HmmDataInfo");
    public final int a;
    public final int b;

    public din(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r4.equals("APK") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.din a(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 != 0) goto L99
            java.lang.String r0 = ","
            lfy r0 = defpackage.lfy.e(r0)
            java.util.List r0 = r0.k(r8)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L99
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L99
            r2 = 0
            java.lang.Object r4 = r0.get(r2)     // Catch: java.lang.IllegalArgumentException -> L77
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalArgumentException -> L77
            int r5 = r4.hashCode()     // Catch: java.lang.IllegalArgumentException -> L77
            r6 = -2084521848(0xffffffff83c0b888, float:-1.1327112E-36)
            r7 = 2
            if (r5 == r6) goto L4d
            r6 = 65020(0xfdfc, float:9.1112E-41)
            if (r5 == r6) goto L44
            r2 = 78135(0x13137, float:1.0949E-40)
            if (r5 == r2) goto L3a
            goto L57
        L3a:
            java.lang.String r2 = "OEM"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L57
            r2 = 1
            goto L58
        L44:
            java.lang.String r5 = "APK"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L57
            goto L58
        L4d:
            java.lang.String r2 = "DOWNLOAD"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L57
            r2 = 2
            goto L58
        L57:
            r2 = -1
        L58:
            if (r2 == 0) goto L66
            if (r2 == r3) goto L67
            if (r2 != r7) goto L60
            r7 = 3
            goto L67
        L60:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L77
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> L77
            throw r0     // Catch: java.lang.IllegalArgumentException -> L77
        L66:
            r7 = 1
        L67:
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.IllegalArgumentException -> L77
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.IllegalArgumentException -> L77
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.IllegalArgumentException -> L77
            din r2 = new din     // Catch: java.lang.IllegalArgumentException -> L77
            r2.<init>(r7, r0)     // Catch: java.lang.IllegalArgumentException -> L77
            return r2
        L77:
            r0 = move-exception
            lug r2 = defpackage.din.c
            ltv r2 = r2.c()
            luc r2 = (defpackage.luc) r2
            ltv r0 = r2.i(r0)
            luc r0 = (defpackage.luc) r0
            r2 = 45
            java.lang.String r3 = "DataInfo.java"
            java.lang.String r4 = "com/google/android/apps/inputmethod/libs/hmm/DataInfo"
            java.lang.String r5 = "getDataInfoFromString"
            ltv r0 = r0.k(r4, r5, r2, r3)
            luc r0 = (defpackage.luc) r0
            java.lang.String r2 = "Failed to get data info from: %s"
            r0.w(r2, r8)
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.din.a(java.lang.String):din");
    }

    public static String b(String str) {
        return "hmm_data_dic_info_".concat(String.valueOf(str.toLowerCase(Locale.US)));
    }
}
