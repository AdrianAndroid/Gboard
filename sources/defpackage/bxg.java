package defpackage;

import java.text.BreakIterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bxg  reason: default package */
/* loaded from: classes.dex */
public final class bxg {
    private static final lfy c = lfy.d(lej.b).h().b();
    private static final lex d = lex.c(' ');
    public llw a;
    public llw b;
    private llw e;

    public bxg() {
        llw llwVar = lrq.b;
        this.a = llwVar;
        this.e = llwVar;
        this.b = llwVar;
    }

    public static String b(String str, int i) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return "";
        }
        List k = c.k(trim);
        if (i < 0) {
            return d.f(k);
        }
        return d.f(k.subList(Math.max(0, k.size() - i), k.size()));
    }

    public final llp a(String str, Locale locale) {
        llk e = llp.e();
        BreakIterator c2 = c(locale);
        c2.setText(str);
        int first = c2.first();
        int next = c2.next();
        while (true) {
            int i = next;
            int i2 = first;
            first = i;
            if (first != -1) {
                if (!str.substring(i2, first).trim().isEmpty()) {
                    e.h(str.substring(i2, first));
                }
                next = c2.next();
            } else {
                return e.g();
            }
        }
    }

    public final BreakIterator c(Locale locale) {
        BreakIterator breakIterator = (BreakIterator) this.e.get(locale);
        if (breakIterator == null) {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            this.e = llw.l(locale, wordInstance);
            return wordInstance;
        }
        return breakIterator;
    }
}
