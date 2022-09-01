package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kkp  reason: default package */
/* loaded from: classes.dex */
final class kkp implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ mks b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;

    public kkp(Runnable runnable, mks mksVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = mksVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        kki.a(this.b.a(this, this.c, this.d));
    }
}
