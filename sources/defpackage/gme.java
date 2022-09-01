package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gme  reason: default package */
/* loaded from: classes.dex */
public final class gme {
    public static final ltg a = ltg.j("com/google/android/libraries/gsa/io/impl/TimeoutMonitor");
    public final bmm b;
    public final blo c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final blq h;
    public final boolean i;
    public gmd j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile boolean m;
    volatile boolean n;
    volatile boolean o;
    public volatile int p = -1;
    public volatile int q = -1;
    private final gnn r;

    public gme(gnn gnnVar, bmm bmmVar, blo bloVar, blq blqVar, long j, long j2, long j3, long j4, boolean z) {
        this.r = gnnVar;
        this.b = bmmVar;
        this.c = bloVar;
        this.h = blqVar;
        jdg.z(j > 0, "Invalid response timeout: %s", j);
        this.d = j;
        jdg.z(j2 > 0, "Invalid read timeout: %s", j2);
        this.e = j2;
        if (j3 == -1) {
            this.n = true;
        } else {
            jdg.z(false, "Invalid no progress timeout: %s", 0L);
            j3 = 0;
        }
        this.f = j3;
        this.g = j4;
        if (j4 == 0) {
            this.o = true;
        }
        this.i = z;
    }

    public final void a(long j) {
        this.r.e(j, new gky(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c.e();
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.l = true;
    }
}
