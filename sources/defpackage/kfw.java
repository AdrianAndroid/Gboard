package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* renamed from: kfw  reason: default package */
/* loaded from: classes.dex */
public final class kfw {
    private static final kfv d = kfs.a;
    public volatile kfv a = d;
    public ScheduledFuture b;
    public ScheduledFuture c;

    public kfw(kcl kclVar, mks mksVar) {
        kclVar.a(new kft(this, mksVar));
        kclVar.a(new kfu(this, mksVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.b = null;
        }
        ScheduledFuture scheduledFuture2 = this.c;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.c = null;
        }
    }
}
