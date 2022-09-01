package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lex  reason: default package */
/* loaded from: classes.dex */
public class lex {
    public final String c;

    private lex(String str) {
        jdg.u(str);
        this.c = str;
    }

    public lex(lex lexVar) {
        this.c = lexVar.c;
    }

    public static lex c(char c) {
        return new lex(String.valueOf(c));
    }

    public static lex d(String str) {
        return new lex(str);
    }

    public CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void b(Appendable appendable, Iterator it) {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.c);
                appendable.append(a(it.next()));
            }
        }
    }

    public final lex e() {
        return new lev(this, this);
    }

    public final String f(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        i(sb, it);
        return sb.toString();
    }

    public final String g(Object[] objArr) {
        return f(Arrays.asList(objArr));
    }

    public final String h(Object obj, Object obj2, Object... objArr) {
        return f(new lew(objArr, obj, obj2));
    }

    public final void i(StringBuilder sb, Iterator it) {
        try {
            b(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void j(StringBuilder sb, Iterable iterable) {
        i(sb, iterable.iterator());
    }
}
