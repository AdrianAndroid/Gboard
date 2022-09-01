package defpackage;

import android.os.IBinder;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gcc  reason: default package */
/* loaded from: classes.dex */
public final class gcc implements IBinder.DeathRecipient {
    public final AtomicReference a = new AtomicReference();
    final /* synthetic */ gcf b;

    public gcc(gcf gcfVar) {
        this.b = gcfVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.b.c.h("Binder died!");
        Future future = (Future) this.a.getAndSet(null);
        if (future != null) {
            this.b.c.h("Cancelling pending future!");
            future.cancel(false);
        }
    }
}
