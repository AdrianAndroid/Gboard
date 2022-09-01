package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* renamed from: koz  reason: default package */
/* loaded from: classes.dex */
public final class koz implements Closeable {
    public final Closeable a;

    public koz(Closeable closeable) {
        this.a = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
