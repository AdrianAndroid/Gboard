package defpackage;

/* compiled from: PG */
/* renamed from: ezf  reason: default package */
/* loaded from: classes.dex */
public final class ezf {
    public Runnable a;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    private final eze f;

    public ezf(eze ezeVar) {
        this.f = ezeVar;
    }

    public final void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            kki.k(runnable);
            this.a = null;
        }
    }

    public final void b(ezq ezqVar, eym eymVar) {
        this.b = System.currentTimeMillis();
        this.f.e(ezqVar, eymVar);
    }
}
