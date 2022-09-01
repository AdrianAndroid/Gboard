package defpackage;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: lyr  reason: default package */
/* loaded from: classes.dex */
final class lyr implements lyt {
    static final lyr a = new lyr();

    @Override // defpackage.lyt
    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = lyq.a;
        Level level = Level.WARNING;
        new StringBuilder("Suppressing exception thrown when closing ").append(closeable);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
    }
}
