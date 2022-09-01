package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: oya  reason: default package */
/* loaded from: classes2.dex */
final class oya extends oxy {
    public long a = 0;

    public oya(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            long j = this.a;
            if (j >= 0) {
                this.a = j + 1;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read > 0) {
            long j = this.a;
            if (j >= 0) {
                this.a = j + read;
            }
        }
        return read;
    }
}
