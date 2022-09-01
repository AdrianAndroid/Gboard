package defpackage;

import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: kok  reason: default package */
/* loaded from: classes.dex */
public final class kok extends kpe {
    private final List a;

    public kok(InputStream inputStream, List list) {
        super(inputStream);
        this.a = list;
        kqn.d(true, "Input was null", new Object[0]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (kpv kpvVar : this.a) {
            try {
                kpvVar.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            for (kpv kpvVar : this.a) {
                kpvVar.a();
            }
        }
        return read;
    }

    @Override // defpackage.kpe, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            for (kpv kpvVar : this.a) {
                kpvVar.a();
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            for (kpv kpvVar : this.a) {
                kpvVar.a();
            }
        }
        return read;
    }
}
