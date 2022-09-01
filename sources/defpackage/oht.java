package defpackage;

/* compiled from: PG */
/* renamed from: oht  reason: default package */
/* loaded from: classes2.dex */
public final class oht {
    public final String a;
    public final int b;
    private final String c;

    public oht(ohs ohsVar) {
        this.a = ohsVar.b;
        this.b = ohsVar.a();
        this.c = ohsVar.toString();
    }

    public static int a(char c) {
        if (c < '0' || c > '9') {
            if (c >= 'a' && c <= 'f') {
                return c - 'W';
            }
            if (c >= 'A' && c <= 'F') {
                return c - '7';
            }
            return -1;
        }
        return c - '0';
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oht) && ((oht) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
