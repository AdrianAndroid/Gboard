package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: oga  reason: default package */
/* loaded from: classes2.dex */
final class oga implements nyz {
    final Executor a;
    final ScheduledExecutorService b;
    final SSLSocketFactory c;
    final ogu d;
    final lbi e;
    private final oda f;
    private final oda g;
    private final nxy h = new nxy();
    private boolean i;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public oga(oda odaVar, oda odaVar2, SSLSocketFactory sSLSocketFactory, ogu oguVar, lbi lbiVar, byte[] bArr, byte[] bArr2) {
        this.f = odaVar;
        this.a = odaVar.a();
        this.g = odaVar2;
        this.b = (ScheduledExecutorService) odaVar2.a();
        this.c = sSLSocketFactory;
        this.d = oguVar;
        this.e = lbiVar;
    }

    @Override // defpackage.nyz
    public final nzf a(SocketAddress socketAddress, nyy nyyVar, nsc nscVar) {
        if (this.i) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        nxy nxyVar = this.h;
        obv obvVar = new obv(new nxx(nxyVar, nxyVar.c.get()), 16);
        return new ogh(this, (InetSocketAddress) socketAddress, nyyVar.a, nyyVar.c, nyyVar.b, oao.q, new oho(), nyyVar.d, obvVar);
    }

    @Override // defpackage.nyz
    public final ScheduledExecutorService b() {
        return this.b;
    }

    @Override // defpackage.nyz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.b(this.a);
        this.g.b(this.b);
    }
}
