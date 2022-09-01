package defpackage;

/* compiled from: PG */
/* renamed from: fbv  reason: default package */
/* loaded from: classes.dex */
public final class fbv {
    public static final fbv a = new fbv(ieh.j(), dsv.a);
    public final idk f;
    private final dsv h;
    public volatile long b = -1;
    private volatile long g = -1;
    public volatile long c = -1;
    public volatile long d = -1;
    public volatile few e = null;

    public fbv(idk idkVar, dsv dsvVar) {
        this.f = idkVar;
        this.h = dsvVar;
    }

    public final void a(long j) {
        this.d = -1L;
        this.c = -1L;
        this.g = -1L;
        this.b = -1L;
        this.e = null;
        this.b = j;
    }

    public final void b(long j, fbp fbpVar) {
        this.h.a(j);
        if (this.g > 0) {
            return;
        }
        this.g = j;
        if (this.b <= 0) {
            return;
        }
        this.f.g(fbpVar, j - this.b);
    }

    public final void c(long j, few fewVar) {
        if (this.c < 0) {
            this.c = j;
        }
        this.e = fewVar;
    }
}
