package defpackage;

/* compiled from: PG */
/* renamed from: nvx  reason: default package */
/* loaded from: classes2.dex */
final class nvx implements Runnable {
    final /* synthetic */ nvy a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ nvz c;

    public nvx(nvz nvzVar, nvy nvyVar, Runnable runnable) {
        this.c = nvzVar;
        this.a = nvyVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(this.a);
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
