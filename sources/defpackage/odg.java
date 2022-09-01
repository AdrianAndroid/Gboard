package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: odg  reason: default package */
/* loaded from: classes2.dex */
public interface odg extends Closeable {
    void b();

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean d();

    int e();

    int f();

    odg g(int i);

    void i(ByteBuffer byteBuffer);

    void j(OutputStream outputStream, int i);

    void k(byte[] bArr, int i, int i2);

    void l(int i);
}
