package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: orq  reason: default package */
/* loaded from: classes2.dex */
public final class orq {
    public static final /* synthetic */ int a = 0;

    static {
        ouu.h("\"\\");
        ouu.h("\t ,=");
    }

    public static int a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong >= 0) {
                return (int) parseLong;
            }
            return 0;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int b(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int c(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static long d(oql oqlVar) {
        String b = oqlVar.f.b("Content-Length");
        if (b != null) {
            try {
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return Long.parseLong(b);
    }

    public static Set e(opx opxVar) {
        Set emptySet = Collections.emptySet();
        int a2 = opxVar.a();
        for (int i = 0; i < a2; i++) {
            if ("Vary".equalsIgnoreCase(opxVar.c(i))) {
                String d = opxVar.d(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : d.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    public static opx f(oql oqlVar) {
        opx opxVar = oqlVar.h.a.c;
        Set e = e(oqlVar.f);
        if (e.isEmpty()) {
            return new mlu((byte[]) null).D();
        }
        mlu mluVar = new mlu((byte[]) null);
        int a2 = opxVar.a();
        for (int i = 0; i < a2; i++) {
            String c = opxVar.c(i);
            if (e.contains(c)) {
                mluVar.I(c, opxVar.d(i));
            }
        }
        return mluVar.D();
    }

    public static void g(opq opqVar, opz opzVar, opx opxVar) {
        if (opqVar == opq.a) {
            return;
        }
        List a2 = opo.a(opzVar, opxVar);
        if (a2.isEmpty()) {
            return;
        }
        opqVar.b(a2);
    }

    public static boolean h(oql oqlVar) {
        if (!oqlVar.a.b.equals("HEAD")) {
            int i = oqlVar.c;
            return (((i >= 100 && i < 200) || i == 204 || i == 304) && d(oqlVar) == -1 && !"chunked".equalsIgnoreCase(oqlVar.a("Transfer-Encoding"))) ? false : true;
        }
        return false;
    }

    public static boolean i(oql oqlVar) {
        return e(oqlVar.f).contains("*");
    }
}
