package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: oqb  reason: default package */
/* loaded from: classes2.dex */
public final class oqb {
    private static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;

    private oqb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static oqb a(String str) {
        try {
            Matcher matcher = c.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + "\"");
            }
            matcher.group(1).toLowerCase(Locale.US);
            matcher.group(2).toLowerCase(Locale.US);
            Matcher matcher2 = d.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + "\"");
                }
                String group = matcher2.group(1);
                if (group != null && group.equalsIgnoreCase("charset")) {
                    String group2 = matcher2.group(2);
                    if (group2 != null) {
                        if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                            group2 = group2.substring(1, group2.length() - 1);
                        }
                    } else {
                        group2 = matcher2.group(3);
                    }
                    if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + "\"");
                    }
                    str2 = group2;
                }
            }
            return new oqb(str, str2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oqb) && ((oqb) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
