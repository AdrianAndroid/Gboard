package defpackage;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: obo  reason: default package */
/* loaded from: classes2.dex */
public final class obo implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ oce a;

    public obo(oce oceVar) {
        this.a = oceVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = oce.a;
        Level level = Level.SEVERE;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$2", "uncaughtException", "[" + this.a.h + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        oce oceVar = this.a;
        if (oceVar.t) {
            return;
        }
        oceVar.t = true;
        oceVar.g(true);
        oceVar.n(false);
        oceVar.o(new obn(th));
        oceVar.H.d(null);
        oceVar.F.a(4, "PANIC! Entering TRANSIENT_FAILURE");
        oceVar.o.a(nsl.TRANSIENT_FAILURE);
    }
}
