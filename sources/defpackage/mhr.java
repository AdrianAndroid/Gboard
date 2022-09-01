package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: mhr  reason: default package */
/* loaded from: classes.dex */
public final class mhr {
    static {
        Pattern.compile("^/+");
        Pattern.compile("/+$");
        Pattern.compile("/{2,}");
        Pattern.compile("(.*[^/])/+$");
    }

    public static String a(String... strArr) {
        int length = strArr.length - 1;
        if (length != -1) {
            for (String str : strArr) {
                length += str.length();
            }
            char[] cArr = new char[length];
            int i = 0;
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (i > 0 && cArr[i - 1] != '/') {
                        cArr[i] = '/';
                        i++;
                    }
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt = str2.charAt(i2);
                        if (charAt == '/') {
                            if (i <= 0 || cArr[i - 1] != '/') {
                                charAt = '/';
                            }
                        }
                        cArr[i] = charAt;
                        i++;
                    }
                }
            }
            return new String(cArr, 0, i);
        }
        return "";
    }
}
