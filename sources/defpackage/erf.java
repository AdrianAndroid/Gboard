package defpackage;

import android.graphics.Color;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: erf  reason: default package */
/* loaded from: classes.dex */
public final class erf {
    private static final ltg e = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/TextStyleSheetParser");
    public static final Pattern a = Pattern.compile("([^{]+)\\{([^}]*)\\}");
    public static final Pattern b = Pattern.compile(String.format(Locale.US, "^(%s%s)?%s$", "([\\.:][_a-zA-Z][_a-zA-Z0-9-]*)+", "\\s*>\\s*", "([\\.:][_a-zA-Z][_a-zA-Z0-9-]*)+"));
    private static final Pattern f = Pattern.compile("^\"([a-zA-Z0-9_\\.\\-]*)\"$");
    public static final Pattern c = Pattern.compile("\\s");
    public static final Pattern d = Pattern.compile("\\s+");

    public static String a(String str, Pattern pattern, List list) {
        StringBuilder sb = new StringBuilder(str.length());
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find()) {
            sb.append(str.substring(i, matcher.start()));
            sb.append(" ");
            for (int i2 = 1; i2 <= matcher.groupCount(); i2++) {
                String group = matcher.group(i2);
                if (group != null) {
                    list.add(group);
                }
            }
            i = matcher.end();
        }
        if (i != str.length()) {
            sb.append(str.substring(i));
        }
        return sb.toString();
    }

    public static final void b(String str, Object... objArr) {
        ((ltd) ((ltd) e.c()).k("com/google/android/apps/inputmethod/libs/theme/core/TextStyleSheetParser", "putParseError", 551, "TextStyleSheetParser.java")).O(str, objArr);
    }

    public static void c(List list, euu euuVar, eut eutVar, String str, nfh nfhVar) {
        if ((eutVar == null) == (str == null)) {
            ((ltd) e.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/TextStyleSheetParser", "createStyleRules", 242, "TextStyleSheetParser.java")).u("Invalid propertyValue and/or propertyVariable for propertyName: %d", euuVar.ae);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (eutVar != null) {
                nfh t = euv.g.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                euv euvVar = (euv) t.b;
                euvVar.c = euuVar.ae;
                int i = euvVar.a | 1;
                euvVar.a = i;
                euvVar.d = eutVar;
                euvVar.a = i | 2;
                t.cM(str2);
                nfhVar.dJ(t);
            } else {
                nfh t2 = euv.g.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                euv euvVar2 = (euv) t2.b;
                euvVar2.c = euuVar.ae;
                int i2 = euvVar2.a | 1;
                euvVar2.a = i2;
                str.getClass();
                euvVar2.a = i2 | 4;
                euvVar2.e = str;
                t2.cM(str2);
                nfhVar.dJ(t2);
            }
        }
    }

    public static boolean d(String str, nfh nfhVar) {
        if (str.startsWith("#")) {
            int length = str.length();
            if (length == 4) {
                char charAt = str.charAt(1);
                char charAt2 = str.charAt(2);
                char charAt3 = str.charAt(3);
                str = "#" + charAt + charAt + charAt2 + charAt2 + charAt3 + charAt3;
            } else if (length == 5) {
                char charAt4 = str.charAt(1);
                char charAt5 = str.charAt(2);
                char charAt6 = str.charAt(3);
                char charAt7 = str.charAt(4);
                str = "#" + charAt7 + charAt7 + charAt4 + charAt4 + charAt5 + charAt5 + charAt6 + charAt6;
            } else if (length == 9) {
                str = "#" + str.substring(7) + str.substring(1, 7);
            }
        }
        try {
            int parseColor = Color.parseColor(str);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            eut eutVar = (eut) nfhVar.b;
            nft nftVar = eut.f;
            eutVar.a |= 1;
            eutVar.b = parseColor;
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean e(String str, nfh nfhVar) {
        try {
            double parseDouble = Double.parseDouble(str);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            eut eutVar = (eut) nfhVar.b;
            nft nftVar = eut.f;
            eutVar.a |= 16;
            eutVar.i = parseDouble;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean f(String str, nfh nfhVar) {
        String group;
        Matcher matcher = f.matcher(str.trim());
        if (!matcher.matches() || matcher.groupCount() != 1 || (group = matcher.group(1)) == null) {
            return false;
        }
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        eut eutVar = (eut) nfhVar.b;
        nft nftVar = eut.f;
        eutVar.a |= 2;
        eutVar.c = group;
        return true;
    }

    public static void g(String str, nfh nfhVar) {
        String trim = str.trim();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        eut eutVar = (eut) nfhVar.b;
        nft nftVar = eut.f;
        trim.getClass();
        eutVar.a |= 2;
        eutVar.c = trim;
    }
}
