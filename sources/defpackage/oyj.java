package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: oyj  reason: default package */
/* loaded from: classes2.dex */
final class oyj extends InputStream implements InputStreamRetargetInterface {
    public static final /* synthetic */ int a = 0;
    private InputStream b;
    private final ozh c;
    private final byte[] d = new byte[4096];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private IOException i = null;
    private final byte[] j = new byte[1];

    public oyj(InputStream inputStream, ozh ozhVar) {
        inputStream.getClass();
        this.b = inputStream;
        this.c = ozhVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.b != null) {
            IOException iOException = this.i;
            if (iOException != null) {
                throw iOException;
            }
            return this.f;
        }
        throw new oyo("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.j, 0, 1) == -1) {
            return -1;
        }
        return this.j[0] & 255;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.b != null) {
            IOException iOException = this.i;
            if (iOException != null) {
                throw iOException;
            }
            int i4 = 0;
            while (true) {
                try {
                    int min = Math.min(this.f, i2);
                    System.arraycopy(this.d, this.e, bArr, i, min);
                    int i5 = this.e + min;
                    this.e = i5;
                    int i6 = this.f - min;
                    this.f = i6;
                    i += min;
                    i2 -= min;
                    i4 += min;
                    int i7 = this.g;
                    if (i5 + i6 + i7 == 4096) {
                        byte[] bArr2 = this.d;
                        System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                        this.e = 0;
                        i5 = 0;
                    }
                    if (i2 == 0 || this.h) {
                        break;
                    }
                    int i8 = i5 + this.f + this.g;
                    int read = this.b.read(this.d, i8, 4096 - i8);
                    if (read == -1) {
                        this.h = true;
                        this.f = this.g;
                        this.g = 0;
                    } else {
                        int i9 = this.g + read;
                        this.g = i9;
                        int a2 = this.c.a(this.d, this.e, i9);
                        this.f = a2;
                        this.g -= a2;
                    }
                } catch (IOException e) {
                    this.i = e;
                    throw e;
                }
            }
            if (i4 <= 0) {
                return -1;
            }
            return i4;
        }
        throw new oyo("Stream closed");
    }
}
