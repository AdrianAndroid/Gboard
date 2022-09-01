package defpackage;

/* compiled from: PG */
/* renamed from: kam  reason: default package */
/* loaded from: classes.dex */
public final class kam {
    public final int a;
    public final String b;
    public final Throwable c;
    public final int d;

    public kam(int i, int i2, String str, Throwable th) {
        this.d = i;
        this.a = i2;
        this.b = str;
        this.c = th;
    }

    public static kam a(int i, Throwable th) {
        return new kam(i, -1, th.getMessage(), th);
    }

    public static kam b() {
        return new kam(2, -1, null, null);
    }

    public static kam c(String str) {
        return new kam(3, -1, str, null);
    }
}
