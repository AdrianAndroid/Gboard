package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: jsr  reason: default package */
/* loaded from: classes.dex */
public abstract class jsr implements Comparable {
    private static final lfy a = lfy.c(':').h().b();

    public static jsr d(String str, String str2) {
        return new jrh(str, str2);
    }

    public static jsr e(String str) {
        List k = a.k(str);
        if (k.size() != 2) {
            throw new jsn("Invalid input: ".concat(String.valueOf(str)));
        }
        return d((String) k.get(0), (String) k.get(1));
    }

    public static final String h(String str, String str2) {
        return str + ":" + str2;
    }

    public abstract String a();

    public abstract String b();

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(jsr jsrVar) {
        int compareTo = b().compareTo(jsrVar.b());
        return compareTo == 0 ? a().compareTo(jsrVar.a()) : compareTo;
    }

    public final String f() {
        return g(true);
    }

    public final String g(boolean z) {
        String b = b();
        String v = jtq.q(b) ? jtq.v() : a();
        return z ? h(b, v) : v;
    }

    public String toString() {
        return h(b(), a());
    }
}
