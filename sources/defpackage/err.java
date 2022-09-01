package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: err  reason: default package */
/* loaded from: classes.dex */
final class err extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ InputStream a;
    final /* synthetic */ ZipFile b;

    public err(InputStream inputStream, ZipFile zipFile) {
        this.a = inputStream;
        this.b = zipFile;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } finally {
            gvt.a(this.a);
            gvt.a(this.b);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.a.read();
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
