package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: ndn  reason: default package */
/* loaded from: classes2.dex */
public final class ndn {
    public static final lfy a = lfy.c('=').b().a(2);
    private static final lfy d = lfy.c('/');
    private static final lfy e = lfy.c('-');
    public static final lex b = lex.d("/");
    private static final lex f = lex.d("-");
    public static final lex c = lex.d("=");
    private static final llp g = llp.x(new ndm("s", false), new ndm("w", false), new ndm("c", true), new ndm("d", true), new ndm("h", false), new ndm("s", true), new ndm("h", true), new ndm("p", true), new ndm("pp", true), new ndm("pf", true), new ndm("n", true), new ndm("r", false), new ndm("r", true), new ndm("o", true), new ndm("o", false), new ndm("j", false), new ndm("x", false), new ndm("y", false), new ndm("z", false), new ndm("g", true), new ndm("e", false), new ndm("f", false), new ndm("k", true), new ndm("u", true), new ndm("ut", true), new ndm("i", true), new ndm("a", true), new ndm("b", true), new ndm("b", false), new ndm("c", false), new ndm("t", false), new ndm("nt0", false), new ndm("v", true), new ndm("q", false), new ndm("fh", true), new ndm("fv", true), new ndm("fg", true), new ndm("ci", true), new ndm("rw", true), new ndm("rwu", true), new ndm("rwa", true), new ndm("nw", true), new ndm("rh", true), new ndm("no", true), new ndm("ns", true), new ndm("k", false), new ndm("p", false), new ndm("l", false), new ndm("v", false), new ndm("nu", true), new ndm("ft", true), new ndm("cc", true), new ndm("nd", true), new ndm("ip", true), new ndm("nc", true), new ndm("a", false), new ndm("rj", true), new ndm("rp", true), new ndm("rg", true), new ndm("pd", true), new ndm("pa", true), new ndm("m", false), new ndm("vb", false), new ndm("vl", false), new ndm("lf", true), new ndm("mv", true), new ndm("id", true), new ndm("al", true), new ndm("ic", false), new ndm("pg", true), new ndm("mo", true), new ndm("iv", false), new ndm("il", false), new ndm("ba", false));

    static {
        lfy.c(':');
    }

    public static List a(String str, boolean z) {
        jdg.w(str != null, "options is null");
        ArrayList A = lre.A();
        Iterator it = e.i(str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                Object obj = "";
                if (str2.startsWith("O") || str2.startsWith("J")) {
                    while (str2.length() < 12) {
                        str2 = f.h(str2, it.hasNext() ? it.next() : obj, new Object[0]);
                    }
                }
                if (str2.equals("pi") || str2.equals("ya") || str2.equals("ro")) {
                    lex lexVar = f;
                    if (it.hasNext()) {
                        obj = it.next();
                    }
                    str2 = lexVar.h(str2, obj, new Object[0]);
                }
                if (!z || Character.isUpperCase(str2.charAt(0))) {
                    A.add(str2);
                }
            }
        }
        return A;
    }

    public static String c(String str, String str2) {
        jdg.w(str != null, "oldOptions is null");
        jdg.w(true, "newOptions is null");
        if (str.isEmpty()) {
            return str2;
        }
        List<String> a2 = a(str, true);
        if (a2.isEmpty()) {
            return str2;
        }
        a2.addAll(a(str2, false));
        jdg.w(true, "options is null");
        ljm F = ljm.F();
        ArrayList A = lre.A();
        for (String str3 : a2) {
            llp llpVar = g;
            int i = ((lrl) llpVar).c;
            ndm ndmVar = null;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                ndm ndmVar2 = (ndm) llpVar.get(i2);
                if (str3.toLowerCase().startsWith(ndmVar2.a)) {
                    if (!ndmVar2.b) {
                        ndmVar = ndmVar2;
                    } else if (str3.length() == ndmVar2.a.length()) {
                        ndmVar = ndmVar2;
                        break;
                    }
                }
                i2++;
            }
            if (ndmVar != null) {
                F.v(ndmVar, str3);
            } else {
                A.add(str3);
            }
        }
        ArrayList A2 = lre.A();
        llp llpVar2 = g;
        int i3 = ((lrl) llpVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str4 = "";
            for (String str5 : F.d((ndm) llpVar2.get(i4))) {
                if (Character.isUpperCase(str5.charAt(0))) {
                    A2.add(str5);
                } else {
                    str4 = str5;
                }
            }
            if (!str4.isEmpty()) {
                A2.add(str4);
            }
        }
        A2.addAll(A);
        return f.f(A2);
    }

    public final List b(gps gpsVar) {
        ArrayList B = lre.B(d.i(gpsVar.a()));
        return (B.size() <= 0 || !((String) B.get(0)).isEmpty()) ? B : B.subList(1, B.size());
    }
}
