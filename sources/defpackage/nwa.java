package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nwa  reason: default package */
/* loaded from: classes2.dex */
final class nwa extends nst {
    private static final Logger b = Logger.getLogger(nwa.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.nst
    public final nsu a() {
        nsu nsuVar = (nsu) a.get();
        return nsuVar == null ? nsu.d : nsuVar;
    }

    @Override // defpackage.nst
    public final nsu b(nsu nsuVar) {
        nsu a2 = a();
        a.set(nsuVar);
        return a2;
    }

    @Override // defpackage.nst
    public final void c(nsu nsuVar, nsu nsuVar2) {
        if (a() != nsuVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (nsuVar2 != nsu.d) {
            a.set(nsuVar2);
        } else {
            a.set(null);
        }
    }
}
