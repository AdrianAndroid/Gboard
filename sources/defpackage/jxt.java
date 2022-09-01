package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* renamed from: jxt  reason: default package */
/* loaded from: classes.dex */
final class jxt extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ ZipInputStream a;

    public jxt(ZipInputStream zipInputStream) {
        this.a = zipInputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
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
