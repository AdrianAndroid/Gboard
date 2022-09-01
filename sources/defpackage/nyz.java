package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: nyz  reason: default package */
/* loaded from: classes2.dex */
public interface nyz extends Closeable {
    nzf a(SocketAddress socketAddress, nyy nyyVar, nsc nscVar);

    ScheduledExecutorService b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
