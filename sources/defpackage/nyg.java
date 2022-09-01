package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyg  reason: default package */
/* loaded from: classes2.dex */
public final class nyg implements nyz {
    private final nyz a;

    public nyg(nyz nyzVar, Executor executor) {
        jdg.Q(nyzVar, "delegate");
        this.a = nyzVar;
        jdg.Q(executor, "appExecutor");
    }

    @Override // defpackage.nyz
    public final nzf a(SocketAddress socketAddress, nyy nyyVar, nsc nscVar) {
        return new nyf(this.a.a(socketAddress, nyyVar, nscVar), nyyVar.a);
    }

    @Override // defpackage.nyz
    public final ScheduledExecutorService b() {
        return this.a.b();
    }

    @Override // defpackage.nyz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
