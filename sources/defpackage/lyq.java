package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: lyq  reason: default package */
/* loaded from: classes.dex */
public final class lyq {
    static final Logger a = Logger.getLogger(lyq.class.getName());

    private lyq() {
    }

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            try {
                a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
