package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jsi  reason: default package */
/* loaded from: classes.dex */
public final class jsi {
    public static final /* synthetic */ int a = 0;
    private static final lek b;
    private static final Pattern c;
    private static final String d;
    private static final Pattern e;
    private static final Pattern f;

    static {
        lek lekVar;
        lek g = lek.e('a', 'z').g(lek.e('A', 'Z')).g(lek.e('0', '9'));
        int length = "-_".length();
        if (length == 0) {
            lekVar = leh.a;
        } else if (length == 1) {
            lekVar = lek.f("-_".charAt(0));
        } else if (length == 2) {
            lekVar = new lef("-_".charAt(0), "-_".charAt(1));
        } else {
            lekVar = new lea();
        }
        b = g.g(lekVar);
        c = Pattern.compile("^[\\-a-zA-Z0-9_]+$");
        String format = String.format(Locale.US, "(?:\\.(%s))??%s", "[\\-a-zA-Z0-9_]+", ".fetched");
        d = format;
        e = Pattern.compile(String.format(Locale.US, "^(%s)(?:(?:%s)|(?:%s))??$", "[\\-a-zA-Z0-9_]+", format, ".staged"));
        f = Pattern.compile(String.format(Locale.US, "^(%s)-([0-9]+)$", "[\\-a-zA-Z0-9_]+"));
    }

    public static jsr a(jsr jsrVar, String str) {
        jrh jrhVar = (jrh) jsrVar;
        String str2 = jrhVar.a;
        String str3 = jrhVar.b;
        String concat = str != null ? ".".concat(str) : "";
        return jsr.d(str2, str3 + concat + ".fetched");
    }

    public static jsr b(jsr jsrVar) {
        jrh jrhVar = (jrh) jsrVar;
        return jsr.d(jrhVar.a, jrhVar.b.concat(".staged"));
    }

    public static jtr c(String str) {
        String group;
        String group2;
        Matcher matcher = e.matcher(str);
        String group3 = matcher.find() ? matcher.group(1) : null;
        if (group3 == null) {
            return null;
        }
        Matcher matcher2 = f.matcher(group3);
        if (!matcher2.find() || (group = matcher2.group(1)) == null || (group2 = matcher2.group(2)) == null) {
            return null;
        }
        try {
            return jtr.c(group, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(String str, int i) {
        return str + "-" + i;
    }

    public static void e(String str) {
        if (str.length() != 0) {
            if (str.length() > 256) {
                throw new IllegalArgumentException("Name '" + str + "' exceeds maximum length of 256");
            } else if (b.j(str)) {
                return;
            } else {
                String valueOf = String.valueOf(c);
                throw new IllegalArgumentException(str + " is not valid, expected: " + valueOf);
            }
        }
        throw new IllegalArgumentException("Name should not be empty");
    }

    public static void f(String str) {
        if (str != null) {
            e(str);
        }
    }
}
