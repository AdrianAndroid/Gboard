package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: ntm  reason: default package */
/* loaded from: classes2.dex */
public final class ntm {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;
    private final String d;

    public ntm(String str, String str2, long j) {
        jdg.Q(str, "typeName");
        jdg.w(!str.isEmpty(), "empty type");
        this.c = str;
        this.d = str2;
        this.a = j;
    }

    public static ntm a(Class cls, String str) {
        jdg.Q(cls, "type");
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return b(simpleName, str);
    }

    public static ntm b(String str, String str2) {
        return new ntm(str, str2, b.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c + "<" + this.a + ">");
        if (this.d != null) {
            sb.append(": (");
            sb.append(this.d);
            sb.append(')');
        }
        return sb.toString();
    }
}
