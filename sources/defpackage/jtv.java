package defpackage;

/* compiled from: PG */
/* renamed from: jtv  reason: default package */
/* loaded from: classes.dex */
public final class jtv {
    public final long a;
    public final String b;

    private jtv(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public static jtv a(long j, String str) {
        jsi.f(str);
        jtq.s("compressedSize", j);
        return new jtv(j, str);
    }

    public static jtv b(juc jucVar) {
        return a(jucVar.c(), jucVar.k());
    }

    public static jtv c() {
        return a(0L, null);
    }
}
