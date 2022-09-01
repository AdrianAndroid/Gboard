package defpackage;

import android.content.Context;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: mos  reason: default package */
/* loaded from: classes2.dex */
public final class mos implements nyz {
    private final Context a;
    private final oda b;
    private final oda c;
    private final nwh d;
    private final Executor e;
    private final nwd f;
    private ScheduledExecutorService g;
    private Executor h;
    private boolean i;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public mos(Context context, nwd nwdVar, Executor executor, oda odaVar, oda odaVar2, nwh nwhVar) {
        this.a = context;
        this.f = nwdVar;
        this.b = odaVar;
        this.c = odaVar2;
        this.d = nwhVar;
        this.g = (ScheduledExecutorService) odaVar.a();
        this.h = odaVar2.a();
        this.e = executor;
    }

    @Override // defpackage.nyz
    public final nzf a(SocketAddress socketAddress, nyy nyyVar, nsc nscVar) {
        if (this.i) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        if (socketAddress instanceof nwc) {
            ((ltd) ((ltd) mot.a.b()).k("com/google/frameworks/client/data/android/binder/OnDeviceChannelBuilder$TransportFactory", "newClientTransport", 337, "OnDeviceChannelBuilder.java")).w("Creating cross-process transport to %s", socketAddress);
            return new nwl(this.a, (nwc) socketAddress, this.f, this.e, this.b, this.c, this.d, nyyVar.b);
        }
        throw nvu.f.f("Unrecognized address").h();
    }

    @Override // defpackage.nyz
    public final ScheduledExecutorService b() {
        return this.g;
    }

    @Override // defpackage.nyz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
        this.b.b(this.g);
        this.g = null;
        this.c.b(this.h);
        this.h = null;
    }
}
