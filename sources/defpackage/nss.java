package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nss  reason: default package */
/* loaded from: classes2.dex */
public final class nss {
    static final nst a;

    static {
        nst nwaVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            nwaVar = (nst) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(nst.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            nwaVar = new nwa();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = nwaVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            nsu.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
