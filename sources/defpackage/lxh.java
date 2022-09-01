package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* renamed from: lxh  reason: default package */
/* loaded from: classes.dex */
public final class lxh implements Closeable {
    public static final ThreadLocal a = new lxg();
    public int b = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i > 0) {
            this.b = i - 1;
            return;
        }
        throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
    }
}
