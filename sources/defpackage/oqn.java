package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: oqn  reason: default package */
/* loaded from: classes2.dex */
public abstract class oqn implements Closeable {
    public abstract long a();

    public abstract oqb b();

    public abstract out c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        oqs.r(c());
    }

    public final InputStream d() {
        return c().k();
    }
}
