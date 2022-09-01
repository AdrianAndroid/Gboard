package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: oyc  reason: default package */
/* loaded from: classes2.dex */
public final class oyc extends InputStream implements InputStreamRetargetInterface {
    private InputStream a;
    private IOException b = null;
    private final byte[] c = new byte[1];
    private final oyw d;

    public oyc(InputStream inputStream, int i) {
        inputStream.getClass();
        this.a = inputStream;
        this.d = new oyw(i);
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            IOException iOException = this.b;
            if (iOException != null) {
                throw iOException;
            }
            return inputStream.available();
        }
        throw new oyo("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.a = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.c, 0, 1) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new oyo("Stream closed");
        }
        IOException iOException = this.b;
        if (iOException == null) {
            try {
                int read = inputStream.read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                oyw oywVar = this.d;
                int i3 = i + read;
                while (i < i3) {
                    byte b = bArr[i];
                    byte[] bArr2 = oywVar.b;
                    int i4 = oywVar.a;
                    int i5 = oywVar.c;
                    byte b2 = (byte) (b + bArr2[(i4 + i5) & 255]);
                    bArr[i] = b2;
                    oywVar.c = i5 - 1;
                    bArr2[i5 & 255] = b2;
                    i++;
                }
                return read;
            } catch (IOException e) {
                this.b = e;
                throw e;
            }
        }
        throw iOException;
    }
}
