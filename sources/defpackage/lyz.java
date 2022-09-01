package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: lyz  reason: default package */
/* loaded from: classes.dex */
public final class lyz {
    private static final Logger a = Logger.getLogger(lyz.class.getName());

    private lyz() {
    }

    @Deprecated
    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            a.logp(Level.WARNING, "com.google.common.io.LegacyCloseables", "closeQuietly", "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }
}
