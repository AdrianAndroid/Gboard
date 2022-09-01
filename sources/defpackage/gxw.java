package defpackage;

/* compiled from: PG */
/* renamed from: gxw  reason: default package */
/* loaded from: classes.dex */
final class gxw extends gxx {
    final Throwable a;
    private final String c;
    private final long d;

    public gxw(String str, String str2, int i, long j, long j2, Throwable th) {
        super(str2, i, j);
        this.a = th;
        this.c = str;
        this.d = j2;
    }

    public final String toString() {
        lfa T = jdg.T("Finish");
        a(T);
        T.a(this.c);
        T.e("durationSinceStart", ((float) this.d) / 1000000.0f);
        T.a(this.a);
        T.d();
        return T.toString();
    }
}
