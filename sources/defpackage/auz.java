package defpackage;

/* compiled from: PG */
/* renamed from: auz  reason: default package */
/* loaded from: classes.dex */
public final class auz {
    private static final auy e = new aux();
    public final Object a;
    public final auy b;
    public final String c;
    public volatile byte[] d;

    private auz(String str, Object obj, auy auyVar) {
        ce.o(str);
        this.c = str;
        this.a = obj;
        ce.m(auyVar);
        this.b = auyVar;
    }

    public static auz a(String str, Object obj, auy auyVar) {
        return new auz(str, obj, auyVar);
    }

    public static auz b(String str) {
        return new auz(str, null, e);
    }

    public static auz c(String str, Object obj) {
        return new auz(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof auz) {
            return this.c.equals(((auz) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String str = this.c;
        return "Option{key='" + str + "'}";
    }
}
