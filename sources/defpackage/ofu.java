package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ofu  reason: default package */
/* loaded from: classes2.dex */
public final class ofu implements ohg {
    private static final Logger d = Logger.getLogger(ogh.class.getName());
    public final oft a;
    public final ohg b;
    public final oqv c = new oqv(Level.FINE, ogh.class);

    public ofu(oft oftVar, ohg ohgVar) {
        this.a = oftVar;
        this.b = ohgVar;
    }

    @Override // defpackage.ohg
    public final void a(ohq ohqVar) {
        throw null;
    }

    @Override // defpackage.ohg
    public final void b() {
        throw null;
    }

    @Override // defpackage.ohg
    public final void c(boolean z, int i, our ourVar, int i2) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.ohg
    public final void d() {
        try {
            this.b.d();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.ohg
    public final void e(boolean z, int i, int i2) {
        if (z) {
            oqv oqvVar = this.c;
            long j = (4294967295L & i2) | (i << 32);
            if (oqvVar.c()) {
                Object obj = oqvVar.a;
                Logger logger = (Logger) obj;
                logger.logp((Level) oqvVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", ofb.b(2) + " PING: ack=true bytes=" + j);
            }
        } else {
            this.c.f(2, (4294967295L & i2) | (i << 32));
        }
        try {
            ohg ohgVar = this.b;
            if (z) {
                ((ofv) ohgVar).b.h++;
            }
            ((ofv) ohgVar).a.e(z, i, i2);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.ohg
    public final void f(int i, ohf ohfVar) {
        this.c.g(2, i, ohfVar);
        try {
            ohg ohgVar = this.b;
            ((ofv) ohgVar).b.h++;
            ((ofv) ohgVar).a.f(i, ohfVar);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.ohg
    public final void g(ohq ohqVar) {
        throw null;
    }

    @Override // defpackage.ohg
    public final void h(int i, long j) {
        this.c.i(2, i, j);
        try {
            ((ofv) this.b).a.h(i, j);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.ohg
    public final void i(ohf ohfVar, byte[] bArr) {
        this.c.e(2, 0, ohfVar, ouu.i(bArr));
        try {
            ((ofv) this.b).a.i(ohfVar, bArr);
            this.b.d();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.ohg
    public final void j(int i, List list) {
        throw null;
    }
}
