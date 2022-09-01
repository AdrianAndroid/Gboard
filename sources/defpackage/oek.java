package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oek */
/* loaded from: classes2.dex */
public final class oek extends nvl {
    private static final Logger k = Logger.getLogger(oek.class.getName());
    public final oew a;
    public final nuq b;
    public final oix c;
    public final nsn d;
    public final byte[] e;
    public final nsy f;
    public volatile boolean g;
    public boolean h;
    public boolean i;
    public nsj j;
    private final nyi l;
    private boolean m;

    public oek(oew oewVar, nuq nuqVar, num numVar, nsn nsnVar, nsy nsyVar, nyi nyiVar, oix oixVar) {
        this.a = oewVar;
        this.b = nuqVar;
        this.d = nsnVar;
        this.e = (byte[]) numVar.b(oao.d);
        this.f = nsyVar;
        this.l = nyiVar;
        nyiVar.b();
        this.c = oixVar;
    }

    public static /* synthetic */ void d(oek oekVar) {
        oekVar.g = true;
    }

    private final void e(nvu nvuVar) {
        k.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "internalClose", "Cancelling the stream with status {0}", new Object[]{nvuVar});
        this.a.c(nvuVar);
        this.l.a(nvuVar.k());
    }

    @Override // defpackage.nvl
    public final void a(nvu nvuVar, num numVar) {
        int i = oiw.a;
        jdg.G(!this.i, "call already closed");
        this.i = true;
        if (!nvuVar.k() || !this.b.a.b() || this.m) {
            this.a.e(nvuVar, numVar);
            this.l.a(nvuVar.k());
            return;
        }
        e(nvu.k.f("Completed without a response"));
        this.l.a(nvuVar.k());
    }

    @Override // defpackage.nvl
    public final void b(int i) {
        int i2 = oiw.a;
        this.a.g(i);
    }

    public final void c(Object obj) {
        jdg.G(this.h, "sendHeaders has not been called");
        jdg.G(!this.i, "call is closed");
        nuq nuqVar = this.b;
        if (!nuqVar.a.b() || !this.m) {
            this.m = true;
            try {
                this.a.n(nuqVar.e.a(obj));
                if (this.b.a.b()) {
                    return;
                }
                this.a.d();
                return;
            } catch (Error e) {
                a(nvu.c.f("Server sendMessage() failed with Error"), new num());
                throw e;
            } catch (RuntimeException e2) {
                a(nvu.d(e2), new num());
                return;
            }
        }
        e(nvu.k.f("Too many responses"));
    }
}
