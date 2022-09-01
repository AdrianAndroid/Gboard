package defpackage;

import android.text.TextUtils;
import j$.nio.charset.StandardCharsets;
import java.lang.Character;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jbs  reason: default package */
/* loaded from: classes.dex */
public final class jbs {
    private static final lug a = hin.a;
    private static final lmz b = lmz.v(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B, Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
    private static final Pattern c = Pattern.compile("[0-9]+");
    private static final Pattern d = Pattern.compile("\\p{Punct}*");

    public static String a(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
            int length = digest.length;
            char[] cArr = new char[length + length];
            for (int i = 0; i < length; i++) {
                byte b2 = digest[i];
                int i2 = b2 & 15;
                int i3 = (b2 >> 4) & 15;
                int i4 = i + i;
                cArr[i4] = (char) (i3 < 10 ? i3 + 48 : i3 + 87);
                cArr[i4 + 1] = (char) (i2 < 10 ? i2 + 48 : i2 + 87);
            }
            return new String(cArr);
        } catch (NoSuchAlgorithmException e) {
            ((luc) ((luc) ((luc) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/StringUtil", "getMD5String", (char) 206, "StringUtil.java")).t("MD5 not supported");
            return str;
        }
    }

    public static String b(String str) {
        return str == null ? "null" : jdg.q("*", str.length());
    }

    public static String c(String str) {
        char[] s = s(str, 'A', 'Z', 32);
        return s != null ? new String(s) : str;
    }

    public static String d(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char charAt = str.charAt(0);
        if (k(charAt)) {
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charAt - ' ');
            f(charArray, 1, charArray.length - 1);
            return new String(charArray);
        }
        int length = str.length();
        for (int i = 1; i < length; i++) {
            if (o(str.charAt(i))) {
                char[] charArray2 = str.toCharArray();
                f(charArray2, i, length - i);
                return new String(charArray2);
            }
        }
        return str;
    }

    public static String e(String str) {
        char[] s = s(str, 'a', 'z', -32);
        return s != null ? new String(s) : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(char[] cArr, int i, int i2) {
        r(cArr, i, i2, 'A', 'Z', 32);
    }

    public static void g(char[] cArr, int i, int i2) {
        r(cArr, i, i2, 'a', 'z', -32);
    }

    public static boolean h(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) >= 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(int i) {
        return i >= 13312 && b.contains(Character.UnicodeBlock.of(i));
    }

    public static boolean j(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && charSequence.length() >= 2) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (Character.isLetter(charAt)) {
                    if (z) {
                        return true;
                    }
                    z2 = true;
                } else if (!Character.isDigit(charAt)) {
                    continue;
                } else if (z2) {
                    return true;
                } else {
                    z = true;
                }
            }
        }
        return false;
    }

    public static boolean k(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean l(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return d.matcher(charSequence).matches();
    }

    public static boolean m(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return c.matcher(charSequence).matches();
    }

    public static boolean n(String str) {
        int codePointAt;
        return str != null && str.length() == 2 && (codePointAt = str.codePointAt(0)) >= 1040384 && codePointAt <= 1044128;
    }

    public static boolean o(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static String p(String str) {
        if (!TextUtils.isEmpty(str)) {
            int codePointAt = str.codePointAt(0);
            if (Character.isUpperCase(codePointAt)) {
                return str;
            }
            StringBuilder appendCodePoint = new StringBuilder().appendCodePoint(Character.toUpperCase(codePointAt));
            appendCodePoint.append(str.substring(Character.charCount(codePointAt)));
            return appendCodePoint.toString();
        }
        return str;
    }

    public static String q(String str) {
        return str.substring(str.offsetByCodePoints(str.length(), -2));
    }

    private static void r(char[] cArr, int i, int i2, char c2, char c3, int i3) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                char c4 = cArr[i];
                if (c4 >= c2 && c4 <= c3) {
                    cArr[i] = (char) (c4 + i3);
                }
                i++;
            } else {
                return;
            }
        }
    }

    private static char[] s(String str, char c2, char c3, int i) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= c2 && charAt <= c3) {
                char[] charArray = str.toCharArray();
                int i3 = i2 + 1;
                charArray[i2] = (char) (charAt + i);
                r(charArray, i3, length - i3, c2, c3, i);
                return charArray;
            }
        }
        return null;
    }
}
