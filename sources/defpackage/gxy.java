package defpackage;

/* compiled from: PG */
/* renamed from: gxy  reason: default package */
/* loaded from: classes.dex */
final class gxy extends gxx {
    private final String a;
    private final long c;

    public gxy(String str, String str2, int i, long j, long j2) {
        super(str2, i, j);
        this.a = str;
        this.c = j2;
    }

    public final String toString() {
        lfa T = jdg.T("Start");
        a(T);
        T.a(this.a);
        T.e("durationSinceEnqueue", ((float) this.c) / 1000000.0f);
        return T.toString();
    }
}
