package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: oeq  reason: default package */
/* loaded from: classes2.dex */
final class oeq implements oex {
    @Override // defpackage.oex
    public final void a(nvu nvuVar) {
    }

    @Override // defpackage.oex
    public final void b() {
    }

    @Override // defpackage.ofj
    public final void d(ofi ofiVar) {
        while (true) {
            InputStream g = ofiVar.g();
            if (g != null) {
                try {
                    g.close();
                } catch (IOException e) {
                    while (true) {
                        InputStream g2 = ofiVar.g();
                        if (g2 == null) {
                            break;
                        }
                        try {
                            g2.close();
                        } catch (IOException e2) {
                            oeu.b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", (Throwable) e2);
                        }
                    }
                    throw new RuntimeException(e);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ofj
    public final void e() {
    }
}
